package RPG;

import RPG.Entidades.Hero;
import RPG.Jogo.Jogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jogo jogo = new Jogo();

        Hero hero = jogo.criarPersonagem();

        jogo.intro(hero);

    }
}

