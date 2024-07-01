package ficha2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int op;

        System.out.println("qual lugar na corrida");
        op= input.nextInt();
        switch (op) {

            case 1:
                System.out.println("lugar 1");
                break;
            case 2:
                System.out.println("lugar 2");
                break;
            case 3:
                System.out.println("lugar 3");
                break;
            case 4:
                System.out.println("lugar 4");
                break;
            case 5:
                System.out.println("lugar 5");
                break;


        }


    }
}
