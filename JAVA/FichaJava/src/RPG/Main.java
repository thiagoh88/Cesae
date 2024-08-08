package RPG;

import RPG.Entidades.Hero;
import RPG.Jogo.Jogo;

public class Main {
    public static void main(String[] args) {

        Jogo jogo = new Jogo();
        jogo.intro();
        Hero hero = jogo.criarPersonagem();
        jogo.chamarVendedor(hero);
        jogo.salaPrincipal(hero);
        jogo.sala01(hero);
        jogo.sala02(hero);
        jogo.sala03(hero);
        jogo.sala04(hero);
        jogo.sala05(hero);
        jogo.sala06(hero);
        jogo.sala07(hero);
        jogo.sala08(hero);
        jogo.sala09(hero);
        jogo.sala10(hero);
        jogo.sala11(hero);
        jogo.sala12(hero);
        jogo.sala13(hero);
        jogo.sala14(hero);
        jogo.sala15(hero);
        jogo.sala16(hero);
        jogo.sala17(hero);
        jogo.sala18(hero);
        jogo.sala19Secret(hero);


    }
}
