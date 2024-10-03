package Ficha02.Ex02Mexicano;

public class TacoCarne extends Taco {
    @Override
    public void prepare() {
        System.out.println("Preparando um taco de carne...");
    }

    @Override
    public void bake() {
        System.out.println("cozinhando o taco de carne...");
    }

    @Override
    public void box() {
        System.out.println("embalando o taco de carne...");
    }
}
