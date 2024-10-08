package Model;

public class Venda {
    private int atracaoId;
    private String data;
    private String tipoCliente;

    public Venda(int atracaoId, String data, String tipoCliente) {
        this.atracaoId = atracaoId;
        this.data = data;
        this.tipoCliente = tipoCliente;
    }

    public int getAtracaoId() {
        return atracaoId;
    }

    public String getData() {
        return data;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "atracaoId=" + atracaoId +
                ", data='" + data + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                '}';
    }
}
