package POO.FichaPratica11.Ex03_Pizza;

import static POO.FichaPratica11.Ex03_Pizza.TipoCarne.*;
import static POO.FichaPratica11.Ex03_Pizza.TipoFrutoMar.*;
import static POO.FichaPratica11.Ex03_Pizza.TipoQueijo.*;
import static POO.FichaPratica11.Ex03_Pizza.TipoVegetal.*;

public class Main {
    public static void main(String[] args) {

        Queijo queijoMozzarela = new Queijo(10, "Mozzarela", Medidas.GRAMAS, 1.5, OrigemIngrediente.PORTUGAL, MOZZARELA);
        Queijo queijoSerra = new Queijo(11, "Serra", Medidas.UNIDADES, 2, OrigemIngrediente.PORTUGAL, SERRA);
        Queijo queijoCabra = new Queijo(12, "Cabra", Medidas.GRAMAS, 1.5, OrigemIngrediente.ESPANHA, CABRA);
        Queijo queijoOvelha = new Queijo(13, "Ovelha", Medidas.GRAMAS, 2.5, OrigemIngrediente.FRANCA, OVELHA);
        Queijo queijoBrie = new Queijo(14, "Brie", Medidas.UNIDADES, 4, OrigemIngrediente.FRANCA, BRIE);
        Queijo queijoCheddar = new Queijo(15, "Cheddar", Medidas.GRAMAS, 8, OrigemIngrediente.ESPANHA, CHEDDAR);

        Carne carneVaca = new Carne(20, "Vaca", Medidas.GRAMAS, 15, OrigemIngrediente.ESPANHA, VACA);
        Carne carneChourico = new Carne(21, "Chourico", Medidas.UNIDADES, 25, OrigemIngrediente.PORTUGAL, CHOURICO);
        Carne carneFrango = new Carne(22, "Frango", Medidas.GRAMAS, 10, OrigemIngrediente.FRANCA, FRANGO);

        FrutoMar frutoMarCamarao = new FrutoMar(30, "Camarao", Medidas.UNIDADES, 8, OrigemIngrediente.PORTUGAL, CAMARAO);
        FrutoMar frutoMarLagosta = new FrutoMar(31, "Lagosta", Medidas.UNIDADES, 12, OrigemIngrediente.FRANCA, LAGOSTA);
        FrutoMar frutoMarAtum = new FrutoMar(32, "Atum", Medidas.GRAMAS, 7, OrigemIngrediente.ESPANHA, ATUM);

        Vegetal vegetalCebola = new Vegetal(40, "Cebola", Medidas.GRAMAS, 2, OrigemIngrediente.PORTUGAL, CEBOLA);
        Vegetal vegetalPimento = new Vegetal(41, "Pimento", Medidas.UNIDADES, 8, OrigemIngrediente.ESPANHA, PIMENTO);
        Vegetal vegetalCogumelo = new Vegetal(42, "Cogumelo", Medidas.UNIDADES, 2, OrigemIngrediente.FRANCA, COGUMELO);
        Vegetal vegetalMilho = new Vegetal(43, "Milho", Medidas.GRAMAS, 1, OrigemIngrediente.PORTUGAL, MILHO);

        Base baseAlta=new Base(50,"Alta",Medidas.UNIDADES,200,BasePizza.MASSA_ALTA,"Base de massa alta");
        Base baseFina=new Base(51,"Fina",Medidas.UNIDADES,150,BasePizza.MASSA_FINA,"Base de massa fina");




        Pizza pizzaMista = new Pizza(12345, "Pizza Mista", "Pizza tradicional", 20, TamanhoPizza.GRANDE);
        pizzaMista.addIngredientePizza(new IngredientePizza(queijoMozzarela, 250));
        pizzaMista.addIngredientePizza(new IngredientePizza(carneVaca, 100));



        pizzaMista.exbibirDetalhes();

        System.out.println();

        pizzaMista.removeIngredientesPizza(10);
        System.out.println();
        System.out.println();
        pizzaMista.exbibirDetalhes();
    }
}
