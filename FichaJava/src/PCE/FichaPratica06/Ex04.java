package PCE.FichaPratica06;

import java.util.Scanner;

import static PCE.FichaPratica06.Ex03.*;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, opcao;

        System.out.print("insira um numero: ");
        numero = input.nextInt();

        do {
            System.out.println("\n\nAnalise de um numero");
            System.out.println("1. par ou impar");
            System.out.println("2. positivo ou negativo");
            System.out.println("3. primo ou nao primo");
            System.out.println("4. perfeito ou nao perfeito");
            System.out.println("5. triangular ou nao triangular");
            System.out.println("6. trocar de numero");
            System.out.println("7. sair");
            System.out.println("\n escolha a opcao");
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
                    if (perfeito(numero)){
                        System.out.println("perfeito");
                    }else {
                        System.out.println("nao perfeito");
                    }

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                default:
                    System.out.println("opcao invalida");
            }
        }while (numero==1);


    }
}
