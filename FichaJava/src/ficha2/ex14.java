package ficha2;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, menor, medio, maior;

        System.out.println("inserir numero 1");
        num1 = input.nextInt();

        System.out.println("inserir numero 2");
        num2 = input.nextInt();

        System.out.println("inserir numero ");
        num3 = input.nextInt();
        System.out.println("c.crescente\nd.decrescente");
        String op;
        op = input.next();
        switch (op) {

            case "c":
                if (num1 <= num2 && num1 <= num3) {
                    menor = num1;
                    if (num2 <= num3) {
                        medio = num2;
                        maior = num3;
                    } else {
                        medio = num3;
                        maior = num2;
                    }

                }
                if (num2 <= num1 && num2 <= num3) {
                    menor = num2;
                    if (num1 <= num3) {
                        medio = num1;
                        maior = num3;
                    } else {
                        medio = num3;
                        maior = num1;
                    }

                }
                if (num3 <= num2 && num3 <= num1) {
                    menor = num3;
                    if (num2 <= num1) {
                        medio = num2;
                        maior = num1;
                    } else {
                        medio = num1;
                        maior = num2;

                        System.out.println(+menor);
                        System.out.println(+medio);
                        System.out.println(+maior);
                        break;

                    }
                }

            case "d":
                if (num1 <= num2 && num1 <= num3) {
                    menor = num1;
                    if (num2 <= num3) {
                        medio = num2;
                        maior = num3;
                    } else {
                        medio = num3;
                        maior = num2;
                    }
                }
                if (num2 <= num1 && num2 <= num3) {
                    menor = num2;
                    if (num1 <= num3) {
                        medio = num1;
                        maior = num3;
                    } else {
                        medio = num3;
                        maior = num1;
                    }

                }
                if (num3 <= num2 && num3 <= num1) {
                    menor = num3;
                    if (num2 <= num1) {
                        medio = num2;
                        maior = num1;
                    } else {
                        medio = num1;
                        maior = num2;

                        System.out.println(+maior);
                        System.out.println(+medio);
                        System.out.println(+menor);
                        break;
                    }
                }
            default:
                System.out.println("opcao errada");
        }
    }
}
