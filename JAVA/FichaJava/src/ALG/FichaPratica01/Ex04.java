package ALG.FichaPratica01;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double raio, area, pi=3.14;

        System.out.println("Insira o raio:");
        raio = input.nextDouble();

        area = pi * raio * raio;

        System.out.println("Area: " +area);



    }


}
