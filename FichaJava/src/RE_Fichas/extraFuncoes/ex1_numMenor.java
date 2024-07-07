package RE_Fichas.extraFuncoes;

import java.util.Scanner;

public class ex1_numMenor {
    /**
     * Metodo para encontrar o menor numero inserido pelo usuario
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int numeroMaisPequeno(int num1, int num2, int num3) {
        Scanner input = new Scanner(System.in);

        if (num1 < num2 && num1 < num3) {
            return num1;
        }
        if (num2 < num1 && num2 < num3) {
            return num2;
        }
        if (num3 < num1 && num3 < num2) {
            return num3;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        int menor;

        System.out.println("insira um numero 1: ");
        num1 = input.nextInt();
        System.out.println("insira um numero 2: ");
        num2 = input.nextInt();
        System.out.println("insira um numero 3: ");
        num3 = input.nextInt();

        menor = numeroMaisPequeno(num1, num2, num3);
        System.out.println("menor: " + menor);
    }


}
