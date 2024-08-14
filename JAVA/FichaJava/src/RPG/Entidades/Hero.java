package RPG.Entidades;

import RPG.Itens.*;

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
        System.out.println("Arma Principal: " + this.armaPrincipal.getNome());
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

        System.out.println("\nMelhor recuperar o HP antes de continuar...\n\nGostaria de usar uma Potion?          VIDA ATUAL: " + this.getHpAtual() + "/" + this.getMaxHp() + "HP\n1.Sim\n2.Não");
        System.out.print("\nOpção: ");
        int hp = input.nextInt();
        while (hp != 1 && hp != 2) {
            System.out.println("\nMelhor recuperar o HP antes de continuar...\n\nGostaria de usar uma Potion?          VIDA ATUAL: " + this.getHpAtual() + "/" + this.getMaxHp() + "HP\n1.Sim\n2.Não");
            System.out.print("\nOpção: ");
            hp = input.nextInt();

        }
        switch (hp) {
            case 1:
                boolean potionInventario = false;
                System.out.println();
                for (int i = 0; i < this.inventario.size(); i++) {
                    Consumivel consumivelAtual = this.inventario.get(i);

                    if (consumivelAtual instanceof Potion) {
                        potionInventario = true;
                        System.out.print(i + " - " + consumivelAtual.getNome() + " | Cura: " + ((Potion) consumivelAtual).getHpHeal() + " | Power Up: " + ((Potion) consumivelAtual).getPowerUp());
                    }
                }
                if (!potionInventario) {
                    System.out.println("Nenhuma Potion no Inventário");
                    break;
                }
                boolean escolhaCerta = false;
                while (!escolhaCerta) {

                    System.out.print("\n\nEscolha uma Potion: ");
                    int escolha = input.nextInt();

                    if (escolha >= 0 && escolha < this.inventario.size()) {
                        System.out.println("\nVIDA ATUAL: " + this.getHpAtual() + "/" + this.getMaxHp() + "HP");
                        Potion potion = (Potion) this.inventario.get(escolha);
                        this.setHpAtual(getHpAtual() + potion.getHpHeal());
                        this.setForca(getForca() + potion.getPowerUp());

                        if (this.getHpAtual() > this.getMaxHp()) {
                            System.out.println("\nVai haver desperdicio, quer continuar?\n1.Sim\n2.Não\n");
                            System.out.print("Opção: ");
                            int op = input.nextInt();
                            while (op != 1 && op != 2) {
                                System.out.println("\nVai haver desperdicio, quer continuar?\n1.Sim\n2.Não\n");
                                System.out.print("Opção: ");
                                op = input.nextInt();
                            }
                            switch (op) {
                                case 1:
                                    this.setHpAtual(this.getMaxHp());
                                    System.out.println("\nUsou " + potion.getNome() + "\n\n" + this.getNome() + "\n❤\uFE0F " + getHpAtual() + "/" + getMaxHp() + "HP\n\uD83D\uDCAA\uD83C\uDFFB Força: " + this.getForca());
                                    this.inventario.remove(escolha);
                                    escolhaCerta = true;
                                    break;
                                case 2:
                                    System.out.println("\nNada de usar Potion...");
                                    this.setHpAtual(getHpAtual() - potion.getHpHeal());
                                    escolhaCerta = true;
                                    break;
                                default:
                                    System.out.println("\nOpção invalida.");
                                    break;
                            }
                        } else {
                            System.out.println("\nUsou " + potion.getNome() + "\n\n" + this.getNome() + "\n❤\uFE0F " + getHpAtual() + "/" + getMaxHp() + "HP\n\uD83D\uDCAA\uD83C\uDFFB Força: " + this.getForca());
                            this.inventario.remove(escolha);
                            break;
                        }
                    } else {
                        System.out.println("\nOpção Invalida");
                    }
                }
            case 2:
                break;
            default:
                System.out.println("Opção Invalida1");
                break;
        }
    }
}











