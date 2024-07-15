package RE_Fichas.ficha3;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numAnterior, numAtual, quantidade, count = 1;
        boolean crescente = true;
        System.out.println("quantos numero?");
        quantidade = input.nextInt();

        System.out.println("insira um numero");
        numAnterior = input.nextInt();

        while (count < quantidade)
        {
            System.out.println("insira um numero");
            numAtual = input.nextInt();

            if (numAnterior >= numAtual)
            {
                crescente = false;
            }
            numAnterior = numAtual;
            count++;
        }
        if (crescente)
        {
            System.out.println("crescente");
        } else
        {
            System.out.println("não crescente");
        }
    }
}
