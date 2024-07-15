package POO.FichaPratica08.Ex03;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo1=new Retangulo(10,20);
        Retangulo terreno=new Retangulo(100,50);

        System.out.println("Perimetro: " +retangulo1.perimetro()+ " m");
        System.out.println("Area: "+retangulo1.area()+" m2");

        System.out.println("-----------------------------");

        System.out.println("Perimetro: "+terreno.perimetro()+" m");
        System.out.println("Perimetro: "+terreno.area()+ " m");
    }
}
