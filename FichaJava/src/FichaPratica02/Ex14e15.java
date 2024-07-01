package FichaPratica02;

import java.util.Scanner;

public class Ex14e15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // verificar se num1 é o menor
        int num1, num2, num3, menor, medio, maior;

        System.out.println("insira o primeiro numero: ");
        num1 = input.nextInt();
        System.out.println("insira o segundo numero: ");
        num2 = input.nextInt();
        System.out.println("insira o terceiro numero: ");
        num3 = input.nextInt();


        System.out.println("Selecionar a opção desejada:\n c. Crescente\n d. Decrescente");
        String op;
        op = input.next();
        switch (op) {

            case "c":
                // verificar se num1 é o menor
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
                // codigo crescente:

                // verificar se num1 é o menor
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
                System.out.println("Opcao errada");
        }


    }
}



