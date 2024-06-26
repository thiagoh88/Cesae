package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num1,numSecreto,tentativas=1;
        System.out.println("Jogador 1, insira o numero secreto: ");
        numSecreto= input.nextInt();
        do{
            System.out.println("Jogador 2, insira o numero: ");
            num1= input.nextInt();
            if (num1<numSecreto)
            {
                System.out.println("foi menor");
            }
                if (num1>numSecreto)
                {
                    System.out.println("foi maior");
                }
                    if (num1==numSecreto)
                    {
                        System.out.println("acertou!");
                        System.out.println("tentativas: "+tentativas);
                    }
                    tentativas++;
        }while (num1!=numSecreto);
   }
}
