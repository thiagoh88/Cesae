package PCE.FichaPratica06;

public class Ex07 {

    public static void imprimirMoldura(String caracter, int linha, int coluna) {

            //primeira linha
        for (int i = 0; i < coluna; i++)
        {
            System.out.println(caracter);
        }

            //linhas do meio
        for (int linhaAtual = 0; linhaAtual < linha - 2; linhaAtual++)
        {

            //caracter inicial
            System.out.println(caracter);

            //imprimir espaços do meio
            for (int colunaAtual = 0; colunaAtual < coluna - 2; colunaAtual++)
            {
                System.out.println(" ");
            }

            //caracter final
            System.out.println(caracter);
        }
            //ultima linha
        for (int i = 0; i < coluna; i++)
        {
            System.out.println(caracter);
        }
        }

    public static void main(String[] args) {



    }
    }

