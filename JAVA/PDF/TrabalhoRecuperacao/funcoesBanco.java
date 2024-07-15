package TrabalhoSexta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoesBanco {
    /**
     * Método para login do CLIENTE
     *
     * @param user
     * @param password
     * @param
     * @return
     * @throws FileNotFoundException
     */
    public static boolean loginCliente(String user, String password, String[][] matrizContas) throws FileNotFoundException {

        for (int linhas = 0; linhas < matrizContas.length; linhas++) {

            if (matrizContas[linhas][0].equals(user) && matrizContas[linhas][2].equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método para login do ADMIN
     * public static boolean loginCliente(String user, String password, String[][] matrizContas) throws FileNotFoundException {
     * <p>
     * for (int linhas = 0; linhas < matrizContas.length; linhas++) {
     * for (int colunas = 0; colunas < matrizContas[0].length; colunas++) {
     * System.out.print(matrizContas[linhas][colunas]+" | ");
     * }
     * System.out.println();
     * }
     * <p>
     * for (int linhas = 0; linhas < matrizContas.length; linhas++) {
     * <p>
     * if (matrizContas[linhas][0].equals(user) && matrizContas[linhas][2].equals(password)) {
     * return true;
     * }
     * }
     * return false;
     * }
     * <p>
     * /**
     * Criar matriz informacoes clientes e admin
     *
     * @param
     * @param
     * @return
     */
    public static boolean logingadm(String user, String password, String[][] matrizContas) throws FileNotFoundException {


        for (int linhas = 0; linhas < matrizContas.length; linhas++) {

            if (matrizContas[linhas][0].equals(user) && matrizContas[linhas][1].equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Matriz contas CLIENTES
     *
     * @return
     */
    public static String[][] matrizContasCliente() {
        Scanner input = new Scanner(System.in);
        String[][] matriz = new String[5][4];

        matriz[0][0] = "12345";
        matriz[0][1] = "joaquim Alberto";
        matriz[0][2] = "Quim85";
        matriz[0][3] = "0";
        matriz[1][0] = "10";
        matriz[1][1] = "11111";
        matriz[1][2] = "Fernando Torres";
        matriz[1][3] = "Nando92";
        matriz[2][0] = "0";
        matriz[2][1] = "10";
        matriz[2][2] = "22222";
        matriz[2][3] = "David Martins";
        matriz[3][0] = "David!5";
        matriz[3][1] = "0";
        matriz[3][2] = "10";
        matriz[3][3] = "33333";
        matriz[4][0] = "Joana Silva";
        matriz[4][1] = "JoanaSilva999";
        matriz[4][2] = "0";
        matriz[4][3] = "10";
        return matriz;


    }

    /**
     * ADMIN menu
     *
     * @param opcaoAdmin
     */
    public static void adminMenu(int opcaoAdmin) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n    ADMIN");
            System.out.println("1. Consultar");
            System.out.println("2. Modificar Margem de Empréstimo");
            System.out.println("3. Logout");

            opcao = input.nextInt();
            System.out.println("Opção selecionada: " + opcao);
            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (opcao != 3);


    }

    /**
     * CLIENTE menu
     *
     * @param
     */
    public static void clienteMenu(String clienteLogado) {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n    CLIENTE");
            System.out.println("1. Consultar Informações");
            System.out.println("2. Depositar");
            System.out.println("3. Levantar");
            System.out.println("4. Transferir");
            System.out.println("5. Simular Crédito");
            System.out.println("6. Logout");
            opcao = input.nextInt();
            System.out.println("Opção selecionada: " + opcao);
            switch (opcao) {
                case 1:
                    //FUNÇÃO PARA IMPRIMIR A LINHA DO USUARIO LOGADO
                    //funcoesBanco.imprimirCliente(clienteLogado,funcoesBanco.matrizContasCliente());
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
                    System.out.println("Opção invalida");
            }
        } while (opcao != 6);
    }

    /**
     * Imprime o cliente que fez o login
     *
     * @param
     * @param nomeCliente
     * @throws FileNotFoundException
     */
    public static void imprimirCliente(int nomeCliente) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(System.in);

        while (scannerFicheiro.hasNextLine()) {
            String linhaAtual = scannerFicheiro.nextLine();
            String[] colunas = linhaAtual.split(";");

            if (Integer.parseInt(colunas[0]) == nomeCliente) {

                System.out.println(linhaAtual);
            }
        }


    }


}



