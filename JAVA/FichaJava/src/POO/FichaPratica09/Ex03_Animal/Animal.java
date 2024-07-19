package POO.FichaPratica09.Ex03_Animal;

public class Animal {
    private String nome;
    private String especie;
    private String origem;
    private double peso;
    private Alimentos[] comida;

    public Animal(String nome, String especie, String origem, double peso, Alimentos[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.origem = origem;
        this.peso = peso;
        this.comida = alimentacao;
    }

    public void addComida(Alimentos comidaNova) {
        for (int i = 0; i < this.comida.length; i++) {
            if (this.comida[i] == null) {
                this.comida[i]=comidaNova;
                return;

            }
        }

    }

    public void animalComer(Alimentos alimento, double peso) {

        for (int i = 0; i < this.comida.length; i++) {
            if (comida[i].equals(alimento)) {
                peso = peso / 1000;
                this.peso += peso;
                System.out.println("O animal comeu!"+"seu peso: "+this.peso+"kg");
                return;
            }
        }

        System.out.println("Recusou");

    }
}

