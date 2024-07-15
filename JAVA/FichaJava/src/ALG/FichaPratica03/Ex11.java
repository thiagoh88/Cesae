package ALG.FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int inicio=0,salto, fim;

        System.out.println("introduzir salto: ");
        salto = input.nextInt();
        System.out.println("introduzir fim: ");
        fim = input.nextInt();

        while (inicio <= fim)
        {
            System.out.println(+inicio);
            //inicio=inicio+salto
            inicio=inicio+salto;
        }

}
}

