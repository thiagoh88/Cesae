package RPG.Jogo;

import RPG.Entidades.Archer;
import RPG.Entidades.Mage;
import RPG.Entidades.Warrior;
import RPG.Itens.ArmaPrincipal;
import RPG.Itens.ConsumivelCombate;
import RPG.Itens.Potion;
import RPG.Entidades.Hero;
import RPG.Entidades.NPC;
import RPG.Entidades.Vendedor;

import java.util.Scanner;

public class Jogo {

    Scanner input = new Scanner(System.in);

    /**
     * Método de criação do personagem
     *
     * @return
     */
    public Hero criarPersonagem() {

        // Escolher classe
        System.out.println();
        System.out.println();
        System.out.println(" ⚔\uFE0F\uD83D\uDEE1\uFE0F \uD83C\uDFF9 \uD83D\uDDE1\uFE0F Criar Heroi ⚔\uFE0F\uD83D\uDEE1\uFE0F \uD83C\uDFF9 \uD83D\uDDE1\uFE0F");
        System.out.println();
        System.out.println("             1.Warrior ⚔\uFE0F");
        System.out.println("             2.Archer \uD83C\uDFF9");
        System.out.println("             3.Mage \uD83E\uDDD9\u200D♂\uFE0F");
        System.out.print("Classe: ");
        int escolhaClasse = input.nextInt();

        // Deve escolher entre 1 e 3
        while (escolhaClasse != 1 && escolhaClasse != 2 && escolhaClasse != 3) {
            System.out.println("\n ⚔\uFE0F\uD83D\uDEE1\uFE0F \uD83C\uDFF9 \uD83D\uDDE1\uFE0F Criar Heroi ⚔\uFE0F\uD83D\uDEE1\uFE0F \uD83C\uDFF9 \uD83D\uDDE1\uFE0F");
            System.out.println();
            System.out.println("             1.Warrior ⚔\uFE0F");
            System.out.println("             2.Archer \uD83C\uDFF9");
            System.out.println("             3.Mage \uD83E\uDDD9\u200D♂\uFE0F");
            System.out.print("Classe: ");
            escolhaClasse = input.nextInt();
        }


        // Escolher dificuldade
        System.out.println();
        System.out.println("            Dificuldade");
        System.out.println("              1.Easy");
        System.out.println("              2.Hard");
        System.out.print("Escolha: ");
        int escolhaDificuldade = input.nextInt();

        // Deve escolher 1 ou 2
        while (escolhaDificuldade != 1 && escolhaDificuldade != 2) {
            System.out.println();
            System.out.println("            Dificuldade");
            System.out.println("              1.Easy");
            System.out.println("              2.Hard");
            System.out.print("Escolha: ");
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
        System.out.println("\nDistribua os pontos de criação");
        System.out.println("         Pontos: " + escolhaDificuldade);
        System.out.println("   Vida 1 ponto = 1 ponto: ");
        System.out.print("Vida: ");
        int vida = input.nextInt();
        System.out.println("  Força 1 ponto = 5 pontos: ");
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

        System.out.println("\nDistribuiu: " + vida + " pnts de vida e " + forca + " pnts de força");

        // Arma principal recebida na criação do personagem
        ArmaPrincipal armaPrincipal = new ArmaPrincipal("Stick", 0, 10, 20);

        // Switch de escolha da criação do personagem
        Hero hero = null;
        switch (escolhaClasse) {
            case 1:
                hero = new Warrior("Warrior", vida, vida, forca, 01, goldInicial, armaPrincipal);
                System.out.println("\nWarrior Level: 1");
                System.out.println("❤\uFE0F "+vida + "/" + vida + "hp");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força: " + forca);
                System.out.println("\uD83D\uDCB0 Gold: " + goldInicial + "\n");
                break;
            case 2:
                hero = new Archer("Archer", vida, vida, forca, 01, goldInicial, armaPrincipal);
                System.out.println("\nArcher Level: 1");
                System.out.println("❤\uFE0F "+vida + "/" + vida + "hp");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força: " + forca);
                System.out.println("\uD83D\uDCB0 Gold: " + goldInicial + "\n");
                break;
            case 3:
                hero = new Mage("Mage", vida, vida, forca, 01, goldInicial, armaPrincipal);
                System.out.println("\nMage Level: 1");
                System.out.println("❤\uFE0F "+vida + "/" + vida + " HP");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força: " + forca);
                System.out.println("\uD83D\uDCB0 Gold: " + goldInicial + "\n");
                break;
            default:
                System.out.println("escolha invalida");
        }
        return hero;
    }

    // Bandidos
    NPC joca = new NPC("Joca", 100, 30, 15, 10);
    NPC quim = new NPC("Quim", 100, 30, 15, 10);
    NPC zequinha = new NPC("Zequinha", 200, 200, 25, 50);


    // Vale Sombrio
    NPC aranhaGigante = new NPC("Aranha Gigante", 100, 10, 20, 10);
    NPC abelhaAssassina = new NPC("Abelha Assassina", 150, 15, 25, 10);
    NPC insectoide = new NPC("Insectoide", 200, 20, 35, 25);

    // Labirinto Tempestuoso
    NPC gargula = new NPC("Gargula", 300, 30, 10, 5);
    NPC golem = new NPC("Golem", 250, 25, 25, 10);
    NPC minotauro = new NPC("Minotauro", 350, 35, 35, 20);

    //Montanha da Morte
    NPC goblin = new NPC("Goblin", 150, 15, 30, 20);
    NPC orc = new NPC("Orc", 250, 25, 35, 15);
    NPC troll = new NPC("Troll", 300, 20, 40, 30);

    // BOSS
    NPC reiDemonio = new NPC("Rei Demonio", 600, 10, 40, 1000);
    NPC vitor = new NPC("Dark Vitor", 300, 30, 60, 0);


    // Criação Consumiveis
    Potion lifepotionMinor = new Potion("Minor Potion", 10, 20, 0);
    Potion lifepotionMedium = new Potion("Medium Potion", 20, 40, 0);
    Potion lifepotionMajor = new Potion("Major Potion", 30, 60, 0);
    Potion strenghtPotion = new Potion("Strength Potion", 50, 0, 10);
    Potion megaStrengthPotion = new Potion("Mega Strength Potion", 100, 0, 20);

    // Criação Consumivel de Combate
    ConsumivelCombate bomba = new ConsumivelCombate("Bomba", 15, 50);
    ConsumivelCombate superBomba = new ConsumivelCombate("Super Bomba", 30, 100);
    ConsumivelCombate godKiller = new ConsumivelCombate("GOD KILLER", 100, 999);

    // Criação Armas
    ArmaPrincipal stick = new ArmaPrincipal("Stick", 0, 10, 20);
    ArmaPrincipal superStaff = new ArmaPrincipal("Super Staff", 10, 20, 40);
    ArmaPrincipal fireStaff = new ArmaPrincipal("Fire Staff", 30, 40, 60);
    ArmaPrincipal holyStaff = new ArmaPrincipal("Holy Staff", 50, 60, 80);
    ArmaPrincipal bow = new ArmaPrincipal("Bow", 10, 20, 40);
    ArmaPrincipal fireBow = new ArmaPrincipal("Fire Bow", 30, 40, 60);
    ArmaPrincipal holyBow = new ArmaPrincipal("Holy Bow", 50, 60, 80);
    ArmaPrincipal sword = new ArmaPrincipal("Sword", 10, 20, 40);
    ArmaPrincipal fireSword = new ArmaPrincipal("Fire Sword", 30, 40, 60);
    ArmaPrincipal holySword = new ArmaPrincipal("Holy Sword", 50, 60, 80);

    /**
     * Método para chamar o vendedor
     *
     * @param hero
     */
    public void chamarVendedor(Hero hero) {

        // Criação dos itens/armas na loja do vendedor
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

        // Invocando o vendedor
        vendedor.imprimirLoja();

        System.out.println("Inventario");
        hero.mostrarInventario();

    }

    public void intro() {
        System.out.println();
        System.out.println();
        System.out.println("                                         ◯ ☽ ◑    Eldoria    ◐ ❨ ◯\n");
        System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆                      Em um mundo onde a magia e o aço se entrelaçam.                                   ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
        System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆                      Eldoria é uma terra vasta e cheia de mistérios.                                   ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
        System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆                 Governada por reis sábios e protegida por guerreiros honrados.                         ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
        System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆          Mas uma antiga profecia, perdida no tempo, ameaça o equilíbrio de todo o reino.               ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
        System.out.println("⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆ Diz-se que, quando as estrelas alinharem-se de maneira particular, uma força sombria de outro mundo... ⋆˖⁺‧₊☽◯☾₊‧⁺˖⋆");
        System.out.println("                                           Tentará invadir Eldoria...\n");
        System.out.println("                      Apenas o Herói Destinado poderá impedir que as trevas consumam o reino.\n\n");
        System.out.println("                Você é um jovem aventureiro que vive em uma pequena vila nas fronteiras de Eldoria. ");
        System.out.println("                       Aos 18 anos, decide partir em uma jornada para provar seu valor....\n\n");

    }

    public void salaPrincipal(Hero hero) {

        System.out.println("Seguindo pela estrada é possivel escutar gritos de socorro!");
        System.out.println("Um jovem aventureiro sendo atacado por bandidos!\n");
        hero.atacar(joca);
        System.out.println();
        System.out.println();
        hero.atacar(quim);
        System.out.println();
        System.out.println("O jovem aventureiro agradece e diz que tentou chegar no Monastério ");
        System.out.println("mas um grande monstro impediu sua passagem, apenas o Herói pode passar!\n");
        System.out.println("Ele segiu o caminho da cidade...\n");
        System.out.println("Ao fim da estrada temos os caminhos para o monastério, cada caminho tem a sua provação...\nQual devemos seguir?\n");
        System.out.println("Mas antes vou comprar algo com aquele vendedor pois o Vitor pediu. \uD83D\uDE01");
        chamarVendedor(hero);
        System.out.println("1.Montanha da Morte");
        System.out.println("2.Labirinto Tempestuoso");
        System.out.println("3.Vale Sombrio");
        int op = input.nextInt();
        while (op != 1 && op != 2 && op != 3) {
            System.out.println("\nOpção invalida\n");
            System.out.println("1.Montanha da Morte");
            System.out.println("2.Labirinto Tempestuoso");
            System.out.println("3.Vale Sombrio");
            op = input.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("A Montanha da Morte não me mete medo! ao todo...");
                sala01(hero);
                break;
            case 2:
                System.out.println("Esse Labirinto Tempestuoso vai perder a fama depois que conquista-lo! espero...");
                sala02(hero);
                break;
            case 3:
                System.out.println("Vale das Sombras será um passeio no campo! E os insetos?!...");
                sala03(hero);
            default:
                break;
        }


    }

    public void sala01(Hero hero) {
        System.out.println("sala01");
    }

    public void sala02(Hero hero) {
        System.out.println("sala02");
    }

    public void sala03(Hero hero) {
        System.out.println("sala03");
    }

    public void sala04(Hero hero) {
        System.out.println("sala04");
    }

    public void sala05(Hero hero) {
        System.out.println("sala05");
    }

    public void sala06(Hero hero) {
        System.out.println("sala06");
    }

    public void sala07(Hero hero) {
        System.out.println("sala07");
    }

    public void sala08(Hero hero) {
        System.out.println("sala08");
    }

    public void sala09(Hero hero) {
        System.out.println("sala09");
    }

    public void sala10(Hero hero) {
        System.out.println("sala10");
    }

    public void sala11(Hero hero) {
        System.out.println("sala11");
    }

    public void sala12(Hero hero) {
        System.out.println("sala12");
    }

    public void sala13(Hero hero) {
        System.out.println("sala13");
    }

    public void sala14(Hero hero) {
        System.out.println("sala14");
    }

    public void sala15(Hero hero) {
        System.out.println("sala15");
    }

    public void sala16(Hero hero) {
        System.out.println("sala16");
    }

    public void sala17(Hero hero) {
        System.out.println("sala17");
    }

    public void sala18(Hero hero) {
        System.out.println("sala18");
    }

    public void sala19Secret(Hero hero) {
        System.out.println("sala19Secret");
    }

}




