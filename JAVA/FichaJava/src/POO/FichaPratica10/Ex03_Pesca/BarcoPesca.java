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
     * @param peixeNovo
     */
    public void pescarPeixe(Peixe peixeNovo) {
        if (this.calcularCargaAtual() + peixeNovo.getPeso() <= this.capacidadeCarga) {
            this.peixePescado.add(peixeNovo);
        }

    }

    /**
     * Metodo para verificar se tem capacidade de carga e add
     * @param mariscoNovo
     */
    public void pescarMarisco(Marisco mariscoNovo) {
        if (this.calcularCargaAtual() + mariscoNovo.getPeso() <= this.capacidadeCarga) {
            this.mariscoPescado.add(mariscoNovo);
        }

    }

    public void largarPeixe(int indexPeixe) {
        peixePescado.remove(indexPeixe);
    }

    public void largarMarisco(int indexMarisco) {
        mariscoPescado.remove(indexMarisco);
    }

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

    public void salarioTripulacao() {

        // valorPescaria-= valorPescaria*0.4;


    }

    public void exibirPescaria() {
        System.out.println("***** Pescaria *****");
        for (Peixe pescaria : this.peixePescado) {
            pescaria.exibirPeixe();
        }
        for (Marisco pescaria : this.mariscoPescado) {
            pescaria.exibirMarisco();
        }

    }

    public void barcoDetalhes() {
        System.out.println("***** Barco de pesca *****");
        System.out.println("Nome: " + this.nome + "\t| Cor: " + this.cor + "\t| Ano de Frabricação: " + this.anoFabrico + "\t| Tripulação: " + this.tripulacao + "\t | Capacidade: " + this.capacidadeCarga);
    }


}
