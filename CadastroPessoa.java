
import java.util.ArrayList;

public class CadastroPessoa {

    public CadastroPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void CadastroPessoa_comBanco(Pessoa p) {
        Pessoa.adiciona(p);
        System.out.println("cadastrada com sucesso!");
    }

    private Pessoa pessoa;

    public void listar_com_Banco() {
        ArrayList<Pessoa> pessoa = Pessoa.listarPessoa();
        for (Pessoa p : pessoa) {
            System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getClass());
        }
    }
}

