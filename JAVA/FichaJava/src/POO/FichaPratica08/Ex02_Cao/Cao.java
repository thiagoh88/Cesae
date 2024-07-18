package POO.FichaPratica08.Ex02_Cao;

public class Cao {
    private String nome;
    private Racas raca;
    private String latido = "au au";

    /**
     * Método Construtor para Cao
     * @param nome para o cao
     * @param raca para o cao
     */
    public Cao(String nome, Racas raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void ladrar() {
        System.out.println(this.latido);
    }

}