package Tools;

import Model.Atracao;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAtracaoCsv {

    public static ArrayList<Atracao> readCsvFileToAtracaoArray(String filePath) {
        ArrayList<Atracao> atracoes = new ArrayList<>();

        try{
            Scanner readFile = new Scanner(new File(filePath));

            readFile.nextLine();

            while(readFile.hasNextLine()) {
                String linha = readFile.nextLine();
                String[] linhaArray = linha.split(";");

                // 0- atracaoId 1- nome atracao 2-precoadulot 3-precocraican 4-duracao segundos
                int atracaoId = Integer.parseInt(linhaArray[0]);
                String nomeAtracao = linhaArray[1];
                double precoAdulto = Double.parseDouble(linhaArray[2]);
                double precoCrianca = Double.parseDouble(linhaArray[3]);
                int duracaoSegundos = Integer.parseInt(linhaArray[4]);

                Atracao a = new Atracao(atracaoId, nomeAtracao, precoAdulto, precoCrianca, duracaoSegundos);

                atracoes.add(a);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return atracoes;
    }
}
