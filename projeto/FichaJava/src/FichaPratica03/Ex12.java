package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double entrada = 0, count25 = 0, count50 = 0, count75 = 0, count100 = 0;


        while (entrada >= 0)
        {
            System.out.println("insira um numero (negativo break): ");
            entrada = input.nextDouble();


            if (entrada >= 0 && entrada <= 25)
            {
                count25++;
            }
            if (entrada >= 26 && entrada <= 50)
            {
                count50++;
            }
            if (entrada >= 51 && entrada <= 75)
            {
                count75++;
            }
            if (entrada >= 76 && entrada <= 100)
            {
                count100++;
            }

        }

        System.out.println("contador 0-25: " + count25);
        System.out.println("contador 26-50: " + count50);
        System.out.println("contador 51-75: " + count75);
        System.out.println("contador 76-100: " + count100);
    }
}
