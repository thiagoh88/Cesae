package TrabalhoPratico;

import java.io.IOException;
import java.util.Scanner;

import static TrabalhoPratico.Funções.lerCsvParaMatriz;

public class MenuCliente {

    public static void clienteMenu(int opcaoCliente) throws IOException {
        Scanner input = new Scanner(System.in);

        String[][] matrizLogins = lerCsvParaMatriz("src/TrabalhoPratico/Ficheiros/GameStart_Admins.csv");

        do {
            System.out.println("\n\n⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
            System.out.println("\t\uD83D\uDD79\uFE0F  Game Start - CLIENTE  \uD83D\uDD79\uFE0F ");
            System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
            System.out.println("\n     Selecionar a opção desejada:");
            System.out.println("          1.Novo registo✅");
            System.out.println("          2.Estacionamento");
            System.out.println("          3.Catálogos");
            System.out.println("          4.Catálogo gráfico✅");
            System.out.println("          5.Catálogo editora");
            System.out.println("          6.Catálogo categoria");
            System.out.println("          7.Jogo mais recente");
            System.out.println("          8.Menu principal");

            opcaoCliente = input.nextInt();
            System.out.println("Opção selecionada: " + opcaoCliente);
            switch (opcaoCliente) {
                case 1:
                    //Cria e grava dados do cliente em nextLine//
                    System.out.println("Inserir Cliente");
                    input.nextLine();
                    System.out.println("Nome Completo: ");
                    String nomeCompleto = input.nextLine();
                    System.out.println("Contacto: ");
                    int contacto = input.nextInt();
                    input.nextLine();
                    System.out.println("Email: ");
                    String email = input.nextLine();
                    String path = "src/TrabalhoPratico/Ficheiros/gravarCliente.txt";
                    Funções.gravarCliente("src/TrabalhoPratico/Ficheiros/gravarCliente.txt", nomeCompleto, contacto, email);
                    System.out.println("Cliente inserido com sucesso: " + nomeCompleto + "|" + contacto + "|" + email + "|");
                    break;
                case 2:
                    System.out.println("Estacionamento");
                    break;
                case 3:
                    System.out.println("Imprimir catálogo");
                    break;
                case 4:
                    System.out.println("\n    \uD83D\uDC7EEscolha o jogo para imprimir\uD83D\uDC7E ");
                    System.out.println("          1. Call of Duty");
                    System.out.println("          2. Fifa");
                    System.out.println("          3. HollowKnight");
                    System.out.println("          4. Minecraft");
                    System.out.println("          5. Mortal Kombat");
                    System.out.println("          6. Overcooked");
                    System.out.println("          7. The Witcher 3");
                    int opcao = input.nextInt();
                    switch (opcao) {
                        case 1:
                            Funções.imprimirFicheiro("src/TrabalhoPratico/CatalogoGrafico/callOfDuty.txt");
                            break;
                        case 2:
                            Funções.imprimirFicheiro("src/TrabalhoPratico/CatalogoGrafico/fifa.txt");
                            break;
                        case 3:
                            Funções.imprimirFicheiro("src/TrabalhoPratico/CatalogoGrafico/hollowKnight.txt");
                            break;
                        case 4:
                            Funções.imprimirFicheiro("src/TrabalhoPratico/CatalogoGrafico/minecraft.txt");
                            break;
                        case 5:
                            Funções.imprimirFicheiro("src/TrabalhoPratico/CatalogoGrafico/mortalKombat.txt");
                            break;
                        case 6:
                            Funções.imprimirFicheiro("src/TrabalhoPratico/CatalogoGrafico/overcooked.txt");
                            break;
                        case 7:
                            Funções.imprimirFicheiro("src/TrabalhoPratico/CatalogoGrafico/witcher3.txt");
                            break;
                    }

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
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
        while (opcaoCliente != 8);
    }
}
