package RE_Fichas.ficha6;

import java.util.Scanner;

import static PCE.FichaPratica06.Ex05_metodoVetor.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("qual o tamanho do vetor?");
        int tamanhoVetor = input.nextInt();
        int opcao;
        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++)
        {
            System.out.print("insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        do
        {
            System.out.println("\n *** Analise de um Vetor ***");
            System.out.println(" **** escolha uma opcao *****");
            System.out.println("     1. maior elemento");
            System.out.println("     2. menor elemento");
            System.out.println("     3. crescente ou nao");
            System.out.println("     4. sair\n");
            opcao = input.nextInt();

            switch (opcao)
            {
                case 1:
                    System.out.print("\nMaior vetor: " + maior(vetor));
                    break;
                case 2:
                    System.out.print("\nMenor vetor: " + menor(vetor));
                    break;
                case 3:
                    if (crescente(vetor)) {
                        System.out.print("Crescente");
                    } else {
                        System.out.print("Não crescente");
                    }
                    break;
                case 4:
                    System.out.print("\nSaindo...");
                    break;
                default:
                    System.out.print("\nopcao invalida\n");
            }

        }while (opcao!=4);
    }
}
