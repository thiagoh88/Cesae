package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1;

        System.out.println("Introduza o salario: ");
        num1 = input.nextDouble();

        if (num1 <= 15000) {
            num1 = num1 * 0.2;
            System.out.println("Paga 20%: ");
        }


        if (num1 >= 15000 && num1 <= 20000) {
            num1 = num1 * 0.3;
            System.out.println("Paga 30%: ");
        }

        if (num1 >= 20000 && num1 <= 25000) {
            num1 = num1 * 0.35;
            System.out.println("Paga 35%: ");
        }

        if (num1 >25000){
            System.out.println("Paga 40%: ");
        }

    }
}
