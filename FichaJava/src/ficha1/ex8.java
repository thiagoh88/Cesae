package ficha1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int segtotal, min1, min2, seg1, seg2, hora, min, seg;

        System.out.println("Minutos musica 1: ");
        min1 = input.nextInt();
        System.out.println("Minutos musica 2: ");
        min2 = input.nextInt();
        System.out.println("Segundos musica 1: ");
        seg1 = input.nextInt();
        System.out.println("Segundos musica 2: ");
        seg2 = input.nextInt();

        segtotal = (min1 + min2) * 60 + (seg1 + seg2);
        hora = segtotal / 3600;
        segtotal = segtotal % 3600;
        min = segtotal / 60;
        seg= segtotal % 60;


        System.out.println(+hora + "h" + min + "m"+seg+ "s");


    }
}
