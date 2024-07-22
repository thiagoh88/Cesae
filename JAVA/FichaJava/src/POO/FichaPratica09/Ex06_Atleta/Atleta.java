package POO.FichaPratica09.Ex06_Atleta;

public class Atleta {
    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String origem;

    public Atleta(String nome, String modalidade, double altura, double peso, String origem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.origem = origem;
    }
    public void exibirAtletas()
    {
        System.out.println(this.nome);
    }

  }