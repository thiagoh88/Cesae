package ALG.FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, soma, sub, mult, div;

        System.out.println("Primeiro numero");
        num1 = input.nextDouble();
        System.out.println("Segundo numero");
        num2 = input.nextDouble();
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("+ para soma \n- para subtracao \n* para multiplicacao \n/ para divisao");

        String op;
        op = input.next();
        switch (op) {

            case "+":
                System.out.println("Resultado da soma: " + soma);
                break;
            case "-":
                System.out.println("resultado da subtracao: " + sub);
                break;
            case "*":
                System.out.println("resultado da multiplicacao: " + mult);
                break;
            case "/":
                System.out.println("resultado da divisao: " + div);
                break;
            default:
                System.out.println("Opcao errada!");
        }

    }
}




