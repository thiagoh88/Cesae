package aTrabalhoPratico.Ficheiros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class teste {
    public static void main(String[] args) {

            ArrayList<String> monstros = new ArrayList<>();
            monstros.add("Goblin");
            monstros.add("Orc");
            monstros.add("Dragão");
            monstros.add("Esqueleto");
            monstros.add("Zumbi");
            monstros.add("Troll");
            monstros.add("Lobisomem");
            monstros.add("Vampiro");
            monstros.add("Minotauro");
            monstros.add("Hidra");
            Collections.shuffle(monstros);
            Random random = new Random();
            int index = random.nextInt(monstros.size());
            String monstroAleatorio = monstros.get(index);
            System.out.println("nome: "+monstroAleatorio);

        }
    }

