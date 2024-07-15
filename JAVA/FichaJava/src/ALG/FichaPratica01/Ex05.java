package ALG.FichaPratica01;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3, media, vin, trin, cin;

        System.out.print("Insira o primeiro valor\n");
        num1 = input.nextDouble();
        System.out.print("Insira o segundo valor\n");
        num2 = input.nextDouble();
        System.out.print("Insira o terceiro valor\n");
        num3 = input.nextDouble();

        media = (num1 + num2 + num3) / 3;
        vin =  media * 0.2;
        trin = media * 0.3;
        cin = media * 0.5;
        System.out.println("Media: " +media);
        System.out.println("20%: " +vin);
        System.out.println("30%: " +trin);
        System.out.println("50%: " +cin);


    }
}
