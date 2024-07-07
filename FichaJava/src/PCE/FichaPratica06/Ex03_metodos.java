package PCE.FichaPratica06;

public class Ex03_metodos {

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
        int divisor = 0;

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                divisor++;
            }
        }
        if (divisor == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que verifica se o numero é perfeito
     *
     * @param num
     * @return numero
     */
    public static boolean perfeito(int num) {

        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        if (soma == num) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que verifica se o numero é triangular
     *
     * @param num
     * @return
     */
    public static boolean triangular(int num) {
        int triangulares = 0;
        for (int i = 1; triangulares < num; i++)
        {
            triangulares += i;
            if (num == triangulares)
            {
                return true;
            }
        }
        return false;
    }
}




