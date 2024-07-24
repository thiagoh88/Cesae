package POO.FichaPratica11.Ex03_Pizza.Ingredientes;

import POO.FichaPratica11.Ex03_Pizza.Enums.Medidas;
import POO.FichaPratica11.Ex03_Pizza.Enums.OrigemIngrediente;
import POO.FichaPratica11.Ex03_Pizza.Enums.TipoVegetal;

public class Vegetal extends Topping {

    private TipoVegetal tipo;

    public Vegetal(int id, String nome, Medidas unidadeMedida, double calorias, OrigemIngrediente origem, TipoVegetal tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.print("[ Vegetal ");
        super.exibirDetalhes();

    }


}
