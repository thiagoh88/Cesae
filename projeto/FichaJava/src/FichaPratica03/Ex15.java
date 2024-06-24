package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, fatorial = 1;

        System.out.print("insira um numero: ");
        num = input.nextInt();

        while (num > 0)
        {
            fatorial *= num;
            num--;
        }
        System.out.println("fatorial: " + fatorial);
    }
}
