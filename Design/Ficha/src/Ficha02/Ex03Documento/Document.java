package Ficha02.Ex03Documento;

public abstract class Document {
    private String autor, nome, extensao;

    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public String getExtensao() {
        return extensao;
    }

    public Document(String autor, String nome, String extensao) {
        this.autor = autor;
        this.nome = nome;
        this.extensao = extensao;


    }

    public abstract void open();

    public abstract void save();

    public abstract void close();
}


