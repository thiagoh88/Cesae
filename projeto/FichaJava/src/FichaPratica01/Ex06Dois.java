package FichaPratica01;

import java.util.Scanner;

public class Ex06Dois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Insira o valor 1:\n");
        valor1 = input.nextInt();
        System.out.println("Insira o valor 2:\n");
        valor2 = input.nextInt();

        valor1 = valor2;
        System.out.println("Valor 1: " +valor1);

        System.out.println("Valor 2: " +valor2);
    }
}
