package POO.FichaPratica09.Ex03_Animal;

import static POO.FichaPratica09.Ex03_Animal.Alimentos.CAVIAR;
import static POO.FichaPratica09.Ex03_Animal.Alimentos.LIXO;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Doggo", "caramelo", "mundo", 10, new Alimentos[]{LIXO, Alimentos.CARNE});
        Animal fancyDog = new Animal("lady", "cara", "buckingham", 5, new Alimentos[]{Alimentos.CAVIAR});

        dog.animalComer(CAVIAR,500);
        System.out.println("--------------------------");
        dog.animalComer(LIXO,500);
    }


}
