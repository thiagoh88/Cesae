package POO.FichaPratica08.Ex05;

import static POO.FichaPratica08.Ex05.Marcas.OPEL;
import static POO.FichaPratica08.Ex05.Modelos.CORSA;
import static POO.FichaPratica08.Ex05.Marcas.OPEL;
import static POO.FichaPratica08.Ex05.Modelos.CORSA;

public class Main {
    public static void main(String[] args) {
        Carro carro= new Carro(OPEL,CORSA,2010);

       carro.ligar();
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Ano: "+carro.getAnoFabrico());
    }
}
