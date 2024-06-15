package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduzir hora");
        num1 = input.nextInt();
        System.out.println("introduzir minutos");
        num2 = input.nextInt();

        if (num1 <= 12) {
            System.out.println(+num1+":"+num2+"AM");
        } else if (num1 == 13) {
            System.out.println("1:" + num2 + "PM");
        } else if (num1 == 14) {
            System.out.println("2:" + num2 + "PM");
        } else if (num1 == 15) {
            System.out.println("3:" + num2 + "PM");
        } else if (num1 == 16) {
            System.out.println("4:" + num2 + "PM");
        } else if (num1 == 17) {
            System.out.println("5:" + num2 + "PM");
        } else if (num1 == 18) {
            System.out.println("6:" + num2 + "PM");
        } else if (num1 == 19) {
            System.out.println("7:" + num2 + "PM");
        } else if (num1 == 20) {
            System.out.println("8:" + num2 + "PM");
        } else if (num1 == 21) {
            System.out.println("9:" + num2 + "PM");
        } else if (num1 == 22) {
            System.out.println("10:" + num2 + "PM");
        } else if (num1 == 23) {
            System.out.println("11:" + num2 + "PM");
        } else if (num1 == 24) {
            System.out.println("12:" + num2 + "PM");
        }
    }
}
