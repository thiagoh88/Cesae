package RPG.Entidades;

import RPG.Itens.ArmaPrincipal;
import RPG.Itens.ConsumivelCombate;
import RPG.Itens.ItemHero;

import java.util.Random;
import java.util.Scanner;

public class Mage extends Hero {

    public Mage(String nome, int maxHp, int hpAtual, int forca, int level, int gold, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hpAtual, forca, level, gold, armaPrincipal);

    }

    /**
     * Override do metodo atacar
     *
     * @param npc
     */
    @Override
    public void atacar(NPC npc) {
        Scanner input = new Scanner(System.in);
        boolean ataqueEspecial = false;
        int dmg = 0;
        try {
            Thread.sleep(2000);
            System.out.println("\uD83E\uDDD9\u200D♂\uFE0F Enfrentando o " + npc.getNome() + " \uD83E\uDDD9\u200D♂\uFE0F \n");
        } catch (InterruptedException e) {
            System.out.println();
        }
        //JOCA
        if (npc.getNome().equals("Joca")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "                 \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + String.format("%03d", npc.getMaxHp()) + "     X      ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //QUIM
        if (npc.getNome().equals("Quim")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "                \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + String.format("%03d", npc.getMaxHp()) + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //ZEQUINHA
        if (npc.getNome().equals("Zequinha")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "            \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + String.format("%03d", npc.getMaxHp()) + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //ARANHA GIGANTE
        if (npc.getNome().equals("Aranha Gigante")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "             \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //ABELHA ASSASSINA
        if (npc.getNome().equals("Abelha Assassina")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "     \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //INSECTOIDE
        if (npc.getNome().equals("Insectoide")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "           \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //GARGULA
        if (npc.getNome().equals("Gargula")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "              \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //GOLEM
        if (npc.getNome().equals("Golem")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "                \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //MINOTAURO
        if (npc.getNome().equals("Minotauro")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "            \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //GOBLIN
        if (npc.getNome().equals("Goblin")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "              \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //ORC
        if (npc.getNome().equals("Orc")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "                 \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //TROLL
        if (npc.getNome().equals("Troll")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "                \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //REI DEMONIO
        if (npc.getNome().equals("Rei Demonio")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "          \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }
        //DARK VITOR
        if (npc.getNome().equals("Dark Vitor")) {
            System.out.println("| \uD83D\uDC80" + npc.getNome() + "           \uD83E\uDDD9\u200D♂\uFE0F " + this.getNome() + " |");
            System.out.println("| ❤\uFE0F" + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "     X     ❤\uFE0F" + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + " |");
            System.out.println("| \uD83D\uDCAA\uD83C\uDFFBForça: " + npc.getForca() + "        \uD83D\uDCAA\uD83C\uDFFB" + this.getForca() + "+" + this.armaPrincipal.getAtaque() + "/" + this.armaPrincipal.getAtaqueEspecial() + " |\n");
        }

        while (this.getHpAtual() > 0 && npc.getHpAtual() > 0) {
            boolean retorno = false;
            while (!retorno) {
                if (this.getHpAtual() > 0 && npc.getHpAtual() > 0) {
                    try {
                        Thread.sleep(2000);
                        System.out.println("\n1.Ataque \uD83D\uDDE1\uFE0F\n2.Meteoro \uD83D\uDCA5\n3.Inventario \uD83C\uDF92 \n");
                        System.out.print("Opção: ");
                    } catch (InterruptedException e) {
                        System.out.println();
                    }
                    int escolhaMenu = input.nextInt();

                    switch (escolhaMenu) {
                        case 1:// Ataque especial de forma random true e false para executar
                            Random random = new Random();
                            boolean fireball = random.nextBoolean();
                            if (fireball) {
                                dmg = (this.getForca() * 2) + this.armaPrincipal.getAtaque();
                                npc.setHpAtual(npc.getHpAtual() - dmg);
                                System.out.print("\nFIRE BALL! \uD83D\uDD25 -" + dmg + "HP\n\n\uD83D\uDC80 " + npc.getNome() + "\n❤\uFE0F " + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "HP\n\uD83D\uDCAA\uD83C\uDFFB Força: " + npc.getForca() + "\n");
                                retorno = true;
                            } else {
                                dmg = (this.getForca() / 2) + this.armaPrincipal.getAtaque();
                                npc.setHpAtual(npc.getHpAtual() - dmg);
                                System.out.print("\nAtaque \uD83D\uDDE1\uFE0F -" + dmg + "HP\n\n\uD83D\uDC80 " + npc.getNome() + "\n❤\uFE0F " + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "HP\n\uD83D\uDCAA\uD83C\uDFFB Força: " + npc.getForca() + "\n");
                                retorno = true;
                            }
                            break;
                        case 2: // Ataque especial
                            if (!ataqueEspecial) {
                                dmg = this.getForca() + this.armaPrincipal.getAtaqueEspecial();
                                npc.setHpAtual(npc.getHpAtual() - dmg);
                                System.out.print("\nMeteoro \uD83D\uDCA5 -" + dmg + "HP\n\n\uD83D\uDC80 " + npc.getNome() + "\n❤\uFE0F " + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "HP\n\uD83D\uDCAA\uD83C\uDFFB Força: " + npc.getForca() + "\n");
                                ataqueEspecial = true;
                                retorno = true;
                            } else {
                                System.out.print("\nSem Mana.\n");
                            }
                            break;
                        case 3: //Ataque Consumivel
                            if (this.inventario.isEmpty()) {
                                System.out.println("\nInventario vazio.");
                                break;
                            }
                            System.out.println("\nSelecionar um Consumivel de Combate.\n");
                            for (int i = 0; i < this.inventario.size(); i++) {
                                ItemHero itemAtual = this.inventario.get(i);
                                System.out.print((i + 1) + " - ");
                                itemAtual.mostrarDetalhes();
                            }
                            System.out.println("\nDigite 0 para voltar.");
                            System.out.print("Item: ");
                            int escolha = input.nextInt() - 1;
                            if (escolha == -1) {
                                System.out.println("\nVoltar ao Menu...");
                                break;
                            }
                            if (escolha >= 0 && escolha < this.inventario.size() && this.inventario.get(escolha) instanceof ConsumivelCombate) {
                                ConsumivelCombate consumivelAtual = (ConsumivelCombate) this.inventario.get(escolha);
                                npc.setHpAtual(npc.getHpAtual() - consumivelAtual.getAtaqueInstantaneo());
                                this.inventario.remove(escolha);
                                System.out.println("\nVocê usou " + consumivelAtual.getNome() + " -" + consumivelAtual.getAtaqueInstantaneo() + "HP\n\n\uD83D\uDC80 " + npc.getNome() + "\n❤\uFE0F " + String.format("%03d", npc.getHpAtual()) + "/" + npc.getMaxHp() + "HP\n\uD83D\uDCAA\uD83C\uDFFB Força: " + npc.getForca() + "\n");
                                retorno = true;
                                break;
                            } else {
                                System.out.println("\nOpção invalida.");
                            }
                            break;
                        default:
                            System.out.println("\nOpção invalida.\n");
                            break;
                    }
                }
            }
            if (npc.getHpAtual() <= 0) {
                this.level++;
                this.setMaxHp(this.getMaxHp() + 10);
                this.setForca(this.getForca() + 5);
                this.gold += npc.getGold();
                System.out.println("\n" + getNome() + " Derrotou o " + npc.getNome() + "\n");
                System.out.println("     ⚜\uFE0F LEVEL UP! ⚜\uFE0F");
                System.out.println("        Level: " + this.level);
                System.out.println("❤\uFE0F HP +10 | " + this.getHpAtual() + "/" + this.getMaxHp() + " HP");
                System.out.println("\uD83D\uDCAA\uD83C\uDFFB Força +5 | " + this.getForca() + " Força");
                System.out.println("\uD83D\uDCB0 + " + npc.getGold() + " Gold | " + this.gold + " Gold");
            }
            // Turno NPC
            if (npc.getHpAtual() > 0) {
                this.setHpAtual(this.getHpAtual() - (npc.getForca() + 10));
                int forca = (npc.getForca() + 10);
                try {
                    Thread.sleep(2000);
                    System.out.print("\n\uD83D\uDC80 " + npc.getNome() + " Ataca -" + forca + "HP\n\n\uD83C\uDFF9 " + this.getNome() + " LV:" + this.level + "\n❤\uFE0F " + String.format("%03d", this.getHpAtual()) + "/" + this.getMaxHp() + "\n\uD83D\uDCAA\uD83C\uDFFB Força: " + this.getForca() + "\n");
                } catch (InterruptedException e) {
                    System.out.println();
                }
                if (this.getHpAtual() <= 0) {
                    System.out.println("\n" + npc.getNome() + " Derrotou " + this.getNome() + "\n\uD83D\uDC80 GAME OVER \uD83D\uDC80");
                }
            }
        }
        if (npc.getHpAtual() <= 0) {
            npc.setHpAtual(npc.getMaxHp());
        }
    }

}

