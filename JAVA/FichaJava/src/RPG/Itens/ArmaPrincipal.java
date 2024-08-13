package RPG.Itens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArmaPrincipal extends ItemHero {
    private int ataque;
    private int ataqueEspecial;

    public ArmaPrincipal(String nome, int preco, int ataque, int ataqueEspecial,ArrayList<String> heroisPermitidos) {
        super(nome, preco, heroisPermitidos);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }
    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getAtaque() {
        return ataque;
    }

    /**
     * Override do metodo para apresentar os detalhes
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println(" | Ataque: " + this.ataque + " | Ataque Especial: " + this.ataqueEspecial + " | Classe: " + this.heroisPermitidos);
    }
}
