package Model;

public class Atracao {
    private int id;
    private String nome;
    private double precoAdulto;
    private double precoCrianca;
    private int duracaoSegundos;

    public Atracao(int id, String nome, double precoAdulto, double precoCrianca, int duracaoSegundos) {
        this.id = id;
        this.nome = nome;
        this.precoAdulto = precoAdulto;
        this.precoCrianca = precoCrianca;
        this.duracaoSegundos = duracaoSegundos;
    }


    @Override
    public String toString() {
        return "Atracao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", precoAdulto=" + precoAdulto +
                ", precoCrianca=" + precoCrianca +
                ", duracaoSegundos=" + duracaoSegundos +
                '}';
    }
}
