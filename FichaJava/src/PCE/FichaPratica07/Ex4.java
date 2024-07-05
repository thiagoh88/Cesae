package PCE.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex4 {
    public static void imprimirFicheirocsv(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNext()) {
            String linhaAtual = scannerFicheiro.nextLine();
            System.out.println(linhaAtual);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        imprimirFicheirocsv("Files07/exercicio_04.csv");


    }

}
