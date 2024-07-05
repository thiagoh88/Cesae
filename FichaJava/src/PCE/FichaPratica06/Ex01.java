package PCE.FichaPratica06;

import java.util.Scanner;

public class Ex01 {

    public static void fazerBarulho(String animal) {

        animal = animal.toLowerCase();

        switch (animal) {
            case "cão":
            case "CÃO":
                System.out.println("au");
                break;
            case "gato":
                System.out.println("miau");
                break;
            case "peixe":
                System.out.println("glub");
                break;
            case "vaca":
                System.out.println("mu");
                break;
            case "porco":
                System.out.println("oinc");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String animalEscolhido;
        while (true) {
            System.out.print("introduzir um animal");
            animalEscolhido = input.next();

            fazerBarulho(animalEscolhido);
        }

    }
}
