package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int numero, divisor=0;

        System.out.print("insira um numero: ");
        numero=input.nextInt();

        if (numero < 1)
        {
            System.out.println("não primo");
        }
        else
        {
            for (int i = 2; i < numero; i++)
            {
                if (numero % i == 0)
                {
                    divisor++;
                    break;
                }
            }

            if (divisor == 0)
            {
                System.out.println("primo.");
            }
            else
            {
                System.out.println("não primo");
            }
        }
    }
}

