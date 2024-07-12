package TrabalhoSexta;

import TrabalhoPratico.MenuAdmin;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static TrabalhoPratico.Funções.lerCsvParaMatrizLogin;
import static TrabalhoPratico.Funções.loginAdmin;

public class Menu {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String[][] matrizContasCliente = funcoesBanco.matrizContasCliente();

        int opcao;

        do {

            System.out.println("\n    Sistem de gestão de contas ");
            System.out.println("\n    Selecionar a opção desejada:");
            System.out.println("              1.Admin");
            System.out.println("              2.Cliente");
            System.out.println("              3.Sair");

            opcao = input.nextInt();
            System.out.println("Opção selecionada: " + opcao);
            switch (opcao) {
                case 1:
                    System.out.println("\n ADMIN LOGIN");
                    System.out.println("Insira o USER: ");
                    String user = input.next();
                    System.out.println("Insira a PASSWORD: ");
                    String password = input.next();

                    if (user.equals("9999") && password.equals("admin123")) {
                        funcoesBanco.adminMenu(opcao);

                    } else {
                        System.out.println("Acesso negado");
                    }
                    break;
                case 2:
                    System.out.println("\n CLIENTE LOGIN");
                    System.out.println("Insira o USER: ");
                    String user1 = input.next();
                    System.out.println("Insira a PASSWORD: ");
                    String password1 = input.next();

                    if (funcoesBanco.loginCliente(user1, password1, funcoesBanco.matrizContasCliente())) {
                        System.out.println("            Bem-vindo: " + user1);
                        funcoesBanco.clienteMenu(user1);
                    } else {
                        System.out.println("Acesso negado");
                    }
                    break;
                case 3:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }
        } while (opcao != 3);
    }
}

