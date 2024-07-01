package RE_Fichas.ficha3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade,x=1;
        String mensagem;

        System.out.println("inserir um numero");
        quantidade = input.nextInt();
        System.out.println("mensagem:");
        input.nextLine();
        mensagem = input.nextLine();
        System.out.println(mensagem);

while (x<quantidade){

    System.out.println(mensagem);
    x++;
}

    }

}
