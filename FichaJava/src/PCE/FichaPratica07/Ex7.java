package PCE.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex7 {

    public static void qntPalavrasNumeros(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        String palavras = scannerFicheiro.next();;
        int soma=0;
        while (scannerFicheiro.hasNext())
        {

            palavras += scannerFicheiro.next();

        }
        System.out.println(palavras);
    }

    public static void main(String[] args) throws FileNotFoundException {

        qntPalavrasNumeros("Files07/exercicio_07.txt");
    }

}


