package ALG.FichaPratica03;

public class Ex07 {
    public static void main(String[] args) {

        int x = 1, soma = 0;

        while (x <= 100)
        {
            System.out.println(+x);
            soma = soma + x;
            //x=x+1
            x++;
        }

        System.out.println("Total: " + soma);
    }
}
