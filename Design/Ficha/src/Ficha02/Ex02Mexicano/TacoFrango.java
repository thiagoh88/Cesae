package Ficha02.Ex02Mexicano;

public class TacoFrango extends Taco{
    @Override
    public void prepare() {
        System.out.println("Preparando um taco de galinha...");
    }

    @Override
    public void bake() {
        System.out.println("cozinhando o taco de galinha...");
    }

    @Override
    public void box() {
        System.out.println("embalando o taco de galinha...");
    }
}
