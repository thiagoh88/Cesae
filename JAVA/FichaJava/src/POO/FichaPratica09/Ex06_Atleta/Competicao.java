package POO.FichaPratica09.Ex06_Atleta;

public class Competicao {
    private String nomeCompeticao;
    private String pais;
    private Atleta[] listaAtletas;

    /**
     * Método construtor para uma competição
     * @param nomeCompeticao
     * @param pais
     * @param capacidade
     */
    public Competicao(String nomeCompeticao, String pais, int capacidade) {
        this.nomeCompeticao = nomeCompeticao;
        this.pais = pais;
        this.listaAtletas = new Atleta[capacidade];
    }

    public void addAtletas(Atleta atletaNovo) {
        for (int i = 0; i < this.listaAtletas.length; i++) {
            if (this.listaAtletas[i] == null) {
                this.listaAtletas[i] = atletaNovo;
                return;
            }
        }
    }

    public void imprimirAtletas() {
        System.out.println("Nome: " + this.nomeCompeticao + "\nPais: " + this.pais);
        System.out.println("Atletas: ");
        for (int i = 0; i < listaAtletas.length && this.listaAtletas[i] != null; i++) {
            this.listaAtletas[i].exibirAtletas();
        }
    }
}
