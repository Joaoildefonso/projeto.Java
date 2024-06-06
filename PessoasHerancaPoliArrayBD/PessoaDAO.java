package PessoasHerancaPoliArrayBD;
import BancoDeDados.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    private Connection connection;

    public PessoaDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarPessoa(Pessoa pessoa) throws SQLException {
        String sql = "INSERT INTO pessoas (nome, cpf, email) VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, pessoa.getNome());
        statement.setString(2, pessoa.getCpf());
        statement.setString(3, pessoa.getEmail());
        statement.executeUpdate();
    }

    public List<Pessoa> getPessoas() throws SQLException {
        String sql = "SELECT * FROM pessoas";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Pessoa> pessoas = new ArrayList<>();
        while (resultSet.next()) {
            Pessoa pessoa = new Pessoa();
            pessoa.setId(resultSet.getInt("id"));
            pessoa.setNome(resultSet.getString("nome"));
            pessoa.setCpf(resultSet.getString("cpf"));
            pessoa.setEmail(resultSet.getString("email"));
            pessoas.add(pessoa);
        }
        return pessoas;
    }

    public Pessoa getPessoaById(int id) throws SQLException {
        String sql = "SELECT * FROM pessoas WHERE id =?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        Pessoa pessoa = null;
        if (resultSet.next()) {
            pessoa = new Pessoa();
            pessoa.setId(resultSet.getInt("id"));
            pessoa.setNome(resultSet.getString("nome"));
            pessoa.setCpf(resultSet.getString("cpf"));
            pessoa.setEmail(resultSet.getString("email"));
        }
        return pessoa;
    }

    public void atualizarPessoa(Pessoa pessoa) throws SQLException {
        String sql = "UPDATE pessoas SET nome =?, cpf =?, email =? WHERE id =?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, pessoa.getNome());
        statement.setString(2, pessoa.getCpf());
        statement.setString(3, pessoa.getEmail());
        statement.setInt(4, pessoa.getId());
        statement.executeUpdate();
    }

    public void deletarPessoa(int id) throws SQLException {
        String sql = "DELETE FROM pessoas WHERE id =?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }
}