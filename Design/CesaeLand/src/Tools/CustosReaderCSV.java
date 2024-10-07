package Tools;

import Model.Custos;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CustosReaderCSV {

    public static ArrayList<Custos> readListaCustosCSV(String filePath) {

        ArrayList<Custos> listaCustos=new ArrayList<>();

       try {
           Scanner scan = new Scanner(new File(filePath));

           scan.nextLine();//Ignorar cabeçalho

           while (scan.hasNextLine()) {

               String linhaAtual = scan.next();
               String[] linhaDividdida = linhaAtual.split(";");
               int atracaoID = Integer.parseInt(linhaDividdida[0]);
               double custosManutenção = Double.parseDouble(linhaDividdida[1]);
               double custosFixos = Double.parseDouble(linhaDividdida[2]);

               Custos a = new Custos(atracaoID, custosManutenção, custosFixos);
               listaCustos.add(a);
           }

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }

        return listaCustos;
    }
}
