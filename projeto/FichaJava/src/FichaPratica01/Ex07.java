package FichaPratica01;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3, total, desc, total2;

        System.out.println("Preço do produto 1:\n");
        num1 = input.nextDouble();
        System.out.println("Preço do produto 2:\n");
        num2 = input.nextDouble();
        System.out.println("Preço do produto 3:\n");
        num3 = input.nextDouble();

        total = num1 + num2 + num3;
        desc = total * 0.1;
        total2 = total - desc;
        System.out.println("Total: €" +total);
        System.out.println("Total 10%: €" +total2);



    }
}
