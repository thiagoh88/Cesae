package RE_Fichas.ficha2;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double num1, num2;

        System.out.println("insira numero 1");
        num1 = input.nextDouble();
        System.out.println("insira numero 2");
        num2 = input.nextDouble();
        System.out.println("escolha a operação +-*/");

        String op;
        op = input.next();

        switch (op) {
            case "+":

                num1 = num1 + num2;
                System.out.println("soma: " + num1);
                break;
            case "-":
                num1 = num1 - num2;
                System.out.println("subtracao: " + num1);
                break;
            case "*":
                num1=num1*num2;
                System.out.println("multi: "+num1);
                break;
            case "/":
                num1=num1/num2;
                System.out.println("divisao: "+num1);
                break;
            default:
                System.out.println("ta errado!");
        }

    }
}
