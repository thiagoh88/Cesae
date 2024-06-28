package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[5];
        int maior;

        for (int i = 0; i < vetor.length; i++)
        {
            System.out.print("insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maior = vetor[0];

        System.out.println("\n---------------------\n");

        for (int i = 0; i < vetor.length; i++)
        {

            // Numero atual é par
            if (vetor[i] % 2 == 0)
            {

                // O maior ainda impar
                if (maior % 2 != 0)
                {
                    maior = vetor[i];
                }
                // O maior já não impar
                else
                {
                    if (vetor[i] > maior)
                    { // Par atual é maior que o maior
                        maior = vetor[i];
                    }
                }
            }
        }

        if (maior%2!=0)
        {
            System.out.println("Não há pares");
        }
        else
        {
            System.out.println("Maior par: " + maior);
        }

    }
}


