package RPG.Entidades;

import RPG.Itens.Consumivel;
import RPG.Itens.ArmaPrincipal;
import RPG.Itens.ItemHero;
import RPG.Itens.Potion;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Hero extends Entidade {

    public int level;
    public int gold;
    public ArmaPrincipal armaPrincipal;
    public ArrayList<Consumivel> inventario;

    public Hero(String nome, int maxHp, int hpAtual, int forca, int level, int gold, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hpAtual, forca);
        this.level = level;
        this.gold = gold;
        this.armaPrincipal = armaPrincipal;
        this.inventario = new ArrayList<>();

    }

    /**
     * Override do metodo para apresentar detalhes
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Level: " + this.level);
        System.out.println("\uD83D\uDCB0 Gold: " + this.gold);
        mostrarInventario();
    }

    /**
     * Metodo para apresentar o inventario
     */
    public void mostrarInventario() {
        System.out.println("Weapon: " + this.armaPrincipal.getNome());
        for (Consumivel consumivelAtual : this.inventario) {
            consumivelAtual.mostrarDetalhes();
            System.out.println();

        }
    }

    public abstract void atacar(NPC npc);

    public void chest(Consumivel itemNovo) {
        this.inventario.add(itemNovo);
    }

    public void potionUse() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < this.inventario.size(); i++) {
            Consumivel consumivelAtual = this.inventario.get(i);
            if (consumivelAtual instanceof Potion) {
                System.out.println(i + " - " + consumivelAtual.getNome() + " | Cura: " + ((Potion) consumivelAtual).getHpHeal() + " | Power Up: " + ((Potion) consumivelAtual).getPowerUp());
            }
        }
        System.out.println("\nEscolha uma Potion\n");
        int escolha = input.nextInt();
        while (escolha < 0 && escolha > inventario.size()) {
            System.out.println("Escolha uma Potion");
            escolha = input.nextInt();
        }

        if (inventario.get(escolha) instanceof Potion) {
            Potion potion = (Potion) inventario.get(escolha);
            this.setHpAtual(getHpAtual() + potion.getHpHeal());
            this.setForca(getForca() + potion.getPowerUp());
            inventario.remove(escolha);
            System.out.println("Usou " + potion.getNome());
            System.out.println(+getHpAtual() + "/" + getMaxHp());
            System.out.println("Força: " + getForca());

            if (this.getHpAtual() > this.getMaxHp()) {
                System.out.println("\nA Potion recupera mais que precisa, quer continuar?");
                System.out.println("1.Sim");
                System.out.println("2.Não\n");
                int op = input.nextInt();
                switch (op) {
                    case 1:
                        this.setHpAtual(this.getMaxHp());
                        inventario.remove(escolha);
                        System.out.println("Usou " + potion.getNome());
                        System.out.println(+getHpAtual() + "/" + getMaxHp());
                        System.out.println("Força: " + getForca());
                        break;
                    case 2:
                        System.out.println("Nada de usar Potion então...");
                        this.setHpAtual(getHpAtual() - potion.getHpHeal());
                        break;

                }
            }
        }
    }
}












