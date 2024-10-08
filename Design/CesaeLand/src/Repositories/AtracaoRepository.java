package Repositories;

import Model.Atracao;
import Tools.ReadAtracaoCsv;

import java.util.ArrayList;

public class AtracaoRepository {
    private static AtracaoRepository instance;
    private static ArrayList<Atracao> atracoes;

    private AtracaoRepository() {
        atracoes = ReadAtracaoCsv.readCsvFileToAtracaoArray("Files/Cesaeland_atracoes.csv");
    }

    public static AtracaoRepository getInstance() {
        if(instance == null) {
            instance = new AtracaoRepository();
        }

        return instance;
    }

    public ArrayList<Atracao> getAtracaoArray(){
        return atracoes;
    }

    public Atracao getAtracaoByID(int id) {
        for(Atracao a : atracoes) {
            if(a.getId() == id) {
                return a;
            }
        }
        return null;
    }
}
