package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int op;
        System.out.println("Posicao da corrida?");
        op = input.nextInt();
        switch (op){

            case 1: System.out.println("Primeiro lugar 10 pontos");
                break;
            case 2: System.out.println("Segundo lugar 8 pontos");
                break;
            case 3: System.out.println("Terceiro lugar 6 pontos");
                break;
            case 4: System.out.println("Quarto lugar 5 pontos");
                break;
            case 5: System.out.println("Quinto lugar 4 pontos");
                break;
            case 6: System.out.println("Sexto lugar 3 pontos");
                break;
            case 7: System.out.println("Setimo lugar 2 pontos");
                break;
            case 8: System.out.println("Oitavo lugar 1 pontos");
                break;
            default:
                System.out.println("sem pontos");


        }
    }
}
