package PCE.FichaPratica05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int maior;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maior = vetor[0];

        System.out.println("\n---------------------\n");

        for (int i = 0; i < vetor.length; i++)
        {
            if (vetor[i] > maior)
            {
                maior = vetor[i];
            }
        }

        System.out.println("Maior: " + maior);
    }
}
