package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //variaveis
        int quantidade, count = 1, numAnterior, numAtual;
        //atenção
        boolean crescente = true;

        System.out.print("quantos numeros? ");
        quantidade = input.nextInt();

        System.out.print("insira um numero: ");
        numAnterior = input.nextInt();


        while (count < quantidade)
        {
            System.out.print("insira um numero: ");
            numAtual = input.nextInt();

            if (numAnterior >= numAtual)
            {
                crescente = false;
            }
            numAnterior = numAtual;
            count++;
        }
        if (crescente) //crescente==true
        {
            System.out.print("crescente");
        }
        else
        {
            System.out.print("Nao crescente");
        }
    }
}
