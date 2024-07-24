package POO.FichaPratica11.Ex03_Pizza.Ingredientes;

import POO.FichaPratica11.Ex03_Pizza.Enums.Medidas;
import POO.FichaPratica11.Ex03_Pizza.Enums.OrigemIngrediente;
import POO.FichaPratica11.Ex03_Pizza.Enums.TipoCarne;

public class Carne extends Topping {

    private TipoCarne tipo;

    public Carne(int id, String nome, Medidas unidadeMedida, double calorias, OrigemIngrediente origem, TipoCarne tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }

        @Override
        public void exibirDetalhes(){
            System.out.print("[ Carne ");
            super.exibirDetalhes();

        }


    }

