package POO.FichaPratica11.Ex03_Pizza;

import POO.FichaPratica11.Ex03_Pizza.Ingredientes.Ingrediente;
import POO.FichaPratica11.Ex03_Pizza.Ingredientes.Topping;

public class IngredientePizza {
    private Ingrediente ingrediente;
    private double quantidade;

    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Metodo para exibir os detalhes de acordo com a unidade do ingrediente
     */
    public void exibirDetalhes() {
        this.ingrediente.exibirDetalhes();

        System.out.print(" : " + this.quantidade);

        switch (this.ingrediente.getUnidadeMedida()) {
            case GRAMAS:
                System.out.print(" g.");
                break;

            case LITROS:
                System.out.print(" L.");
                break;

            case UNIDADES:
                System.out.print(" uni.");
                break;
        }
        if(ingrediente instanceof Topping){
            Topping tp = (Topping) ingrediente;
            System.out.print("| "+tp.getOrigem());
        }

    }


}