import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        System.out.println("introduzir numero 1:");
        num1 = input.nextDouble();
        System.out.println("introduzir numero 2:");
        num2 = input.nextDouble();
        num1=num2+num1;
        System.out.println("resultado: "+num1);

    }
}
