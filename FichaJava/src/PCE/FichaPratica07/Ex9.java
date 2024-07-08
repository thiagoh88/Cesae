package PCE.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static PCE.FichaPratica07.Ex7.contarLinhasFicheiro;

public class Ex9 {

    public static String[][] lerCsvParaMatriz(String path) throws FileNotFoundException {

        String[][] matrizCompleta = new String[contarLinhasFicheiro(path) - 1][4];

        Scanner scannerFicheiro = new Scanner(new File(path));

        String linha = scannerFicheiro.nextLine();

        int contadorLinhaMatriz = 0;

        while (scannerFicheiro.hasNextLine()) {

            linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(",");

            for (int coluna = 0; coluna < matrizCompleta[0].length; coluna++) {
                matrizCompleta[contadorLinhaMatriz][coluna] = linhaDividida[coluna];
            }
            contadorLinhaMatriz++;
        }
        return matrizCompleta;
    }

    public static void imprimirMusicasGenero(String genero, String[][] matrizCompleta) {


    }
    public static void imprimirMusicasArtista(String artista, String[][] matrizCompleta) {


    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("1. Pesquisar por músicas de um determinado género");
            System.out.println("2. Pesquisar músicas de um determinado artista.");
            System.out.println("3. Pesquisar música com maior duração.");
            System.out.println("4. Pesquisar músicas com duração acima de um valor especificado.");
            System.out.println("5. Número de músicas no ficheiro.");
            System.out.println("6. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }

        } while (opcao != 6);
    }

    public static void main(String[] args) {
        menu();
    }

}
