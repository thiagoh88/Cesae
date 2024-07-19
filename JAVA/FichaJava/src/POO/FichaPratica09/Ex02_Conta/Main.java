package POO.FichaPratica09.Ex02_Conta;

public class Main {
    public static void main(String[] args) {

        Conta Jao = new Conta(1.1, 0, "Jão");
        Conta Quim = new Conta(002, 1000, "Quim");

        Conta Zequinha = new Conta(12345, 0, "Zequinha");
        System.out.println("------------------------------------");
        System.out.println("Jão valor do deposito: " + Jao.depositar(1000) + "€");
        Jao.mostrarSaldo();

        System.out.println("------------------------------------");

        //System.out.println(Jao.levantar(500) + "€");
        Jao.mostrarSaldo();


        System.out.println("-------------------------------------");
        Jao.transferencia(Quim, 500);
        System.out.println("\n------------------------------------");
        Jao.mostrarSaldo();
        System.out.println();
        Quim.mostrarSaldo();
        System.out.println("---------------------------------------");

        Quim.pedirEmprestimo(10);

    }
}
