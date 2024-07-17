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

    public double transferencia(Conta cliente, double valorTransferir) {
        if (valorTransferir > 0 && this.saldo>=valorTransferir) {
            this.saldo -= valorTransferir;
            cliente.saldo += valorTransferir;
        }else {
            System.out.println("SALDO INSUFICIENTE");
        }
        return valorTransferir;
    }

    public double depositar(double valorDepositar) {
        this.saldo += valorDepositar;
        return saldo;
    }

    public double levantar(double valorLevantar) {
        if (this.saldo < valorLevantar) {
            System.out.println("SALDO INSUFICIENTE");
        } else {
            this.saldo -= valorLevantar;
        }
        return valorLevantar;
    }

    public double mostrarSaldo() {
        System.out.println("Titular da conta: " + this.titular + "\t| conta: " + this.numConta + " | Saldo: " + this.saldo + "€");
        return saldo;
    }
}
