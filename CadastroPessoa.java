
import java.util.ArrayList;

public class CadastroPessoa {

    private PessoaDAO pessoaDAO = new PessoaDAO();

    public <PessoaDAO> CadastroPessoa(PessoaDAO pessoaDAO) {
        this.pessoaDAO = pessoaDAO;
    }

    public void cadastrarPessoa_comBanco(Pessoa p) {
        pessoaDAO.adiciona(p);
        System.out.println("cadastrada com sucesso!");
    }

    public void listar_com_banco(){
        ArrayList<Pessoa> pessoa = pessoaDAO.listarPessoas();
        for (Pessoa p : pessoa) {
            System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade());
        }
    }
}