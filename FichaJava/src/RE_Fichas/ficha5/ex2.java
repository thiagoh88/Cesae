package RE_Fichas.ficha5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[3];
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("comissão [" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        System.out.println("\n---------------------\n");

        for (int i = 0; i < vetor.length; i++)
        {
            soma = soma + vetor[i];

        }System.out.println("soma: " +soma);
    }
}
