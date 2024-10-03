package Ficha02.Ex01LojaOnline;

public class Eletronics extends Product{

    public Eletronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("***** Eletrónico: " + this.name + " *****");
        System.out.println("Preço: " + this.price + " €\n");
    }
}