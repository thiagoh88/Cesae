package FichaPratica01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, soma;

        // Ler num1
        System.out.print("Insira um numero");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Insira um numero");
        num2 = input.nextInt();

        // Somar num1 e num2
        soma = num1 + num2;

        // apresentar o resultado
        System.out.println(soma);




    }
}
