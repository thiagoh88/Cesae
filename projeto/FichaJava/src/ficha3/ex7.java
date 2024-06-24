package ficha3;

public class ex7 {
    public static void main(String[] args) {

        int inicio = 1, soma = 0;

        while (inicio <= 100) {
            soma = soma + inicio;
            System.out.println(inicio++);
        }
        System.out.println(soma);
    }
}
