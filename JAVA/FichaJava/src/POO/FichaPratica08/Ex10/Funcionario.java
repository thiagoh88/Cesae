package POO.FichaPratica08.Ex10;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public double aumentarSalario(double maisSalario) {
        this.salario = this.salario + (this.salario * (maisSalario / 100));
        return salario;
    }

    public void exibirDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Autor: "+this.departamento);
        System.out.println("Salario: "+this.salario);
    }

}

