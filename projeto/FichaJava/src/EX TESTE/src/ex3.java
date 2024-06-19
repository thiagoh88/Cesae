import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, area;

        System.out.println("insira numero");
        num1 = input.nextDouble();
        System.out.println("outro");
        num2 = input.nextDouble();

        area = num1 * num2;
        System.out.println("area" + area);
        num1 = 21*(num1+num2);
        System.out.println("perimetro"+num1);
    }
}
