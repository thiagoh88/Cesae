package POO.FichaPratica08.Ex11;

public class Main {
    public static void main(String[] args) {

        Conta Jao=new Conta(1234,0,"Jão");
        Conta Quim=new Conta(123,1000,"Quim");

        Conta Zequinha = new Conta(12345,0,"Zequinha");

        System.out.println("valor do deposito: "+Zequinha.depositar(1000));
        Zequinha.mostrarSaldo();
        System.out.println("valor levantado: "+Zequinha.levantar(120));
        Zequinha.mostrarSaldo();

        System.out.println("Titular Jão"+ Jao.transferencia(500));

    }
}
