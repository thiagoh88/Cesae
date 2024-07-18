package POO.FichaPratica09.Ex01_Carro;

import static POO.FichaPratica08.Ex05_Carro.TipoCombustivel.DIESEL;

public class Carro {
    private Marcas marca;
    private Modelos modelo;
    private int anoFabrico;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel combustivel;
    private double litros100km;

    public Carro(Marcas marca, Modelos modelo, int anoFabrico, int potencia, TipoCombustivel combustivel, double litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.litros100km = litros100km;
    }

    public void ligar() {
        if (anoFabrico < 1994 && combustivel.equals(DIESEL)) {
            System.out.println("Deita um pouco de fumo...Custa a pegar...O carro está ligado!" + "\nVrumm-vrumm-vrumm");
        } else if (anoFabrico < 1994) {
            System.out.println("Custa a pegar...O carro está ligado!" + "vrumm vrumm vrumm");
        } else if (anoFabrico >= 1994 && potencia < 250) {
            System.out.println("O carro está ligado!" + "vrum vrum");
        } else if (anoFabrico >= 1994 && potencia >= 250) {
            System.out.println("O carro está ligado!" + "VRUUUMMMMM");
        }
    }

    public void corrida(Carro adversario1) {
        if (this.potencia > adversario1.potencia) {
            System.out.println("Adversario 1 mais potente");
        } else {
            System.out.println("Adversario 2 mais potente");
        }
    }

    public double distancia(double kmRodado){
        double consumo=(this.litros100km*100)/kmRodado;
        return consumo;
    }
}

