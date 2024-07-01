package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fim,count=0;

        System.out.println("inserir numero");
        fim = input.nextInt();
        while (count<=fim) {
            System.out.println(count++);
            //count=count+1 ou count++;

        }


    }
}
