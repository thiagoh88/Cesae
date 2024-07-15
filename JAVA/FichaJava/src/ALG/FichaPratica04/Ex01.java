package ALG.FichaPratica04;

import java.util.Scanner;



public class Ex01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double num1,num2,resultado;
        String op,continuar;

        do {

        System.out.print("insira num1: ");
        num1= input.nextDouble();
        System.out.print("insira num2: ");
        num2= input.nextDouble();


            System.out.print("Selecionar uma operação:\n");
            System.out.print("+ soma\n");
            System.out.print("- subtração\n");
            System.out.print("* multiplicação\n");
            System.out.print("/ divisão\n");

            op= input.next();

            switch (op)
            {

                case "+": resultado=num1+num2;
                System.out.println("\nescolheu soma: "+resultado);
                break;
                case "-": resultado=num1-num2;
                System.out.println("\nescolheu subtração: "+resultado);
                break;
                case "*": resultado=num1*num2;
                System.out.println("\nescolheu multiplicação: "+resultado);
                break;
                case "/": resultado=num1/num2;
                System.out.println("\nescolheu divisão: "+resultado);
                break;
                default: System.out.println("\ninvalido: "+op);
            }

            System.out.print("\nrepetir a operação? 1.Sim / 0.Não");
            continuar=input.next();
                  //string usa .equals (.equalsIgnoreCase
        } while (continuar.equals("s"));


    }
}
