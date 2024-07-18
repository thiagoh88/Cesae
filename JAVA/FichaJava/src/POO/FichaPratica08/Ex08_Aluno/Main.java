package POO.FichaPratica08.Ex08_Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("insira a media");
        double num = input.nextDouble();
        Aluno aluno = new Aluno("Zequinha", 18, "Soft Dev", num);
        //duas formas
        Aluno aluno1=new Aluno("jão", 19, "culinaria",8);
        System.out.println("Zequinha: " +aluno.situacao());
        System.out.println("Jão: " +aluno1.situacao());

    }
}
