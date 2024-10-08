import Model.Atracao;
import Model.User;
import Model.Venda;
import Repositories.AtracaoRepository;
import Repositories.UsersRepository;
import Repositories.VendaRepository;
import Views.LoginView;
interface Produto{
    void exibirInfo();
}
class ProdutoA implements  Produto{

    @Override
    public void exibirInfo() {
        System.out.println("A");
    }
}

class ProdutoB implements Produto {

    @Override
    public void exibirInfo() {
        System.out.println("B");
    }
}

interface Fabricas {
    Produto criarProduto();
}

class FabricaProdutoA implements Fabricas {

    @Override
    public Produto criarProduto() {
        return new ProdutoA();
    }
}

class FabricaProdutoB implements Fabricas {

    @Override
    public Produto criarProduto() {
        return new ProdutoB();
    }
}

public class Main {

    public static void main(String[] args) {
        Fabricas fabricaB = new FabricaProdutoB();
        Produto produtoB = fabricaB.criarProduto();
        produtoB.exibirInfo();
        Fabricas fabricaA = new FabricaProdutoA();
        Produto produtoA = fabricaA.criarProduto();
        produtoA.exibirInfo();
    }
}
