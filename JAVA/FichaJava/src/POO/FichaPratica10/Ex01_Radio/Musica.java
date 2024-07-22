package POO.FichaPratica10.Ex01_Radio;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracao;


    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + this.titulo + "\t| Genero: " + this.genero + "\t| Artista: " + this.artista + "\t| Duração: " + this.duracao + " seg.");
    }

    public int getDuracao() {
        return duracao;
    }
}
