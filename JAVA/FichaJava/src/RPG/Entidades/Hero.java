package RPG.Entidades;

import RPG.Itens.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public abstract class Hero extends Entidade {

    public int level;
    public int gold;
    public ArmaPrincipal armaPrincipal;
    public ArrayList<Consumivel> inventario;
    public int forcaInicial;
    public int vidaInicial;

    public Hero(String nome, int maxHp, int hpAtual, int forca, int level, int gold, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hpAtual, forca);
        this.level = level;
        this.gold = gold;
        this.armaPrincipal = armaPrincipal;
        this.inventario = new ArrayList<>();

    }

    public int getLevel() {
        return level;
    }

    public ArmaPrincipal getArmaPrincipal() {
        return armaPrincipal;
    }

    public int getGold() {
        return gold;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setForcaInicial(int forcaInicial) {
        this.forcaInicial = forcaInicial;
    }

    public void setVidaInicial(int vidaInicial) {
        this.vidaInicial = vidaInicial;
    }

    public int getForcaInicial() {
        return forcaInicial;
    }

    public int getVidaInicial() {
        return vidaInicial;
    }

    public void setArmaPrincipal(ArmaPrincipal armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public void setGold(int gold) {
        this.gold = gold;
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
        System.out.println();
        for (Consumivel consumivelAtual : this.inventario) {
            consumivelAtual.mostrarDetalhes();
            System.out.println();

        }
    }

    /**
     * Metodo para combate
     *
     * @param npc
     */
    public abstract void atacar(NPC npc);

    /**
     * Adicionar itens encontrado no jogo no inventario
     *
     * @param itemNovo
     */
    public void chest(Consumivel itemNovo) {
        this.inventario.add(itemNovo);
    }

    /**
     * Metodo em Do-While para random ouro ou morrer / 40% Gold / 20% Morrer
     */
    public void totem() {
        Scanner input = new Scanner(System.in);
        boolean sair = false;
        int op = 0;
        do {
            System.out.println("Apertar o botão?\n1.Sim\n2.Não");
            System.out.print("Opção: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    Random random = new Random();
                    int sorte = random.nextInt(1, 10);
                    if (sorte == 2 || sorte == 4 || sorte == 6 || sorte == 8) {
                        this.gold += 5;
                        System.out.println("Ganhou 5 Gold!");
                        System.out.println(this.getGold() + "Gold");
                    } else if (sorte == 3 || sorte == 5) {
                        System.out.println("Morreu!");
                        this.setHpAtual(0);
                        sair = true;
                        break;
                    } else {
                        System.out.println("Não aconteceu nada...");
                    }
                    break;
                case 2:
                    System.out.println("Melhor eu ir andando...");
                    sair = true;
                    break;
            }
        } while (!sair);
    }

    /**
     * Usar poção / questionar sobreuso / limite maxHP
     */
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
                        System.out.println(i + " - " + consumivelAtual.getNome() + " | Cura: " + ((Potion) consumivelAtual).getHpHeal() + " | Power Up: " + ((Potion) consumivelAtual).getPowerUp());
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












