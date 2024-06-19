import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;

        System.out.println("inrerir numero");
        num1 = input.nextDouble();
        System.out.println("outro numero");
        num2 = input.nextDouble();
        String op;
        System.out.println("1 soma 2 subtracao");
        op = input.next();
        switch (op) {
            case "1":
                num1 = num1 + num2;
                System.out.println("soma: " + num1);

            case "2":
                num1 = num1 - num2;
                System.out.println("subtracao:" + num1);
        }

    }
}
