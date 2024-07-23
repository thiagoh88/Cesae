package POO.FichaPratica11.Ex03_Pizza;

import java.util.ArrayList;

public class Pizza {
    private final int MAX_INGREDIENTES = 5;
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> ingredientes;

    public Pizza(int id, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<IngredientePizza>();

    }

    /**
     * Metodo par adicionar os ingredientes na pizza NO LIMETE DE 5
     *
     * @param ingredientePizzaNovo
     */
    public void addIngredientePizza(IngredientePizza ingredientePizzaNovo) {
        if (this.ingredientes.size() < MAX_INGREDIENTES) {
            this.ingredientes.add(ingredientePizzaNovo);
        }
    }

    /**
     * Metodo para remover um ingrediente pelo ID
     *
     * @param idRemove
     */
    public void removeIngredientesPizza(int idRemove) {

        for (IngredientePizza ingredienteAtual : this.ingredientes) {

//se o ingrediente atual getIngrediente(classe-IngredientePizza).getId(classe-Ingrediente) igual ao id//
            if (ingredienteAtual.getIngrediente().getId() == idRemove) {

                this.ingredientes.remove(ingredienteAtual);
                System.out.println("Ingrediente removido: ");
                ingredienteAtual.exibirDetalhes();
                return;
            }

        }

    }

    /**
     * Metodo para exibir detalhes da pizza e seus ingredientes
     */
    public void exbibirDetalhes() {

        System.out.println("***** " + this.nome + " *****");
        System.out.println("Código: " + this.id);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + " €");
        System.out.println("Tamanho: " + this.tamanho);

        int cont = 1;
        for (IngredientePizza ingredientePizzaAtual : this.ingredientes) {
            System.out.print("Ingrediente " + cont++ + ":");
            ingredientePizzaAtual.exibirDetalhes();
            System.out.println();
        }

    }


}



