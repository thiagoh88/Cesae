package POO.FichaPratica11.Ex03_Pizza.Ingredientes;

import POO.FichaPratica11.Ex03_Pizza.Enums.Medidas;
import POO.FichaPratica11.Ex03_Pizza.Enums.OrigemIngrediente;
import POO.FichaPratica11.Ex03_Pizza.Enums.TipoQueijo;

public class Queijo extends Topping {

    private TipoQueijo tipo;

    public Queijo(int id, String nome, Medidas unidadeMedida, double calorias, OrigemIngrediente origem, TipoQueijo tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }

    @Override
    public void exibirDetalhes(){
        System.out.print("[ Queijo ");
        super.exibirDetalhes();

    }



}
