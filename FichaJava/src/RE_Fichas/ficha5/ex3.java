package RE_Fichas.ficha5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[3];
        int maior;
        for (int i = 0; i < vetor.length; i++)
        {
            System.out.print("insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        maior=vetor[0];

        for (int i=0;i< vetor.length;i++)
        {
            if (vetor[i]>maior)
            {
                maior=vetor[i];
            }
        }
        System.out.println("Maior: " +maior);
    }
}
