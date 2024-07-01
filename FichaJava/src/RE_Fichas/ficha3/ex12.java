package RE_Fichas.ficha3;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num=0,count25=0,count50=0,count75=0,count100=0;

        while (num>=0){
            System.out.println("introduza um numero");
            num= input.nextInt();

            if (num>=0&&num<=25){
                count25++;
            }
            if (num>=26&&num<=50){
                count50++;
            }
            if (num>=51&&num<=75){
                count75++;
            }
            if (num>=76&&num<=100){
                count100++;
            }

        }
        System.out.println("intervalo 25: "+count25);
        System.out.println("intervalo 50: "+count50);
        System.out.println("intervalo 75: "+count75);
        System.out.println("intervalo 100: "+count100);



    }
}
