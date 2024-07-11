package TrabalhoPratico;

import java.io.*;
import java.util.Scanner;

public class Funções {


    /**
     * Método para contar as colunas da matriz
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static int contarColunasFicheiro(String path) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(new File(path));

        if (scannerFicheiro.hasNextLine()) {
            String primeiraLinha = scannerFicheiro.nextLine();
            String[] colunas = primeiraLinha.split(",");
            return colunas.length;
        }
        return 0;
    }

    /**
     * Método para contar as linhas da matriz
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static int contarLinhasFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        int numeroLinhas = 0;

        while (scannerFicheiro.hasNextLine()) {
            numeroLinhas++;
            scannerFicheiro.nextLine();
        }

        return numeroLinhas;
    }

    /**
     * Método de leitura e "transformação" do ficheiro em matriz
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static String[][] lerCsvParaMatriz(String path) throws FileNotFoundException {

        String[][] matrizCompleta = new String[contarLinhasFicheiro(path)][contarColunasFicheiro(path)];
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
     * Método especifico para o login do admin
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static String[][] lerCsvParaMatrizLogin(String path) throws FileNotFoundException {

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
     * Método para dar acesso ao admin
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
            for (char trocarEspaco : linhaAtual.toCharArray()) {

                if (trocarEspaco == ';') {
                    System.out.print(' ');
                } else {
                    System.out.print(trocarEspaco);
                }
            }
            System.out.println();
        }
    }

    /**
     * Método para somar as vendas
     *
     * @param path
     * @throws FileNotFoundException
     */
    public static void valorTotalVendido(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        double somatorio = 0;

        String linhaAtual = scannerFicheiro.nextLine();

        while (scannerFicheiro.hasNext()) {
            linhaAtual = scannerFicheiro.nextLine();
            String[] linhaDividida = linhaAtual.split(";");

            somatorio += Double.parseDouble(linhaDividida[5]);


        }

        System.out.println("\nTotal de vendas: " + String.format("€%.2f", somatorio));
    }

    /**
     * Método para pesquisar cliente
     *
     * @param path
     * @param clienteId
     * @throws FileNotFoundException
     */
    public static void pesquisaCliente(String path, int clienteId) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(new File(path));

        String primeiraLinha = scannerFicheiro.nextLine();

        while (scannerFicheiro.hasNextLine()) {
            String linhaAtual = scannerFicheiro.nextLine();
            String[] colunas = linhaAtual.split(";");

            if (Integer.parseInt(colunas[0]) == clienteId) {
                System.out.println(primeiraLinha);
                System.out.println(linhaAtual);
                return;
            }
        }
    }

    /**
     * Método para verificar o jogo mais caro e imprimir os clientes que o compraram
     *
     * @param pathVendas
     * @throws FileNotFoundException
     */
    public static void jogoCaro(String pathVendas, String pathClientes) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(new File(pathVendas));

        double jogoMaisCaro = 0;
        String nomeJogo = "";
        String clienteJogoCaro = "";
        String linha = scannerFicheiro.nextLine();

        //encontrar o jogo mais caro _______________________________________
        while (scannerFicheiro.hasNextLine()) {
            linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");

            if (Double.parseDouble(linhaDividida[5]) > jogoMaisCaro) {

                jogoMaisCaro = Double.parseDouble(linhaDividida[5]);
                nomeJogo = linhaDividida[4];
                clienteJogoCaro = linhaDividida[1];
            }
        }

        System.out.println("\nJogo mais caro.\n" + nomeJogo + " €" + jogoMaisCaro);
        System.out.println("\nClientes que Compraram: ");

        // ________________________________________________________________

        Scanner scannerFicheiro2 = new Scanner(new File(pathVendas));
        linha = scannerFicheiro2.nextLine();

        // encontrar clientes que o compraram por ID
        while (scannerFicheiro2.hasNextLine()) {
            linha = scannerFicheiro2.nextLine();
            String[] linhaDividida = linha.split(";");

            if (jogoMaisCaro == Double.parseDouble(linhaDividida[5])) {

                Scanner scannerFicheiro3 = new Scanner(new File(pathClientes));
                linha = scannerFicheiro3.nextLine();

                while (scannerFicheiro3.hasNextLine()) {
                    linha = scannerFicheiro3.nextLine();
                    String[] linhaDivididaClientes = linha.split(";");
                    // procurar o cliente com aquele id
                    if (linhaDividida[1].equals(linhaDivididaClientes[0])) {
                        System.out.print("\n| Id: " + linhaDivididaClientes[0]);
                        System.out.println(" | Nome: " + linhaDivididaClientes[1] + " |");
                    }

                }
            }
        }
    }

    /**
     * Método para gravar as informações do cliente (add Bufferedwriter)
     *
     * @param path
     * @param
     * @throws FileNotFoundException
     */
    public static void gravarCliente(String path, String nome, int contacto, String email) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        writer.write(nome + " | " + contacto + " | " + email);
        writer.newLine();
        writer.close();

    }

    /**
     * Método para encontrar o lucro das vendas em base na categoria vs percentual
     *
     * @param pathVendas
     * @param pathCategorias
     * @throws FileNotFoundException
     */
    public static void totalLucro(String pathVendas, String pathCategorias) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(new File(pathVendas));
        String linhaAtual = scannerFicheiro.nextLine();
        double lucroTotal = 0;

        while (scannerFicheiro.hasNext()) {
            linhaAtual = scannerFicheiro.nextLine();
            String[] linhaDivididaVendas = linhaAtual.split(";");

            Scanner scannerFicheiro2 = new Scanner(new File(pathCategorias));
            linhaAtual = scannerFicheiro2.nextLine();

            while (scannerFicheiro2.hasNext()) {
                linhaAtual = scannerFicheiro2.nextLine();
                String[] linhaDivididaCategoria = linhaAtual.split(";");

                if (linhaDivididaVendas[3].equals(linhaDivididaCategoria[0])) {
                    lucroTotal += Double.parseDouble(linhaDivididaVendas[5]) * (Double.parseDouble(linhaDivididaCategoria[1]) / 100);
                }
            }
        }
        System.out.println(lucroTotal);
    }

    public static void melhorCliente(String pathClientes, String pathVendas) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(pathVendas));

        int melhorCliente = 0;
        String nomeJogo = "";
        String linha = scannerFicheiro.nextLine();

        //encontrar o melhor cliente -------------------------------------
        while (scannerFicheiro.hasNextLine()) {
            linha = scannerFicheiro.nextLine();
            String[] linhaDivididaVendas = linha.split(";");




            if (valorTotalCliente > melhorCliente) {

                melhorCliente = valorTotalCliente;
                idClienteMelhor = idClienteAtual;
            }
        }
        System.out.println(melhorCliente);
    }
}

