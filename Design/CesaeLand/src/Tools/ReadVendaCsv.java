package Tools;

import Model.Atracao;
import Model.Venda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadVendaCsv {
    public static ArrayList<Venda> readCsvFileToVendaArray(String filePath) {
        ArrayList<Venda> vendas = new ArrayList<>();

        try{
            Scanner readFile = new Scanner(new File(filePath));

            readFile.nextLine();

            while(readFile.hasNextLine()) {
                String linha = readFile.nextLine();
                String[] linhaArray = linha.split(";");

                // 0- atracaoId 1- nome atracao 2-precoadulot 3-precocraican 4-duracao segundos
                int atracaoId = Integer.parseInt(linhaArray[0]);
                String data = linhaArray[1];
                String tipoCliente = linhaArray[2];

                Venda v = new Venda(atracaoId, data, tipoCliente);

               vendas.add(v);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return vendas;
    }
}
