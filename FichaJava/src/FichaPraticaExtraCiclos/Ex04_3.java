package FichaPraticaExtraCiclos;

public class Ex04_3 {
    public static void main(String[] args) {
        int altura = 5;

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
