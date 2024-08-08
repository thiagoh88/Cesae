package RPG.Entidades;

import RPG.Itens.ArmaPrincipal;
import RPG.Itens.Consumivel;
import RPG.Itens.ConsumivelCombate;
import RPG.Itens.ItemHero;

import java.util.ArrayList;
import java.util.Scanner;

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
    public void imprimirLoja() {
        for (int i = 1; i < this.loja.size(); i++) {
            ItemHero itemAtual = this.loja.get(i);
            System.out.print(i + " - ");
            itemAtual.mostrarDetalhes();
        }
    }

    /**
     * Método para apresentar a loja e "vender" itens adicionados
     *
     * @param hero
     */
    public void vender(Hero hero, int itemIndex) {


        // Index deve ser um numero valido do array
        if (itemIndex > 0 && itemIndex < this.loja.size()) {

            ItemHero item = this.loja.get(itemIndex);
            if (hero.gold >= item.preco) {

                // SE o item for uma instancia da ArmaPrincipal substitui a atual ArmaPrincipal
                if (item instanceof ArmaPrincipal) {
                    hero.armaPrincipal = (ArmaPrincipal) item;
                    System.out.println("Parece uma boa arma!\n");

                    //SE o item for uma instancia de Consumivel add ao inventario
                } else if (item instanceof Consumivel) {
                    hero.inventario.add((Consumivel) item);
                    System.out.println("É um bom consumivel!\n");
                }
                // Desconta o ouro do personagem
                hero.gold -= item.preco;

                // Remove da loja o item
                loja.remove(itemIndex);
            } else {
                System.out.println("Pobre!");
            }
        } else if (itemIndex < 0 || itemIndex > this.loja.size()) {
            System.out.println("Index Inválido\n");
        }
    }
}
