package Repositories;

import Model.Atracao;
import Model.Venda;
import Tools.ReadAtracaoCsv;
import Tools.ReadVendaCsv;

import java.util.ArrayList;

public class VendaRepository {
    private static VendaRepository instance;
    private static ArrayList<Venda> vendas;

    public VendaRepository() {
        vendas = ReadVendaCsv.readCsvFileToVendaArray("Files/Cesaeland_vendas.csv");
    }

    public static VendaRepository getInstance() {
        if(instance == null) {
            instance = new VendaRepository();
        }

        return instance;
    }

    public ArrayList<Venda> getVendasArray(){
        return vendas;
    }
}
