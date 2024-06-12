package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1,num2,num3,media;

        System.out.println("inserir nota 1: ");
        num1=input.nextDouble();
        System.out.println("inserir nota 2: ");
        num2=input.nextDouble();
        System.out.println("inserir nota 3: ");
        num3=input.nextDouble();

        media=((num1*25)+(num2*35)+(num3*40))/100;

        if (media>=9.5){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }





    }
}
