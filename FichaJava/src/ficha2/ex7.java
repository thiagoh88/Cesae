package ficha2;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("insira um numero");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}
