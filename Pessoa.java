import java.util.ArrayList;

public class Pessoa {

    protected String nome;
    protected String CPF;
    protected String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public static void adiciona(Pessoa p) {
    }

    public static ArrayList<Pessoa> listarPessoa() {
        return null;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String next) {
        this.CPF = CPF;
    }
}
