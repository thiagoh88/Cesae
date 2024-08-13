package RPG.Entidades;

import RPG.Itens.ArmaPrincipal;
import RPG.Itens.Consumivel;
import RPG.Itens.ItemHero;

import java.util.*;

public class Vendedor {
    private ArrayList<ItemHero> loja;

    public Vendedor() {
        this.loja = new ArrayList<>();
    }

    /**
     * Método para adicionar os itens no array loja
     *
     * @param itemNovo
     */
    public void adicionarItem(ItemHero itemNovo) {
        this.loja.add(itemNovo);
        return;
    }

    /**
     * Metodo para imprimir a loja do vendedor excluindo o array na posição zero
     */


    public void imprimirLoja(Hero hero) {
        Collections.shuffle(this.loja);
        for (int i = 1; i < 11; i++) {
            ItemHero itemAtual = this.loja.get(i);
            if (itemAtual.getHeroisPermitidos().contains(hero.getClass().getSimpleName())) {
                System.out.print((i) + " - ");
                itemAtual.mostrarDetalhes();
            }
        }
        System.out.println();
    }

    /**
     * Método para apresentar a loja e "vender" itens adicionados
     *
     * @param hero
     */
    public void vender(Hero hero, int itemIndex) {
        hero.inventario.add(null);

        // Index deve ser um numero valido do array
        if (itemIndex >= 1 && itemIndex <= this.loja.size()) {

            ItemHero item = this.loja.get(itemIndex - 1);
            if (hero.gold >= item.preco) {

                // SE o item for uma instancia da ArmaPrincipal substitui a atual ArmaPrincipal
                if (item instanceof ArmaPrincipal) {
                    hero.armaPrincipal = (ArmaPrincipal) item;
                    System.out.println("\nArma nova!\n");

                    //SE o item for uma instancia de Consumivel add ao inventario
                } else if (item instanceof Consumivel) {
                    hero.inventario.add((Consumivel) item);
                    System.out.println("\nPode ser útil\n");
                }
                // Desconta o ouro do personagem
                hero.gold -= item.preco;

                // Remove da loja o item
                loja.remove(itemIndex);
            } else {
                System.out.println("Gold insuficiente...");
            }
        } else if (itemIndex < 0 || itemIndex > this.loja.size()) {
            System.out.println("Index Inválido\n");
        }
    }
}
