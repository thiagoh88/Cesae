package PCE.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class teste {

    public static double melhorClientes(String pathVendas) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(new File(pathVendas));

        double valorTotalCliente = 0;
        double melhorCliente = 0;

        String nomeJogo = "";

        String linha = scannerFicheiro.nextLine();

        //encontrar o melhor cliente -------------------------------------
        while (scannerFicheiro.hasNextLine()) {

            linha = scannerFicheiro.nextLine();

            String[] linhaDivididaVendas = linha.split(";");

            melhorCliente = Integer.parseInt(linhaDivididaVendas[1]);

            valorTotalCliente = Double.parseDouble(linhaDivididaVendas[5]);

            if (valorTotalCliente > melhorCliente) {
                melhorCliente = valorTotalCliente;
                //idClientemelhor = idClienteAtual;
            }


        }
        return valorTotalCliente;

    }


    public static void main(String[] args) throws FileNotFoundException {

        System.out.print(melhorClientes("src/TrabalhoPratico/Ficheiros/GameStart_Vendas.csv"));
    }
}