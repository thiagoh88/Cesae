package RPG.Jogo;

import RPG.Entidades.Archer;
import RPG.Entidades.Mage;
import RPG.Entidades.Warrior;
import RPG.Itens.*;
import RPG.Entidades.Hero;
import RPG.Entidades.NPC;
import RPG.Entidades.Vendedor;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    Jogo.MusicPlayer musicaIntro = new Jogo.MusicPlayer();
    Jogo.MusicPlayer musicaJogo = new Jogo.MusicPlayer();
    Jogo.MusicPlayer musicaFinal = new Jogo.MusicPlayer();
    Jogo.MusicPlayer musicaEnd = new Jogo.MusicPlayer();


    Scanner input = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GOLD = "\u001B[0;93m";
    public static final String ANSI_BGBLACK = "\u001B[40m";
    // Bandidos
    NPC joca = new NPC("Joca", 80, 120, 30, 25);
    NPC quim = new NPC("Quim", 80, 80, 30, 25);
    NPC zequinha = new NPC("Zequinha", 80, 80, 40, 50);


    // Vale Sombrio
    NPC aranhaGigante = new NPC("Aranha Gigante", 100, 100, 25, 25);
    NPC abelhaAssassina = new NPC("Abelha Assassina", 100, 100, 25, 25);
    NPC insectoide = new NPC("Insectoide", 125, 125, 50, 50);

    // Labirinto Tempestuoso
    NPC gargula = new NPC("Gargula", 100, 100, 25, 25);
    NPC golem = new NPC("Golem", 100, 100, 25, 25);
    NPC minotauro = new NPC("Minotauro", 125, 125, 45, 50);

    //Montanha da Morte
    NPC goblin = new NPC("Goblin", 100, 100, 25, 25);
    NPC orc = new NPC("Orc", 100, 100, 25, 30);
    NPC troll = new NPC("Troll", 125, 125, 45, 50);

    // BOSS
    NPC reiDemonio = new NPC("Rei Demonio", 250, 250, 70, 1000);
    NPC vitor = new NPC("Master Chef Vitor", 1000, 1000, 20, 0);

    ArrayList<String> heroisPermitidos = new ArrayList<>(List.of("Warrior", "Mage", "Archer"));
    ArrayList<String> heroiWarrior = new ArrayList<>(List.of("Warrior"));
    ArrayList<String> heroiArcher = new ArrayList<>(List.of("Archer"));
    ArrayList<String> heroiMage = new ArrayList<>(List.of("Mage"));

    // Criação Consumiveis
    Potion lifepotionMinor = new Potion("Minor Potion", 20, heroisPermitidos, 50, 0);
    Potion lifepotionMedium = new Potion("Medium Potion", 40, heroisPermitidos, 100, 0);
    Potion lifepotionMajor = new Potion("Major Potion", 80, heroisPermitidos, 150, 0);
    Potion strenghtPotion = new Potion("Strength Potion", 50, heroisPermitidos, 0, 10);
    Potion megaStrengthPotion = new Potion("Mega Strength Potion", 100, heroisPermitidos, 0, 20);

    // Criação Consumivel de Combate
    ConsumivelCombate pedra = new ConsumivelCombate("Pedra", 15, heroisPermitidos, 50);
    ConsumivelCombate superPedra = new ConsumivelCombate("Super Pedra", 30, heroisPermitidos, 100);
    ConsumivelCombate buggyCode = new ConsumivelCombate("Buggy Code", 100, heroisPermitidos, 999);

    // Criação Armas
    ArmaPrincipal stick = new ArmaPrincipal("Stick", 0, 10, 20, heroisPermitidos);

    ArmaPrincipal superStaff = new ArmaPrincipal("Super Staff", 80, 20, 40, heroiMage);
    ArmaPrincipal fireStaff = new ArmaPrincipal("Fire Staff", 120, 40, 60, heroiMage);
    ArmaPrincipal holyStaff = new ArmaPrincipal("Holy Staff", 160, 60, 80, heroiMage);

    ArmaPrincipal bow = new ArmaPrincipal("Bow", 80, 20, 40, heroiArcher);
    ArmaPrincipal fireBow = new ArmaPrincipal("Fire Bow", 120, 40, 60, heroiArcher);
    ArmaPrincipal holyBow = new ArmaPrincipal("Holy Bow", 160, 60, 80, heroiArcher);


    ArmaPrincipal sword = new ArmaPrincipal("Sword", 80, 20, 40, heroiWarrior);
    ArmaPrincipal fireSword = new ArmaPrincipal("Fire Sword", 120, 40, 60, heroiWarrior);
    ArmaPrincipal holySword = new ArmaPrincipal("Holy Sword", 160, 60, 80, heroiWarrior);

    /**
     * Metodo para tocar musicas
     */
    public static class MusicPlayer {
        public Thread musica;
        public Player player;
        public boolean play;

        public void play(String filePath) {
            play = true;
            musica = new Thread(() -> {
                try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
                    player = new Player(fileInputStream);
                    player.play();
                } catch (JavaLayerException | IOException e) {
                    e.printStackTrace();
                }
            });
            musica.start();  // Inicia a thread de música
        }

        public void stopMusic() {
            if (player != null) {
                play = false;
                player.close();
                try {
                    if (musica != null) {
                        musica.join();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Metodo para imprimir um ficheiro
     *
     * @param path
     * @throws FileNotFoundException
     */
    public void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNext()) {
            String linhaAtual = scannerFicheiro.nextLine();
            System.out.println(linhaAtual);
        }
    }

    /**
     * Metodo de criação do personagem
     *
     * @return hero
     */
    public Hero criarPersonagem() {
        musicaIntro.stopMusic();
        musicaIntro.play("RPG/MP3/inicio.mp3");
        // Escolher classe
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_BLUE);
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("                                ⚔\uFE0F \uD83C\uDFF9 \uD83D\uDD2E \uD83D\uDDE1\uFE0F Sistema de Criação de Herói \uD83D\uDDE1\uFE0F \uD83D\uDD2E \uD83C\uDFF9 ⚔\uFE0F");
            System.out.println();
            System.out.println("                            1.⚔\uFE0F Warrior - Bônus: NPC ataca 1º | -10 Dano | +20 Defesa");
            System.out.println("                            2.\uD83C\uDFF9 Archer - Bônus: 1ºturn x2 | Crit. Arrow x2 | -5 Defesa");
            System.out.println("                            3.\uD83E\uDDD9\u200D♂\uFE0F Mage - Bônus: Random 50% FireBall Dano x2 | -10 Defesa");
            System.out.print("\nClasse: ");
        } catch (InterruptedException e) {
            System.out.println();
        }
        int escolhaClasse = input.nextInt();

        // Deve escolher entre 1 e 3
        while (escolhaClasse != 1 && escolhaClasse != 2 && escolhaClasse != 3) {
            System.out.println();
            System.out.println("                                        ⚔\uFE0F \uD83C\uDFF9 \uD83D\uDD2E \uD83D\uDDE1\uFE0F Criar Heroi \uD83D\uDDE1\uFE0F \uD83D\uDD2E \uD83C\uDFF9 ⚔\uFE0F");
            System.out.println();
            System.out.println("                            1.⚔\uFE0F Warrior - Bônus: Lento | -10 Dano | +20 Defesa | Gold x2");
            System.out.println("                            2.\uD83C\uDFF9 Archer - Bônus: 1ºturno x2 | Critical Arrow Dano x2 | -5 Defesa");
            System.out.println("                            3.\uD83E\uDDD9\u200D♂\uFE0F Mage - Bônus: Random 50% FireBall Dano x2 | -10 Defesa");
            System.out.print("\nClasse: ");
            escolhaClasse = input.nextInt();
        }


        // Escolher dificuldade
        System.out.println();
        System.out.println("                                                  Dificuldade");
        System.out.println("                                          1.Easy - 300 Pontos Criação");
        System.out.println("                                          2.Hard - 200 Pontos Criação");
        System.out.print("\nOpção: ");
        int escolhaDificuldade = input.nextInt();

        // Deve escolher 1 ou 2
        while (escolhaDificuldade != 1 && escolhaDificuldade != 2) {
            System.out.println();
            System.out.println("                                                  Dificuldade");
            System.out.println("                                          1.Easy - 300 Pontos Criação");
            System.out.println("                                          2.Hard - 200 Pontos Criação");
            System.out.print("\nOpção: ");
            escolhaDificuldade = input.nextInt();
        }
        int pntsCriacao = 0;
        int goldInicial = 0;

        if (escolhaDificuldade == 1) {
            escolhaDificuldade = 300;
            pntsCriacao = 300;
            goldInicial = 20;
        } else {
            escolhaDificuldade = 220;
            pntsCriacao = 220;
            goldInicial = 15;
        }

        // Distribuir pontos de criação
        System.out.println("\n                                        Distribua os pontos de criação");
        System.out.println("                                                 Pontos: " + escolhaDificuldade);
        System.out.println("                                            Vida 1 ponto = 1 ponto ");
        System.out.println("                                           Força 1 ponto = 5 pontos ");
        System.out.print("Vida: ");
        int vida = input.nextInt();
        System.out.print("Força: ");
        int forca = input.nextInt();

        // Garantir a distribuição correta
        while (vida + (forca * 5) != pntsCriacao || vida + (forca * 5) > pntsCriacao) {
            System.out.println("\nDistribuição inválida. Tente novamente.");
            System.out.println("   Vida 1 ponto = 1 ponto: ");
            System.out.print("Vida: ");
            vida = input.nextInt();
            System.out.println("  Força 1 ponto = 5 pontos: ");
            System.out.print("Força: ");
            forca = input.nextInt();
        }

        System.out.println("\nDistribuiu: " + vida + " pnts de vida e " + forca + " pnts de força\n");

        // Arma principal recebida na criação do personagem
        ArmaPrincipal armaPrincipal = stick;


        // Switch de escolha da criação do personagem
        Hero hero = null;
        switch (escolhaClasse) {
            case 1:
                System.out.println("\nNovo Heroi Criado");
                hero = new Warrior("Warrior", vida, vida, forca, 01, goldInicial, armaPrincipal);
                System.out.println("\n⚔\uFE0F Warrior Level: 1");
                System.out.println("❤\uFE0F " + vida + "/" + vida + "hp");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força: " + forca);
                System.out.println("\uD83D\uDCB0 Gold: " + goldInicial + "\n");
                System.out.println("--------------------------------------------------------------------------------------------------------------" + ANSI_RESET);
                break;
            case 2:
                System.out.println("\nNovo Heroi Criado");
                hero = new Archer("Archer", vida, vida, forca, 01, goldInicial, armaPrincipal);
                System.out.println("\n\uD83C\uDFF9 Archer Level: 1");
                System.out.println("❤\uFE0F " + vida + "/" + vida + "hp");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força: " + forca);
                System.out.println("\uD83D\uDCB0 Gold: " + goldInicial + "\n");
                System.out.println("--------------------------------------------------------------------------------------------------------------" + ANSI_RESET);
                break;
            case 3:
                System.out.println("\nNovo Heroi Criado");
                hero = new Mage("Mage", vida, vida, forca, 01, goldInicial, armaPrincipal);
                System.out.println("\n\uD83E\uDDD9\u200D♂\uFE0F Mage Level: 1");
                System.out.println("❤\uFE0F " + vida + "/" + vida + " HP");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força: " + forca);
                System.out.println("\uD83D\uDCB0 Gold: " + goldInicial + "\n");
                System.out.println("--------------------------------------------------------------------------------------------------------------" + ANSI_RESET);
                break;
            default:
                System.out.println("escolha invalida" + ANSI_RESET);
        }
        return hero;
    }

    /**
     * Metodo para recomeçar o jogo ou sair.
     *
     * @param hero
     */
    public void morreu(Hero hero) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println(ANSI_CYAN);
        System.out.println("\n1.Retry com o mesmo Herói.\n2.Retry Sistema de Criação de Herói.\n3.Sair do Jogo.");
        System.out.print("Opção: ");
        int op = input.nextInt();
        boolean escolha = false;
        while (!escolha) {
            switch (op) {
                case 1:
                    System.out.println("\nRetry com o mesmo Herói...");
                    hero.setHpAtual(hero.getMaxHp());
                    intro(hero);
                    escolha = true;
                    break;
                case 2:
                    System.out.println("\nRetry Sistema de Criação de Herói...");
                    hero.inventario.clear();
                    criarPersonagem();
                    intro(hero);
                    escolha = true;
                    break;
                case 3:
                    System.out.println("\nObrigado por jogar.\n\nSaindo...");
                    System.exit(0);
                    escolha = true;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
        System.out.println(ANSI_RESET);
    }

    /**
     * Metodo para chamar o vendedor
     *
     * @param hero
     */
    public void chamarVendedor(Hero hero) {

        // ADD itens/armas na loja do vendedor
        Vendedor vendedor = new Vendedor();

        vendedor.adicionarItem(stick);
        vendedor.adicionarItem(superStaff);
        vendedor.adicionarItem(fireStaff);
        vendedor.adicionarItem(holyStaff);
        vendedor.adicionarItem(bow);
        vendedor.adicionarItem(fireBow);
        vendedor.adicionarItem(holyBow);
        vendedor.adicionarItem(sword);
        vendedor.adicionarItem(fireSword);
        vendedor.adicionarItem(holySword);
        vendedor.adicionarItem(lifepotionMinor);
        vendedor.adicionarItem(lifepotionMedium);
        vendedor.adicionarItem(lifepotionMajor);
        vendedor.adicionarItem(strenghtPotion);
        vendedor.adicionarItem(megaStrengthPotion);
        vendedor.adicionarItem(pedra);
        vendedor.adicionarItem(superPedra);
        vendedor.adicionarItem(buggyCode);


        System.out.print(ANSI_YELLOW);
        System.out.println("\n                            **********************\n                            * \uD83D\uDCB0 Salim's Shop \uD83D\uDCB0 *\n                            *     1.Comprar      *\n                            *     0.Sair         *\n                            **********************");
        System.out.print("\nOpção: ");
        int op = input.nextInt();
        while (op != 1 && op != 0) {
            System.out.println("\n                            **********************\n                            * \uD83D\uDCB0 Salim's Shop \uD83D\uDCB0 *\n                            *     1.Comprar      *\n                            *     0.Sair         *\n                            **********************");
            System.out.print("\nOpção: ");
            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.print(ANSI_BLUE);
                System.out.println("\n---------------------------------------------------------------------------------");
                System.out.print(ANSI_RESET);
                System.out.print(ANSI_YELLOW);
                vendedor.imprimirLoja(hero);
                System.out.print(ANSI_RESET);
                System.out.print(ANSI_BLUE);
                System.out.println("---------------------------------------------------------------------------------");
                System.out.print(ANSI_RESET);
                System.out.print(ANSI_BLUE);
                System.out.println("Digite 0 para sair                                        " + hero.getNome() + " -     ❤\uFE0F " + hero.getHpAtual() + "/" + hero.getMaxHp() + "hp\n                                                                    \uD83D\uDCAA\uD83C\uDFFB Força: " + hero.getForca() + "\n                                                                    \uD83D\uDCB0 Gold: " + hero.gold);
                System.out.print("\nOpção: ");
                System.out.print(ANSI_RESET);
                System.out.print(ANSI_YELLOW);
                int itemIndex = input.nextInt();
                vendedor.vender(hero, itemIndex);
                while (itemIndex != 0) {
                    System.out.print(ANSI_BLUE);
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.print(ANSI_RESET);
                    System.out.print(ANSI_YELLOW);
                    vendedor.imprimirLoja(hero);
                    System.out.print(ANSI_RESET);
                    System.out.print(ANSI_BLUE);
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.print(ANSI_RESET);
                    System.out.print(ANSI_BLUE);
                    System.out.println("Digite 0 para sair                                        " + hero.getNome() + " -   ❤\uFE0F " + hero.getHpAtual() + "/" + hero.getMaxHp() + "hp\n                                                                    \uD83D\uDCAA\uD83C\uDFFB Força: " + hero.getForca() + "\n                                                                    \uD83D\uDCB0 Gold: " + hero.gold);
                    System.out.print("\nOpção: ");
                    System.out.print(ANSI_RESET);
                    System.out.print(ANSI_YELLOW);
                    itemIndex = input.nextInt();
                    vendedor.vender(hero, itemIndex);
                }
            case 0:
                System.out.println("\nInventario:");
                hero.mostrarInventario();
            default:
                break;
        }
        System.out.print(ANSI_RESET);
    }

    /**
     * Intro da história do jogo
     */
    public void intro(Hero hero) throws FileNotFoundException {
        try {
            Thread.sleep(3000);
            String pathPotato = "RPG/Art/potato.txt";
            System.out.println(ANSI_GOLD + ANSI_BGBLACK + "\n**************************************************************************************************************");
            imprimirFicheiro(pathPotato);
            System.out.println();
            System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆        No pacífico reino de Simplória, onde não acontece nada de especial.        ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
            System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆                Governado pelo Rei Carlos, que não faz grande coisa.               ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
            System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆                       Um reino próspero e calmo, até demais.                      ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
            System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆                      Infelizmente, essa calma chega ao fim...                     ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
            System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆              Quando tu! O nosso Herói encontra uma batata por acaso!              ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
            System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆             Parece uma simples Batata, mas ela carrega uma PROFECIA!              ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
            System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆     Agora, cabe ao Herói descobrir o que diz a profecia e... salvar o mundo?!     ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆\n");
            System.out.println("                                              Quem sabe?!");
            System.out.println("\n**************************************************************************************************************");
            System.out.println(ANSI_RESET);
            inicio(hero);
            musicaIntro.stopMusic();
        } catch (InterruptedException e) {
            System.out.println();
        }
    }

    /**
     * Sala Principal
     */
    public void inicio(Hero hero) throws FileNotFoundException {
        musicaIntro.stopMusic();
        musicaJogo.play("RPG/MP3/jogo.mp3");

        try {
            Thread.sleep(20000);
            System.out.print(ANSI_GREEN + "\nNuma manhã qualquer, o nosso Herói segue sem destino até ouvir um sussurro:'Olha para cima!'\nDe repente, é atingido por uma batata do céu que se revela mágica\nE lhe pede para a levar ao Monastério, ou o Rei Demónio destruirá o reino.\nAgora, o Herói tem um objetivo, embora pouco claro, e deve enfrentar as forças do mal que tentarão impedi-lo.\n");
            System.out.println("\nSeguindo pela floresta, encontras uma estrada e és avistado por bandidos possuídos! Prepara-te!\n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        System.out.print(ANSI_RED);

        //LUTA 1
        try {
            Thread.sleep(10000);
            hero.atacar(joca);
        } catch (InterruptedException e) {
            System.out.println();
        }
        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        System.out.println(ANSI_RESET);
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_GREEN + "\n Outro bandido, prepare-se!  \n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        //LUTA 2
        System.out.print(ANSI_RED);
        hero.atacar(quim);

        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        System.out.println(ANSI_RESET);
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_GREEN + "\n O lider dos bandidos apareceu!  \n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        //LUTA 3
        System.out.print(ANSI_RED);
        hero.atacar(zequinha);
        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        System.out.print(ANSI_RESET);
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_GREEN + "\nA estrada se divide em 3 caminhos...\nQual devemos seguir?\n\nMas antes vou comprar algo com aquele vendedor pois o Vitor pediu. \uD83D\uDE01" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        try {
            Thread.sleep(5000);
            System.out.print(ANSI_YELLOW);
            chamarVendedor(hero);
            System.out.print(ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        //POTION
        System.out.print(ANSI_RED);
        hero.potionUse();
        System.out.print(ANSI_RESET);


        System.out.println(ANSI_GREEN + "\nQual caminho devo serguir?\n\n1.Montanha da Morte\n2.Labirinto Tempestuoso\n3.Vale Sombrio");
        System.out.print("Opção: ");
        int op = input.nextInt();
        while (op != 1 && op != 2 && op != 3) {
            System.out.println("\nOpção invalida\n");
            System.out.println("\nQual caminho devo serguir?\n\n1.Montanha da Morte\n2.Labirinto Tempestuoso\n3.Vale Sombrio");
            System.out.print("Opção: ");
            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("\nA Montanha da Morte não me mete medo! ao todo..." + ANSI_RESET);
                montanhaMorte(hero);
                break;
            case 2:
                System.out.println("\nEsse Labirinto Tempestuoso vai perder a fama depois que conquista-lo! espero..." + ANSI_RESET);
                labirintoTempestuoso(hero);
                break;
            case 3:
                System.out.println("\nVale das Sombras será um passeio no campo! E os insetos?!..." + ANSI_RESET);
                valeSombrio(hero);
            default:
                break;
        }
    }

    public void montanhaMorte(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN + "\n\nMontanha da Morte");

        try {
            Thread.sleep(2000);
            System.out.println("\nSeguindo pela montanha, somos atacados por um Goblin!\n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //LUTA GOBLIN
        System.out.print(ANSI_RED);
        try {
            Thread.sleep(2000);
            hero.atacar(goblin);
        } catch (InterruptedException e) {
            System.out.println();
        }

        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        System.out.print(ANSI_RESET);
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_GREEN + "\nMais à frente, uma bifurcação." + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //POTION
        try {
            Thread.sleep(2000);
            System.out.print(ANSI_RED);
            hero.potionUse();
            System.out.print(ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        System.out.println(ANSI_GREEN + "\nQual caminho devo serguir?\n\n1.Subir as pedras\n2.Seguir pela caverna");
        System.out.print("Opção: ");
        int op = input.nextInt();
        while (op != 1 && op != 2 && op != 3) {
            System.out.println("\nOpção invalida\n");
            System.out.println("\nQual caminho devo serguir?\n\n1.Subir as pedras\n2.Seguir pela caverna");
            System.out.print("Opção: ");
            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("\nEspero não cair..." + ANSI_RESET);
                subirPedras(hero);
                break;
            case 2:
                System.out.println("\nEssa caverna parese perigosa!" + ANSI_RESET);
                caverna(hero);
                break;
            default:
                break;
        }
    }

    public void labirintoTempestuoso(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN);
        System.out.println("Labirinto Tempestuoso");


        //O QUE OCORRE NA SALA

        System.out.println(ANSI_RESET);
        System.out.print(ANSI_RED);
        System.out.println("\nMelhor recuperar o HP antes de continuar...");
        System.out.println("Gostaria de usar uma poção?\n1.Sim\n2.Não");
        int hp = input.nextInt();
        switch (hp) {
            case 1:
                hero.potionUse();
                break;
            case 2:
                break;
            default:
                System.out.println("invalido");
        }
        System.out.print(ANSI_RESET);
        System.out.println(ANSI_GREEN);
        System.out.println("Qual caminho devo serguir?\n");
        System.out.println("1.Esquerda");
        System.out.println("2.Direita");
        int op = input.nextInt();
        while (op != 1 && op != 2 && op != 3) {
            System.out.println("\nOpção invalida\n");
            System.out.println("Qual caminho devo serguir?\n");
            System.out.println("1.Esquerda");
            System.out.println("2.Direita");

            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("É tudo igual!?");
                labesquerda(hero);
                break;
            case 2:
                System.out.println("É tudo igual!?");
                labdireita(hero);
                break;
            default:
                break;
        }
        System.out.print(ANSI_RESET);
    }

    public void valeSombrio(Hero hero) {
        System.out.println(ANSI_GREEN);
        System.out.println("Vale Sombrio");


        //O QUE OCORRE NA SALA

        System.out.println(ANSI_RESET);
        System.out.print(ANSI_RED);
        System.out.println("\nMelhor recuperar o HP antes de continuar...");
        System.out.println("Gostaria de usar uma poção?\n1.Sim\n2.Não");
        int hp = input.nextInt();
        switch (hp) {
            case 1:
                hero.potionUse();
                break;
            case 2:
                break;
            default:
                System.out.println("invalido");
        }
        System.out.print(ANSI_RESET);
        System.out.println(ANSI_GREEN);
        System.out.println("?");
        caminhoFloresta(hero);
        System.out.println(ANSI_RESET);
    }

    public void subirPedras(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN + "\nSubir Pedras");

        try {
            Thread.sleep(2000);
            System.out.println("\nIncrível, como é que um orc veio parar aqui?\n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //LUTA ORC
        System.out.print(ANSI_RED);
        try {
            Thread.sleep(2000);
            hero.atacar(orc);
        } catch (InterruptedException e) {
            System.out.println();
        }

        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        System.out.print(ANSI_RESET);
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_GREEN + "\nEsse caminho segue apenas numa direção..." + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //POTION
        try {
            Thread.sleep(2000);
            System.out.print(ANSI_RED);
            hero.potionUse();
            System.out.print(ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        System.out.println(ANSI_GREEN + "\nDevo seguir pelo Caminho estreiro..\n" + ANSI_RESET);
        caminhoEstreito(hero);

    }

    public void labesquerda(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN);
        System.out.println("Labirinto Caminho Esquerdo");


        //O QUE OCORRE NA SALA

        System.out.println(ANSI_RESET);
        System.out.print(ANSI_RED);
        System.out.println("\nMelhor recuperar o HP antes de continuar...");
        System.out.println("Gostaria de usar uma poção?\n1.Sim\n2.Não");
        int hp = input.nextInt();
        switch (hp) {
            case 1:
                hero.potionUse();
                break;
            case 2:
                break;
            default:
                System.out.println("invalido");
        }
        System.out.print(ANSI_RESET);
        System.out.println(ANSI_GREEN);
        System.out.println("Qual caminho devo serguir?\n");
        System.out.println("1.Caminho estranho");
        System.out.println("2.Seguir pelo corredor");
        int op = input.nextInt();
        while (op != 1 && op != 2) {
            System.out.println("\nOpção invalida\n");
            System.out.println("Qual caminho devo serguir?\n");
            System.out.println("1.Caminho estranho");
            System.out.println("2.Seguir pelo corredor");

            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("Uma Caverna!");
                caverna(hero);
                break;
            case 2:
                System.out.println("Acho que estou perdido...");
                corredor(hero);
                break;
            default:
                break;
        }
        System.out.println(ANSI_RESET);
    }

    public void labdireita(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN);
        System.out.println("Labirinto Caminho Direito");


        //O QUE OCORRE NA SALA

        System.out.println(ANSI_RESET);
        System.out.print(ANSI_RED);
        System.out.println("\nMelhor recuperar o HP antes de continuar...");
        System.out.println("Gostaria de usar uma poção?\n1.Sim\n2.Não");
        int hp = input.nextInt();
        switch (hp) {
            case 1:
                hero.potionUse();
                break;
            case 2:
                break;
            default:
                System.out.println("invalido");
        }
        System.out.print(ANSI_RESET);
        System.out.println(ANSI_GREEN);
        System.out.println("Qual caminho devo serguir?\n");
        System.out.println("1.Caminho estreito pela direita");
        System.out.println("2.Seguir em frente");
        int op = input.nextInt();
        while (op != 1 && op != 2) {
            System.out.println("\nOpção invalida\n");
            System.out.println("Qual caminho devo serguir?\n");
            System.out.println("1.Caminho estreito pela direita");
            System.out.println("2.Seguir em frente");

            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("Ué?!");
                labesquerda(hero);
                break;
            case 2:
                System.out.println("Essa caverna parese perigosa!");
                corredorLargo(hero);
                break;
            default:
                break;
        }
        System.out.println(ANSI_RESET);
    }

    public void caminhoFloresta(Hero hero) {
        System.out.println(ANSI_GREEN);
        System.out.println("Caminho da Floresta");


        //O QUE OCORRE NA SALA

        System.out.println(ANSI_RESET);
        System.out.print(ANSI_RED);
        System.out.println("\nMelhor recuperar o HP antes de continuar...");
        System.out.println("Gostaria de usar uma poção?\n1.Sim\n2.Não");
        int hp = input.nextInt();
        switch (hp) {
            case 1:
                hero.potionUse();
                break;
            case 2:
                break;
            default:
                System.out.println("invalido");
        }
        System.out.print(ANSI_RESET);
        System.out.println(ANSI_GREEN);
        System.out.println("Tenho que encarar esse lodo!?\n");
        lodo(hero);
        System.out.print(ANSI_RESET);
    }

    public void caminhoEstreito(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN + "Caminho Estreito");

        try {
            Thread.sleep(2000);
            System.out.println("\nMais um Orc\n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //LUTA ORC
        System.out.print(ANSI_RED);
        try {
            Thread.sleep(2000);
            hero.atacar(orc);
        } catch (InterruptedException e) {
            System.out.println();
        }

        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        System.out.println(ANSI_RESET);
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_GREEN + "Esse caminho segue apenas numa direção..." + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //POTION
        try {
            Thread.sleep(2000);
            System.out.print(ANSI_RED);
            hero.potionUse();
            System.out.print(ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }


        System.out.println(ANSI_GREEN + "\nMelhor seguir por esta Trilha da Montanha...\n" + ANSI_RESET);
        trilhaMontanha(hero);
    }

    public void caverna(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN + "\nCaverna");

        try {
            Thread.sleep(2000);
            System.out.println("\nIncrível, como é que um orc veio parar aqui?\n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //LUTA ORC
        System.out.print(ANSI_RED);
        try {
            Thread.sleep(2000);
            hero.atacar(orc);
        } catch (InterruptedException e) {
            System.out.println();
        }
        System.out.println(ANSI_RESET);
        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_GREEN + "Esse caminho segue apenas numa direção..." + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //POTION
        try {
            Thread.sleep(2000);
            System.out.print(ANSI_RED);
            hero.potionUse();
            System.out.print(ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        System.out.print(ANSI_RESET);
        System.out.println(ANSI_GREEN + "Finalmente a saida!\n" + ANSI_RESET);
        trilhaMontanha(hero);
    }

    public void corredor(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN);
        System.out.println("Saida do Labirinto");


        //O QUE OCORRE NA SALA

        System.out.println(ANSI_RESET);
        System.out.print(ANSI_RED);
        System.out.println("\nMelhor recuperar o HP antes de continuar...");
        System.out.println("Gostaria de usar uma poção?\n1.Sim\n2.Não");
        int hp = input.nextInt();
        switch (hp) {
            case 1:
                hero.potionUse();
                break;
            case 2:
                break;
            default:
                System.out.println("invalido");
        }
        System.out.print(ANSI_RESET);
        System.out.println(ANSI_GREEN);
        System.out.println("Estou no cume de uma montanha!\n");
        trilhaMontanha(hero);
        System.out.println(ANSI_RESET);
    }

    public void corredorLargo(Hero hero) {
        System.out.println(ANSI_GREEN);
        System.out.println("Corredor Largo");


        //O QUE OCORRE NA SALA

        System.out.println(ANSI_RESET);
        System.out.print(ANSI_RED);
        System.out.println("\nMelhor recuperar o HP antes de continuar...");
        System.out.println("Gostaria de usar uma poção?\n1.Sim\n2.Não");
        int hp = input.nextInt();
        switch (hp) {
            case 1:
                hero.potionUse();
                break;
            case 2:
                break;
            default:
                System.out.println("invalido");
        }
        System.out.print(ANSI_RESET);
        System.out.println(ANSI_GREEN);
        System.out.println("Apenas é possivel ir em frente...");
        salasaida(hero);

        System.out.println(ANSI_RESET);
    }

    public void lodo(Hero hero) {
        System.out.println(ANSI_GREEN);
        System.out.println("Lodo");


        //O QUE OCORRE NA SALA

        System.out.print(ANSI_RESET);
        System.out.print(ANSI_RED);
        System.out.println("\nMelhor recuperar o HP antes de continuar...");
        System.out.println("Gostaria de usar uma poção?\n1.Sim\n2.Não");
        int hp = input.nextInt();
        switch (hp) {
            case 1:
                hero.potionUse();
                break;
            case 2:
                break;
            default:
                System.out.println("invalido");
        }
        System.out.print(ANSI_RESET);
        System.out.println(ANSI_GREEN);
        System.out.println("O que é aquilo?\n");
        chest(hero);
        System.out.print(ANSI_RESET);
    }

    public void cume(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN + "\nCume");

        try {
            Thread.sleep(2000);
            System.out.println("\nIncrível, como é que um orc veio parar aqui?\n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //LUTA ORC
        System.out.print(ANSI_RED);
        try {
            Thread.sleep(2000);
            hero.atacar(orc);
        } catch (InterruptedException e) {
            System.out.println();
        }
        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        System.out.println(ANSI_RESET);
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_GREEN + "\nhm? Salim!" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        try {
            Thread.sleep(5000);
            System.out.print(ANSI_YELLOW);
            chamarVendedor(hero);
            System.out.print(ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //POTION
        try {
            Thread.sleep(2000);
            System.out.print(ANSI_RED);
            hero.potionUse();
            System.out.print(ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //50% random de encontrar salasecreta
        Random random = new Random();
        boolean salasecret = random.nextBoolean();
        if (salasecret) {
            System.out.println(ANSI_GREEN + "\nIsso é uma pedra falsa?\n1.Mover a pedra\n2.Melhor não tocar nisso...");
            System.out.print("Opção: ");
            int op = input.nextInt();
            while (op != 1 && op != 2) {
                System.out.println("\nIsso é uma pedra falsa?\n1.Mover a pedra\n2.Melhor não tocar nisso...");
                System.out.print("Opção: ");
                op = input.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("\nUma sala secreta!\n" + ANSI_RESET);
                    sala19Secret(hero);
                    break;
                case 2:
                    System.out.println("\nVou seguir o meu caminho...\nParece um entrada secreta para o Monastério...\n" + ANSI_RESET);
                    monasterio(hero);
                default:
                    break;
            }
        }
        System.out.println(ANSI_GREEN + "Parece um entrada secreta para o Monastério...\n" + ANSI_RESET);
        monasterio(hero);
    }

    public void trilhaMontanha(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN + "Trilha da Montanha");

        try {
            Thread.sleep(2000);
            System.out.println("\nParece que vou ter de enfrentar este Troll se quiser chegar ao cume.\n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //LUTA TROLL
        System.out.print(ANSI_RED);
        try {
            Thread.sleep(2000);
            hero.atacar(troll);
        } catch (InterruptedException e) {
            System.out.println();
        }
        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        System.out.println(ANSI_RESET);
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_GREEN + "Mais à frente, uma bifurcação." + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        //POTION
        try {
            Thread.sleep(2000);
            System.out.print(ANSI_RED);
            hero.potionUse();
            System.out.print(ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        System.out.println(ANSI_GREEN + "\nQual caminho devo serguir?\n1.Cume\n2.Atravessar uma Ponte");
        System.out.print("Opção: ");
        int op = input.nextInt();
        while (op != 1 && op != 2) {
            System.out.println("\nOpção invalida\n");
            System.out.println("\\nQual caminho devo serguir?\n1.Cume\n2.Atravessar uma Ponte");
            System.out.print("Opção: ");
            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("\nParece alto..." + ANSI_RESET);
                cume(hero);
                break;
            case 2:
                System.out.println("\nFinalmente!" + ANSI_RESET);
                entradaMonasterio(hero);
                break;
            default:
                break;
        }
    }

    public void salasaida(Hero hero) {
        System.out.println("Sala sem Saida?!");

        //O QUE OCORRE NA SALA

    }

    public void chest(Hero hero) {
        System.out.println("Chest");

        //O QUE OCORRE NA SALA

    }

    public void entradaMonasterio(Hero hero) throws FileNotFoundException {
        musicaJogo.stopMusic();
        musicaFinal.play("RPG/MP3/boss.mp3");
        System.out.println(ANSI_GREEN + "Entrada do Monastério");
        System.out.println("Olha o Salim!" + ANSI_RESET);
        chamarVendedor(hero);
        monasterio(hero);
    }

    public void monasterio(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_GREEN + "Monasterio");

        try {
            Thread.sleep(2000);
            System.out.println("\nQuem é esse chifrudo vermelho? Não parece feliz em me ver...\n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //LUTA REI DEMONIO
        System.out.print(ANSI_RED);
        try {
            Thread.sleep(2000);
            hero.atacar(reiDemonio);
        } catch (InterruptedException e) {
            System.out.println();
        }

        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        System.out.println(ANSI_RESET);
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_GREEN + "\nA Batata não parece ter ficado muito contente com isso." + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //POTION
        try {
            Thread.sleep(2000);
            System.out.print(ANSI_RED);
            hero.potionUse();
            System.out.print(ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }
        System.out.println(ANSI_GREEN + "\nO que eu devo fazer?\n1.Colocar a Batata no TRONO\n2.Colocar a Batata na PANELA DOURADA?");
        System.out.print("Opção: ");
        int op = input.nextInt();
        while (op != 1 && op != 2) {
            System.out.println("O que eu devo fazer?\n1.Colocar a Batata no TRONO\n2.Colocar a Batata na PANELA DOURADA?");
            System.out.print("Opção: ");
            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("\nDeus Salve o Rei BATATA!\nNão muito contente, o Rei Batata entrega-te um chocolate e agradece pelos teus esforços.\n" + ANSI_RESET);
                end(hero);
                break;
            case 2:
                System.out.println("\nUau, quem é esse que apareceu do nada!?" + ANSI_RESET);
                profecia(hero);
                break;
            default:
                break;
        }
    }

    public void sala19Secret(Hero hero) throws FileNotFoundException {
        System.out.println(ANSI_YELLOW + "Sala Secreta");

        System.out.println("\nUm tesouro!\nO pesadelo do Vitor!");
        hero.chest(buggyCode);
        System.out.println("\nConsumivel 'Buggy Code' adicionado ao inventário" + ANSI_RESET);
        System.out.println(ANSI_RED);
        System.out.println("Inventário:");
        hero.mostrarInventario();
        System.out.println(ANSI_RESET);
        System.out.println(ANSI_GREEN + "\nParece uma entrada secreta para o Monastério...\n" + ANSI_RESET);
        monasterio(hero);
        musicaFinal.stopMusic();
    }

    public void profecia(Hero hero) throws FileNotFoundException {
        musicaJogo.stopMusic();
        musicaFinal.play("RPG/MP3/action.mp3");
        System.out.println(ANSI_YELLOW + "\nA PROFECIA");

        try {
            Thread.sleep(2000);
            System.out.println("\nO ser misterioso apresenta-se como Master Chef Vítor.\nEnfurecido por teres arruinado os planos dele de dominar o reino, ele parte para uma batalha final!\n" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println();
        }

        //LUTA MASTER CHEF VITOR
        System.out.print(ANSI_PURPLE);
        try {
            Thread.sleep(2000);
            hero.atacar(vitor);
        } catch (InterruptedException e) {
            System.out.println();
        }
        if (hero.getHpAtual() <= 0) {
            musicaJogo.stopMusic();
            morreu(hero);
        }
        System.out.println(ANSI_RESET);
        try {
            Thread.sleep(2000);
            System.out.println(ANSI_YELLOW + "\nCom a derrota desse ser maligno, o reino ficará a salvo!\nA batata agradece por não teres desistido e questiona como soubeste sobre a profecia da panela dourada?\nEnfim, toma aqui um chocolate e adeus.\n" + ANSI_RESET);
            finalVerdadeiro(hero);
        } catch (InterruptedException e) {
            System.out.println();
        }
    }

    public void end(Hero hero) throws FileNotFoundException {
        musicaFinal.stopMusic();
        musicaEnd.play("RPG/MP3/end.mp3");
        System.out.println(ANSI_YELLOW + "END...?");
        System.out.println("\nParabéns, derrotaste o Rei Demónio e consagraste o Rei Batata\nEntretanto, um ser misterioso esperava por esse momento para realizar a profecia e dominar todo o reino!\nFalhaste em proteger o reino, mas ganhaste um chocolate!");
        System.out.println("\n\nFIM\n\n" + ANSI_RESET);
        morreu(hero);
    }

    public void finalVerdadeiro(Hero hero) throws FileNotFoundException {
        musicaFinal.stopMusic();
        musicaEnd.play("RPG/MP3/end.mp3");
        System.out.println(ANSI_YELLOW + "Parabéns, derrotaste o maior inimigo do reino e consagraste o Deus Batata!\nCom o reino a salvo, agora podes fazer um puré de batata com salsicha na panela dourada.");
        System.out.println("\n\nFIM\n\n" + ANSI_RESET);
        morreu(hero);


        System.out.print(ANSI_RED);
        System.out.println(ANSI_RESET);


    }

}





