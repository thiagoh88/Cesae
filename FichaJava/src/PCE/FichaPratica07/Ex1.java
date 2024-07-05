package PCE.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {
    /**
     * Método que imprime o conteudo de um ficheiro
     * @param path caminho para o ficheiro
     * @throws FileNotFoundException caso o ficheiro não exista
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNext()) {
            String linhaAtual = scannerFicheiro.nextLine();
            System.out.println(linhaAtual);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        imprimirFicheiro("Files07/exercicio_01_Alternativa02.txt");


    }

}

