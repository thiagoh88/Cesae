package POO.FichaPratica09.Ex06_Atleta;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Zequinha", "Salto", 1.80, 75, "zambia");
        Atleta atleta2 = new Atleta("Quim", "corrida", 1.90, 60, "texas");
        Atleta atleta3 = new Atleta("Jao", "jogador", 1.7, 65, "alemanha");
        Atleta atleta4 = new Atleta("Mario", "rugby", 1.8, 120, "irlanda");
        Atleta atleta5 = new Atleta("Vitor", "dev", 1.7, 70, "portugal");
        Atleta atleta6 = new Atleta("Joca", "bocha", 1.60, 80, "norte");

        Competicao comp1=new Competicao("Euro","Espanha",6);
        Competicao comp2=new Competicao("LE Champ","Franca",6);

        comp1.addAtletas(atleta1);
        comp1.addAtletas(atleta2);
        comp1.addAtletas(atleta3);
        comp1.addAtletas(atleta4);
        comp1.addAtletas(atleta5);
        comp1.addAtletas(atleta6);

        comp1.imprimirAtletas();

    }
}
