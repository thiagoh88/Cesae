package RPG.Itens;

import java.util.ArrayList;

public class ConsumivelCombate extends Consumivel {

    private int AtaqueInstantaneo;

    public ConsumivelCombate(String nome, int preco, ArrayList<String> heroisPermitidos, int ataqueInstantaneo) {
        super(nome, preco, heroisPermitidos);
        AtaqueInstantaneo = ataqueInstantaneo;
    }

    public int getAtaqueInstantaneo() {
        return AtaqueInstantaneo;
    }

    /**
     * Override do metodo para apresentar os detalhes
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println(" | Ataque Instantaneo: " + this.AtaqueInstantaneo);
    }





}
