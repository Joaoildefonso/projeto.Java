import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        int servico = 30;


        Connection conexao = null;
        try {
            conexao = GeraConexao();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        if (conexao != null) {
            switch (servico) {
                case 1:
                    System.out.println("Cadastrar ");

                    break;
                case 2:
                    System.out.println("Efetuar login");

                    break;
                case 3:
                    System.out.println("Escolher serviço");

                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } else {
            System.out.println("Não foi possível estabelecer uma conexão com o banco de dados.");
        }
    }

    public static Connection GeraConexao() throws SQLException {
        Connection conexao = null;

        String url = "jdbc:mysql://localhost:3306/lavanderia"; // ou "jdbc:mysql://localhost:3306/lavanderia1";
        String usuario = "root";
        String senha = "F@ce2727";
        conexao = DriverManager.getConnection(url, usuario, senha);
        System.out.println("Conexão realizada com sucesso.");
        return conexao;
    }
}
