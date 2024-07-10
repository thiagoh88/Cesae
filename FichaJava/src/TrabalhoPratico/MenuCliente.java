package TrabalhoPratico;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static TrabalhoPratico.Funções.lerCsvParaMatriz;
import static TrabalhoPratico.Funções.loginAdmin;

public class MenuCliente {

    public static void clienteMenu(int opcaoCliente) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        String[][] matrizLogins = lerCsvParaMatriz("src/TrabalhoPratico/Ficheiros/GameStart_Admins.csv");

        System.out.println("\n\n⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("\t\uD83D\uDD79\uFE0F  Game Start - CLIENTE  \uD83D\uDD79\uFE0F ");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("\n     Selecionar a opção desejada:");
        System.out.println("          1.Novo registo");
        System.out.println("          2.Estacionamento");
        System.out.println("          3.Catálogo");
        System.out.println("          4.Catálogo gráfico");
        System.out.println("          5.Catálogo editora");
        System.out.println("          6.Catálogo categoria");
        System.out.println("          7.Jogo mais recente");
        System.out.println("          8.Admin");
        System.out.println("          9.Sair");

        opcaoCliente = input.nextInt();
        System.out.println("Opção selecionada: " + opcaoCliente);
        switch (opcaoCliente) {

            case 1:
                System.out.println("Novo registo");
                break;
            case 2:
                System.out.println("Estacionamento");
                break;
            case 3:
                System.out.println("Imprimir catálogo");
                break;
            case 4:
                System.out.println("Imprimir catálogo editora");
                break;
            case 5:
                System.out.println("Imprimir catálogo editora");
                break;
            case 6:
                System.out.println("Imprimir catálogo categoria");
                break;
            case 7:
                System.out.println("Imprimir jogo mais recente");
                break;
            case 8:
                System.out.println("\uD83D\uDEE0\uFE0F ADMIN LOGIN \uD83D\uDEE0\uFE0F");
                System.out.println("Insira o USER: ");
                String user = input.next();
                System.out.println("Insira a PASSWORD: ");
                String password = input.next();

                if (loginAdmin(user, password, matrizLogins)) {
                    System.out.println("Bem-vindo: " + user);
                    MenuAdmin.adminMenu(opcaoCliente);
                } else {
                    System.out.println("Acesso errado");
                }
                break;
            case 9:
                System.out.println("\nAté à próxima \uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0F");
                break;
            default:
                System.out.println("Opção invalida");
        }
        while (opcaoCliente != 9) ;
    }
}
