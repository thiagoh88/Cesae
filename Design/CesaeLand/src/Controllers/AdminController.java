package Controllers;

import Model.Venda;
import Repositories.VendaRepository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AdminController {

    private VendaRepository salesRepository;

    public AdminController() {
        this.salesRepository = new VendaRepository();
    }
    public static double lerTotalVendas(){
        double totalVendas = 0.0;
        try (BufferedReader br = new BufferedReader(new VendaRepository())) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(";");
                totalVendas += Double.parseDouble(colunas[2]) + Double.parseDouble(colunas[3]);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return totalVendas;
    }



    public double totalSales(){
        double totalSales=0;

        for(Venda saleAtual : salesRepository.getVendasArray()){
            totalSales+=saleAtual.getQuantity()*saleAtual.getPrice();
        }

        return totalSales;
    }
}
