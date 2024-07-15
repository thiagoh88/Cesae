package PCE.extraFuncoes;

import java.util.Scanner;

public class ex2_media {
    /**
     * Metodo para encontrar a media entre 3 numeros inseridos pelo usuario
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static double media(double num1, double num2, double num3) {

        Scanner input = new Scanner(System.in);

        double media;
        media = (num1 + num2 + num3) / 3;

        return media;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira numero 1: ");
        double num1 = input.nextDouble();
        System.out.println("insira numero 2: ");
        double num2 = input.nextDouble();
        System.out.println("insira numero 3: ");
        double num3 = input.nextDouble();

        System.out.println(media(num1, num2, num3));
    }

}
