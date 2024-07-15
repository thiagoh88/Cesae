package ALG.FichaPratica04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        do {
            System.out.println("\nSelecionar uma opção:\n");
            System.out.printf("1.Criar\n");
            System.out.printf("2.Atualizar\n");
            System.out.printf("3.Eliminar\n");
            System.out.printf("4.Sair\n");
            op = input.nextInt();

            switch (op)
            {
                case 1:
                    System.out.printf("\nescolheu Criar");
                    break;
                case 2:
                    System.out.printf("\nescolheu Atualizar");
                    break;
                case 3:
                    System.out.printf("\nescolheu Eliminar");
                    break;
                case 4:
                    System.out.printf("\nescolheu Sair");
                    break;
                default:
                    System.out.println("\ninvalido");
            }
        }
        while (op != 4);
    }
}
