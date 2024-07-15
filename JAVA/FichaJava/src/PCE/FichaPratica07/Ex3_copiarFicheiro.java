package PCE.FichaPratica07;
import java.io.*;
import java.util.Scanner;
public class Ex3_copiarFicheiro {

    public static void copiarFicheiro(String pathOrigem, String pathDestino) throws IOException {

        Scanner scannerOrigem = new Scanner(new File(pathOrigem));

        FileWriter maquinaEscreverDestino = new FileWriter(new File(pathDestino));

        while(scannerOrigem.hasNextLine()){
            String linha = scannerOrigem.nextLine();
            maquinaEscreverDestino.append(linha+"\n");
        }

        maquinaEscreverDestino.close();

    }

    public static void main(String[] args) throws IOException {

        copiarFicheiro("FicheirosFicha07/exercicio_03_Alternativa01.txt","FicheirosFicha07/exercicio_03_copia.txt");
    }

}
