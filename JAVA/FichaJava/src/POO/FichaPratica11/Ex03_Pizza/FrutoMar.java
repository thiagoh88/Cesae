package POO.FichaPratica11.Ex03_Pizza;

public class FrutoMar extends Topping{

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
