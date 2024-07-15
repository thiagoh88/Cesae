package RE_Fichas.ficha3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num,inicio=0;

        System.out.println("insira um numero:");
        num= input.nextInt();
        while (inicio<=num){
            System.out.println(inicio++);
        }




    }
}
