package FichaPratica05;

import java.util.Random;
import java.util.Scanner;

public class Ex12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Random rd=new Random();
        int aleatorio = rd.nextInt(-100,100);
        int numRandom = rd.nextInt(-100,100);


        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[][] matriz = new int[10][2];

        for (int i = 0; i < v1.length; i++)
        {
            System.out.print("insira no Vetor1["+i+"]: ");
            v1[i] = input.nextInt();
        }
        for (int i = 0; i < v2.length; i++)
        {
            System.out.print("insira no Vetor2["+i+"]: ");
            v2[i] = input.nextInt();

        }
        for (int linha = 0; linha < matriz.length; linha++)
        {
            matriz[linha][0]= v1[linha];
            matriz[linha][1]= v2[linha];
        }
        for (int linha = 0; linha < matriz.length; linha++)
        {
            for (int coluna = 0; coluna < matriz[0].length; coluna++)
            {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
    }
}
