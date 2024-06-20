package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num, soma = 0, contador = 0, media;

        System.out.println("advinha o numero (-1)");

        while (true) {
            num = input.nextDouble();

            if (num == -1) {
                break;
            }
            //soma+=num
            soma = soma + num;
            contador++;
        }

        if (contador > 0) {
            media = soma / contador;
            System.out.println("media: " + media);
        }
    }
}
