package RE_Fichas.ficha5;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[5];
        double maior;
        boolean par = false;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextDouble();
        }
        maior = vetor[0];
        for (int i = 0; i < vetor.length; i++)
        {
            if (vetor[i] % 2 == 0)
            {
                if (!par||vetor[i]>maior)
                {
                    maior=vetor[i];
                }
                par=true;
            }
        }
        if (par)
        {
            System.out.println(maior);
        }
        else
        {
            System.out.println("não");
        }
    }
}
