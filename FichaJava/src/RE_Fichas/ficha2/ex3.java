package RE_Fichas.ficha2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double salario;

        System.out.println("insira o salario: ");
        salario= input.nextInt();

        if (salario<15001){
            System.out.println("Taxa 20%");
        }
        if (salario>=15000&&salario<=20000){
            System.out.println("Taxa 30%");
        }
        if (salario>=20000&&salario<=25000){
            System.out.println("Taxa 35%");
        }
        if (salario>=25000){
            System.out.println("Taxa 40%");
        }










    }
}
