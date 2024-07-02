package ALG.FichaPratica02;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cod, diastrab, subal, irs, vencimento, seg, liq, iliq;

        System.out.println("Insira o codigo do funcionario: ");
        cod = input.nextDouble();
        System.out.println("Dias trabalhado: ");
        diastrab = input.nextDouble();
        System.out.println("Selecione o cargo:\n e.empregado\n c.chefe\n a.administrador ");
        String cargo;
        cargo = input.next();
        switch (cargo) {
            case "e":
                vencimento = diastrab * 40;
                if (vencimento <= 1000) {
                    irs = vencimento * 0.1;
                    subal = diastrab * 5;
                    iliq = vencimento + subal;
                    seg = (vencimento * 0.11) + (vencimento * 0.2375);
                    liq = iliq - irs - seg;
                    System.out.println("Funcionario: " + cod + "\nCargo: Empregado" + "\nDias trabalhado: " + diastrab);
                    System.out.println("valor Iliquido: " + iliq);
                    System.out.println("total sub alimentacao: " + subal);
                    System.out.println("retencao IRS 10%: " + irs);
                    System.out.println("total segurancao social: " + seg);
                    System.out.println("valor Liquido: " + liq);
                }
                if (vencimento >= 1001) {

                    irs = vencimento * 0.2;
                    subal = diastrab * 5;
                    iliq = vencimento + subal;
                    seg = (vencimento * 0.11) + (vencimento * 0.2375);
                    liq = iliq - irs - seg;
                    System.out.println("Funcionario: " + cod + "\nCargo: Empregado" + "\nDias trabalhado: " + diastrab);
                    System.out.println("valor Iliquido: " + iliq);
                    System.out.println("total sub alimentacao: " + subal);
                    System.out.println("retencao IRS 20%: " + irs);
                    System.out.println("total segurancao social: " + seg);
                    System.out.println("valor Liquido: " + liq);
                }
                break;
            case "c":
                vencimento = diastrab * 60;
                if (vencimento <= 1000) {
                    irs = vencimento * 0.1;
                    subal = diastrab * 7.5;
                    iliq = vencimento + subal;
                    seg = (vencimento * 0.11) + (vencimento * 0.2375);
                    liq = iliq - irs - seg;
                    System.out.println("Funcionario: " + cod + "\nCargo: Chefe" + "\nDias trabalhado: " + diastrab);
                    System.out.println("valor Iliquido: " + iliq);
                    System.out.println("total sub alimentacao: " + subal);
                    System.out.println("retencao IRS 10%: " + irs);
                    System.out.println("total segurancao social: " + seg);
                    System.out.println("valor Liquido: " + liq);
                }
                if (vencimento >= 1001) {
                    irs = vencimento * 0.2;
                    subal = diastrab * 7.5;
                    iliq = vencimento + subal;
                    seg = (vencimento * 0.11) + (vencimento * 0.2375);
                    liq = iliq - irs - seg;
                    System.out.println("Funcionario: " + cod + "\nCargo: Chefe" + "\nDias trabalhado: " + diastrab);
                    System.out.println("valor Iliquido: " + iliq);
                    System.out.println("total sub alimentacao: " + subal);
                    System.out.println("retencao IRS 20%: " + irs);
                    System.out.println("total segurancao social: " + seg);
                    System.out.println("valor Liquido: " + liq);
                }
                break;

            case "a":
                vencimento = diastrab * 80;
                if (vencimento <= 1000) {
                    irs = vencimento * 0.1;
                    subal = diastrab * 7.5;
                    iliq = vencimento + subal;
                    seg = (vencimento * 0.11) + (vencimento * 0.2375);
                    liq = iliq - irs - seg;
                    System.out.println("Funcionario: " + cod + "\nCargo: Administrador" + "\nDias trabalhado: " + diastrab);
                    System.out.println("valor Iliquido: " + iliq);
                    System.out.println("total sub alimentacao: " + subal);
                    System.out.println("retencao IRS 10%: " + irs);
                    System.out.println("total segurancao social: " + seg);
                    System.out.println("valor Liquido: " + liq);
                }
                if (vencimento >= 1001) {
                    irs = vencimento * 0.2;
                    subal = diastrab * 7.5;
                    iliq = vencimento + subal;
                    seg = (vencimento * 0.11) + (vencimento * 0.2375);
                    liq = iliq - irs - seg;
                    System.out.println("Funcionario: " + cod + "\nCargo: Administrador" + "\nDias trabalhado: " + diastrab);
                    System.out.println("valor Iliquido: " + iliq);
                    System.out.println("total sub alimentacao: " + subal);
                    System.out.println("retencao IRS 20%: " + irs);
                    System.out.println("total segurancao social: " + seg);
                    System.out.println("valor Liquido: " + liq);
                }
                break;

            default:
                System.out.println("invalido");
        }
    }
}
