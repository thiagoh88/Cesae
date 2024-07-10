package TrabalhoPratico;

import javax.xml.transform.Source;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static TrabalhoPratico.Funções.lerCsvParaMatriz;

public class MenuAdmin {

    public static void adminMenu(int opcaoAdmin) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        while (opcaoAdmin != 12) {

            System.out.println("\n\n⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
            System.out.println("\t \uD83D\uDD79\uFE0F  Game Start - ADMIN  \uD83D\uDD79\uFE0F ");
            System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
            System.out.println("\n     Selecionar a opção desejada:");
            System.out.println("        1.Consulta de ficheiros");
            System.out.println("        2.Total de vendas");
            System.out.println("        3.Total de Lucro");
            System.out.println("        4.Pesquisa de cliente");
            System.out.println("        5.Jogo mais caro");
            System.out.println("        6.Melhores clientes");
            System.out.println("        7.Melhor categoria");
            System.out.println("        8.Pesquisa de vendas");
            System.out.println("        9.TOP 5 jogos");
            System.out.println("        10.BOTTOM 5 jogos");
            System.out.println("        11.Cliente");
            System.out.println("        12.Sair");


            opcaoAdmin = input.nextInt();
            System.out.println("Opção selecionada: " + opcaoAdmin);

            switch (opcaoAdmin) {

                case 1:
                    System.out.println("1.Imprimir vendas");
                    System.out.println("2.Imprimir clientes");
                    System.out.println("3.Imprimir categorias");
                    System.out.println("4.Voltar");
                    int opcao = input.nextInt();
                    switch (opcao) {
                        case 1:
                            Funções.imprimirFicheiro("src/TrabalhoPratico/Ficheiros/GameStart_Vendas.csv");
                            break;
                        case 2:
                            Funções.imprimirFicheiro("src/TrabalhoPratico/Ficheiros/GameStart_Clientes.csv");
                            break;
                        case 3:
                            Funções.imprimirFicheiro("src/TrabalhoPratico/Ficheiros/GameStart_Categorias.csv");
                            break;
                        case 4:
                            MenuAdmin.adminMenu(opcao);
                    }
                case 2:
                    Funções.valorTotalVendido("src/TrabalhoPratico/Ficheiros/GameStart_Vendas.csv");
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:
                    MenuCliente.clienteMenu(opcaoAdmin);
                    break;
                case 12:
                    System.out.println("\nAté à próxima \uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0F");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}


