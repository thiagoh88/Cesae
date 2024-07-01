package ficha2;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("primeiro");
        num1 = input.nextInt();
        System.out.println("segundo");
        num2 = input.nextInt();
        System.out.println("terceiro");
        num3 = input.nextInt();
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1);
        }
        if (num2 < num1 && num2 < num3) {
            System.out.println(num2);
        }
        if (num3 < num2 && num3 < num2) {
            System.out.println(num3);
        }
    }
}
