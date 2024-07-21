package POO.FichaPratica09.Ex04_Imovel;

import static POO.FichaPratica09.Ex04_Imovel.Acabamento.*;
import static POO.FichaPratica09.Ex04_Imovel.Tipo.*;

public class Main {
    public static void main(String[] args) {

        Imovel casa1 = new Imovel("Rua do Zequinha", 99, "Porto", APARTAMENTO, NOVA, 120, 2, 2, 10);
        Imovel casa2 = new Imovel("Rua 30 de Fevereiro", 10, "Lisboa", CASA, RESTAURO, 200, 4, 3, 0);
        Imovel casa3 = new Imovel("Rua da Rua sem Nome", 88, "Neverland", MANSAO, NOVACOMALTOACABAMENTO, 550, 5, 5, 50);

        casa1.imprimirDescricao();
        System.out.println(casa1.calcularPrecoCasa(0) + "€");
        System.out.println("---------------------------------");

        casa2.imprimirDescricao();
        System.out.println(casa2.calcularPrecoCasa(0) + "€");
        System.out.println("---------------------------------");

        casa3.imprimirDescricao();
        System.out.println(casa3.calcularPrecoCasa(0) + "€");
        System.out.println("--------------------------------------");

        System.out.println("--------------------------------------");

        System.out.println("Casa com maior valor");
        Imovel maiorValor = casa1.compararImoveis(casa3);
        maiorValor.imprimirDescricao();
        //como meter o valor da casa junto no print?//
    }
}
