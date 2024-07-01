package ficha2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        int num1, num2;

        System.out.println("primeiro numero: ");
        num1 = input.nextInt();
        System.out.println("segundo numero: ");
        num2 = input.nextInt();

        if (num1>num2){
            System.out.println("menor: "+num2+"\nmaior: "+num1);
        }else {
            System.out.println("menor: "+num1+"\nmaior: "+num2);
        }

    }
}
