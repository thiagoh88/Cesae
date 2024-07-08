package PCE.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex5 {

    public static void imprimirSoma(String path) throws FileNotFoundException {

        Scanner numero = new Scanner(new File(path));

        int somatorio = 0;

        while (numero.hasNextInt()) {
            somatorio += numero.nextInt();
        }

        System.out.println("Somatorio: "+somatorio);


    }

    public static void main(String[] args) throws FileNotFoundException {
        imprimirSoma("Files07/exercicio_05_1999.txt");
    }

}
