package PCE.FichaPratica06;

import java.util.Scanner;

import static PCE.FichaPratica06.Ex03.perfeito;

public class teste {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num;

        System.out.println("insira numero");
        num= input.nextInt();
        if (perfeito(num)){
            System.out.println("perfeito");
        }else {
            System.out.println("nao");
        }
    }
}
