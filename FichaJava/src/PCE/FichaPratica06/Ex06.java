package PCE.FichaPratica06;

import java.util.Scanner;

import static PCE.FichaPratica06.Ex05.*;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanhoVetor;
        System.out.println("qual o tamanho do vetor?");
        tamanhoVetor = input.nextInt();

        int[] vetor = new int[tamanhoVetor];

        int opcao;

        boolean op = true;

        for (int i = 0; i < tamanhoVetor; i++) {

            System.out.print("insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }


        do {
            System.out.println("\n *** Analise de um Vetor ***");
            System.out.println(" **** escolha uma opcao *****");
            System.out.println("     1. maior elemento");
            System.out.println("     2. menor elemento");
            System.out.println("     3. crescente ou nao");
            System.out.println("     4. sair\n");

            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("\nMaior vetor: "+maior(vetor));
                    break;
                case 2:
                    System.out.print("\nMenor vetor: "+menor(vetor));
                    break;
                case 3:
                    System.out.println(crescente(vetor));
                    break;
                case 4:
                    System.out.println("\nSaindo...");
                    op = false;
                    break;
                default:
                    System.out.println("\nopcao invalida\n");
            }
        } while (op);

    }
}
