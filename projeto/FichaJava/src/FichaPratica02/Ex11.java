package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo, mov, valor;

        System.out.println("introduzir saldo: ");
        saldo = input.nextDouble();

        System.out.println("introduzir valor a movimentar: ");
        mov = input.nextDouble();

        valor = saldo+mov;
        if (valor <= -1){
            System.out.println("Operação invalida\n");
            System.out.println("Saldo: "+saldo);
        }else{

            System.out.println("Saldo artual: "+valor);
        }
    }
}
