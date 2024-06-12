package FichaPratica01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double cod, dias, vencimentoI, alimentacao, irs, seg1, seg2;

        System.out.println("Introduzir codigo do funcionario:");
        cod = input.nextDouble();
        System.out.println("Introduzir numero de dias trabalhado:");
        dias = input.nextDouble();

        vencimentoI = dias * 40;
        alimentacao = dias *5;
        irs = vencimentoI * 0.1;


        System.out.println("Funcionario: " + cod);

        System.out.println("Vencimento iliquido: €" +vencimentoI);
        System.out.println("Total Sub. alimentacao: €" +alimentacao);
        System.out.println("Valor IRS: €" +irs);




    }

}
