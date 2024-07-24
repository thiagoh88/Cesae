package POO.FichaPratica11.Ex03_Pizza.Ingredientes;

import POO.FichaPratica11.Ex03_Pizza.Enums.Medidas;
import POO.FichaPratica11.Ex03_Pizza.Enums.OrigemIngrediente;
import POO.FichaPratica11.Ex03_Pizza.Enums.TipoFrutoMar;

public class FrutoMar extends Topping {

    private TipoFrutoMar tipo;

    public FrutoMar(int id, String nome, Medidas unidadeMedida, double calorias, OrigemIngrediente origem, TipoFrutoMar tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }

    @Override
    public void exibirDetalhes(){
        System.out.print("[ Fruto do Mar ");
        super.exibirDetalhes();

    }


}
