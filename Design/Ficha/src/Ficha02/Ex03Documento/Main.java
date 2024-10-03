package Ficha02.Ex03Documento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("texto\ncalculo\napresentacao\n");
        String tipo = input.next();
        System.out.print("nome\n");
        String nome = input.next();
        System.out.print("autor\n");
        String autor = input.next();

        Document documento = CriarDoc.createDocument(tipo, nome, autor);

        int op = 0;
        do {
            System.out.println("\n1.abrir");
            System.out.println("2.salvar");
            System.out.println("3.fechar");
            System.out.print("Opção: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    documento.open();
                    break;
                case 2:
                    documento.save();
                    break;
                case 3:
                    documento.close();
                    break;
                default:
                    System.out.println("invalido");

            }
        } while (op != 3);

    }
}
