package PCE.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex6 {


    public static void pessoaVelha(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        int maior = 0;
        String nomeMaisVelho = "";

        while (scannerFicheiro.hasNext()) {
            String linhaAtual = scannerFicheiro.nextLine();
            String[] idades = linhaAtual.split(",");
            System.out.println(idades[1]);

            if (Integer.parseInt(idades[1]) > maior) {
                maior = Integer.parseInt(idades[1]);
                nomeMaisVelho = idades[0];
            }
        }
        System.out.println("Pessoa mais velha é " + nomeMaisVelho + " e tem " + maior + " anos.");
    }

    public static void main(String[] args) throws FileNotFoundException {

        pessoaVelha("Files07/exercicio_06.txt");


    }
}
