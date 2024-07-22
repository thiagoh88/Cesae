package POO.FichaPratica10.Ex01_Radio;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 260);
        Musica musica2 = new Musica("Bohemian Rapsody", "Rock", "Queen", 359);
        Musica musica3 = new Musica("Mestre da Culinária", "Heavy Metal", "Quim Barreiros", 233);

        MusicPlayer playlist1 = new MusicPlayer();

        playlist1.addMusica(musica1);
        playlist1.addMusica(musica2);
        playlist1.addMusica(musica3);

        //playlist1.tocarMusica();

        //System.out.println("-----------------------------------------------");
        //playlist1.removerMusica(0);
        //System.out.println("-----------------------------------------------");

        //playlist1.tocarMusica();

        // System.out.println("-----------------------------------------------");
        //playlist1.removerTodasMusicas();
        //System.out.println("-----------------------------------------------");

        //playlist1.tocarMusica();

        System.out.println("------------------------------------------------");
        playlist1.tocarMusica();
        System.out.println("------------------------------------------------");
        playlist1.trocarMusicas(0, 1);
        playlist1.tocarMusica();

        playlist1.calcularDuracao();

    }
}
