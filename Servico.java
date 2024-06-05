public class Servico {

    public class Servico {

        // Variáveis de instância da classe
        private String nomeServico;
        private double preco;

        // Construtor
        public Servico(String nomeServico, double preco) {
            this.nomeServico = nomeServico;
            this.preco = preco;
        }

        // Métodos getters e setters
        public String getNomeServico() {
            return nomeServico;
        }

        public void setNomeServico(String nomeServico) {
            this.nomeServico = nomeServico;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        // Método para descrever o serviço
        public void descrever() {
            System.out.println("Serviço: " + nomeServico + " - Preço: R$" + preco);
        }
    }

}
