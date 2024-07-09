package TrabalhoPratico;

import javax.xml.transform.Source;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MenuAdmin {

    public static void adminMenu(int opcaoAdmin) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);




        System.out.println("\n\n⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("\t \uD83D\uDD79\uFE0F  Game Start - ADMIN  \uD83D\uDD79\uFE0F ");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("\n     Selecionar a opção desejada:");
        System.out.println("        1.Consulta de ficheiros");
        System.out.println("        2.Total de vendas");
        System.out.println("        3.Total de vendas");
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
                System.out.println("Consulta de ficheiros");
                break;
            case 2:
                System.out.println("Total de vendas");
                break;
            case 3:
                System.out.println("Total de vendas");
                break;
            case 4:
                System.out.println("Pesquisa de cliente");
                break;
            case 5:
                System.out.println("Jogo mais caro");
                break;
            case 6:
                System.out.println("Melhores clientes");
                break;
            case 7:
                System.out.println("Melhor categoria");
                break;
            case 8:
                System.out.println("Pesquisa de vendas");
                break;
            case 9:
                System.out.println("TOP 5 jogos");
                break;
            case 10:
                System.out.println("BOTTOM 5 jogos");
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
        while (opcaoAdmin != 12) ;

    }
}

