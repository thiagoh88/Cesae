package Controllers;

import Model.Atracao;
import Repositories.AtracaoRepository;

public class ClientController {
    private AtracaoRepository atracaoRepository;

    public ClientController() {
        this.atracaoRepository = AtracaoRepository.getInstance();
    }

    public String consultarAtracao() {
        String mensagem = "";
        for (Atracao atracao : atracaoRepository.getAtracaoArray()) {
            mensagem = mensagem + "\n*** " + atracao.getNome() + " ***" + "\n" + "Preço para Criança: " + atracao.getPrecoCrianca() + "\n" + "Preço para Adulto: " + atracao.getPrecoAdulto() + "\n";
            int duracaoSegundos = atracao.getDuracaoSegundos();
            int minutos = duracaoSegundos / 60;
            int segundos = duracaoSegundos % 60;
            mensagem = mensagem + "Duração (em formato min:seg): " + minutos + ":" + (segundos < 10 ? "0" + segundos : segundos) + "\n";
        }

        return mensagem;
    }
}