package POO.FichaPratica08.Ex07_Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro Top", "Thiago", "Programação", 500, "123456789");
        Livro livro2 = new Livro("livro", "bom","muito boa",100, "123456");

        livro1.exibirDetalhe();
        System.out.println();
        livro2.exibirDetalhe();

    }
}
