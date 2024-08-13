package RPG.Itens;

import RPG.Entidades.Archer;
import RPG.Entidades.Mage;
import RPG.Entidades.Warrior;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemHero {
    public String nome;
    public int preco;
    public ArrayList<String> heroisPermitidos;

    public List<String> getHeroisPermitidos() {
        return heroisPermitidos;
    }

    public ItemHero(String nome, int preco, ArrayList<String> heroisPermitidos) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = heroisPermitidos;
    }

    public String getNome() {
        return nome;
    }

    /**
     * Método para apresentar os detalhes
     */
    public void mostrarDetalhes() {
        System.out.print(this.nome + " | " + this.preco + " Ouros");
    }


}
