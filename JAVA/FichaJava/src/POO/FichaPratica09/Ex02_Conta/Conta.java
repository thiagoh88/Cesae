package POO.FichaPratica09.Ex02_Conta;

public class Conta {
    private double numConta;
    private double saldo = 0;
    private String titular;
    private int anoAbertura = 2024;
    private double margemEmprestimo = 0;
    private double valorDivida = 0;

    public Conta(double numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;

    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
        this.margemEmprestimo = 0.9 * this.saldo;
    }

    public void transferencia(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            System.out.println("Transferencia Efetuada: " + valor);
            this.setSaldo(this.saldo-valor);
            contaDestino.setSaldo(contaDestino.saldo+valor);
        } else {
            System.out.println("Transferência Recusada. Saldo Insuficiente.");
        }
    }

    public void depositar(double valorDepositar) {
        System.out.println("Desposito efetuado: " + valorDepositar);
        this.saldo += valorDepositar;
    }

    public void levantar(double valorLevantar) {
        if (this.saldo >= valorLevantar) {
            System.out.println("Levantamento efetuado: " + valorLevantar);
            this.setSaldo(this.saldo - valorLevantar);
        } else {
            System.out.println("Levantamento Recusado. Saldo Insuficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Numero Conta: " + this.numConta + "\t| Titular: " + this.titular + "\t| Saldo: " + this.saldo + " €");
    }

    public void pedirEmprestimo(double valor){
        if(this.valorDivida==0){
            // Não tem dívida

            if(this.margemEmprestimo>=valor){
                // Valor válido
                this.setSaldo(this.saldo+valor);
                this.valorDivida=valor;
            }else{
                // Pediu mais do que o que pode
                System.out.println("Margem de Empréstimo insuficiente");
            }

        }else{
            // Tem dívida
            System.out.println("Dívidas pendentes. Não é possível emprestar mais.");
        }
    }


}
