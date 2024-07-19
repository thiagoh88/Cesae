package POO.FichaPratica09.Ex02_Conta;

public class Conta {
    private double numConta;
    private double saldo;
    private String titular;
    private int anoAbertura = 2024;
    private double margemEmprestimo = this.saldo * 0.9;
    private double valorDivida;

    public Conta(double numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;

    }

    public double transferencia(Conta titular, double valorTransferir) {
        if (this.saldo >= valorTransferir) {
            this.saldo -= valorTransferir;
            titular.saldo += valorTransferir;
            System.out.printf("Transferencia de: " + valorTransferir + "€");
        } else {
            System.out.println("SALDO INSUFICIENTE");
        }
        return valorTransferir;
    }

    public double depositar(double valorDepositar) {
        this.saldo += valorDepositar;
        return saldo;
    }

    public void levantar(double valorLevantar) {
        if (this.saldo >= valorLevantar) {
            this.saldo -= valorLevantar;
        } else {
            System.out.println("SALDO INSUFICIENTE");
        }

    }

    public double mostrarSaldo() {
        System.out.println("Titular da conta: " + this.titular + "\t| conta: " + this.numConta + " | Saldo: " + this.saldo + "€");
        return saldo;
    }

    public boolean pedirEmprestimo(double valorPedido) {
        if (this.valorDivida == 0 && this.margemEmprestimo > valorPedido) {
            this.saldo += valorPedido;
            this.valorDivida += valorPedido;
            return true;
        }
        System.out.println("NEGADO");
        return false;
    }
    public void exibirDetalhe(){
        System.out.println("---------------");
        System.out.println("Titular: "+this.titular+"Saldo: "+this.saldo);
    }
}
