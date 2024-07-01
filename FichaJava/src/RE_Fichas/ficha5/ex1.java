package RE_Fichas.ficha5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] vetor= new int[3];

        for (int i=0; i< vetor.length; i++)
        {
            System.out.print("insira um numero no vetor ["+i+"]: ");
            vetor[i]= input.nextInt();
        }
        System.out.println("\n---------------------\n");

        for (int i=0; i< vetor.length;i++){

            System.out.println("vetor ["+i+"]: "+vetor[i]);
        }




    }
}
