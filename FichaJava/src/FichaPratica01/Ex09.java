package FichaPratica01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double codigoFuncionario, dias,iliquido, alimentacao, irs, segurancaF,segurancaE, liquido;

        System.out.println("Introduzir codigo do funcionario:");
        codigoFuncionario = input.nextDouble();
        System.out.println("Introduzir numero de dias trabalhado:");
        dias = input.nextDouble();


        System.out.println("Funcionario: " + codigoFuncionario);

        iliquido=dias*40;
        System.out.println("Vencimento iliquido: €" +iliquido);

        alimentacao=dias*5;
        System.out.println("Total Sub. alimentacao: €" +alimentacao);

        irs=iliquido*0.1;
        System.out.println("Valor IRS: €" +irs);

        segurancaF=iliquido*0.11;
        segurancaE=iliquido*0.2375;
        System.out.println("Seguranca social Funcionario: " +segurancaF+ "\tEmpresa:" +segurancaE);

        liquido=iliquido-irs-segurancaE+alimentacao;
        System.out.println("total liquido:" +liquido);




    }

}
