package RE_Fichas.ficha2;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int hora,min;

        System.out.println("hora");
        hora= input.nextInt();
        System.out.println("minuto");
        min= input.nextInt();

        if (hora>12){
            hora=hora-12;
            System.out.println(+hora+"h"+min+"m"+"PM");
        }else {
            System.out.println(+hora+"h"+min+"m"+"AM");
        }





    }
}
