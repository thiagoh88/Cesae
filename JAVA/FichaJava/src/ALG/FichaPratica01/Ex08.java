package ALG.FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min1, min2, min3, min4, min5, seg1, seg2, seg3, seg4, seg5;
        int segsoma, segfinal, minsoma, min, hora, segtotal;
        //MUSICA 1
        System.out.println("Introduza minutos da musica 1:\n");
        min1 = input.nextInt();

        System.out.println("Introduza segundos da musica 1:\n");
        seg1 = input.nextInt();

        //MUSICA 2
        System.out.println("Introduza minutos da musica 2:\n");
        min2 = input.nextInt();

        System.out.println("Introduza segundos da musica 2:\n");
        seg2 = input.nextInt();

        //MUSICA 3
        System.out.println("Introduza minutos da musica 3:\n");
        min3 = input.nextInt();

        System.out.println("Introduza segundos da musica 3:\n");
        seg3 = input.nextInt();

        //MUSICA 4
        System.out.println("Introduza minutos da musica 4:\n");
        min4 = input.nextInt();

        System.out.println("Introduza segundos da musica 4:\n");
        seg4 = input.nextInt();

        //MUSICA 5
        System.out.println("Introduza minutos da musica 5:\n");
        min5 = input.nextInt();

        System.out.println("Introduza segundos da musica 5:\n");
        seg5 = input.nextInt();

        segsoma = (seg1 + seg2 + seg3 + seg4 + seg5);
        minsoma = (min1 + min2 + min3 + min4 + min5) * 60;
        segtotal = (segsoma + minsoma);

        hora = segtotal / 3600;
        segtotal = segtotal % 3600;
        min = segtotal / 60;
        segfinal = segtotal % 60;

        System.out.println("Horas: " +hora);
        System.out.println("Minutos: " +min);
        System.out.println("Segundos: " +segfinal);




    }
}
