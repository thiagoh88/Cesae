package RE_Fichas.ficha1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1,pi=3.14;
        System.out.println("entrar com raio");
        num1 = input.nextDouble();
        num1=2*pi*num1;
        System.out.println("area:" +num1);



    }
}
