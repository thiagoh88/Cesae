package POO.FichaPratica10.Ex03_Pesca;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private String anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marcaBarco;
    private ArrayList<Peixe> peixePescado;
    private ArrayList<Marisco> mariscoPescado;

    /**
     * Metodo construtor para barco
     *
     * @param nome            do barco
     * @param cor             do barco
     * @param anoFabrico      do bardo
     * @param tripulacao      exclui capitao
     * @param capacidadeCarga em kilos
     * @param marcaBarco
     */
    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCarga, Marca marcaBarco) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marcaBarco = marcaBarco;
        this.peixePescado = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    /**
     * Metodo para calcular a carga do barco
     *
     * @return A carga atual do barco
     */
    public double calcularCargaAtual() {
        double cargaAtual = 0;
        for (Peixe peixeAtual : this.peixePescado) {
            cargaAtual += peixeAtual.getPeso();
        }
        for (Marisco mariscoAtual : this.mariscoPescado) {
            cargaAtual += mariscoAtual.getPeso();
        }
        return cargaAtual;
    }

    /**
     * Metodo para verificar se tem capacidade de carga e add
     *
     * @param peixeNovo
     */
    public void pescarPeixe(Peixe peixeNovo) {
        if (this.calcularCargaAtual() + peixeNovo.getPeso() <= this.capacidadeCarga) {
            this.peixePescado.add(peixeNovo);
        }

    }

    /**
     * Metodo para verificar se tem capacidade de carga e add
     *
     * @param mariscoNovo
     */
    public void pescarMarisco(Marisco mariscoNovo) {
        if (this.calcularCargaAtual() + mariscoNovo.getPeso() <= this.capacidadeCarga) {
            this.mariscoPescado.add(mariscoNovo);
        }

    }

    /**
     * Metodo para largar peixe (remover do array)
     *
     * @param indexPeixe
     */
    public void largarPeixe(int indexPeixe) {
        peixePescado.remove(indexPeixe);
    }

    /**
     * Metodo para largar marisco (remover do array)
     *
     * @param indexMarisco
     */
    public void largarMarisco(int indexMarisco) {
        mariscoPescado.remove(indexMarisco);
    }

    /**
     * Metodo que calcula o valor total da carga em €
     *
     * @return
     */
    public double calcularTotal() {

        double valorPescaria = 0;

        for (Peixe peixeAtual : this.peixePescado) {
            valorPescaria += peixeAtual.getPeso() * peixeAtual.getPrecoKg();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            valorPescaria += mariscoAtual.getPeso() * mariscoAtual.getPrecoKg();
        }

        return valorPescaria;
    }

    /**
     * Método para exibir os detalhes do Barco de Pesca
     */
    public void exibirDetalhes() {
        System.out.println("***** " + this.nome + " *****");
        System.out.println("Capacidade Carga: " + this.capacidadeCarga + " Kg.");
        System.out.println("Carga Atual: " + this.calcularCargaAtual() + " Kg.");

        System.out.println("\nPeixe Pescado:");
        for (Peixe peixeAtual : this.peixePescado) {
            peixeAtual.exibirDetalhes();
        }

        System.out.println("\nMarisco Pescado:");
        for (Marisco mariscoAtual : this.mariscoPescado) {
            mariscoAtual.exibirDetalhes();
        }

        System.out.println("Valor Total da Carga: " + this.calcularTotal() + " €");
    }

    public void salarioTripulacao() {

        double salarioTotal = this.calcularTotal();

        salarioTotal = salarioTotal - (salarioTotal * 0.4);

        double salarioIndividual = salarioTotal / this.tripulacao;

        System.out.println("Salario de cada tripulante: " + salarioIndividual);
    }
}
