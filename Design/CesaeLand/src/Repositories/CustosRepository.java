package Repositories;

import Model.Custos;
import Tools.CustosReaderCSV;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustosRepository {

    private ArrayList<Custos> listaCustos;
    private static CustosRepository instance;

    public CustosRepository() {
        this.listaCustos = CustosReaderCSV.readListaCustosCSV("Files/Cesaeland_custos.csv");
    }

    public static CustosRepository getInstance() {

        if (instance==null){

            instance=new CustosRepository();
        }

        return instance;
    }

    public ArrayList<Custos> getListaCustos() {
        return listaCustos;
    }

    public Custos getCustoById(int id){
        for(Custos c : this.getListaCustos()) {
            if(c.getAtracaoID() == id){
                return c;
            }
        }

        return null;
    }

    public double getTotalCustosFixos() {
        double totalCustosFixos = 0;
        for(Custos c : this.getListaCustos()) {
            totalCustosFixos = totalCustosFixos + c.getCustosFixos();
        }

        return totalCustosFixos;
    }
}
