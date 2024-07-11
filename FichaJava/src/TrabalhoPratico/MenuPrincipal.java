package TrabalhoPratico;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static TrabalhoPratico.Funções.*;
public class MenuPrincipal {

    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);

        String[][] matrizLogins = lerCsvParaMatrizLogin("src/TrabalhoPratico/Ficheiros/GameStart_Admins.csv");

        int opcao;

        do
        {
            System.out.println("\n\n\n\n\n⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
            System.out.println("\t\uD83D\uDD79\uFE0F Bem-vindo ao Game Start \uD83D\uDD79\uFE0F ");
            System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
            System.out.println("\n     Selecionar a opção desejada:");
            System.out.println("              1.Admin");
            System.out.println("              2.Cliente");
            System.out.println("              3.Sair");

            opcao = input.nextInt();
            System.out.println("Opção selecionada: " + opcao);
            switch (opcao)
            {
                case 1:
                    System.out.println("\n          \uD83D\uDEE0\uFE0F ADMIN LOGIN \uD83D\uDEE0\uFE0F");
                    System.out.println("            Insira o USER: ");
                    String user = input.next();
                    System.out.println("            Insira a PASSWORD: ");
                    String password = input.next();

                    if (loginAdmin(user, password, matrizLogins)) {
                        System.out.println("            Bem-vindo: " + user);
                        MenuAdmin.adminMenu(opcao);
                    }
                    else
                    {
                        System.out.println("Acesso errado");
                    }
                    break;
                case 2:
                    MenuCliente.clienteMenu(opcao);
                    break;
                case 3:
                    System.out.println();
                    Funções.imprimirFicheiro("src/TrabalhoPratico/Ficheiros/bypereira.txt");
                    System.out.println("//                              by Thiago Pereira\n");
                    break;
                default:
                    System.out.println("\n8Opção invalida");
            }
        }
        while (opcao != 3);
    }
}
