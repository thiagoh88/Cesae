package RPG.Entidades;

import RPG.Itens.ArmaPrincipal;
import RPG.Itens.Consumivel;
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
        Scanner input = new Scanner(System.in);

        System.out.println("\nO vendedor Salim apareceu com algumas tralhas\n");
        System.out.println("0.Comprar");
        System.out.println("1.Sair");
        int op = input.nextInt();
        while (op != 0 && op != 1) {
            System.out.println("0.Comprar");
            System.out.println("1.Sair");
            op = input.nextInt();
        }
        switch (op) {
            case 0:
                for (int i = 1; i < this.loja.size(); i++) {
                    ItemHero itemAtual = this.loja.get(i);
                    System.out.print(i + " - ");
                    itemAtual.mostrarDetalhes();
                }
                System.out.println("\nDigite 0 para sair");
                System.out.print("Escolha: ");
                op = input.nextInt();
                while (op != 0) {
                    for (int i = 1; i < this.loja.size(); i++) {
                        ItemHero itemAtual = this.loja.get(i);
                        System.out.print(i + " - ");
                        itemAtual.mostrarDetalhes();
                        System.out.println("\nDigite 0 para sair");
                        System.out.print("Escolha: ");
                        op = input.nextInt();
                    }

                }
                break;
            case 1:
                break;
        }
        System.out.println("\nSalim foi a vidinha, qualquer dia ele volta...\n");
    }

    /**
     * Método para apresentar a loja e "vender" itens adicionados
     *
     * @param hero
     * @param IndexItem
     */
    public void vender(Hero hero, int IndexItem) {

        // Index deve ser um numero valiro do array
        if (IndexItem >= 0 && IndexItem < loja.size()) {

            ItemHero item = loja.get(IndexItem);
            if (hero.gold >= item.preco) {

                // SE o item for uma instancia da ArmaPrincipal substitui a atual ArmaPrincipal
                if (item instanceof ArmaPrincipal) {
                    hero.armaPrincipal = (ArmaPrincipal) item;
                    System.out.println("Parece uma boa arma!");

                    //SE o item for uma instancia de Consumivel add ao inventario
                } else if (item instanceof Consumivel) {
                    hero.inventario.add((Consumivel) item);
                    System.out.println("É um bom consumivel!");
                }
                // Desconta o ouro do personagem
                hero.gold -= item.preco;

                // Remove da loja o item
                loja.remove(IndexItem);
            } else {
                System.out.println("Pobre!");
            }
        } else {
            System.out.println("Índice inválido.");
        }
    }


}
