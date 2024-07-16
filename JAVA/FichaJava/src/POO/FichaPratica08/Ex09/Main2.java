package POO.FichaPratica08.Ex09;

public class Main2 {
    public static void main(String[] args) {
        Produto2 lapis = new Produto2("lapis hb", 0.4);
        lapis.exibirDetalhes();

        lapis.comprar(150);
        lapis.exibirDetalhes();

        lapis.vender(50);
        lapis.exibirDetalhes();

        lapis.vender(200);
        lapis.exibirDetalhes();

    }
}
