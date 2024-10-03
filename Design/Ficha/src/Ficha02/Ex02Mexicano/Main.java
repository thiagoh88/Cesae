package Ficha02.Ex02Mexicano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String op;

        System.out.println("Escolha o taco carne, frango ou vegan: ");
        op = input.nextLine();

        Taco tacoUser = TacoFactory.createTaco(op);

        tacoUser.prepare();
        tacoUser.bake();
        tacoUser.box();

    }
}

