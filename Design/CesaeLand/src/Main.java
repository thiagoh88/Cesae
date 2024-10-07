import Model.Atracao;
import Model.User;
import Model.Venda;
import Repositories.AtracaoRepository;
import Repositories.UsersRepository;
import Repositories.VendaRepository;
import Views.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView lv = new LoginView();
        lv.menu();
    }
}
