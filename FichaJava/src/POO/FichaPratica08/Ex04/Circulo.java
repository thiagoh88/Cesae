package POO.FichaPratica08.Ex04;

public class Circulo {
    private  double raio;
    private double pi;

    public Circulo(double raio, double pi){
        this.raio = raio;
        this.pi= pi;
    }
    public double area(){
        return this.pi * this.raio * this.raio;
    }
}
