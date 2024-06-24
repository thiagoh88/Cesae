package ficha3;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0, soma = 1, count = -1, media;

        while (num != -1) {

            System.out.println("insira numero (-1)");
            num = input.nextInt();
            soma = soma + num;
            count++;
        }
        media = soma / count;
        System.out.println(media);


    }
}
