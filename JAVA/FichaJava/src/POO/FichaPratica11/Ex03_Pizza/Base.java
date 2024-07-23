package POO.FichaPratica11.Ex03_Pizza;

public class Base extends Ingrediente {
    private BasePizza tipoBase;
    private String descricao;

    public Base(int id, String nome, Medidas unidadeMedida, double calorias, BasePizza tipoBase, String descricao) {
        super(id, nome, unidadeMedida, calorias);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }


}
