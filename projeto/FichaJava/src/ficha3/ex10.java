package ficha3;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num,inicio=2;

        System.out.println("insira um numero");
        num= input.nextInt();

                while (inicio<=num){
                    System.out.println(inicio);
                    inicio=inicio+2;
                }




    }
}
