package RPG.Itens;

public class Potion extends Consumivel {

    public int hpHeal;
    public int powerUp;

    public Potion(String nome, int preco, int hpHeal, int powerUp) {
        super(nome, preco);
        this.hpHeal = hpHeal;
        this.powerUp = powerUp;
    }

    public void setHpHeal(int hpHeal) {
        this.hpHeal = hpHeal;
    }

    public void setPowerUp(int powerUp) {
        this.powerUp = powerUp;
    }

    public int getHpHeal() {
        return hpHeal;
    }

    public int getPowerUp() {
        return powerUp;
    }

    /**
     * Override do metodo para apresentar os detalhes
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println(" | Cura: " + this.hpHeal + "hp" + " | Power UP: " + this.powerUp + "pts");
    }




}
