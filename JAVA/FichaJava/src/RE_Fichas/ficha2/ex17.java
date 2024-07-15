package RE_Fichas.ficha2;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double saldoMedio;

        System.out.println("Insira o saldo medio:");
        saldoMedio= input.nextDouble();

        if (saldoMedio>=0&&saldoMedio<2000)
        {
            System.out.println("Nenhum credito");
        }
        if (saldoMedio>=2000&&saldoMedio<4000)
        {
            saldoMedio=saldoMedio*0.2;
            System.out.println("20% "+saldoMedio);
        }
        if (saldoMedio>=4000&&saldoMedio<6000)
        {
            saldoMedio=saldoMedio*0.3;
            System.out.println("30% "+saldoMedio);
        }
        if (saldoMedio>=6000)
        {
            saldoMedio=saldoMedio*0.4;
            System.out.println("40% "+saldoMedio);
        }









    }
}
