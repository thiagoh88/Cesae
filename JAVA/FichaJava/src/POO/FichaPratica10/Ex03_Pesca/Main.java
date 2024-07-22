package POO.FichaPratica10.Ex03_Pesca;

public class Main {
    public static void main(String[] args) {
        Peixe salmao = new Peixe("salmao", 200, 15);
        Peixe bacalhau = new Peixe("bacalhau", 400, 20);
        Peixe sardinha = new Peixe("sardinha", 100, 5);

        Marisco ostra = new Marisco("ostra", 100, 45);
        Marisco lula = new Marisco("lula", 300, 15);
        Marisco caracois = new Marisco("caracois", 100, 10);

        BarcoPesca pescaria1 = new BarcoPesca("Orfeuzinho", "Amarelo", "1980", 5, 1500,Marca.SAVER);
        BarcoPesca pescaria2 = new BarcoPesca("Jubileu", "Vermelho", "2000", 3, 500,Marca.DEVLIN);

        pescaria1.pescarPeixe(salmao);
        pescaria1.pescarPeixe(bacalhau);
        pescaria1.pescarMarisco(ostra);
        pescaria1.pescarMarisco(lula);
        pescaria1.barcoDetalhes();
        System.out.println();
        pescaria1.exibirPescaria();

        System.out.println("Valor Total das Pescaria: "+pescaria1.calcularTotal()+" €");
    }
}
