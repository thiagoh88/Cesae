package Controllers;

import Model.Sale;
import Repositories.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientController {

    private SalesRepository salesRepository;

    public ClientController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

    public ArrayList<String> listItens() {

        ArrayList<String> productNameList = new ArrayList<>();
        for (Sale saleAtual : salesRepository.getSalesArray()) {
            productNameList.add(saleAtual.getProductName());
        }

        return productNameList;
    }

}
