package PCE.FichaPratica07;
import java.io.*;
import java.util.Scanner;
public class Ex3 {

    public static String copiarFicheiro(String pathOrigem,String pathDestino) throws IOException {
        Scanner scannerOrigem = new Scanner(new File(pathOrigem));
        FileWriter maquinaEscreverDestino = new FileWriter(new File(pathDestino));

        while (scannerOrigem.hasNextLine()) {

        }

return pathDestino;
    }
}

