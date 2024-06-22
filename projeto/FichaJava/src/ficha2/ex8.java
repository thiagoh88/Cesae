package ficha2;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double nota1,nota2,nota3,media;

        System.out.println("nota1: ");
        nota1= input.nextDouble();

        System.out.println("nota2: ");
        nota2= input.nextDouble();

        System.out.println("nota3: ");
        nota3= input.nextDouble();

        nota1=nota1*0.25;
        nota2=nota2*0.35;
        nota3=nota3*0.40;
        media= nota1+nota2+nota3;

        if (media>=9.5) {
            System.out.println("Aprovado: " + media);
        }else {
            System.out.println("Reprovado: "+media);
        }

    }
}
