package ALG.FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0, somatorio = 1, contador = -1, media;


        while (num != -1) {
            System.out.println("advinha o numero (-1)");
            num = input.nextInt();

            somatorio = somatorio + num;
            contador++;
        }
        media = somatorio / contador;
        System.out.println("Media: " + media);

    }
}
