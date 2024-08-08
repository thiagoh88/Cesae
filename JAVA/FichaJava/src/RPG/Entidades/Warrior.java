package RPG.Entidades;

import RPG.Itens.ArmaPrincipal;

import java.util.Scanner;

public class Warrior extends Hero {

    public Warrior(String nome, int maxHp, int hpAtual, int forca, int level, int gold, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hpAtual, forca, level, gold, armaPrincipal);

    }

    @Override
    public void atacar(NPC npc) {
        boolean ataqueEspecial = false;
        System.out.println("Encontrou o " + npc.getNome());
        System.out.println("Parece que ele está muito chateado!");

        while (this.getHpAtual() > 0 && npc.getHpAtual() > 0) {
            Scanner input = new Scanner(System.in);

            System.out.println();
            System.out.println("1.Atacar");
            System.out.println("2.Ataque especial");
            System.out.println("3.Inventario");
            System.out.println();
            int escolhaMenu = input.nextInt();
            int dmg = 0;

            switch (escolhaMenu) {
                case 1: // Ataque normal
                    System.out.print("Ataque");
                    System.out.println();
                    dmg = this.getForca() + this.armaPrincipal.getAtaque();
                    break;
                case 2: // Ataque especial
                    if (!ataqueEspecial) {
                        System.out.print("Ataque Especial");
                        System.out.println();
                        dmg = this.getForca() + this.armaPrincipal.getAtaqueEspecial();
                        ataqueEspecial = true;
                    } else {
                        System.out.println("Estas a brincar? Já usou isso uma vez!");
                        System.out.println();
                        System.out.println("Ataque normal");
                        System.out.println();
                        dmg = this.getForca() + this.armaPrincipal.getAtaque();
                    }
                    break;
                case 3: //Ataque Consumivel
                    break;
                default:
                    System.out.println();
                    System.out.println("va lá, escolhe alguma coisa direito...");
                    System.out.println();
                    break;
            }

            npc.setHpAtual(npc.getHpAtual() - dmg);

            System.out.print(this.getNome() + " ataca " + npc.getNome());
            System.out.println(" -" + dmg + "hp");
            System.out.println();
            System.out.println(npc.getNome() + "\n" + npc.getHpAtual() + "/" + npc.getMaxHp() + "HP");
            System.out.println();

            if (npc.getHpAtual() <= 0) {
                break;
            }

            // NPC

            this.setHpAtual(this.getHpAtual() - npc.getForca());

            System.out.print(npc.getNome() + " ataca " + this.getNome());
            System.out.println(" -" + npc.getForca() + "hp");
            System.out.println();
            System.out.println(this.getNome() + "\n" + this.getHpAtual() + "/" + this.getMaxHp() + "HP");
            System.out.println();
        }

        if (this.getHpAtual() > 0) {
            this.level++;
            this.setMaxHp(this.getHpAtual() + 50);
            this.setForca(this.getForca() + 5);
            this.gold += npc.getGold();
            System.out.println(this.getNome() + " Derrotou o " + npc.getNome());
            System.out.println();
            System.out.println("LEVEL UP!");
            System.out.println("Level: " + this.level);
            System.out.println("HP +10 | " + this.getHpAtual() + "/" + this.getMaxHp() + " HP");
            System.out.println("Força +5 | " + this.getForca() + " Força");
            System.out.println("+ " + npc.getGold() + " Gold");
            System.out.println(+this.gold + " Gold");
        } else {
            System.out.println(npc.getNome() + " acabou com " + this.getNome());
            System.out.println();
            System.out.println("GAME OVER MY FRIEND");
        }
    }
}

