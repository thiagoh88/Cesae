package PCE.FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] comissoes = new double[13];
        double soma = 0;

        for (int i = 0; i < comissoes.length-1; i++) {
            System.out.print("insira a comissão do mes " + (i + 1) + ": ");
            comissoes[i] = input.nextDouble();
        }
        System.out.println("\n---------------------\n");
        for (int i = 0; i < comissoes.length; i++) {
            soma = soma + comissoes[i];
        }
        System.out.println(soma);

    }
}
