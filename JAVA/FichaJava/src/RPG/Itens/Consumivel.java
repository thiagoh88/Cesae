package RPG.Itens;

import java.util.ArrayList;

public abstract class Consumivel extends ItemHero {

    public Consumivel(String nome, int preco, ArrayList<String> heroisPermitidos) {
        super(nome, preco, heroisPermitidos);
    }
}

