package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("numero?");
        num1 = input.nextDouble();

        if (num1%2==0){

            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}
