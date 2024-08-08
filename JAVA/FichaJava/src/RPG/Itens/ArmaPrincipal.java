package RPG.Itens;

public class ArmaPrincipal extends ItemHero {
    private int ataque;
    private int ataqueEspecial;

    public ArmaPrincipal(String nome, int preco, int ataque, int ataqueEspecial) {
        super(nome, preco);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }
    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    /**
     * Override do metodo para apresentar os detalhes
     */
    @Override
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println(" | Ataque: "+this.ataque+" | Ataque Especial: " +ataqueEspecial);
    }





}
