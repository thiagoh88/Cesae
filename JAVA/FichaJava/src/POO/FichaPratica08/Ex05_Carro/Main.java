package POO.FichaPratica08.Ex05_Carro;

import static POO.FichaPratica08.Ex05_Carro.Marcas.MERCEDES;
import static POO.FichaPratica08.Ex05_Carro.TipoCombustivel.DIESEL;
import static POO.FichaPratica08.Ex05_Carro.TipoCombustivel.GASOLINA;
import static POO.FichaPratica08.Ex05_Carro.Marcas.BMW;
import static POO.FichaPratica08.Ex05_Carro.Modelos.CORSA;
import static POO.FichaPratica08.Ex05_Carro.Modelos.M100;

public class Main {
    public static void main(String[] args) {

        Carro adversario1 = new Carro(BMW, M100, 2010, 250, GASOLINA, 6.5);
        Carro adversario2 = new Carro(MERCEDES, CORSA, 1990, 80, DIESEL, 5.5);

        adversario2.ligar();
        System.out.println("-----------------------------");
        adversario1.corrida(adversario2);
        System.out.println("-----------------------------");
        System.out.println();

        System.out.println("Adversario1: " + adversario1.distancia(97));
        System.out.println("--------------------------");
        System.out.println("Adversario2: " + adversario2.distancia(97));
        System.out.println("---------------------------");
        System.out.println();

        if (adversario1.distancia(97) > adversario2.distancia(97)) {
            System.out.println();
            System.out.println("Maior consumo: " + adversario1.distancia(97));
        } else {
            System.out.println("Maior consumo: " + adversario2.distancia(97));
        }
    }
}
