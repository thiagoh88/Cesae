package ficha3;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, salto, inicio = 0;

        System.out.println("limite");
        limite = input.nextInt();
        System.out.println("salto");
        salto = input.nextInt();

        while (inicio <= limite) {

            System.out.println(inicio);
            inicio = inicio + salto;
        }
    }
}
