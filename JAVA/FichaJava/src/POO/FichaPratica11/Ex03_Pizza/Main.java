package POO.FichaPratica11.Ex03_Pizza;

import POO.FichaPratica11.Ex03_Pizza.Enums.*;
import POO.FichaPratica11.Ex03_Pizza.Ingredientes.*;

import static POO.FichaPratica11.Ex03_Pizza.Enums.TipoCarne.*;
import static POO.FichaPratica11.Ex03_Pizza.Enums.TipoFrutoMar.*;
import static POO.FichaPratica11.Ex03_Pizza.Enums.TipoQueijo.*;
import static POO.FichaPratica11.Ex03_Pizza.Enums.TipoVegetal.*;

public class Main {
    public static void main(String[] args) {

        Queijo queijoMozzarela = new Queijo(10, "Mozzarela", Medidas.GRAMAS, 1.5, OrigemIngrediente.NACIONAL, MOZZARELA);
        Queijo queijoSerra = new Queijo(11, "Serra", Medidas.UNIDADES, 2, OrigemIngrediente.NACIONAL, SERRA);
        Queijo queijoCabra = new Queijo(12, "Cabra", Medidas.GRAMAS, 1.5, OrigemIngrediente.IMPORTADO, CABRA);
        Queijo queijoOvelha = new Queijo(13, "Ovelha", Medidas.GRAMAS, 2.5, OrigemIngrediente.IMPORTADO, OVELHA);
        Queijo queijoBrie = new Queijo(14, "Brie", Medidas.UNIDADES, 4, OrigemIngrediente.IMPORTADO, BRIE);
        Queijo queijoCheddar = new Queijo(15, "Cheddar", Medidas.GRAMAS, 8, OrigemIngrediente.IMPORTADO, CHEDDAR);

        Carne carneVaca = new Carne(20, "Vaca", Medidas.GRAMAS, 15, OrigemIngrediente.IMPORTADO, VACA);
        Carne carneChourico = new Carne(21, "Chourico", Medidas.UNIDADES, 25, OrigemIngrediente.NACIONAL, CHOURICO);
        Carne carneFrango = new Carne(22, "Frango", Medidas.GRAMAS, 10, OrigemIngrediente.IMPORTADO, FRANGO);

        FrutoMar frutoMarCamarao = new FrutoMar(30, "Camarao", Medidas.UNIDADES, 8, OrigemIngrediente.NACIONAL, CAMARAO);
        FrutoMar frutoMarLagosta = new FrutoMar(31, "Lagosta", Medidas.UNIDADES, 12, OrigemIngrediente.IMPORTADO, LAGOSTA);
        FrutoMar frutoMarAtum = new FrutoMar(32, "Atum", Medidas.GRAMAS, 7, OrigemIngrediente.IMPORTADO, ATUM);

        Vegetal vegetalCebola = new Vegetal(40, "Cebola", Medidas.GRAMAS, 2, OrigemIngrediente.NACIONAL, CEBOLA);
        Vegetal vegetalPimento = new Vegetal(41, "Pimento", Medidas.UNIDADES, 8, OrigemIngrediente.IMPORTADO, PIMENTO);
        Vegetal vegetalCogumelo = new Vegetal(42, "Cogumelo", Medidas.UNIDADES, 2, OrigemIngrediente.IMPORTADO, COGUMELO);
        Vegetal vegetalMilho = new Vegetal(43, "Milho", Medidas.GRAMAS, 1, OrigemIngrediente.NACIONAL, MILHO);
        Vegetal vegetalmolho = new Vegetal(44, "Molho", Medidas.LITROS, 2, OrigemIngrediente.NACIONAL, MOLHO_TOMATE);

        Base baseAlta = new Base(50, "Base Alta", 2, BasePizza.MASSA_ALTA, "Base de massa alta");
        Base baseFina = new Base(51, "Base Fina", 1, BasePizza.MASSA_FINA, "Base de massa fina");

        FrutoMar obj = new Vegetal(50,"4444",Medidas.UNIDADES,2,OrigemIngrediente.NACIONAL,)
        Pizza pizzaMista = new Pizza(12345, "Pizza Mista", "Pizza tradicional", 20, TamanhoPizza.GRANDE);

        pizzaMista.addIngredientePizza(new IngredientePizza(baseAlta, 100));
        pizzaMista.addIngredientePizza(new IngredientePizza(vegetalmolho, 0.1));
        pizzaMista.addIngredientePizza(new IngredientePizza(queijoMozzarela, 100));
        pizzaMista.addIngredientePizza(new IngredientePizza(carneVaca, 100));
        pizzaMista.addIngredientePizza((new IngredientePizza(baseFina, 100)));

        pizzaMista.exbibirDetalhes();

        System.out.println("---------------------------------");

        pizzaMista.removeIngredientesPizza(50);
        pizzaMista.removeIngredientesPizza(10);

        pizzaMista.exbibirDetalhes();

        pizzaMista.determinarTipoPizza();


    }
}
