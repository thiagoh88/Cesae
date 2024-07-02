package ALG.FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.println("introduzir inicio: ");
        inicio = input.nextInt();
        System.out.println("introduzir fim: ");
        fim = input.nextInt();

        while (inicio <= fim) {
            System.out.println(+inicio);
            //inicio=inicio+1
            inicio++;


        }
    }
}
