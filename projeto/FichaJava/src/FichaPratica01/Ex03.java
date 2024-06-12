package FichaPratica01;

import com.sun.source.util.DocTreePathScanner;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        // Ler teclado
        Scanner input = new Scanner(System.in);

        //variaveis
        double num1, num2, area, per;


        // Ler num1
        System.out.print("Insira a largura\n");
        num1 = input.nextDouble();

        // Ler num2
        System.out.print("Insira o comprimento\n");
        num2 = input.nextDouble();

        // calculo area
        area = num1 * num2;
        // calculo perimetro
        per = num1 * 2 + num2 * 2;

        // apresentar
        System.out.println("Area: " +area);
        System.out.println("Perimetro: " +per);

    }
}
