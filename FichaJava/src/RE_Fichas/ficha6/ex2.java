package RE_Fichas.ficha6;

import java.util.Scanner;

public class ex2 {
    /**
     * ler numero positivo
     *
     * @return
     */
    public static int lerpositivo() {
        Scanner input = new Scanner(System.in);

        int numLido;

        do {
            System.out.println("insira um numero inteiro e positivo");
            numLido = input.nextInt();
        }
        while (numLido < 0);
        return numLido;
    }

    /**
     * imprimir a linha de asteriscos
     * @param quantAsterisco
     */
    public static void asterisco(int quantAsterisco) {

        for (int i = 0; i < quantAsterisco; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int num=lerpositivo();
        asterisco(num);


    }



}


