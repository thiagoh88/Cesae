package Model;

public class Custos {

    private int atracaoID;
    private double custoManutencao;
    private double custosFixos;

    public Custos(int atracaoID, double custoManutencao, double custosFixos) {
        this.atracaoID = atracaoID;
        this.custoManutencao = custoManutencao;
        this.custosFixos = custosFixos;
    }

    public int getAtracaoID() {
        return atracaoID;
    }

    public double getCustoManutencao() {
        return custoManutencao;
    }

    public double getCustosFixos() {
        return custosFixos;
    }

    @Override
    public String toString() {
        return "Custos{" +
                "atracaoID=" + atracaoID +
                ", custoManutencao=" + custoManutencao +
                ", custosFixos=" + custosFixos +
                '}';
    }
}
