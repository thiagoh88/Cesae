package RPG;

import RPG.Entidades.Hero;
import RPG.Jogo.Jogo;

public class Main {
    public static void main(String[] args) {

        Jogo.MusicPlayer musicaIntro = new Jogo.MusicPlayer();
        Jogo.MusicPlayer musicaJogo = new Jogo.MusicPlayer();
        Jogo.MusicPlayer musicaFinal = new Jogo.MusicPlayer();
        Jogo.MusicPlayer musicaEnd = new Jogo.MusicPlayer();


       // musicaIntro.play("C:/Users/thiag/Documents/CESAE/JAVA/FichaJava/src/RPG/MP3/action.mp3");
        Jogo jogo = new Jogo();
        jogo.intro();
        Hero hero = jogo.criarPersonagem();
        musicaIntro.stopMusic();

      //  musicaJogo.play("C:/Users/thiag/Documents/CESAE/JAVA/FichaJava/src/RPG/MP3/chase.mp3");
        jogo.inicio(hero);
        jogo.montanhaMorte(hero);
        jogo.labirintoTempestuoso(hero);
        jogo.valeSombrio(hero);
        jogo.subirPedras(hero);
        jogo.labesquerda(hero);
        jogo.labdireita(hero);
        jogo.caminhoFloresta(hero);
        jogo.caminhoEstreito(hero);
        jogo.caverna(hero);
        jogo.corredor(hero);
        jogo.corredorLargo(hero);
        jogo.lodo(hero);
        jogo.cume(hero);
        jogo.trilhaMontanha(hero);
        jogo.salasaida(hero);
        jogo.chest(hero);
        jogo.entradaMonasterio(hero);
        musicaJogo.stopMusic();

        musicaFinal.play("C:/Users/thiag/Documents/CESAE/JAVA/FichaJava/src/RPG/MP3/boss.mp3");
        jogo.monasterio(hero);
        jogo.sala19Secret(hero);
        musicaFinal.stopMusic();

        musicaEnd.play("C:/Users/thiag/Documents/CESAE/JAVA/FichaJava/src/RPG/MP3/end.mp3");
        jogo.end(hero);
    }
}
