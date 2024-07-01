package RE_Fichas.ficha2;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int op;
        System.out.println("1.Criar\n2.Atualizar\n3.Eliminar\n4.Sair\n");
        op= input.nextInt();

        while (op!=4) {
            System.out.println("1.Criar\n2.Atualizar\n3.Eliminar\n4.Sair\n");
            op= input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("CRIAR");
                    break;
                case 2:
                    System.out.println("ATUALIZAR");
                    break;
                case 3:
                    System.out.println("ELIMINAR");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!\n");
            }
        }






    }
}
