package Ficha02.Ex01LojaOnline;

public class Food extends Product{
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("***** Food: " + this.name + " *****");
        System.out.println("Preço: " + this.price + " €\n");
    }


}