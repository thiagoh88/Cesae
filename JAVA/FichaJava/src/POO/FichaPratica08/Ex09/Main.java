package POO.FichaPratica08.Ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao;
        do {
            Scanner input = new Scanner(System.in);
            Produto produto = new Produto("caixa", 1.99);
            System.out.println("1.Comprar");
            System.out.println("2.Vender");
            System.out.println("3.Estoque");
            System.out.println("4.Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("quantidade: ");
                    double num = input.nextDouble();
                    produto.comprar(num);
                    break;
                case 2:
                    System.out.println("quantidade: ");
                    num = input.nextDouble();
                    produto.vender(num);
                    break;
                case 3:
                    produto.estoque();
                    System.out.println();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("invalido");
                    break;
            }
        } while (opcao != 4);
    }
}

