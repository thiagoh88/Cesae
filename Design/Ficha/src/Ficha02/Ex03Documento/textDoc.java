package Ficha02.Ex03Documento;

public class textDoc extends Document {
    public textDoc(String autor, String nome) {
        super(autor, nome, ".docx");
    }

    @Override
    public void open() {
        System.out.println("\nA abrir o documento de texto: " + getNome() + getExtensao());

    }

    @Override
    public void save() {
        System.out.println("\nAlterações do " + getAutor() + " gravadas");
    }

    @Override
    public void close() {
        System.out.println("\nA fechar o documento de texto...");
    }
}

