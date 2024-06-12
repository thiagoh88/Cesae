package FichaPratica01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex02Dois {

    public static void main(String[] args) {

        //Ler teclado
        Scanner input = new Scanner(System.in);

        // Variaveis
        int num1, num2, soma, sub, mult, div;

        // Ler num1
        System.out.print("Insira um numero\n");
        num1 = input.nextInt();
        // Ler num2
        System.out.print("Insira outro numero\n");
        num2 = input.nextInt();

        // soma
        soma = num1 + num2;
        // sub
        sub = num1 - num2;
        // mult
        mult = num1 * num2;
        // div
        div = num1 / num2;

        // apresentar
        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+sub);
        System.out.println("Multiplicação: "+mult);
        System.out.println("Divisão: "+div);


    }

}
