package POO.Ex01;

public class Main {
    public static void main(String[] args) {

        Pessoa vitor = new Pessoa("vitor",24,1.7);
            Pessoa ana = new Pessoa("ana",22,1.6);
        System.out.println("info pessoas");
        System.out.println("nome: "+vitor.getNome());
        System.out.println("idade: "+vitor.getIdade()+" anos");
        System.out.println("altura: "+vitor.getAltura()+ " m" );

        System.out.println("---------------------------------");

        System.out.println("nome: "+ana.getNome());
        System.out.println("idade: "+ana.getIdade()+" anos");
        System.out.println("altura: "+ana.getAltura()+ " m" );
    }
}
