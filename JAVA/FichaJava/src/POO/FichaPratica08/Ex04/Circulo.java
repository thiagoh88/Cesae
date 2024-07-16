package POO.FichaPratica08.Ex04;

public class Circulo {
    private double raio;


    public Circulo(double raio) {
        this.raio = raio;

    }

    public double area() {
        return 3.14 * this.raio * this.raio;
    }

    public double circunferencia() {
        return 2 * 3.14 * this.raio;
    }
}
