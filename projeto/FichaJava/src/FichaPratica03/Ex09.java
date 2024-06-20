package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x,soma,media;
        System.out.println("advinha o numero (-1)");
        x = input.nextDouble();
        while (x != -1) {
            System.out.println("advinha o numero");
            x= input.nextDouble();
        }
        System.out.println("ACERTOU!");
    }
}
