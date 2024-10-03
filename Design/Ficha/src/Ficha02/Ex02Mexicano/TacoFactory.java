package Ficha02.Ex02Mexicano;

public class TacoFactory {
    public static Taco createTaco(String type){
        switch (type){
            case "carne":
                return new TacoCarne();
            case "frango":
                return new TacoFrango();
            case "vegan":
                return new TacoVegan();
            default:
                throw new IllegalArgumentException("Não é taco " + type);
        }
    }
}
