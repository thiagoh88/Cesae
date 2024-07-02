package ALG.FichaPratica02;

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

        if (valor>=0){

            saldo=valor;

        }else{

            System.out.println("operacao invalida");
        }
        System.out.println("saldo"+saldo);
    }
}
