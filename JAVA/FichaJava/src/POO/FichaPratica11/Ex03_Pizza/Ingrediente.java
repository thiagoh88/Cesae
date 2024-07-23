package POO.FichaPratica11.Ex03_Pizza;

public class Ingrediente {
    private int id;
    private String nome;
    private Medidas unidadeMedida;
    private double calorias;

    public Ingrediente(int id, String nome, Medidas unidadeMedida, double calorias) {
        this.id = id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.calorias = calorias;
    }

    public int getId() {
        return id;
    }

    /**
     * Exporta a unidade de medida para IngredientePizza verificar de acordo
     * @return
     */
    public Medidas getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * Metodo para exibir os detalhes dos ingredientes
     *
     */
    public void exibirDetalhes() {

        System.out.print("| " + this.id + " | " + this.nome + " | " + this.unidadeMedida + " | " + this.calorias + " Kcal ]");
    }


}
