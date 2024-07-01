package FichaPratica02;

import java.util.Scanner;

public class Ex13Dois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Introduzir hora");
        num1 = input.nextInt();
        System.out.println("introduzir minutos");
        num2 = input.nextInt();

        if (num1 <= 12) {
            System.out.println(+num1+":"+num2+"AM");
        } else if (num1 >= 13) {
            num3 = num1 - 12;
            System.out.println(+num3+":"+num2+"PM");
        }

    }
}
