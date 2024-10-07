package Views;

import Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Controllers.AdminController.lerTotalVendas;

public class AdminView {

    private AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void menu() {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n***** Menu Administrador *****");
            System.out.println("1. Total das vendas");
            System.out.println("2. Total de lucro");
            System.out.println("3. Total de vendas e lucro por mês");
            System.out.println("4. Atração mais procurada por adultos");
            System.out.println("5. Atração mais procurada por crianças");
            System.out.println("6. Atração mais procurada");
            System.out.println("7. Atração mais lucrativa");
            System.out.println("8. Atração menos lucrativa");
            System.out.println("9. Atração com melhor preço/tempo");
            System.out.println("10. Adicionar novo login");
            System.out.println("11. Sair");

            System.out.print("Insira a opção: ");
            opcao = input.nextInt();

            System.out.println("-------------------------------------------------------------------------------------");

            switch (opcao) {
                case 1: // Total de todas as vendas
                    break;
                lerTotalVendas();
                case 2: // Lucro total
                    break;

                case 3: // Total de vendas e lucro por mês
                    break;

                case 4: // Atração mais procurada por adultos - número de bilhetes vendidos
                    break;

                case 5: // Atração mais procurada por crianças - número de bilhetes vendidos
                    break;

                case 6: // Atração mais procurada - número de bilhetes vendidos
                    break;

                case 7: // Atração mais lucrativa - período total
                    break;

                case 8: // Atração menos lucrativa - período total
                    break;

                case 9: // Atração com melhor preço/tempo - atração que custa menos por segundo
                    break;

                case 10: // Adicionar novo login - Adiciona um novo acesso válido, perguntando o tipo de acesso a criar
                    break;

                case 11: // Sair
                    break;

                default:
                    break;

            }
            System.out.println("-------------------------------------------------------------------------------------");

        } while (opcao != 11);

    }
}
