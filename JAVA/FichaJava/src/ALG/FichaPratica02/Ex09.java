package ALG.FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2,num3;

        System.out.println("inserir numero 1");
        num1= input.nextInt();
        System.out.println("inserir numero 2");
        num2= input.nextInt();
        System.out.println("inserir numero 3");
        num3= input.nextInt();

if (num1<num2 && num1<num3){
    System.out.println("menor numero: " +num1);
}else if (num2<num1 && num2<num3) {
    System.out.println("menor numero: " +num2);
}else{
    System.out.println("menor numero: " +num3);

}
    
}


    }
