package RPG.Entidades;

import RPG.Itens.ArmaPrincipal;
import RPG.Itens.Consumivel;
import RPG.Itens.ItemHero;

import java.util.*;

public class Vendedor {
    private ArrayList<ItemHero> loja;
    private ArrayList<ItemHero> novaLoja;

    public Vendedor() {
        this.loja = new ArrayList<>();
        this.novaLoja = new ArrayList<>();
    }

    /**
     * Método para adicionar os itens no array loja
     *
     * @param itemNovo
     */
    public void adicionarItem(ItemHero itemNovo) {
        this.loja.add(itemNovo);
    }

    /**
     * Metodo para imprimir a loja do vendedor excluindo o array na posição zero
     */
    public void imprimirLoja(Hero hero) {

        // ADD itens permitidos em um novo array
        for (int i = 0; i < this.loja.size(); i++) {
            ItemHero itemAtual = this.loja.get(i);

            if (itemAtual.getHeroisPermitidos().contains(hero.getClass().getSimpleName()) && !itemAtual.getNome().equals("Stick")) {
                novaLoja.add(itemAtual);
            }

        }
        // Print em shuffle do novo array até 10 itens permitidos
        Collections.shuffle(novaLoja);
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " - ");
            novaLoja.get(i).mostrarDetalhes();
        }
    }

    /**
     * Método para apresentar a loja e "vender" itens adicionados
     *
     * @param hero
     */
    public void vender(Hero hero, int itemIndex) {

        boolean compra = false;

        while (!compra) {

            // Index deve ser um numero valido do array até 10
            if (itemIndex > 0 && itemIndex <= 10) {

                ItemHero item = this.novaLoja.get(itemIndex - 1);
                if (hero.gold >= item.preco) {

                    // SE o item for uma instancia da ArmaPrincipal substitui a atual ArmaPrincipal
                    if (item instanceof ArmaPrincipal) {
                        hero.armaPrincipal = (ArmaPrincipal) item;
                        System.out.println("\nArma Equipada.\n");

                        //SE o item for uma instancia de Consumivel add ao inventario
                    } else if (item instanceof Consumivel) {
                        hero.inventario.add((Consumivel) item);
                        System.out.println("\nConsumível Comprado.\n");
                    }

                    hero.gold -= item.preco;
                    this.novaLoja.remove(itemIndex - 1);
                    compra = true;

                } else {
                    System.out.println("\nGold insuficiente...\n");
                    break;
                }
            } else {
                break;
            }
        }
    }
}
