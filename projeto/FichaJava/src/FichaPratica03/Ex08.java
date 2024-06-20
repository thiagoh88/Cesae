package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numero, limite1, limite2;
        System.out.println("Introduzir numero:");
        numero = input.nextInt();


        limite2 = numero - 5;
        while (limite2 < numero)
        {
            System.out.println(+limite2);
           //faz a leitura depois ( começa no zero )
            limite2 = limite2 + 1;
        }

        limite1 = numero + 5;
        while (numero < limite1)
        {
            //faz a leitura primeiro
            numero = numero + 1;
            System.out.println(+numero);
        }

}
}

