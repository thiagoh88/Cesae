package PCE.FichaPratica06;

import java.util.Scanner;

public class Ex02 {

    /**
     * Metodo para ler numero Positivo Inteiro
     * @return para numero positivo inteiro
     */
    public static int lerPositivoInteiro() {

        Scanner input = new Scanner(System.in);

        int numeroLido;

        do {
            System.out.println("insira numero inteiro: ");
            numeroLido = input.nextInt();
        }
        while (numeroLido < 0);

        return numeroLido;

    }

    /**
     * Metodo para ler e imprimir
     * @param quantidadeAsteriscos
     */
    public static void linhaAsteriscos(int quantidadeAsteriscos) {
        for (int i = 0; i < quantidadeAsteriscos; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linhaAsteriscos(30);
        int numeroUser = lerPositivoInteiro();
        linhaAsteriscos(numeroUser);
        linhaAsteriscos(30);
    }
}
