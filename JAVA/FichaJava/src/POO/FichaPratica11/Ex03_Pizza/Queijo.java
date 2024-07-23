package POO.FichaPratica11.Ex03_Pizza;

public class Queijo extends Topping{

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
