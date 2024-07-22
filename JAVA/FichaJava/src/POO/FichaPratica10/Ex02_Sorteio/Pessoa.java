package POO.FichaPratica10.Ex02_Sorteio;

public class Pessoa {
    private String nome;
    private int idade;
    private String telemovel;
    private String email;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa(String nome, int idade, String telemovel, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telemovel = telemovel;
        this.email = email;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome+ "\t| Idade: "+this.idade+"\t| Telemovel: "+this.telemovel+"\t| Email: "+this.email);
    }



}
