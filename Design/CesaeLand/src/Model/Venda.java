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

    @Override
    public String toString() {
        return "Venda{" +
                "atracaoId=" + atracaoId +
                ", data='" + data + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                '}';
    }
}
