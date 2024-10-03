package Ficha02.Ex01LojaOnline;

    public class Book extends Product {

        public Book(String name, double price) {
            super(name, price);
        }

        @Override
        public void display() {
            System.out.println("***** Livro: " + this.name + " *****");
            System.out.println("Preço: " + this.price + " €\n");
        }
    }

