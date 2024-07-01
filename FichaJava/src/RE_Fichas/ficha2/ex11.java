package RE_Fichas.ficha2;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo, mov, total;

        System.out.println("inserir saldo: ");
        saldo = input.nextDouble();
        System.out.println("inserir movimento: ");
        mov = input.nextDouble();

        total = saldo + mov;

        if (total >= 0)
        {
            System.out.println("Saldo atual: " + total);
        }
        else
        {
            System.out.println("Operação invalida!"+"\nSaldo atual: " +saldo);
        }
    }
}
