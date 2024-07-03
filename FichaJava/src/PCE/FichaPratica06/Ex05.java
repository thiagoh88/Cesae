package PCE.FichaPratica06;

import java.util.Scanner;

public class Ex05 {

    /**
     * Método para encontrar o maior vetor
     *
     * @param vetor
     * @return maior
     */
    static int maior(int[] vetor) {

        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    /**
     * Método para encontrar o menor vetor
     *
     * @param vetor
     * @return menor
     */
    static int menor(int[] vetor) {

        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    /**
     * Método para verificar se é crescente
     * @param vetor
     * @return não sei
     */
    static int crescente(int[] vetor) {
        boolean crescente = true;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                crescente = false;
            }
        }
        if (crescente) {
            System.out.println("crescente");
        }else {
            System.out.println("nao crescente");
        }
        return vetor[0];
    }
}




