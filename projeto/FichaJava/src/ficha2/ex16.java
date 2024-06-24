package ficha2;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, notas;

        System.out.println("inserir valor multiplo de 5");
        valor = input.nextInt();



        if (valor % 5 == 0) {
            notas = valor / 200;
            System.out.println("200:" + notas);
            valor = valor % 200;
            notas = valor / 100;
            System.out.println("100:" + notas);
            valor = valor % 100;
            notas = valor / 50;
            System.out.println("100:" + notas);
            valor = valor % 50;
            notas = valor / 20;
            System.out.println("100:" + notas);
            valor = valor % 20;
            notas = valor / 10;
            System.out.println("100:" + notas);
            valor = valor % 10;
            notas = valor / 5;
            System.out.println("100:" + notas);
        }else {
            System.out.println("valor invalido");
        }
    }
}
