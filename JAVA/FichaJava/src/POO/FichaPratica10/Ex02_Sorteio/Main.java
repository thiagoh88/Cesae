package POO.FichaPratica10.Ex02_Sorteio;

public class Main {
    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("Quim", 19, "123123123", "quim@gmail.com");
        Pessoa pessoa2 = new Pessoa("Zequinha,17", 20, "123123123", "zequinha@email.com");
        Pessoa pessoa3 = new Pessoa("Joca", 21, "123123", "email@a.com");

        Sorteio cabazNatal = new Sorteio(5000);

        cabazNatal.addParticipante(pessoa1);
        cabazNatal.addParticipante(pessoa2);
        cabazNatal.addParticipante(pessoa3);

        cabazNatal.exibirDetalhes();

        cabazNatal.exibirForEach();

        System.out.println("vencedor");
        cabazNatal.sortear().exibirDetalhes();
    }
}