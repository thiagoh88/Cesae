package Views;

import java.util.Scanner;

public class EngView {

    //private EngController engController;

    public void menu(){

        Scanner input=new Scanner(System.in);

        int opcao=-1;
        while (opcao!=3){


            System.out.println("***** Bem vindo ao menu do Engenheiro******");
            System.out.println("1: Consultar as 3 próximas revisões.");
            System.out.println("2: Consultar histórico de revisões.");
            System.out.println("3: Sair");
            System.out.print("Escolha:");
            opcao=input.nextInt();

            switch (opcao){

                case 1:

                    System.out.println("Consultar");
                    break;

                case 2:

                    System.out.println("Histórico");
                    break;

                case 3:

                    System.out.println("A Sair...");

                    break;

                default:

                    System.out.println("Escolha Inválida");
            }
        }
    }
}
