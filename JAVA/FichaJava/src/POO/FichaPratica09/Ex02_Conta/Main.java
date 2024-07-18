package POO.FichaPratica09.Ex02_Conta;

public class Main {
    public static void main(String[] args) {

        Conta Jao = new Conta(1.1, 0, "Jão",2023);
        Conta Quim = new Conta(002, 0, "Quim",2023);

        Conta Zequinha = new Conta(12345, 0, "Zequinha",2023);
        System.out.println("------------------------------------");
        System.out.println("Jão valor do deposito: " + Jao.depositar(1000) + "€");
        Jao.mostrarSaldo();

        System.out.println("------------------------------------");

        System.out.println("Jão valor levantado: " + Jao.levantar(500) + "€");
        Jao.mostrarSaldo();


        System.out.println("-------------------------------------");
        Jao.transferencia(Quim, 500);
        System.out.println("\n------------------------------------");
        Jao.mostrarSaldo();
        System.out.println();
        Quim.mostrarSaldo();
    }
}
