package PCE.FichaPratica06;

public class Ex05_metodoVetor {

    /**
     * Método para encontrar o maior vetor
     *
     * @param vetor array a ser analisado
     * @return maior valor
     */
    public static int maior(int[] vetor) {

        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    /**
     * Método para encontrar o menor vetor
     *
     * @param vetor array a ser analisado
     * @return menor valor
     */
    public static int menor(int[] vetor) {

        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    /**
     * Método para verificar se é crescente
     *
     * @param vetor
     * @return não sei
     */
    public static boolean crescente(int[] vetor) {
        boolean crescente = true;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                crescente = false;
            }
        }
        return true;
    }
}




