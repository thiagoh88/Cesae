package RE_Fichas.ficha3;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int inicio,fim;

        System.out.println("inicio");
        inicio= input.nextInt();
        System.out.println("fim");
        fim= input.nextInt();

        while (inicio<=fim){
            System.out.println(inicio++);
        }









    }
}
