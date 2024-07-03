package PCE.FichaPratica06;

import java.util.Scanner;

public class Ex07 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int numLinha, numColuna;
        String caracter;
        System.out.println("insira um caracter: ");
        caracter = input.next();
        System.out.println("insira um numero de linhas: ");
        numLinha = input.nextInt();
        System.out.println("insira um numero de colunas:");
        numColuna = input.nextInt();


        String[][] matriz = new String[numLinha][numColuna];

        for (int linha = 0; linha < numLinha; linha++) {
            for (int coluna = 0; coluna < numColuna; coluna++) {
                matriz[linha][coluna] = caracter;
            }
        }

        for (int linha = 0; linha < numLinha; linha++) {
            for (int coluna = 0; coluna < numColuna; coluna++) {
                System.out.print(matriz[linha][coluna]);
            }
            System.out.println();
        }


    }
}
