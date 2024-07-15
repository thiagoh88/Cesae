package PCE.FichaPratica05;

import java.util.Scanner;

public class Ex04_menorVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[3];
        int menor;

        for (int i = 0; i < vetor.length; i++)
        {
            System.out.print("insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        menor = vetor[0];

        System.out.println("\n---------------------\n");

        for (int i = 1; i < vetor.length; i++)
        {
            if (vetor[i] < menor)
            {
                menor = vetor[i];
            }

        }
        System.out.println("Menor: "+menor);
    }
}
