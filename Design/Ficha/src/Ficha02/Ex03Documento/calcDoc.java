package Ficha02.Ex03Documento;

public class calcDoc extends Document {
    public calcDoc(String autor, String nome) {
        super(autor, nome, ".xlsx");
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento de cálculo: " + getNome() + getExtensao());
    }

    @Override
    public void save() {
        System.out.println("Alterações do " + getNome() + " gravadas");
    }

    @Override
    public void close() {
        System.out.println("A fechar o documento de cálculo...");
    }
}
