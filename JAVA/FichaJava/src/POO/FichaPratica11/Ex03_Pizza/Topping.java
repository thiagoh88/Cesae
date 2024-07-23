package POO.FichaPratica11.Ex03_Pizza;

public class Topping extends Ingrediente {

    private OrigemIngrediente origem;

    public Topping(int id, String nome, Medidas unidadeMedida, double calorias, OrigemIngrediente origem) {
        super(id, nome, unidadeMedida, calorias);
        this.origem = origem;
    }


}
