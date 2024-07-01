package FichaPratica04;

import java.util.Scanner;

public class Ex04Dois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        boolean primo = true;
        System.out.println("insira um numero");
        num = input.nextInt();

        if (num < 1) {
            primo = false;
        }
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("primo");
        } else {
            System.out.println("nao primo");
        }
    }
}
