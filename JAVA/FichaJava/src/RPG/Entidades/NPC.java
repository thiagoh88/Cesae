package RPG.Entidades;

public class NPC extends Entidade {
    private int gold;

    public NPC(String nome, int maxHp, int hpAtual, int forca, int ouro) {
        super(nome, maxHp, hpAtual, forca);
        this.gold = ouro;
    }

    public int getGold() {
        return gold;
    }

    /**
     * Override do metodo para apresentar os detalhes
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Gold: " +this.gold);
    }
}
