package FichaPratica01;

import java.util.Scanner;

public class Ex08Dois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int segtotal, hora, min, seg;

        System.out.println("Introduza minutos da musica 1:\n");
        segtotal = input.nextInt() * 60;

        System.out.println("Introduza segundos da musica 1:\n");
        segtotal = segtotal + input.nextInt();

        System.out.println("Introduza minutos da musica 2:\n");
        segtotal = segtotal + input.nextInt() * 60;

        System.out.println("Introduza segundos da musica 2:\n");
        segtotal = segtotal + input.nextInt();

        System.out.println("Introduza minutos da musica 3:\n");
        segtotal = segtotal + input.nextInt() * 60;

        System.out.println("Introduza segundos da musica 3:\n");
        segtotal = segtotal + input.nextInt();

        System.out.println("Introduza minutos da musica 4:\n");
        segtotal = segtotal + input.nextInt() * 60;

        System.out.println("Introduza segundos da musica 4:\n");
        segtotal = segtotal + input.nextInt();

        System.out.println("Introduza minutos da musica 5:\n");
        segtotal = segtotal + input.nextInt() * 60;

        System.out.println("Introduza segundos da musica 5:\n");
        segtotal = segtotal + input.nextInt();

        hora = segtotal/3600;
        min = (segtotal/60)-(hora*60);
        seg = segtotal - (hora*3600) - (min*60);

        System.out.println("O Álbum tem: "+hora+"h "+min+"m "+seg+"s");


    }
}
