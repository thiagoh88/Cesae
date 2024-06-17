package FichaPratica02;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

double saldoMedio;

        System.out.println("Insirao saldo medio:");
        saldoMedio= input.nextDouble();

        if (saldoMedio<=0||saldoMedio<=2000){
            System.out.println("Sem credito");
        }
        if (saldoMedio>2000&&saldoMedio<=4000){
            saldoMedio=saldoMedio*0.2;
            System.out.println("Valor do credito 20%:"+saldoMedio);
        }
        if (saldoMedio>4000&&saldoMedio<=6000){
            saldoMedio=saldoMedio*0.3;
            System.out.println("Valor do credito 30%:"+saldoMedio);
        }
        if (saldoMedio>6000){
            saldoMedio=saldoMedio*0.4;
            System.out.println("Valor do credito 40%:"+saldoMedio);
        }

    }
}
