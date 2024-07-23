package POO.FichaPratica11.Ex01_Avioes;

import static POO.FichaPratica11.Ex01_Avioes.CategoriaJato.MIDSIZE_JET;

public class Main {
    public static void main(String[] args) {

        JatoParticular gulfstream = new JatoParticular("123", "gulfstream", 2010, 4000, 500, 100, 100, 4, 1000, 1000, 40000, 300, 500, MIDSIZE_JET);
        JatoParticular cessna = new JatoParticular("J12345", "Cessna 125", 1990, 850, 12.5, 6.75, 2.3, 2, 800, 750, 50000, 12, 300, MIDSIZE_JET);
        JatoParticular boeing = new JatoParticular("1344", "boeing", 2005, 2000, 500, 100, 100, 2, 500, 1000, 2000, 200, 400, MIDSIZE_JET);

        cessna.addInstalacao(Instalacao.WC);
        cessna.addInstalacao(Instalacao.TOMADAS);
        cessna.addInstalacao(Instalacao.WIFI);

        cessna.exibirInstalacoes();

        gulfstream.addInstalacao(Instalacao.WIFI);
        gulfstream.addInstalacao(Instalacao.TOMADAS);
        gulfstream.addInstalacao(Instalacao.WC);

        gulfstream.exibirInstalacoes();

        boeing.addInstalacao(Instalacao.WC);
        boeing.addInstalacao(Instalacao.WIFI);
        boeing.addInstalacao(Instalacao.CINEMA);

        AviaoCombate f17 = new AviaoCombate("123", "f17", 2000, 5000, 200, 100, 100, 1, 500, 1000, 50000, "alemanha", true);
        AviaoCombate f22 = new AviaoCombate("888","f22",2020,500,50,50,100,2,500,1500,50000,"Polonia",true);


        f17.addArma(Arma.METRALHADORAS);
        f17.addArma(Arma.BOMBAS);
        f17.addArma(Arma.FOGUETES);

        f17.exibirArsenal();

        f22.addArma(Arma.FOGUETES);
        f22.addArma(Arma.BOMBAS);

        f22.exibirArsenal();

        Catalogo lojaAvioesXPTO = new Catalogo();
        lojaAvioesXPTO.compraAviao(cessna);
        lojaAvioesXPTO.compraAviao(gulfstream);
        lojaAvioesXPTO.compraAviao(boeing);
        lojaAvioesXPTO.compraAviao(f17);
        lojaAvioesXPTO.compraAviao(f22);

        lojaAvioesXPTO.exibirCatalogo();


    }
}
