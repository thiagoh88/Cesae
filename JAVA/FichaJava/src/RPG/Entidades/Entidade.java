package RPG.Entidades;

public abstract class Entidade {

    private String nome;
    private int maxHp;
    private int hpAtual;
    private int forca;

    public Entidade(String nome, int vidaMax, int vidaAtual, int forca) {
        this.nome = nome;
        this.maxHp = vidaMax;
        this.hpAtual = vidaAtual;
        this.forca = forca;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setHpAtual(int hpAtual) {
        this.hpAtual = hpAtual;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getHpAtual() {
        return hpAtual;
    }

    public int getForca() {
        return forca;
    }

    /**
     * Método para apresentar os detalhes do personagem
     */
    public void mostrarDetalhes() {
        System.out.println("Nome: " + this.nome + "❤\uFE0F \tHP: " + this.hpAtual + "/" + this.maxHp + "\uD83D\uDCAA\uD83C\uDFFB \tForça: " + this.forca);
    }

}
