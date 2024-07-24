package POO.FichaPratica11.Ex03_Pizza.Ingredientes;

import POO.FichaPratica11.Ex03_Pizza.Enums.Medidas;
import POO.FichaPratica11.Ex03_Pizza.Enums.OrigemIngrediente;

public class Topping extends Ingrediente {

    private OrigemIngrediente origem;

    public Topping(int id, String nome, Medidas unidadeMedida, double calorias, OrigemIngrediente origem) {
        super(id, nome, unidadeMedida, calorias);
        this.origem = origem;
    }
}
