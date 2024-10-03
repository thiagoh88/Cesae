package Ficha02.Ex01LojaOnline;

public class Main {
    public static void main(String[] args) {
        Product javaHeadFirst = ProductFactory.createProduct("book", "Java Heads First", 50);
        Product pcHP = ProductFactory.createProduct("eletronics", "Laptop HP", 1500);
        Product torradeira = ProductFactory.createProduct("eletronics", "Torradeira Philips", 90);
        Product tshirt = ProductFactory.createProduct("clothing", "T-shirt Preta", 25);
        Product arroz = ProductFactory.createProduct("food","Arroz Branco",1);

        ShoppingCart sc = new ShoppingCart("Vitor Santos");
        sc.addProduto(pcHP);
        sc.addProduto(torradeira);
        sc.addProduto(arroz);

        sc.printCart();
        System.out.println("Total: " + sc.cartTotal());


    }
}
