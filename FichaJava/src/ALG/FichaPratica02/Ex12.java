package ALG.FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Selecionar a opção desejada:\n 1.Criar\n 2.Atualizar\n 3.Eliminar\n 4.Sair");
        String op;
        op = input.next();
        switch (op) {
            case "1":
                System.out.println("CRIAR");
                break;
            case "2":
                System.out.println("ATUALIZAR");
                break;
            case "3":
                System.out.println("ELIMINAR");
                break;
            case "4":
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
