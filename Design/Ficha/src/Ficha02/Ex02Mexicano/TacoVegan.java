package Ficha02.Ex02Mexicano;

public class TacoVegan extends Taco{
    @Override
    public void prepare() {
        System.out.println("Preparando um taco de vegan...");
    }

    @Override
    public void bake() {
        System.out.println("cozinhando o taco de vegan...");
    }

    @Override
    public void box() {
        System.out.println("embalando o taco de vegan...");
    }
}
