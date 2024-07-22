package POO.FichaPratica10.Ex01_Radio;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Musica> programacao;


    public MusicPlayer() {
        this.programacao = new ArrayList<Musica>();
    }

    public void addMusica(Musica musicaNova) {
        this.programacao.add(musicaNova);
    }

    public void tocarMusica() {
        for (Musica musicaAtual : this.programacao) {
            musicaAtual.exibirDetalhes();
        }
    }

    public void removerMusica(int musica) {
        System.out.print("musica removida: ");
        programacao.remove(musica).exibirDetalhes();
    }

    public void removerTodasMusicas() {
        System.out.println("Musicas removidas: ");
        programacao.clear();

    }

    public void trocarMusicas(int indexMusica1, int indexMusica2) {

        Musica musicaTemp = this.programacao.get(indexMusica1);
        this.programacao.set(indexMusica1, this.programacao.get(indexMusica2));
        this.programacao.set(indexMusica2, musicaTemp);
        System.out.println("Trocar na posição: " + indexMusica1 + "\t| por: " + indexMusica2);
    }

    //public void trocarMusicas(int indextrocar, Musica musicaNova){
    //    this.programacao.set(indextrocar,musicaNova);
    //}

    //public void trocarMusica(Musica musica1, Musica musica2) {
    //  if (this.programacao.contains(musica1) && this.programacao.contains(musica2)) {
    //    int indexMusica1 = this.programacao.indexOf(musica1);
    //  int indexMusica2 = this.programacao.indexOf(musica2);

    //this.programacao.set(indexMusica1, musica2);
    //this.programacao.set(indexMusica2, musica1);
    //}

    //}

    public void imprimirRelatorio() {
        for (int i = 0; i < this.programacao.size(); i++) {
            System.out.println("Musica: " + (i + 1) + " - ");
            this.programacao.get(i).exibirDetalhes();
        }
    }

    public void calcularDuracao() {
        int totalSegundosAlbum = 0;

        for (Musica musicaAtual : this.programacao) {
            totalSegundosAlbum += musicaAtual.getDuracao();
        }

        int horas, minutos, segundos;
        horas = totalSegundosAlbum / 3600;
        minutos = totalSegundosAlbum / 60 - (horas * 60);
        segundos = totalSegundosAlbum - (horas * 3600) - (minutos * 60);

        System.out.println("Duração: "+horas+":"+minutos+":"+segundos);
    }

}


