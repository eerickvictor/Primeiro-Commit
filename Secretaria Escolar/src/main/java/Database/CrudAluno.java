package Database;

import Pessoas.Aluno;
import Pessoas.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CrudAluno {
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    private static Connection conn = null;

    public static PreparedStatement jorge(String sql) throws Exception {
        conn = Conexao.getConexao();
        ps = conn.prepareStatement(sql);

        return ps;
    }

    public static void cadastrarAluno(Aluno aluno) throws Exception{
        String sql = "INSERT INTO aluno (nome, matricula, sexo, email, dataNascimento, status, faltas, media) VALUES (?, ?, ?, ?, ?, ?, ?)";

        ps = jorge(sql);
        ps.setString(1, aluno.getNome());
        ps.setString(2, aluno.getMatricula());
        ps.setString(3, String.valueOf(aluno.getSexo()));
        ps.setString(4, aluno.getEmail());
        ps.setString(5, aluno.getData_nascimento());
        ps.setString(6, aluno.getStatus());
        ps.setString(7, String.valueOf(aluno.getFaltas()));
        ps.setString(8, String.valueOf(aluno.getMedia()));

        conn.close();
    }

    public static List<Aluno> alunos(Aluno aluno) throws Exception {
        List<Aluno> alunos = null;
        String sql = "SELECT * from aluno";

        ps = jorge(sql);

        alunos = new ArrayList<Aluno>();
        rs = ps.executeQuery();

        while (rs.next()) {
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getMatricula());
            ps.setString(3, String.valueOf(aluno.getSexo()));
            ps.setString(4, aluno.getEmail());
            ps.setString(5, aluno.getData_nascimento());
            ps.setString(6, aluno.getStatus());
            ps.setString(7, String.valueOf(aluno.getFaltas()));
            ps.setString(8, String.valueOf(aluno.getMedia()));
            alunos.add(aluno);
        }

        conn.close();
        return alunos;
    }
    public static void alterarAluno(Aluno aluno) throws Exception{
        String sql = "UPDATE aluno SET nome=?, matricula=?, sexo=?, email=?, data_nascimento=?, status=?, faltas=?, media=? WHERE matricula=?";

        ps = jorge(sql);
        ps.setString(1, aluno.getNome());
        ps.setString(2, aluno.getMatricula());
        ps.setString(3, String.valueOf(aluno.getSexo()));
        ps.setString(4, aluno.getEmail());
        ps.setString(5, aluno.getData_nascimento());
        ps.setString(6, aluno.getStatus());
        ps.setString(7, String.valueOf(aluno.getFaltas()));
        ps.setString(8, String.valueOf(aluno.getMedia()));
        ps.executeUpdate();

        conn.close();
    }
    public static void excluirAluno(Aluno aluno) throws Exception{
        String sql = "DELETE FROM aluno WHERE matricula=?";

        ps = jorge(sql);
        ps.setString(1, aluno.getMatricula());
        ps.executeUpdate();

        conn.close();
    }
}
