package PCE.FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[10];
        double soma=0,media=0;

        for (int i = 0; i < vetor.length; i++)
        {
            System.out.print("insira um numero"+(i+1)+": ");
            vetor[i] = input.nextDouble();
        }

        System.out.println("\n---------------------\n");

        for (int i=0;i< vetor.length;i++)
        {
            soma=soma+vetor[i];
            vetor[i]++;
            media=soma/vetor.length;
        }

        System.out.println("Total: "+soma+"\nMedia: "+media);
    }
}
