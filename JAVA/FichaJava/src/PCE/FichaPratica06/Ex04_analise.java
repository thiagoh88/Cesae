package PCE.FichaPratica06;

import java.util.Scanner;

import static PCE.FichaPratica06.Ex03_metodos.*;

public class Ex04_analise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, opcao;

        System.out.print("insira um numero: ");
        numero = input.nextInt();

        do {
            System.out.println("\n*** Analise do numero: " + numero + " ***");
            System.out.println(" **** escolha uma opcao *****");
            System.out.println("     1. par ou impar");
            System.out.println("     2. positivo ou negativo");
            System.out.println("     3. primo ou nao primo");
            System.out.println("     4. perfeito ou nao perfeito");
            System.out.println("     5. triangular ou nao triangular");
            System.out.println("     6. trocar de numero");
            System.out.println("     7. sair");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (parImpar(numero)) {
                        System.out.println("par");
                    } else {
                        System.out.println("impar");
                    }
                    break;

                case 2:
                    if (positivoNegativo(numero)) {
                        System.out.println("positivo");
                    } else {
                        System.out.println("negativo");
                    }
                    break;

                case 3:
                    if (primo(numero)) {
                        System.out.println("primo");
                    } else {
                        System.out.println("nao primo");
                    }
                    break;

                case 4:
                    if (perfeito(numero)) {
                        System.out.println("perfeito");
                    } else {
                        System.out.println("nao perfeito");
                    }
                    break;

                case 5:
                    if (triangular(numero)) {
                        System.out.println("triangular");
                    } else {
                        System.out.println("nao");
                    }
                    break;

                case 6:
                    System.out.println("insira um novo numero: ");
                    numero = input.nextInt();
                    continue;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("opcao invalida");

            }
        } while (opcao != 7);
    }
}
