package POO.FichaPratica08.Ex06_Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        Calculadora calc = new Calculadora();
        double num1, num2;

        System.out.println("insira um numero: ");
        num1 = input.nextDouble();
        System.out.println("insira outro numero: ");
        num2 = input.nextDouble();

        System.out.println("soma: " + calculadora.soma(num1, num2));
        System.out.println("subtracao: " + calculadora.subtracao(num1, num2));
        System.out.println("multiplicacao: " + calculadora.multiplicacao(num1, num2));
        System.out.println("divisao: " + calculadora.divisao(num1, num2));

        //duas formas de resolver

        System.out.println(calc.soma(10, 5));
        System.out.println(calc.subtracao(10, 5));
        System.out.println(calc.multiplicacao(10, 5));
        System.out.println(calc.divisao(10, 5));



    }


}
