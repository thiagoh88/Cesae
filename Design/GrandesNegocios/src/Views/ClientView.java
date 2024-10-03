package Views;

import Controllers.ClientController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientView {
    private ClientController clientController;

    public ClientView() throws FileNotFoundException {
        this.clientController = new ClientController();
    }

    public void menu() {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do {
            System.out.println("\n\n*** Menu Cliente ***");
            System.out.println("1. Produtos Disponiveis");
            System.out.println("2. Produtos de uma Categoria");
            System.out.println("3. Produto Mais Barato/Caro");
            System.out.println("4. Sair");

            System.out.print("Insira a opção: ");
            opcao = input.nextInt();

            System.out.println("____________________________");
            switch (opcao) {
                case 1:
                    for(String nomeAtual : clientController.listItens()){
                        System.out.println(nomeAtual);
                    }
                    break;
                case 2: // Consultar Produtos de uma Categoria
                    break;
                case 3: // Consultar Produto Mais Barato/Caro
                    break;
                case 4: // Sair
                    break;
                default:
            }
            System.out.println("____________________________");
        } while (opcao != 4);
    }
    private void itensList (){
        System.out.println("Lista de artigos\n " +clientController.listItens());}
}
