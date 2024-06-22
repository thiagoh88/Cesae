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









        }
    }
}
