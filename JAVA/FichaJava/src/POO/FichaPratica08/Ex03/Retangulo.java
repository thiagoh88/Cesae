package POO.FichaPratica08.Ex03;

public class Retangulo {
    private int largura;
    private int comprimento;

    public Retangulo(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }
    public int area(){
        return this.comprimento * this.largura;
    }
    public int perimetro(){
        return this.comprimento + this.comprimento + this.largura + this.largura;
    }
}
