package FichaPratica05;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("insira na matriz[" + linha + "][" + coluna + "] : ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");

            }
            System.out.println();
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (linha == coluna) {
                    soma = soma + matriz[linha][coluna];
                }

            }
        }
        System.out.println("\nTotal: " + soma);
    }
}
