package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.println("introduzir numero 1: ");
        inicio = input.nextInt();
        System.out.println("introduzir numero 2: ");
        fim = input.nextInt();

        while (inicio >= inicio && inicio <= fim) {
            System.out.println(+inicio);
            inicio = inicio + 1;


        }
    }
}
