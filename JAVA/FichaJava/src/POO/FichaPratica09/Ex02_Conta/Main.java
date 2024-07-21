package POO.FichaPratica09.Ex02_Conta;

public class Main {
    public static void main(String[] args) {

        Conta Jao = new Conta(1.1, "Jão");
        Conta Quim = new Conta(002, "Quim");

        Conta Zequinha = new Conta(12345, "Zequinha");
        System.out.println("------------------------------------");
        Jao.depositar(1000);
        Jao.mostrarSaldo();

        System.out.println("------------------------------------");

        Jao.levantar(500);
        Jao.mostrarSaldo();


        System.out.println("-------------------------------------");
        Jao.transferencia(500,Quim);
        System.out.println("\n------------------------------------");
        Jao.mostrarSaldo();
        System.out.println();
        Quim.mostrarSaldo();
        System.out.println("\n----------------------------------------");
        System.out.println();

        Jao.pedirEmprestimo(900);
        Jao.mostrarSaldo();
        Jao.pedirEmprestimo(500);
        Jao.mostrarSaldo();
    }
}
