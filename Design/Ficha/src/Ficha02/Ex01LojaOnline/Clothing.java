package Ficha02.Ex01LojaOnline;

public class Clothing extends Product{

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("***** Roupa: " + this.name + " *****");
        System.out.println("Preço: " + this.price + " €\n");
    }
}