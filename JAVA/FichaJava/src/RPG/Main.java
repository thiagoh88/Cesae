package RPG;

import RPG.Entidades.Hero;
import RPG.Jogo.Jogo;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Jogo jogo = new Jogo();
        Hero hero = jogo.criarPersonagem();
        jogo.intro(hero);
    }
}

