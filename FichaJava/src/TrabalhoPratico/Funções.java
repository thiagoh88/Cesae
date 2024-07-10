package TrabalhoPratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Funções {


    /**
     * Método de leitura e "transformação" do ficheiro em matriz
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static String[][] lerCsvParaMatriz(String path) throws FileNotFoundException {

        String[][] matrizCompleta = new String[4][2];
        Scanner scannerFicheiro = new Scanner(new File(path));


        int contadorLinhaMatriz = 0;

        while (scannerFicheiro.hasNextLine()) {
            String linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");

            for (int coluna = 0; coluna < matrizCompleta[0].length; coluna++) {
                matrizCompleta[contadorLinhaMatriz][coluna] = linhaDividida[coluna];
            }
            contadorLinhaMatriz++;
        }
        return matrizCompleta;
    }

    /**
     * Método para dar acesso unicamendo ao admin
     *
     * @param user
     * @param password
     * @param matrizLogins
     * @return
     * @throws FileNotFoundException
     */
    public static boolean loginAdmin(String user, String password, String[][] matrizLogins) throws FileNotFoundException {


        for (int linhas = 0; linhas < matrizLogins.length; linhas++) {

            if (matrizLogins[linhas][0].equals(user) && matrizLogins[linhas][1].equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método para imprimir um ficheiro
     *
     * @param path
     * @throws FileNotFoundException
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNext()) {
            String linhaAtual = scannerFicheiro.nextLine();
            System.out.println(linhaAtual);
        }
    }

    /**
     * Método para somar as vendas
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static Double valorTotalVendido(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        double somatorio = 0;

        String linhaAtual = scannerFicheiro.nextLine();

        while (scannerFicheiro.hasNext()) {
            linhaAtual = scannerFicheiro.nextLine();
            String[] linhaDividida = linhaAtual.split(";");

            somatorio += Double.parseDouble(linhaDividida[5]);


        }
        System.out.println("Total de vendas: " + "€" + somatorio);
        return somatorio;
    }


    public static Double totalLucro(String[][] matrizVendas, String[][] matrizCategoria) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(System.in);

        double lucro = 0;
        String linhaAtual = scannerFicheiro.nextLine();
        for (int linhasVendas = 0; linhasVendas < matrizVendas.length; linhasVendas++) {
            for (int linhasCategoria = 0; linhasCategoria < matrizCategoria.length; linhasCategoria++) {

                if (matrizVendas[linhasVendas][5].equals(matrizCategoria[linhasCategoria][1])) {
                    lucro += Double.parseDouble(matrizVendas[linhasVendas][1]) * Double.parseDouble(matrizCategoria[linhasCategoria][1]) / 100;
                }
            }
        }
        System.out.println(lucro);
        return lucro;
    }

    public static String[][] lerCsvParaMatriz2(String path) throws FileNotFoundException {

        String[][] matrizCompleta = new String[176][2];
        Scanner scannerFicheiro = new Scanner(new File(path));


        int contadorLinhaMatriz = 0;

        while (scannerFicheiro.hasNextLine()) {
            String linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");

            for (int coluna = 0; coluna < matrizCompleta[0].length; coluna++) {
                matrizCompleta[contadorLinhaMatriz][coluna] = linhaDividida[coluna];
            }
            contadorLinhaMatriz++;
        }
        return matrizCompleta;

    }

    public static void main(String[] args) throws FileNotFoundException {
        String[][] matrizVendas = lerCsvParaMatriz2("src/TrabalhoPratico/Ficheiros/GameStart_Vendas.csv");
        String[][] matrizCategorias = lerCsvParaMatriz2("src/TrabalhoPratico/Ficheiros/GameStart_Categorias.csv");
        totalLucro(matrizCategorias,matrizVendas);
    }
}




