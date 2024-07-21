package POO.FichaPratica09.Ex04_Imovel;

public class Imovel {
    private String rua;
    private int numPorta;
    private String cidade;
    private Tipo tipo; //apartamento,casa,mansão
    private Acabamento acabamento; //restauro,usada,nova,nova com alto acabamento
    private double area;
    private int numQuartos;
    private int numCasasBanho;
    private double areaPiscina;

    public Imovel(String rua, int numPorta, String cidade, Tipo tipo, Acabamento acabamento, double area, int numQuartos, int numCasasBanho, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numCasasBanho = numCasasBanho;
        this.areaPiscina = areaPiscina;
    }

    /**
     * Método para calcular o valor da casa
     *
     * @param valorCasa
     * @return
     */
    public double calcularPrecoCasa(double valorCasa) {
        if (this.tipo.equals(Tipo.APARTAMENTO)) {
            valorCasa += (this.area * 1000);
        }
        if (this.tipo.equals(Tipo.CASA)) {
            valorCasa += (this.area * 3000);
        }
        if (this.tipo.equals(Tipo.MANSAO)) {
            valorCasa += (this.area * 5000);
        }
        if (this.numQuartos > 0) {
            for (int i = 0; i < this.numQuartos; i++) {
                int contador = 0;
                contador++;
                valorCasa += contador * 7500;
            }
        }
        if (this.numCasasBanho > 0) {
            for (int i = 0; i < this.numCasasBanho; i++) {
                int contador = 0;
                contador++;
                valorCasa += contador * 10500;
            }
        }
        if (this.areaPiscina > 0) {
            valorCasa = (this.areaPiscina * 1000) + valorCasa;
        }
        if (this.acabamento.equals(Acabamento.RESTAURO)) {
            valorCasa *= 0.5;
        }
        if (this.acabamento.equals(Acabamento.USADA)) {
            valorCasa *= 0.1;
        }
        if (this.acabamento.equals(Acabamento.NOVA)) {
            valorCasa = valorCasa;
        }
        if (this.acabamento.equals(Acabamento.NOVACOMALTOACABAMENTO)) {
            valorCasa = (valorCasa * 0.25) + valorCasa;
        }
        return valorCasa;
    }

    //public void mudarEstadoCasa() {}

    public void imprimirDescricao() {
        System.out.println("Tipo: " + this.tipo + "\nAcabamento: " + this.acabamento + "\nArea: " + this.area + "m2" + "\nQuartos: " + this.numQuartos + "\nBanhos: " + this.numCasasBanho + "\nArea piscina: " + this.areaPiscina + "m2");
    }

    public Imovel compararImoveis(Imovel comparar) {
        if (this.calcularPrecoCasa(0) > comparar.calcularPrecoCasa(0)) {
            return this;
        } else {
            if (this.calcularPrecoCasa(0) < comparar.calcularPrecoCasa(0)) {
                return comparar;
            }
        }
        return null;
    }
}

