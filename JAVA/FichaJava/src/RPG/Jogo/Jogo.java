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

import java.io.FileInputStream;
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

    // Bandidos
    NPC joca = new NPC("Joca", 150, 150, 300, 10);
    NPC quim = new NPC("Quim", 150, 150, 300, 10);
    NPC zequinha = new NPC("Zequinha", 250, 50, 400, 50);


    // Vale Sombrio
    NPC aranhaGigante = new NPC("Aranha Gigante", 200, 50, 35, 10);
    NPC abelhaAssassina = new NPC("Abelha Assassina", 250, 50, 40, 10);
    NPC insectoide = new NPC("Insectoide", 300, 50, 50, 25);

    // Labirinto Tempestuoso
    NPC gargula = new NPC("Gargula", 200, 50, 35, 5);
    NPC golem = new NPC("Golem", 250, 50, 40, 10);
    NPC minotauro = new NPC("Minotauro", 300, 50, 50, 20);

    //Montanha da Morte
    NPC goblin = new NPC("Goblin", 200, 50, 35, 20);
    NPC orc = new NPC("Orc", 250, 50, 40, 15);
    NPC troll = new NPC("Troll", 300, 50, 50, 30);

    // BOSS
    NPC reiDemonio = new NPC("Rei Demonio", 500, 50, 70, 1000);
    NPC vitor = new NPC("Dark Vitor", 200, 50, 100, 0);

    ArrayList<String> heroisPermitidos = new ArrayList<>(List.of("Warrior", "Mage", "Archer"));
    ArrayList<String> heroiWarrior = new ArrayList<>(List.of("Warrior"));
    ArrayList<String> heroiArcher = new ArrayList<>(List.of("Archer"));
    ArrayList<String> heroiMage = new ArrayList<>(List.of("Mage"));

    // Criação Consumiveis
    Potion lifepotionMinor = new Potion("Minor Potion", 10, heroisPermitidos, 20, 0);
    Potion lifepotionMedium = new Potion("Medium Potion", 20, heroisPermitidos, 40, 0);
    Potion lifepotionMajor = new Potion("Major Potion", 30, heroisPermitidos, 60, 0);
    Potion strenghtPotion = new Potion("Strength Potion", 50, heroisPermitidos, 0, 10);
    Potion megaStrengthPotion = new Potion("Mega Strength Potion", 100, heroisPermitidos, 0, 20);

    // Criação Consumivel de Combate
    ConsumivelCombate bomba = new ConsumivelCombate("Bomba", 15, heroisPermitidos, 50);
    ConsumivelCombate superBomba = new ConsumivelCombate("Super Bomba", 30, heroisPermitidos, 100);
    ConsumivelCombate godKiller = new ConsumivelCombate("GOD KILLER", 100, heroisPermitidos, 999);

    // Criação Armas
    ArmaPrincipal stick = new ArmaPrincipal("Stick", 0, 10, 20, heroisPermitidos);

    ArmaPrincipal superStaff = new ArmaPrincipal("Super Staff", 10, 20, 40, heroiMage);
    ArmaPrincipal fireStaff = new ArmaPrincipal("Fire Staff", 30, 40, 60, heroiMage);
    ArmaPrincipal holyStaff = new ArmaPrincipal("Holy Staff", 50, 60, 80, heroiMage);

    ArmaPrincipal bow = new ArmaPrincipal("Bow", 10, 20, 40, heroiArcher);
    ArmaPrincipal fireBow = new ArmaPrincipal("Fire Bow", 30, 40, 60, heroiArcher);
    ArmaPrincipal holyBow = new ArmaPrincipal("Holy Bow", 50, 60, 80, heroiArcher);


    ArmaPrincipal sword = new ArmaPrincipal("Sword", 10, 20, 40, heroiWarrior);
    ArmaPrincipal fireSword = new ArmaPrincipal("Fire Sword", 30, 40, 60, heroiWarrior);
    ArmaPrincipal holySword = new ArmaPrincipal("Holy Sword", 50, 60, 80, heroiWarrior);

    /**
     * Método para tocar musicas
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
     * Método para chamar o vendedor
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
        vendedor.adicionarItem(bomba);
        vendedor.adicionarItem(superBomba);
        vendedor.adicionarItem(godKiller);


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
                System.out.println("Digite 0 para sair                                        " + hero.getNome() + " - ❤\uFE0F " + hero.getHpAtual() + "/" + hero.getMaxHp() + "hp\n                                                                    \uD83D\uDCAA\uD83C\uDFFB Força: " + hero.getForca() + "\n                                                                    \uD83D\uDCB0 Gold: " + hero.gold);
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
                    System.out.println("Digite 0 para sair                                        " + hero.getNome() + " - ❤\uFE0F " + hero.getHpAtual() + "/" + hero.getMaxHp() + "hp\n                                                                    \uD83D\uDCAA\uD83C\uDFFB Força: " + hero.getForca() + "\n                                                                    \uD83D\uDCB0 Gold: " + hero.gold);
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
     * Mátodo para recomeçar o jogo ou sair.
     *
     * @param hero
     */
    public void morreu(Hero hero) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n1.Jogar novamente com o mesmo Heroi.\n2.Jogar novamente com um novo Heroi.\n3.Sair do Jogo.");
        System.out.print("Opção: ");
        int op = input.nextInt();
        boolean escolha = false;
        while (!escolha) {
            switch (op) {
                case 1:
                    hero.setHpAtual(hero.getMaxHp());
                    hero.inventario.clear();
                    hero.setGold(20);
                    intro(hero);
                    escolha = true;
                    break;
                case 2:
                    criarPersonagem();
                    intro(hero);
                    escolha = true;
                    break;
                case 3:
                    System.exit(0);
                    escolha = true;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }

    /**
     * Método de criação do personagem
     *
     * @return
     */
    public Hero criarPersonagem() {
        musicaIntro.stopMusic();
        musicaIntro.play("C:/Users/thiag/Documents/CESAE/JAVA/FichaJava/src/RPG/MP3/action.mp3");

        // Escolher classe
        try {
            Thread.sleep(8000);
            System.out.println(ANSI_BLUE);
            System.out.println();
            System.out.println("                                        ⚔\uFE0F \uD83C\uDFF9 \uD83D\uDD2E \uD83D\uDDE1\uFE0F Criar Heroi \uD83D\uDDE1\uFE0F \uD83D\uDD2E \uD83C\uDFF9 ⚔\uFE0F");
            System.out.println();
            System.out.println("                            1.⚔\uFE0F Warrior - Bônus: Lento | -10 Dano | +20 Defesa | Gold x2");
            System.out.println("                            2.\uD83C\uDFF9 Archer - Bônus: 1ºturno x2 | Critical Arrow Dano x2 | -5 Defesa");
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
        System.out.print("\nEscolha: ");
        int escolhaDificuldade = input.nextInt();

        // Deve escolher 1 ou 2
        while (escolhaDificuldade != 1 && escolhaDificuldade != 2) {
            System.out.println();
            System.out.println("                                                  Dificuldade");
            System.out.println("                                          1.Easy - 300 Pontos Criação");
            System.out.println("                                          2.Hard - 200 Pontos Criação");
            System.out.print("\nEscolha: ");
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
                System.out.println("---------------------------------------------------------------------------------" + ANSI_RESET);
                break;
            case 2:
                System.out.println("\nNovo Heroi Criado");
                hero = new Archer("Archer", vida, vida, forca, 01, goldInicial, armaPrincipal);
                System.out.println("\n\uD83C\uDFF9 Archer Level: 1");
                System.out.println("❤\uFE0F " + vida + "/" + vida + "hp");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força: " + forca);
                System.out.println("\uD83D\uDCB0 Gold: " + goldInicial + "\n");
                System.out.println("---------------------------------------------------------------------------------" + ANSI_RESET);
                break;
            case 3:
                System.out.println("\nNovo Heroi Criado");
                hero = new Mage("Mage", vida, vida, forca, 01, goldInicial, armaPrincipal);
                System.out.println("\n\uD83E\uDDD9\u200D♂\uFE0F Mage Level: 1");
                System.out.println("❤\uFE0F " + vida + "/" + vida + " HP");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força: " + forca);
                System.out.println("\uD83D\uDCB0 Gold: " + goldInicial + "\n");
                System.out.println("---------------------------------------------------------------------------------" + ANSI_RESET);
                break;
            default:
                System.out.println("escolha invalida" + ANSI_RESET);
        }
        return hero;
    }

    /**
     * Intro da história do jogo
     */
    public void intro(Hero hero) {

        System.out.println(ANSI_GREEN + "\n******************************************************************************************************************************");
        System.out.println();
        System.out.println("                                             ◯ ☽ ◑    Eldoria    ◐ ❨ ◯\n");
        System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆                          Em um mundo onde a magia e o aço se entrelaçam.                               ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
        System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆                          Eldoria é uma terra vasta e cheia de mistérios.                               ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
        System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆                   Governada por reis sábios e protegida por guerreiros honrados.                       ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
        System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆           Mas uma antiga profecia, perdida no tempo, ameaça o equilíbrio de todo o reino.              ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
        System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆ Diz-se que, quando as estrelas alinharem-se de maneira particular, uma força sombria de outro mundo... ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
        System.out.println("                                             Tentará invadir Eldoria...\n");
        System.out.println("                         Apenas o Herói Destinado poderá impedir que as trevas consumam o reino.\n\n");
        System.out.println("                    Você é um jovem aventureiro que vive em uma pequena vila nas fronteiras de Eldoria. ");
        System.out.println("                            Aos 18 anos, decide partir em uma jornada para provar seu valor....");
        System.out.println("\n******************************************************************************************************************************" + ANSI_RESET);
        inicio(hero);
        musicaIntro.stopMusic();
    }

    /**
     * Sala Principal
     */
    public void inicio(Hero hero) {
        musicaIntro.stopMusic();
        musicaJogo.play("C:/Users/thiag/Documents/CESAE/JAVA/FichaJava/src/RPG/MP3/chase.mp3");
        System.out.print(ANSI_GREEN + "\nSeguindo pela estrada é possivel escutar gritos de socorro!");
        System.out.println("Um jovem aventureiro sendo atacado por bandidos!\n\nPrepare-se!\n");
        System.out.print(ANSI_RED);

        hero.atacar(joca);
        if (hero.getHpAtual() <= 0) {
            morreu(hero);
        }

        try {
            Thread.sleep(2000);
            System.out.println("\n Outro bandido, prepare-se!  \n");
        } catch (InterruptedException e) {
            System.out.println();
        }

        hero.atacar(quim);
        if (hero.getHpAtual() <= 0) {
            morreu(hero);
        }

        try {
            Thread.sleep(2000);
            System.out.println("\n O lider dos bandidos apareceu!  \n");
        } catch (InterruptedException e) {
            System.out.println();
        }

        hero.atacar(zequinha);
        if (hero.getHpAtual() <= 0) {
            morreu(hero);
        }


        System.out.print(ANSI_RESET);
        System.out.print(ANSI_GREEN);
        try {
            Thread.sleep(2000);
            System.out.println("\nO jovem aventureiro agradece a ajuda e diz que tentou chegar ao Monastério da Luz");
            System.out.println("Mas um grande monstro impediu sua passagem, apenas o Herói pode passar!\n");
            System.out.println("Ele segiu o caminho da cidade...\n");
            System.out.println("Ao fim da estrada temos os caminhos para o monastério, cada caminho tem a sua provação...\nQual devemos seguir?\n");
            System.out.println("Mas antes vou comprar algo com aquele vendedor pois o Vitor pediu. \uD83D\uDE01");
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
        System.out.print(ANSI_RED);
        hero.potionUse();
        System.out.print(ANSI_RESET);
        System.out.println(ANSI_GREEN);
        System.out.println("Qual caminho devo serguir?\n");
        System.out.println("1.Montanha da Morte");
        System.out.println("2.Labirinto Tempestuoso");
        System.out.println("3.Vale Sombrio");
        int op = input.nextInt();
        while (op != 1 && op != 2 && op != 3) {
            System.out.println("\nOpção invalida\n");
            System.out.println("Qual caminho devo serguir?\n");
            System.out.println("1.Montanha da Morte");
            System.out.println("2.Labirinto Tempestuoso");
            System.out.println("3.Vale Sombrio");
            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("A Montanha da Morte não me mete medo! ao todo...");
                montanhaMorte(hero);
                break;
            case 2:
                System.out.println("Esse Labirinto Tempestuoso vai perder a fama depois que conquista-lo! espero...");
                labirintoTempestuoso(hero);
                break;
            case 3:
                System.out.println("Vale das Sombras será um passeio no campo! E os insetos?!...");
                valeSombrio(hero);
            default:
                break;
        }
        System.out.println("------------------------------------------------------------------\n");
        System.out.println(ANSI_RESET);
    }

    public void montanhaMorte(Hero hero) {
        System.out.print(ANSI_GREEN);
        System.out.println("Montanha da Morte");


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
        System.out.println("Qual caminho devo serguir?\n");
        System.out.println("1.Subir as pedras");
        System.out.println("2.Seguir pela caverna");
        int op = input.nextInt();
        while (op != 1 && op != 2 && op != 3) {
            System.out.println("\nOpção invalida\n");
            System.out.println("Qual caminho devo serguir?\n");
            System.out.println("1.Subir as pedras");
            System.out.println("2.Seguir pela caverna");

            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("Espero não cair...");
                subirPedras(hero);
                break;
            case 2:
                System.out.println("Essa caverna parese perigosa!");
                caverna(hero);
                break;
            default:
                break;
        }
        System.out.print(ANSI_RESET);

    }

    public void labirintoTempestuoso(Hero hero) {
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
        System.out.println("Qual caminho devo serguir?\n");
        System.out.println("1.Subir as pedras");
        System.out.println("2.Seguir pela caverna");
        int op = input.nextInt();
        while (op != 1 && op != 2 && op != 3) {
            System.out.println("\nOpção invalida\n");
            System.out.println("Qual caminho devo serguir?\n");
            System.out.println("1.Subir as pedras");
            System.out.println("2.Seguir pela caverna");

            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("Espero não cair...");
                subirPedras(hero);
                break;
            case 2:
                System.out.println("Essa caverna parese perigosa!");
                caverna(hero);
                break;
            default:
                break;
        }
        System.out.println(ANSI_RESET);
    }

    public void subirPedras(Hero hero) {
        System.out.println(ANSI_GREEN);
        System.out.println("Subir Pedras");


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
        System.out.println("devo seguir pelo Caminho estreiro..\n");
        caminhoEstreito(hero);
        System.out.println(ANSI_RESET);
    }

    public void labesquerda(Hero hero) {
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

    public void labdireita(Hero hero) {
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

    public void caminhoEstreito(Hero hero) {
        System.out.println("Caminho Estreito");


        //O QUE OCORRE NA SALA


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
        System.out.println("Melhor seguir por esta Trilha da Montanha...\n");
        trilhaMontanha(hero);
    }

    public void caverna(Hero hero) {
        System.out.println(ANSI_GREEN);
        System.out.println("Caverna");


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
        System.out.println("Finalmente a saida!\n");
        trilhaMontanha(hero);
        System.out.println(ANSI_RESET);
    }

    public void corredor(Hero hero) {
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

    public void cume(Hero hero) {
        System.out.println("sala13");


        //O QUE OCORRE NA SALA

        //50% random de encontrar salasecreta
        Random random = new Random();
        boolean salasecret = random.nextBoolean();
        if (salasecret) {
            System.out.println("Isso é uma pedra falsa?");
            System.out.println("1.Mover a pedra");
            System.out.println("2.Melhor não tocar nisso...");
            int op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("\nUma sala secreta!");
                    sala19Secret(hero);
                    break;
                case 2:
                    System.out.println("Vou seguir o meu caminho...");
            }
        }
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
        System.out.println("Parece um entrada secreta para o Monastério...\n");
        entradaMonasterio(hero);
    }

    public void trilhaMontanha(Hero hero) {
        System.out.println("Trilha da Montanha");


        //O QUE OCORRE NA SALA


        System.out.print(ANSI_RED);

        System.out.print(ANSI_RESET);
        System.out.println("Qual caminho devo serguir?\n");
        System.out.println("1.Cume");
        System.out.println("2.Atravessar uma Ponte");
        int op = input.nextInt();
        while (op != 1 && op != 2) {
            System.out.println("\nOpção invalida\n");
            System.out.println("Qual caminho devo serguir?\n");
            System.out.println("1.Cume");
            System.out.println("2.Atravessar uma Ponte");

            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("Parece alto...");
                cume(hero);
                break;
            case 2:
                System.out.println("Finalmente!");
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

    public void entradaMonasterio(Hero hero) {
        musicaJogo.stopMusic();
        musicaFinal.play("C:/Users/thiag/Documents/CESAE/JAVA/FichaJava/src/RPG/MP3/boss.mp3");
        System.out.println("sala17");

        //O QUE OCORRE NA SALA

    }

    public void monasterio(Hero hero) {
        System.out.println("Monasterio");

        //O QUE OCORRE NA SALA

        hero.atacar(reiDemonio);


        System.out.println(ANSI_GREEN);
        System.out.println("Qual caminho devo serguir?\n");
        System.out.println("1.END");
        System.out.println("2.RITUAL");
        int op = input.nextInt();
        while (op != 1 && op != 2 && op != 3) {
            System.out.println("\nOpção invalida\n");
            System.out.println("Qual caminho devo serguir?\n");
            System.out.println("1.END");
            System.out.println("2.RITUAL");

            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("Espero não cair...");
                end(hero);
                break;
            case 2:
                System.out.println("Essa caverna parese perigosa!");
                ritual(hero);
                break;
            default:
                break;
        }
        System.out.print(ANSI_RESET);
    }

    public void sala19Secret(Hero hero) {
        System.out.println(ANSI_GREEN);
        System.out.println("Sala Secreta");

        System.out.println("Um tesouro!\nO que será que isso faz?!");
        hero.chest(godKiller);
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
        System.out.println("Parece um entrada secreta para o Monastério...\n");
        entradaMonasterio(hero);
        System.out.println(ANSI_RESET);
        musicaFinal.stopMusic();
    }

    public void ritual(Hero hero) {
        System.out.println("O RITUAL");

        //O QUE OCORRE NA SALA


        System.out.println(ANSI_RED);
        hero.atacar(vitor);
        System.out.println(ANSI_RESET);

        System.out.println(ANSI_GREEN);
        end(hero);
        System.out.println(ANSI_RESET);
        musicaFinal.stopMusic();
    }

    public void end(Hero hero) {
        musicaEnd.play("C:/Users/thiag/Documents/CESAE/JAVA/FichaJava/src/RPG/MP3/end.mp3");
        System.out.println("END");

        //O QUE OCORRE NA SALA

    }
}





