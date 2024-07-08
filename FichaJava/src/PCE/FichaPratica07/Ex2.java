package PCE.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex2 {


    public static void criarFicheiroTexto(String path, String mensagem) throws FileNotFoundException {

        PrintWriter maquinaEscrever = new PrintWriter(new File(path)) ;

        maquinaEscrever.println(mensagem);

        maquinaEscrever.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        criarFicheiroTexto("Files07/meuficheiro.txt", "teste mensagem");

    }
    }

