package ficha3;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        int num,inicio,fim;

        System.out.println("inserir numero");
        num= input.nextInt();

        inicio=num-5;
        while (inicio<num)
        {
            System.out.println(inicio);
            inicio++;
        }
        fim=num+5;
        while (num<fim)
        {
            num++;
            System.out.println(num);
        }
    }
}
