package POO.FichaPratica11.Ex01_Avioes;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(String numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altCauda, int nMotores, double autonomia, double velMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, altCauda, nMotores, autonomia, velMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Arma>();
    }

    public void addArma(Arma armaNova) {
        if (this.arsenal.size() < 3) {
            this.arsenal.add(armaNova);
        }
    }

    public void removeArma(Arma armaRemover) {
        this.arsenal.remove(armaRemover);
    }

    public void exibirArsenal() {
        System.out.println("Armas: ");
        System.out.println(this.arsenal);
    }
    public void exibirDetalhesAviaoCombate(){
        super.exibirDetalhes();
        System.out.println("Pais de origem: "+this.paisOrigem+"Camuflagem: "+this.camuflagem);
        this.exibirArsenal();
    }
}
