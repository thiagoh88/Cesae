package POO.FichaPratica11.Ex03_Pizza.Ingredientes;

import POO.FichaPratica11.Ex03_Pizza.Enums.BasePizza;
import POO.FichaPratica11.Ex03_Pizza.Enums.Medidas;

public class Base extends Ingrediente {
    private BasePizza tipoBase;
    private String descricao;

    public Base(int id, String nome, double calorias, BasePizza tipoBase, String descricao) {
        super(id, nome, Medidas.GRAMAS, calorias);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }

}
