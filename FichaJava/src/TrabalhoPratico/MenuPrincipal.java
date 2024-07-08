package TrabalhoPratico;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("\t\uD83D\uDD79\uFE0F Bem-vindo ao Game Start \uD83D\uDD79\uFE0F ");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("\n      Selecionar a opção desejada:");
        System.out.println("             1.Admin");
        System.out.println("             2.Cliente");
        System.out.println("             3.Sair");
        int opcao= input.nextInt();

        switch (opcao){

            case 1:
                System.out.println(menuAdmin);
                break;
            case 2:
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida");

        }while (opcao!=3);

    }



}
