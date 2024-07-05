package PCE.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex2 {


    public static void imprimirTexto() throws FileNotFoundException {

        String fileContent = "texto dentro de um ficheiro criado";

        File ficheiro = new File("Files07/meuficheiro.txt");
        PrintWriter printWriter = new PrintWriter(ficheiro);

        printWriter.println(fileContent);
        printWriter.println("sexta");

        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        imprimirTexto();
    }
    }

