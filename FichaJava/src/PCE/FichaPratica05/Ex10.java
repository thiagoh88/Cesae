package PCE.FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int pesquisa, contador = 0;

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
        System.out.println("insira um numero para pesquisa: ");
        pesquisa = input.nextInt();

        for (int linha = 0; linha < matriz.length; linha++)
        {
            for (int coluna = 0; coluna < matriz[0].length; coluna++)
            {
                if (matriz[linha][coluna]==pesquisa)
                {
                    contador++;
                }
            }
        System.out.println("há "+contador+" posições na matriz com o numero:" +pesquisa);
      }
   }
}
