package ALG.FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor,notas;
        System.out.println("valor multiplo de 5");
        valor= input.nextInt();



        if (valor%5==0) {

            System.out.println("Notas para o valor €"+valor);

            notas = valor / 200;
            System.out.println("200:" + notas);
            valor = valor % 200;
            notas = valor / 100;
            System.out.println("100:" + notas);
            valor = valor % 100;
            notas = valor / 50;
            System.out.println("50:" + notas);
            valor = valor % 50;
            notas = valor / 20;
            System.out.println("20:" + notas);
            valor = valor % 20;
            notas = valor / 10;
            System.out.println("10:" + notas);
            valor = valor % 10;
            notas = valor / 5;
            System.out.println("5:" + notas);

        }else {
            System.out.println("valor invalido");


        }
       }
    }

