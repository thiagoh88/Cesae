package Views;

import Controllers.ClientController;

import java.util.Scanner;

public class ClientView {
    private ClientController clientController;

    public ClientView() {
        this.clientController = new ClientController();
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n\n******** Menu Cliente *********");
            System.out.println("1. Atrações Disponíveis");
            System.out.println("2. Atrações Favoritas");
            System.out.println("3. Sair");
            System.out.print("Insira uma opção: ");
            opcao = input.nextInt();
            System.out.println("__________________________________________________");

            switch (opcao) {
                case 1: // Consultar Atrações Disponíveis
                    System.out.println("Atrações disponíveis...");
                    System.out.println("função para imprimir o csv atracoes, porem a duração em min:seg");
                    break;
                case 2: // Consultar Atrações Favoritas
                    System.out.println("Atrações Favoritas...");
                    System.out.println("função para imprimir do ficheiro de atracoes, a atracao que mais vendeu para adultos e criancas");
                    break;
                case 3: // Sair
                    System.out.println("Saindo...");
                    break;
                default:
            }
            System.out.println("__________________________________________________");
        } while (opcao != 3);

    }
}