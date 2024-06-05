public class ServicoDAO {

    // Esta lista simula uma base de dados em memória
    private List<Servico> servico;

    public ServicoDAO() {
        this.servicos = new ArrayList<>();
    }

    // Método para adicionar um serviço
    public void adicionarServico(Servico servico) {
        servico.add(servico);
    }

    // Método para remover um serviço
    public boolean removerServico(Servico servico) {
        return servico.remove(servico);
    }

    // Método para obter todos os serviços
    public List<Servico> obterTodosServicos() {
        return new ArrayList<>(servico);
    }

    // Método para buscar um serviço pelo nome
    public Servico buscarPorNome(String nomeServico) {
        for (Servico servico : servicos) {
            if (servico.getNomeServico().equals(nomeServico)) {
                return servico;
            }
        }
        return null; // ou lançar uma exceção se preferir
    }
}
