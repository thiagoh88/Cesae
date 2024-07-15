package POO.FichaPratica08.Ex05;

public class Carro {
    private Marcas marca;
    private Modelos modelo;
    private int anoFabrico;

    public Carro(Marcas marca, Modelos modelo,int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    public Marcas getMarca() {
        return marca;
    }

    public Modelos getModelo() {
        return modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public void ligar() {
        System.out.println("o carro esta ligado");
    }
}
