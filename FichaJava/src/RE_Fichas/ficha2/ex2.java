package RE_Fichas.ficha2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double salario;

        System.out.println("insira o salario");
        salario= input.nextDouble();

        if (salario<=15000){
            salario=salario*0.2;
            System.out.println("Paga taxa de 20%: "+salario);
        }else {
            salario=salario*0.3;
            System.out.println("Paga taxa de 30%: "+salario);
        }










    }

}
