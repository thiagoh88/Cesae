package ALG.FichaPratica02;

import java.util.Scanner;

public class Ex10Dois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, resultado;

        String op;

        System.out.println("Primeiro numero");
        num1 = input.nextDouble();
        System.out.println("Segundo numero");
        num2 = input.nextDouble();

        System.out.println("Operacao(+- * /):");
        op = input.next();

        switch (op){
            case "+":
                resultado=num1+num2;
                System.out.println("soma" +resultado);
                break;
            case "-":
                resultado=num1-num2;
                System.out.println("subtracao" +resultado);
                break;
            case "*":
                resultado=num1*num2;
                System.out.println("multiplicacao" +resultado);
                break;
            case "/":
                resultado=num1/num2;
                System.out.println("divisao" +resultado );
                break;


        }
    }
}
