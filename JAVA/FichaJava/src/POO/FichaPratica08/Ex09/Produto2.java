package POO.FichaPratica08.Ex09;

public class Produto2 {
    private String nome;
    private double preco;
    private int quantStock=0;

    public Produto2(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void comprar(int quantidadeCompra){
        this.quantStock+=quantidadeCompra;

    }
    public void vender(int quantidadeVenda){
        if (this.quantStock>=quantidadeVenda){
            this.quantStock-=quantidadeVenda;
        }else{
            System.out.println("Stock indisponivel");
        }
    }
    public void exibirDetalhes(){
        System.out.println("Produto: "+this.nome + "\t| Preço: "+this.preco + "\t| Quant. Stock: "+this.quantStock);
    }

}

