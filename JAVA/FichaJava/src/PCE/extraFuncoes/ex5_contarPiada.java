package PCE.extraFuncoes;

import java.util.Scanner;

public class ex5_contarPiada {

    public static String contarPiada(int piada) {

        String[] bibliotecaPiadas = new String[4];

        bibliotecaPiadas[0] = "Que nome se dá a uma ferramenta perdida? Foice";
        bibliotecaPiadas[1] = "O que 17 alentejanos fazem em frente ao cinema? À espera que chege mais um porque o filme é para mais de 18.";
        bibliotecaPiadas[2] = "Qual é a panela que está sempre triste? A panela depressão.";
        bibliotecaPiadas[3] = "O que acontece se o Pai Natal morrer? Ele não estará mais em trenós.";

        return bibliotecaPiadas[piada];

    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("insira numero 0-3 para ler uma piada");
        int numPiada= input.nextInt();

        System.out.println(contarPiada(numPiada));
    }

}


