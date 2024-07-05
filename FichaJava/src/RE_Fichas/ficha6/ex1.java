package RE_Fichas.ficha6;

import java.util.Scanner;

public class ex1 {

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
            default:
                System.out.println("invalido");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

       String animalEscolhido;
       while (true){
           System.out.println("introduzir animal");
           animalEscolhido=input.next();

           fazerBarulho(animalEscolhido);
       }
    }
}
