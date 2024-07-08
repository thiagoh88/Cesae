package TrabalhoPratico;

import java.util.Scanner;

public class MenuAdmin {

    public static void menuAdmin(){

        Scanner input=new Scanner(System.in);

        System.out.println("selecionar opção");
        System.out.println("1.op");
        System.out.println("2.op");

        int opcao=input.nextInt();

        switch (opcao){

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }while (opcao!=4);

    }
    }

