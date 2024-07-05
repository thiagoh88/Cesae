package RE_Fichas.ficha6;

public class ex3 {

    public static boolean parImpar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean negativa(int num) {
        if (num < 0) {
            return false;
        } else {
            return true;
        }

    }

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
}
