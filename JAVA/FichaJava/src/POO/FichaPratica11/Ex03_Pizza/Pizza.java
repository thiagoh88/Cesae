package POO.FichaPratica11.Ex03_Pizza;

import POO.FichaPratica11.Ex03_Pizza.Enums.TamanhoPizza;
import POO.FichaPratica11.Ex03_Pizza.Ingredientes.Base;
import POO.FichaPratica11.Ex03_Pizza.Ingredientes.Topping;

import java.util.ArrayList;

public class Pizza {
    private final int MAX_INGREDIENTES = 5;
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> listaIngredientes;

    public Pizza(int id, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.listaIngredientes = new ArrayList<IngredientePizza>();
    }

    /**
     * Metodo par adicionar os ingredientes na pizza NO LIMETE DE 5
     *
     * @param ingredientePizzaNovo
     */
    public void addIngredientePizza(IngredientePizza ingredientePizzaNovo) {

        if (this.listaIngredientes.isEmpty()) {
            if (ingredientePizzaNovo.getIngrediente() instanceof Base) {
                this.listaIngredientes.add(ingredientePizzaNovo);
                return;
            }
        } else {
            if (this.listaIngredientes.size() < this.MAX_INGREDIENTES && ingredientePizzaNovo.getIngrediente() instanceof Topping) {
                this.listaIngredientes.add(ingredientePizzaNovo);
                return;
            }
        }
    }

    /**
     * Metodo para remover um ingrediente pelo ID
     *
     * @param idRemover
     */
    public void removeIngredientesPizza(int idRemover) {
        for (IngredientePizza ingredienteAtual : this.listaIngredientes) {
//se o ingrediente atual getIngrediente(classe-IngredientePizza).getId(classe-Ingrediente) igual ao id//
            if (ingredienteAtual.getIngrediente().getId() == idRemover) {
                this.listaIngredientes.remove(ingredienteAtual);
                System.out.println("Ingrediente removido: ");
                ingredienteAtual.exibirDetalhes();
                return;
            }
        }
    }

    /**
     * Metodo para calcular as calorias da pizza
     *
     * @return
     */
    public double caloriasTotais() {
        double caloriasTotais = 0;
        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {
            caloriasTotais += ingredientePizzaAtual.getQuantidade() * ingredientePizzaAtual.getIngrediente().getCalorias();
        }
        return caloriasTotais;
    }

    /**
     * Metodo para alterar a quantidade de ingrediente da pizza
     *
     * @param idRemover
     * @param novaQuantidade
     */
    public void alterarQuantidadeIngredientePizza(int idRemover, double novaQuantidade) {
        for (IngredientePizza ingredienteAtual : this.listaIngredientes) {
            if (ingredienteAtual.getIngrediente().getId() == idRemover) {
                ingredienteAtual.setQuantidade(novaQuantidade);
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
        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {
            System.out.print("Ingrediente " + cont++ + ":");
            ingredientePizzaAtual.exibirDetalhes();
            System.out.println();
        }
    }
}



