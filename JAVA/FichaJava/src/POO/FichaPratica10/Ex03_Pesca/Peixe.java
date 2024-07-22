package POO.FichaPratica10.Ex03_Pesca;

public class Peixe {
    private String especie;
    private double peso;
    private double precoKg;

    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    public Peixe(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    public void exibirPeixe() {
        System.out.println("Especie: " + this.especie + "\t| Peso: " + this.peso + "\t| Preço/KG: " + this.precoKg+"€");
    }
}
