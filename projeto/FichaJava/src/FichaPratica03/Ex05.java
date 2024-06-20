package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade, x = 1;
        String mensagem;


        System.out.println("quantidade");
        quantidade = input.nextInt();

        System.out.println("mensagem");
        input.nextLine();
        mensagem = input.nextLine();

        System.out.println("quantidade: " + quantidade);

        while (x < quantidade) {
            System.out.println(mensagem);
            x++;
        }

    }
}
