package RE_Fichas.ficha1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num1,num2;

        System.out.println("introduzir 1");
        num1= input.nextInt();
        System.out.println("introduzir 2");
        num2= input.nextInt();

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println(+num1+"-"+num2);





    }
}
