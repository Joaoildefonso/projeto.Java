import java.util.ArrayList;
import java.util.List;

public class ServicoDAO {


    private List<Servico> Servico;

    public ServicoDAO(){
        this.Servico = new ArrayList<>();
    }


    public boolean removerServico(Servico servico) {
        return Servico.remove(servico);
    }


    public List<Servico> obterTodosServico() {
        return new  ArrayList<>(Servico);
    }


    public Servico buscarPorNome(String nomeServico) {
        for (Servico servico : Servico) {
            if (servico.getNomeServico().equals(nomeServico)) {
                return servico;
            }
        }
        return null;
    }
}
