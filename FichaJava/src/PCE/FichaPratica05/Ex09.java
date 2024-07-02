package PCE.FichaPratica05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int soma=0;
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
                soma=soma+matriz[linha][coluna];
            }
            System.out.println();
        }
        System.out.println("Soma: "+soma);
    }
}
