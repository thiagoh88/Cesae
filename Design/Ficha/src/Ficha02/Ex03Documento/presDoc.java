package Ficha02.Ex03Documento;

public class presDoc extends Document {
    public presDoc(String autor, String nome) {
        super(autor, nome, ".pptx");
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento de apresentação: " + getNome() + getExtensao());
    }

    @Override
    public void save() {
        System.out.println("Alterações do " + getNome() + " gravadas");
    }

    @Override
    public void close() {
        System.out.println("A fechar o documento de apresentação...");
    }
}
