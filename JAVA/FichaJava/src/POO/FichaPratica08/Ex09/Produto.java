package POO.FichaPratica08.Ex09;

public class Produto {
    private String nome;
    private double preco;
    private double qntEstoque = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {

    }

    public double setQntEstoque(double qntEstoque) {
        this.qntEstoque = qntEstoque;
        return qntEstoque;
    }

    public double comprar(double num) {
        setQntEstoque(qntEstoque + num);
        return qntEstoque;
    }

    public double vender(double num) {
        if (qntEstoque < num) {
            System.out.println("quantidade insuficiente");
        } else {
            setQntEstoque(qntEstoque - num);

        }
        return qntEstoque;
    }

    public void estoque() {
        System.out.println(qntEstoque);
    }
}


