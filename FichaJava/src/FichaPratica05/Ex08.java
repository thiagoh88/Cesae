package FichaPratica05;

import java.util.Scanner;

public class Ex08
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int linha=0; linha< matriz.length;linha++)
        {
            for (int coluna = 0; coluna < matriz[0].length; coluna++)
            {
                System.out.print("insira na matriz["+linha+"]["+coluna+"] : ");
                matriz[linha][coluna]=input.nextInt();
            }
        }
        for (int linha=0; linha< matriz.length;linha++)
        {
            for (int coluna = 0; coluna < matriz[0].length; coluna++)
            {
                System.out.print(matriz[linha][coluna]+"\t|\t");
            }
            System.out.println();
        }
    }
}