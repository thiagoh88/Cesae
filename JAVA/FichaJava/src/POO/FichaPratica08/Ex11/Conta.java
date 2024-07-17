package POO.FichaPratica08.Ex11;

public class Conta {
    private double numConta;
    private double saldo;
    private String titular;

    public Conta(double numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public double transferencia(double valorTrans, double valorReceber) {
        this.saldo = this.saldo-valorTrans;
this.saldo=
        return saldo;
    }

    public double depositar(double valorDeposito) {
        this.saldo += valorDeposito;
        return saldo;
    }

    public double levantar(double valorRetirar) {
        if (this.saldo < valorRetirar) {
            System.out.println("saldo insuficiente");
        } else {
            this.saldo -= valorRetirar;
        }
        return valorRetirar;
    }

    public double mostrarSaldo() {
        System.out.println("Saldo da conta " + this.numConta + ": " + this.saldo);
        return saldo;
    }
}
