package FichaPratica01;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, valor1, valor2;

        System.out.println("Insira o valor 1:\n");
        num1 = input.nextInt();
        System.out.println("Insira o valor 2:\n");
        num2 = input.nextInt();

        valor2 = num1;
        valor1 = num2;

        System.out.println("Valor 1: " +num2);
        System.out.println("Valor 2: " +num1);


    }
}
