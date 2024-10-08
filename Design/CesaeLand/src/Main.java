import Controllers.AdminController;
import Model.Atracao;
import Model.User;
import Model.Venda;
import Repositories.AtracaoRepository;
import Repositories.UsersRepository;
import Repositories.VendaRepository;
import Views.AdminView;
import Views.LoginView;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        AtracaoRepository atracaoRepository = new AtracaoRepository();
        List<Atracao> atracoes = atracaoRepository.getAtracoes();
        AdminController.AtracaoController controller = new AdminController.AtracaoController();
        Atracao melhorAtracao = controller.atracaoMelhorPrecoSegundo(atracoes);
        AdminView.AtracaoView view = new AdminView.AtracaoView();
        view.AtracaoComMelhorPreco(melhorAtracao);
    }
    }

