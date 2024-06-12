package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.println("primeiro:");
        num1 = input.nextInt();
        System.out.println("segundo");
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.println(num2+" "+num1);
        }else{
            System.out.println(num1+" "+num2);

        }
    }
}
