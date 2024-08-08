package RPG.Itens;

public class ConsumivelCombate extends Consumivel {

    private int AtaqueInstantaneo;

    public ConsumivelCombate(String nome, int preco, int ataqueInstantaneo) {
        super(nome, preco);
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
