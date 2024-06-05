public class Servico {

    public class Servico {


        private String nomeServico;
        private double preco;


        public Servico(String nomeServico, double preco) {
            this.nomeServico = nomeServico;
            this.preco = preco;
        }


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

        
        public void descrever() {
            System.out.println("Serviço: " + nomeServico + " - Preço: R$" + preco);
        }
    }

}
