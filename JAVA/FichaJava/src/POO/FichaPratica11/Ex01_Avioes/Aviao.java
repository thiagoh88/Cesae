package POO.FichaPratica11.Ex01_Avioes;

public class Aviao {
    private String numSerie;
    private String modelo;
    private  int anoFabrico;
    private double peso;
    private double compFuselagem;
    private double envAsas;
    private double altCauda;
    private  int nMotores;
    private double autonomia;
    private double velMax;
    private double preco;

    public Aviao(String numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altCauda, int nMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.compFuselagem = compFuselagem;
        this.envAsas = envAsas;
        this.altCauda = altCauda;
        this.nMotores = nMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }
    public void exibirDetalhes(){
        System.out.println("***** "+this.modelo+" "+this.numSerie+ " *****");
        System.out.println("Dimensoes - comp. Fuselagem: " +this.compFuselagem+" m. | Env. asas: "+this.envAsas);
        System.out.println("Ano Fabrico: " +this.anoFabrico+ " | num. motores: " +this.nMotores+" | vel. maxima: "+this.velMax);
        System.out.println("Preço: " +this.preco);
    }
}
