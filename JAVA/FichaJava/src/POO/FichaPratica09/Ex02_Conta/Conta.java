package POO.FichaPratica09.Ex02_Conta;

public class Conta {
    private double numConta;
    private double saldo;
    private String titular;
    private int anoAbertura;
    private String margemEmprestimo;
    private double valorDivida;

    public Conta(double numConta, double saldo, String titular, int anoAbertura,double valorDivida) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
        this.anoAbertura = anoAbertura;
        this.valorDivida = valorDivida;
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

    public void pedirEmprestimo(double valorPedir) {
        if (valorDivida>0){
            System.out.println("Emprestimo negado");
        } else if (valorPedir<=(saldo*0.9)) {
            this.valorDivida+=valorPedir;
            this.saldo+=valorPedir;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }


}
