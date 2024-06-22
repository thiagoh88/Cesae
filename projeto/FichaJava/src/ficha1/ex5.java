package ficha1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double num1,num2,num3,media;
        System.out.println("introduza 1");
        num1= input.nextDouble();
        System.out.println("introduza 2");
        num2= input.nextDouble();
        System.out.println("introduza 3");
        num3= input.nextDouble();

        num1=(num1+num2+num3)/3;

        System.out.println("media: "+num1);
        media=num1*0.2;
        System.out.println("20%: "+media);

        media=num1*0.3;
        System.out.println("30%: "+media);

        media=num1*0.4;
        System.out.println("40%: "+media);



    }
}
