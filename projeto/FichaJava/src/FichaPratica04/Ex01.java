package FichaPratica04;

import java.util.Scanner;



public class Ex01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num1,num2,s=1,n=0,resp;
        String op;

        System.out.printf("insira num1: ");
        num1= input.nextInt();
        System.out.printf("insira num2: ");
        num2= input.nextInt();

        do {
            System.out.println("Selecionar uma operação:\n");
            System.out.printf("+ soma\n");
            System.out.printf("- subtração\n");
            System.out.printf("* multiplicação\n");
            System.out.printf("/ divisão\n");

            op= input.next();

            switch (op)
            {
                case "+": System.out.printf("\nescolheu soma");break;
                case "-": System.out.printf("\nescolheu subtração");break;
                case "*": System.out.printf("\nescolheu multiplicação");break;
                case "/": System.out.printf("\nescolheu divisão");break;
                default: System.out.println("\ninvalido");
            }

            System.out.println("\nrepetir a operação? 1.Sim / 0.Não");
            resp=input.nextInt();

        } while (resp==s);


    }
}
