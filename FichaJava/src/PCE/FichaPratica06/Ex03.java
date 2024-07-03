package PCE.FichaPratica06;

import java.util.Scanner;

public class Ex03 {

    /**
     * Método que retorna se um número é par ou impar
     *
     * @param num Número inteiro
     * @return true se é par || false se é impar
     */
    public static boolean parImpar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que retorna se um número é positivo ou negativo
     *
     * @param num Número inteiro
     * @return true se positivo || false se negativo
     */
    public static boolean positivoNegativo(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que retorna se um número é ou não primo
     *
     * @param num Número inteiro
     * @return true se primo || false não primo
     */
    public static boolean primo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que verifica se o numero é perfeito
     *
     * @param num
     * @return numero
     */
    public static boolean perfeito(int num) {
        if (num <= 1) {
            return false;
        }
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }

    /**
     * Método que verifica se o numero é triangular
     * @param num
     * @return
     */
    public static boolean triangular(int num) {

        if (num < 1) {
            return false;
        }
        int soma = 0, n = 1;
        while (soma < num) {
            soma += n;
            if (soma == num) {
                return true;
            }
            n++;
        }
        return false;
    }





}



