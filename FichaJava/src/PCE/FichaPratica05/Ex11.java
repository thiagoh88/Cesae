package PCE.FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int maior, menor;
        for (int linha = 0; linha < matriz.length; linha++)
        {
            for (int coluna = 0; coluna < matriz[0].length; coluna++)
            {
                System.out.print("insira na matriz[" + linha + "][" + coluna + "] : ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++)
        {
            for (int coluna = 0; coluna < matriz[0].length; coluna++)
            {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }

        menor=matriz[0][0];
        maior=matriz[0][0];

        for (int linha = 0; linha < matriz.length; linha++)
        {
            for (int coluna = 0; coluna < matriz[0].length; coluna++)
            {
                if (matriz[linha][coluna] > maior)
                {
                    maior = matriz[linha][coluna];
                }
                if (matriz[linha][coluna] < menor)
                {
                    menor = matriz[linha][coluna];
                }
            }
        }

        System.out.println("\nMaior: " + maior + "\nMenor: " + menor);
    }
}