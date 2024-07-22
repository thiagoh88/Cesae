package POO.FichaPratica10.Ex02_Sorteio;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    ArrayList<Pessoa> listaParticipantes;

    public Sorteio(double premio) {
        this.premio = premio;
        this.listaParticipantes = new ArrayList<Pessoa>();
    }

    public void addParticipante(Pessoa participanteNovo) {
        if (participanteNovo.getIdade() >= 18) {
            System.out.println("Inscrito: " + participanteNovo.getNome());
            this.listaParticipantes.add(participanteNovo);
        } else {
            System.out.println("Menor de idade: " + participanteNovo.getNome());
        }

    }

    public void exibirDetalhes() {
        for (int i = 0; i < this.listaParticipantes.size(); i++) {
            System.out.println("participante: " + (i + 1) + " - ");
            this.listaParticipantes.get(i).exibirDetalhes();
        }
    }

    public void exibirForEach() {
        System.out.println("***** Lista de Participantes *****");
        for (Pessoa pessoaAtual : this.listaParticipantes) {
            pessoaAtual.exibirDetalhes();
        }
    }

    public Pessoa sortear() {
        Random rd = new Random();
        int indexSorteado = rd.nextInt(this.listaParticipantes.size());
        return this.listaParticipantes.get(indexSorteado);
    }

}
