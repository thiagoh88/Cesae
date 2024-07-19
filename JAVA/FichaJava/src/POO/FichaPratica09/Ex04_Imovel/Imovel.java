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

    public double calcularPrecoCasa(Imovel tipo, Imovel acabamento, Imovel numQuartos, Imovel numCasasBanho, Imovel areaPiscina, double valorCasa) {




        return valorCasa;
    }


}
