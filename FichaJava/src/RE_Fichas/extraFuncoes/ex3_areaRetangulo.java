package RE_Fichas.extraFuncoes;

import java.util.Scanner;

public class ex3_areaRetangulo {

    public static double calcularAreaRetangulo(double base, double altura) {

        double area = base * altura;

        System.out.println("area: " + area);

        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("base: ");
        double num1 = input.nextDouble();
        System.out.println("altura: ");
        double num2 = input.nextDouble();

        calcularAreaRetangulo(num1, num2);
    }

}
