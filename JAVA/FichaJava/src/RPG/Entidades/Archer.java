package RPG.Entidades;

import RPG.Itens.ArmaPrincipal;

import java.util.Scanner;

public class Archer extends Hero {
    public Archer(String nome, int maxHp, int hpAtual, int forca, int level, int gold, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hpAtual, forca, level, gold, armaPrincipal);
    }

    @Override
    public void atacar(NPC npc) {
        Scanner input = new Scanner(System.in);
        boolean ataqueEspecial = false;
        int dmg = 0;


        System.out.println("⚔\uFE0F Enfrentando o " + npc.getNome() + " ⚔\uFE0F \n");
        System.out.println(npc.getNome() + "\n" + npc.getHpAtual() + "/" + npc.getMaxHp() + "hp\n" + "Força: " + npc.getForca());

        // For para repetir o turno do heroi 2x

        for (int turno = 1; turno < 2; turno++) {
            System.out.println(npc.getHpAtual());
            System.out.println("\n1.Atacar \uD83D\uDDE1\uFE0F");
            System.out.println("2.Ataque especial \uD83D\uDCA5");
            System.out.println("3.Inventario \uD83C\uDF92 \n");
            int escolhaMenu = input.nextInt();

            switch (escolhaMenu) {
                case 1: // Ataque normal
                    System.out.print("Ataque \uD83D\uDDE1\uFE0F\n");
                    dmg = this.getForca() + this.armaPrincipal.getAtaque();
                    npc.setHpAtual(npc.getHpAtual() - dmg);
                    System.out.print(this.getNome() + " ataca " + npc.getNome());
                    System.out.println(" -" + dmg + "hp\n");
                    System.out.println(npc.getNome() + "\n" + npc.getHpAtual() + "/" + npc.getMaxHp() + "HP\n");
                    break;
                case 2: // Ataque especial
                    if (!ataqueEspecial) {
                        System.out.print("Ataque Especial \uD83D\uDCA5\n");
                        dmg = this.getForca() + this.armaPrincipal.getAtaqueEspecial();
                        npc.setHpAtual(npc.getHpAtual() - dmg);
                        System.out.print(this.getNome() + " ataca " + npc.getNome());
                        System.out.println(" -" + dmg + "hp\n");
                        System.out.println(npc.getNome() + "\n" + npc.getHpAtual() + "/" + npc.getMaxHp() + "HP\n");
                        ataqueEspecial = true;
                    } else {
                        System.out.println("Estas a brincar? Já usou isso uma vez!\n");
                        System.out.println("Ataque \uD83D\uDDE1\uFE0F\n");
                        dmg = this.getForca() + this.armaPrincipal.getAtaque();
                        npc.setHpAtual(npc.getHpAtual() - dmg);
                        System.out.print(this.getNome() + " ataca " + npc.getNome());
                        System.out.println(" -" + dmg + "hp\n");
                        System.out.println(npc.getNome() + "\n" + npc.getHpAtual() + "/" + npc.getMaxHp() + "HP\n");
                    }
                    break;
                case 3: //Ataque Consumivel
                    break;
                default:
                    System.out.println("\nva lá, escolhe alguma coisa direito...\n");
                    break;
            }
            if (npc.getHpAtual() <= 0) {
                this.level++;
                this.setMaxHp(this.getMaxHp() + 10);
                this.setForca(this.getForca() + 5);
                this.gold += npc.getGold();
                System.out.println(this.getNome() + " Derrotou o " + npc.getNome() + "\n");
                System.out.println("     ⚜\uFE0F LEVEL UP! ⚜\uFE0F");
                System.out.println("        Level: " + this.level);
                System.out.println("❤\uFE0F HP +10 | " + this.getHpAtual() + "/" + this.getMaxHp() + " HP");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força +5 | " + this.getForca() + " Força");
                System.out.println("\uD83D\uDCB0 + " + npc.getGold() + " Gold | " + this.gold + " Gold");
                break;
            }
            break;
        }

        // Turno NPC
        if (npc.getHpAtual() > 0) {
            this.setHpAtual(this.getHpAtual() - npc.getForca());
            System.out.print(npc.getNome() + " ataca " + this.getNome());
            System.out.println(" -" + npc.getForca() + "hp\n");
            System.out.println(this.getNome() + "\n" + this.getHpAtual() + "/" + this.getMaxHp() + "HP\n");

            if (this.getHpAtual() <= 0) {
                System.out.println(npc.getNome() + " acabou com " + this.getNome() + "\n");
                System.out.println("GAME OVER MY FRIEND");
            }
        }
        // Turno Heroi
        if (this.getHpAtual() > 0 && npc.getHpAtual() > 0) {

            System.out.println("\n1.Atacar \uD83D\uDDE1\uFE0F");
            System.out.println("2.Ataque especial \uD83D\uDCA5");
            System.out.println("3.Inventario \uD83C\uDF92 \n");
            int escolhaMenu = input.nextInt();

            switch (escolhaMenu) {
                case 1: // Ataque normal
                    System.out.print("Ataque \uD83D\uDDE1\uFE0F\n");
                    dmg = this.getForca() + this.armaPrincipal.getAtaque();
                    npc.setHpAtual(npc.getHpAtual() - dmg);
                    System.out.print(this.getNome() + " ataca " + npc.getNome());
                    System.out.println(" -" + dmg + "hp\n");
                    System.out.println(npc.getNome() + "\n" + npc.getHpAtual() + "/" + npc.getMaxHp() + "HP\n");
                    break;
                case 2: // Ataque especial
                    if (!ataqueEspecial) {
                        System.out.print("Ataque Especial \uD83D\uDCA5\n");
                        dmg = this.getForca() + this.armaPrincipal.getAtaqueEspecial();
                        npc.setHpAtual(npc.getHpAtual() - dmg);
                        System.out.print(this.getNome() + " ataca " + npc.getNome());
                        System.out.println(" -" + dmg + "hp\n");
                        System.out.println(npc.getNome() + "\n" + npc.getHpAtual() + "/" + npc.getMaxHp() + "HP\n");
                        ataqueEspecial = true;
                    } else {
                        System.out.println("Estas a brincar? Já usou isso uma vez!\n");
                        System.out.println("Ataque \uD83D\uDDE1\uFE0F\n");
                        dmg = this.getForca() + this.armaPrincipal.getAtaque();
                        npc.setHpAtual(npc.getHpAtual() - dmg);
                        System.out.print(this.getNome() + " ataca " + npc.getNome());
                        System.out.println(" -" + dmg + "hp\n");
                        System.out.println(npc.getNome() + "\n" + npc.getHpAtual() + "/" + npc.getMaxHp() + "HP\n");
                    }
                    break;
                case 3: //Ataque Consumivel
                    break;
                default:
                    System.out.println("\nva lá, escolhe alguma coisa direito...\n");
                    break;
            }
            if (npc.getHpAtual() <= 0) {
                this.level++;
                this.setMaxHp(this.getMaxHp() + 10);
                this.setForca(this.getForca() + 5);
                this.gold += npc.getGold();
                System.out.println(this.getNome() + " Derrotou o " + npc.getNome() + "\n");
                System.out.println("     ⚜\uFE0F LEVEL UP! ⚜\uFE0F");
                System.out.println("        Level: " + this.level);
                System.out.println("❤\uFE0F HP +10 | " + this.getHpAtual() + "/" + this.getMaxHp() + " HP");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força +5 | " + this.getForca() + " Força");
                System.out.println("\uD83D\uDCB0 + " + npc.getGold() + " Gold | " + this.gold + " Gold");

            }
        }
    }
}



