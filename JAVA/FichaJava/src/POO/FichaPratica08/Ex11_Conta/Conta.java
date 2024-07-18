package POO.FichaPratica08.Ex11_Conta;

public class Conta {
    private double numConta;
    private double saldo;
    private String titular;

    public Conta(double numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public double transferencia(Conta titular, double valorTransferir) {
        if (this.saldo>=valorTransferir) {
            this.saldo -= valorTransferir;
            titular.saldo += valorTransferir;
            System.out.printf("Transferencia de: "+valorTransferir+"€");
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
