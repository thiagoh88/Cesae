package PCE.FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++)
        {
            System.out.print("insira no Vetor["+i+"]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("\n---------------------\n");

        for (int i = 0; i < vetor.length; i++)
        {
            System.out.println("Vetor["+i+"]= "+vetor[i]);
        }
    }
}
