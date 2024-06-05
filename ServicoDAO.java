import java.util.ArrayList;

public class ServicoDAO {


    private List<Servico> servico;

    public ServicoDAO(){
        this.servicos = new ArrayList<>();
    }


    public boolean removerServico(Servico servico) {
        return servico.remove(servico);
    }


    public List<Servico> obterTodosServicos() {
        return new  ArrayList<>(servico);
    }


    public Servico buscarPorNome(String nomeServico) {
        for (Servico servico : servicos) {
            if (servico.getNomeServico().equals(nomeServico)) {
                return servico;
            }
        }
        return null;
    }
}
