package ALG.FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;

        System.out.println("Introduza um salario: ");
        num1 = input.nextDouble();

        if (num1<=15000) {
            num1 = num1*0.2;
            System.out.println("Paga taxa de 20%: "+num1);

        }else{
            num1 = num1*0.3;
            System.out.println("Paga taxa de 30%: "+num1);
        }
        }
    }

