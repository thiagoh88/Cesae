package RE_Fichas.ficha6;

import java.util.Scanner;

import static RE_Fichas.ficha6.ex3.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, opcao;
        System.out.println("insira um numero");
        num = input.nextInt();

        do {
            System.out.println("\n*** Analise do numero: " + num + " ***");
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
                    if (parImpar(num)) {
                        System.out.println("Par");
                    } else
                        System.out.println("Impar");
                case 2:
                    if (negativa(num)) {
                        System.out.println("positivo");
                    } else {
                        System.out.println("negativo");
                    }
                case 3:
                    if (primo(num)) {
                        System.out.println("primo");
                    } else {
                        System.out.println("nao");
                    }


            }


        } while (opcao != 3);

    }
}
