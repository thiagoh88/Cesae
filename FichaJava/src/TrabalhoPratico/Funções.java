package TrabalhoPratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Funções {

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

    public static boolean loginAdmin(String user, String password, String[][] matrizLogins) throws FileNotFoundException {


        for (int linhas = 0; linhas < matrizLogins.length; linhas++) {

            if (matrizLogins[linhas][0].equals(user) && matrizLogins[linhas][1].equals(password)) {

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        // Criar martiz logins
        String[][] matrizLogins = lerCsvParaMatriz("src/TrabalhoPratico/Ficheiros/GameStart_Admins.csv");

        System.out.println("user");
        String user = input.next();
        System.out.println("pass");
        String password = input.next();
        loginAdmin(user, password, matrizLogins);
    }
}


