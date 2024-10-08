package Controllers;

import Model.Atracao;
import Model.User;
import Model.Venda;
import Repositories.AtracaoRepository;
import Repositories.CustosRepository;
import Repositories.UsersRepository;
import Repositories.VendaRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminController {
    private VendaRepository vr;
    private CustosRepository cr;
    private AtracaoRepository ar;
    private UsersRepository ur;

    public AdminController() {
        this.vr = VendaRepository.getInstance();
        this.cr = CustosRepository.getInstance();
        this.ar = AtracaoRepository.getInstance();
        this.ur = UsersRepository.getInstance();
    }

    private int[][] getBilhetesVendidosPorAtracao() {
        ArrayList<Atracao> atracoes = ar.getAtracaoArray();
        ArrayList<Venda> vendas = vr.getVendasArray();

        int[][] atracoesMaisProcuradas = new int[atracoes.size()][2];
        for (int i = 0; i < atracoes.size(); i++) {

            int id = atracoes.get(i).getId();
            int count = 0;

            for (int j = 0; j < vendas.size(); j++) {

                if (vendas.get(j).getAtracaoId() == id) {
                    count++;
                }
            }
            atracoesMaisProcuradas[i][0] = id;
            atracoesMaisProcuradas[i][1] = count;
        }

        return atracoesMaisProcuradas;
    }

    public int getBilhetesVendidosAtracaoID(int id) {
        int[][] bilhetesPorAtracao = getBilhetesVendidosPorAtracao();

        for (int i = 0; i < bilhetesPorAtracao.length; i++) {
            if (bilhetesPorAtracao[i][0] == id) {
                return bilhetesPorAtracao[i][1];
            }
        }

        return -1;
    }

    public Atracao getAtracaoMaisProcurada() {
        int[][] atracoesMaisProcuradas = getBilhetesVendidosPorAtracao();

        int biggest = atracoesMaisProcuradas[0][1];
        int atracaoId = atracoesMaisProcuradas[0][0];

        for (int i = 0; i < atracoesMaisProcuradas.length; i++) {

            if (atracoesMaisProcuradas[i][1] > biggest) {
                atracaoId = atracoesMaisProcuradas[i][0];
            }
        }

        return getAtracaoID(atracaoId);
    }

    public int[] totalAtracoesPorAdulto() {
        int numAtracoes = ar.getAtracaoArray().size();
        int[] contagemAdultos = new int[numAtracoes];

        for (Venda venda : vr.getVendasArray()) {
            if (venda.getTipoCliente().equalsIgnoreCase("adulto")) {
                contagemAdultos[venda.getAtracaoId() - 1]++;
            }
        }

        return contagemAdultos;
    }

    /**
     * Metodo que vai buscar os bilhetes vendidos de cada atracao a criancas
     *
     * @return array em que a posicao correscponde ao id+1 e o valor aos bilhetes vendiso
     */
    public int[] totalAtracoesPorCrianca() {
        int numAtracoes = ar.getAtracaoArray().size();
        int[] contagemCriancas = new int[numAtracoes];

        for (Venda venda : vr.getVendasArray()) {
            if (venda.getTipoCliente().equalsIgnoreCase("crianca")) {
                contagemCriancas[venda.getAtracaoId() - 1]++;
            }
        }

        return contagemCriancas;
    }

    public Atracao atracaoMaisProcuradaPorAdultos() {
        int[] contagemAdultos = new int[ar.getAtracaoArray().size()];

        for (Venda venda : vr.getVendasArray()) {
            if (venda.getTipoCliente().equalsIgnoreCase("adulto")) {
                contagemAdultos[venda.getAtracaoId() - 1]++;
            }
        }

        int atracaoMaisProcuradaId = -1;
        int maiorBilhetes = 0;

        for (int i = 0; i < contagemAdultos.length; i++) {
            if (contagemAdultos[i] > maiorBilhetes) {
                maiorBilhetes = contagemAdultos[i];
                atracaoMaisProcuradaId = i + 1;
            }
        }

        if (atracaoMaisProcuradaId != -1) {
            return ar.getAtracaoByID(atracaoMaisProcuradaId);
        }

        return null;
    }

    public Atracao atracaoMaisProcuradaPorCriancas() {
        int[] contagemCriancas = new int[ar.getAtracaoArray().size()];

        for (Venda venda : vr.getVendasArray()) {
            if (venda.getTipoCliente().equalsIgnoreCase("crianca")) {
                contagemCriancas[venda.getAtracaoId() - 1]++;
            }
        }

        int atracaoMaisProcuradaId = -1;
        int maiorBilhetes = 0;

        for (int i = 0; i < contagemCriancas.length; i++) {
            if (contagemCriancas[i] > maiorBilhetes) {
                maiorBilhetes = contagemCriancas[i];
                atracaoMaisProcuradaId = i + 1;
            }
        }

        if (atracaoMaisProcuradaId != -1) {
            return ar.getAtracaoByID(atracaoMaisProcuradaId);
        }

        return null;
    }


    public double calcularTotalVendas() {
        double totalVendas = 0;
        Map<Integer, ArrayList<Double>> precoAtracaoPorBilhete = getAtracaoPorPrecoTipoBilhete();

        for (Venda venda : vr.getVendasArray()) {
            double precoBilhete = precoAtracaoPorBilhete.get(venda.getAtracaoId())
                    .get(venda.getTipoCliente().equalsIgnoreCase("adulto") ? 0 : 1);

            totalVendas += precoBilhete;
        }

        return totalVendas;
    }

    public double calcularTotalLucro() {
        Map<String, Double> lucroPorMes = totalLucroPorMes();

        double totalLucro = 0;
        for (double lucro : lucroPorMes.values()) {
            totalLucro += lucro;
        }

        return totalLucro;
    }


    /**
     * Metodo que calcula o lucro por mes tendo em conta os custos associados
     *
     * @return Mapa com a data como chave e o respetivo lucro como valor
     */
    public Map<String, Double> totalLucroPorMes() {
        Map<String, Double> lucroPorMes = new HashMap<>();
        Map<Integer, ArrayList<Double>> precoAtracaoPorBilhete = getAtracaoPorPrecoTipoBilhete();

        for (Venda v : vr.getVendasArray()) {
            double precoVenda = precoAtracaoPorBilhete.get(v.getAtracaoId())
                    .get(v.getTipoCliente().equalsIgnoreCase("adulto") ? 0 : 1);

            double lucroVenda = precoVenda - cr.getCustoById(v.getAtracaoId()).getCustoManutencao();

            String dataMes = v.getData();

            if (!lucroPorMes.containsKey(dataMes)) {
                double custoFixoMesTotal = cr.getTotalCustoFixoMes();
                lucroPorMes.put(dataMes, custoFixoMesTotal * -1);
            }
            lucroPorMes.put(dataMes, lucroPorMes.get(dataMes) + lucroVenda);
        }

        return lucroPorMes;

    }

    private Map<Integer, ArrayList<Double>> getAtracaoPorPrecoTipoBilhete() {
        Map<Integer, ArrayList<Double>> precoAtracaoPorBilhete = new HashMap<>();

        for (Atracao a : ar.getAtracaoArray()) {
            ArrayList<Double> precoAdultoCrianca = new ArrayList<>();
            precoAdultoCrianca.add(a.getPrecoAdulto());
            precoAdultoCrianca.add(a.getPrecoCrianca());
            precoAtracaoPorBilhete.put(a.getId(), precoAdultoCrianca);
        }

        return precoAtracaoPorBilhete;
    }

    public Atracao getAtracaoID(int id) {
        return ar.getAtracaoByID(id);
    }


    public boolean addUser(String tipoUtilizador, String userName, String password) {
        User newUser = new User(tipoUtilizador, userName, password);

        return ur.addUser(newUser);
    }

    public boolean saveUsers() {
        return ur.saveUsers();
    }

    public void atracaoMaisLucrativa() {
        int[] atracoesAdultos = totalAtracoesPorAdulto();
        double[][] lucroPorAtracaoAdulto = new double[ar.getAtracaoArray().size()][2];
        for (int i = 0; i < ar.getAtracaoArray().size(); i++) {
            double id = ar.getAtracaoArray().get(i).getId();
            double lucroBilhete = ar.getAtracaoArray().get(i).getPrecoAdulto() - cr.getListaCustos().get(i).getCustoManutencao();
            double custoMes = cr.getListaCustos().get(i).getCustosFixos() * 3;

            lucroPorAtracaoAdulto[i][0] = id;
            lucroPorAtracaoAdulto[i][1] = (atracoesAdultos[i] * lucroBilhete) - custoMes;

        }
        int[] atracoesCriancas = totalAtracoesPorCrianca();
        double[][] lucroPorAtracaoCrianca = new double[ar.getAtracaoArray().size()][2];
        for (int i = 0; i < ar.getAtracaoArray().size(); i++) {
            double id = ar.getAtracaoArray().get(i).getId();
            double lucroBilhete = ar.getAtracaoArray().get(i).getPrecoCrianca() - cr.getListaCustos().get(i).getCustoManutencao();
            double custoMes = cr.getListaCustos().get(i).getCustosFixos() * 3;
            for (int j = 0; j < atracoesCriancas.length; j++) {
                if (i == j) {
                    System.out.println(lucroBilhete + "  " + custoMes + " " + atracoesCriancas[i] + " " + id);
                }
                lucroPorAtracaoCrianca[i][0] = id;
                lucroPorAtracaoCrianca[i][1] = (atracoesCriancas[i] * lucroBilhete) - custoMes;

            }
            double[][] atracaoMaisLucrativa = new double[ar.getAtracaoArray().size()][2];
            for (int z = 0; z < atracaoMaisLucrativa.length; z++) {
                atracaoMaisLucrativa[z][0] = ar.getAtracaoArray().get(z).getId();
                atracaoMaisLucrativa[z][1] = lucroPorAtracaoAdulto[z][1] + lucroPorAtracaoCrianca[z][1];
            }

        }
    }
    public static class AtracaoController {


        public Atracao atracaoMelhorPrecoSegundo(List<Atracao> atracoes) {
            Atracao melhorAtracao = null;
            double menorCustoPorSegundo = Double.MAX_VALUE;
            for (Atracao atracao : atracoes) {
                double custoPorSegundo = atracao.getPrecoAdulto() + atracao.getPrecoCrianca() / atracao.getDuracaoSegundos();
                if (custoPorSegundo < menorCustoPorSegundo) {
                    menorCustoPorSegundo = custoPorSegundo;
                    melhorAtracao = atracao;
                }
            }
            return melhorAtracao;
        }
    }
}
