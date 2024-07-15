package POO.Ex02;

public class Main {
    public static void main(String[] args) {
        Cao rex=new Cao("Rex", Racas.CARAMELO);
        Cao max=new Cao("max", Racas.GOLDEN);
        max.ladrar();
        rex.ladrar();

        System.out.println("---------------------------");

        rex.setLatido("rrrrrrr");

        rex.ladrar();
        max.ladrar();
    }
}
