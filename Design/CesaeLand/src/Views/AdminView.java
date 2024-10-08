package Views;

import Controllers.AdminController;
import Model.Atracao;

import java.util.Map;
import java.util.Scanner;

public class AdminView {
    
    private AdminController adminController;

    public AdminView() {
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
                    calcularTotalVendas();
                    break;
                case 2: // Lucro total
                    calcularTotalLucro();
                    break;
                case 3: // Total de vendas e lucro por mês
                    lucroPorMes();
                    break;

                case 4: // Atração mais procurada por adultos - número de bilhetes vendidos
                    atracaoMaisProcuradaAdultos();
                    break;
                case 5: // Atração mais procurada por crianças - número de bilhetes vendidos
                    atracaoMaisProcuradaCriancas();
                    break;
                case 6: // Atração mais procurada - número de bilhetes vendidos
                    atracaoMaisProcurada();
                    break;

                case 7: // Atração mais lucrativa - período total
                    break;

                case 8: // Atração menos lucrativa - período total
                    break;

                case 9: // Atração com melhor preço/tempo - atração que custa menos por segundo
                    break;

                case 10: // Adicionar novo login - Adiciona um novo acesso válido, perguntando o tipo de acesso a criar
                    addLogin();
                    break;
                case 11: // Sair
                    sair();
                    break;

                default:
                    break;

            }
            System.out.println("-------------------------------------------------------------------------------------");

        } while (opcao != 11);

    }

    public void atracaoMaisProcurada() {
        int[][] atracaoMaisProcurada = adminController.getAtracaoMaisProcurada();
        System.out.println("ATRACAO MAIS PROCURADA: " + adminController.getAtracaoID(atracaoMaisProcurada[0][0]).getNome() + " BILHETES VENDIDOS: " + atracaoMaisProcurada[0][1]);
    }

    public void atracaoMaisProcuradaAdultos(){
        Atracao a = adminController.atracaoMaisProcuradaPorAdultos();
        int[] contagemAdultos = adminController.totalAtracoesPorAdulto();

        System.out.println("ATRACAO MAIS PROCURADA ADULTOS: " + a.getNome() + " BILHETES VENDIDOS: " + contagemAdultos[a.getId() - 1]);
    }

    public void atracaoMaisProcuradaCriancas() {
        // Ir ver qual a atracao mais procurada, somente a atracao
        Atracao a = adminController.atracaoMaisProcuradaPorCriancas();
        // Ir buscar array com numero de bilhetes vendidos por atracao e ver quantos bilhetes vendeu a atracao mais procurada encontrada anteriormente
        int[] contagemCriancas = adminController.totalAtracoesPorCrianca();

        System.out.println("ATRACAO MAIS PROCURADA CRIANCAS: " + a.getNome() + " BILHETES VENDIDOS: " + contagemCriancas[a.getId() - 1]);
    }

    public void calcularTotalVendas() {
        double totalVendas = adminController.calcularTotalVendas();
        System.out.println("TOTAL VENDAS: " + totalVendas + "$");
    }

    public void calcularTotalLucro() {
        double lucro = adminController.calcularTotalLucro();
        System.out.println("TOTAL LUCRO: " + String.format("%.2f", lucro) + "$");
    }

    private void addLogin() {
        Scanner in = new Scanner(System.in);
        int tipoUtilizador = 0;
        do {
            System.out.println("Introduza o tipo de utilizador\n1-Admin 2-Engenheiro");
            tipoUtilizador = in.nextInt();
            in.nextLine();
        }while(tipoUtilizador != 1 && tipoUtilizador != 2);
        System.out.println("Introduza username");
        String username = in.nextLine();
        System.out.println("Introduza password.");
        String password = in.nextLine();

        if(adminController.addUser(tipoUtilizador == 1 ? "ADMIN" : "ENG", username, password)) {
            System.out.println("Utilizador adicionado com sucesso.");
        } else {
            System.out.println("Erro adicionar utilizador.");
        }
    }

    private void lucroPorMes() {
        Map<String, Double> lucroPorMes = adminController.totalLucroPorMes();

        for(Map.Entry<String,Double> entry : lucroPorMes.entrySet()) {
            System.out.println("MES: " + entry.getKey() + " LUCRO: " + String.format("%.2f", entry.getValue()) + "$");
        }
    }

    public void sair() {
        adminController.saveUsers();
    }
}
