package PCE.FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ex3 {

    public static String lerFicheiro() throws FileNotFoundException
    {
        Scanner leitura = new Scanner(new File("Files07/exercicio_01_Alternativa01.txt"));
        String ficheiro = leitura.nextLine();

        while (leitura.hasNextLine())
        {
            ficheiro += leitura.nextLine();
        }
        leitura.close();

        return ficheiro;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("Files07/meuficheiro.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(lerFicheiro());

        printWriter.close();
    }
}
