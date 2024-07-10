package TrabalhoPratico;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static TrabalhoPratico.Funções.lerCsvParaMatriz;
import static TrabalhoPratico.Funções.loginAdmin;

public class MenuPrincipal {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String[][] matrizLogins = lerCsvParaMatriz("src/TrabalhoPratico/Ficheiros/GameStart_Admins.csv");

        System.out.println("\n\n\n\n\n⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("\t\uD83D\uDD79\uFE0F Bem-vindo ao Game Start \uD83D\uDD79\uFE0F ");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("\n     Selecionar a opção desejada:");
        System.out.println("              1.Admin");
        System.out.println("              2.Cliente");
        System.out.println("              3.Sair");

        int opcao = input.nextInt();
        System.out.println("Opção selecionada: " + opcao);
        switch (opcao) {

            case 1:
                System.out.println("\uD83D\uDEE0\uFE0F ADMIN LOGIN \uD83D\uDEE0\uFE0F");
                System.out.println("  Insira o USER: ");
                String user = input.next();
                System.out.println("Insira a PASSWORD: ");
                String password = input.next();

                if (loginAdmin(user, password, matrizLogins)) {
                    System.out.println("Bem-vindo: " + user);
                    MenuAdmin.adminMenu(opcao);
                } else {
                    System.out.println("Acesso errado");
                }
                break;
            case 2:
                MenuCliente.clienteMenu(opcao);
                break;
            case 3:
                System.out.println("\nAté à próxima \uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0F");
                break;
            default:
                System.out.println("Opção invalida");

        }
        while (opcao != 3) ;

    }


}
