package PCE.FichaPratica06;

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

    public static boolean perfeito(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 1; i < num-1; i++) {
            if (num % i == 0) {
                int soma = 0;
                soma = soma + i;
                if (soma == num) {
                    return true;
                }

            }
        }
        return false;
    }

}



