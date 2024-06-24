package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int inicio=2,fim;
        System.out.println("inserir numero: ");
        fim= input.nextInt();

       while (inicio<=fim)
       {
           System.out.println(+inicio);
           inicio=inicio+2;
       }



    }
}
