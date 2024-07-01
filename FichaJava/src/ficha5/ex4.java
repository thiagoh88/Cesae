package ficha5;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int menor;

        for (int i = 0; i < vetor.length; i++)
        {
            System.out.print("insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        menor = vetor[0];

        for (int i = 0; i < vetor.length; i++)
        {
            if (vetor[i] < menor)
            {
                menor = vetor[i];
            }
        }
        System.out.println(menor);
    }
}
