package POO.FichaPratica08.Ex11;

public class Main {
    public static void main(String[] args) {

        Conta Jao = new Conta(1234, 0, "Jão");
        Conta Quim = new Conta(123, 0, "Quim");

        Conta Zequinha = new Conta(12345, 0, "Zequinha");

        System.out.println("Zequinha valor do deposito: " + Zequinha.depositar(1000) + "€");
        Zequinha.mostrarSaldo();

        System.out.println();

        System.out.println("Zequinha valor levantado: " + Zequinha.levantar(120) + "€");
        Zequinha.mostrarSaldo();

        System.out.println();

        Jao.transferencia(Quim, 500);
        Jao.mostrarSaldo();
        System.out.println();
        Quim.mostrarSaldo();
    }
}
