package ficha3;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int inicio=1,fim=100;

        System.out.println("inicio");
        inicio= input.nextInt();
        System.out.println("fim");
        fim= input.nextInt();

        while (inicio<fim){

            if (inicio%3==0){
                System.out.println(inicio);
            }
            inicio++;
        }
    }
}
