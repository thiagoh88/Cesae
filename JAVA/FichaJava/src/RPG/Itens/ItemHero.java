package RPG.Itens;

import java.util.ArrayList;

public abstract class ItemHero {
    public String nome;
    public int preco;
    public ArrayList<ItemHero> heroisPermitidos;

    public ItemHero(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    /**
     * Método para apresentar os detalhes
     */
    public void mostrarDetalhes() {
        System.out.print("Nome: " + this.nome + " | " + this.preco + " Ouros");
        for (ItemHero heroiAtual : this.heroisPermitidos) {
            // if (heroiAtual.getEquipamentos)
        }
        //  System.out.println("Equipavel: "+heroiAtual);
    }


}
