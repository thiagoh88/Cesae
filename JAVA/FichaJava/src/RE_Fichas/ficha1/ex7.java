package RE_Fichas.ficha1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double prod1, prod2, prod3, desc;

        System.out.println("produto 1");
        prod1 = input.nextDouble();
        System.out.println("produto 2");
        prod2 = input.nextDouble();
        System.out.println("produto 3");
        prod3 = input.nextDouble();

        desc=(prod1+prod2+prod3)*0.1;
        prod1=(prod1+prod2+prod3)-desc;

        System.out.println("total com 10% de desconto: " + prod1);


    }
}
