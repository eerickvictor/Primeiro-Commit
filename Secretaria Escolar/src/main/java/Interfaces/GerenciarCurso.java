package Interfaces;
import Pessoas.Curso;
public interface GerenciarCurso {
    void cadastroCurso(Curso cadCurso);
    void listarCurso();
    Curso buscarCurso(String idCurso);
    void alterarCurso(String idCurso);
    void deletarCurso(String idCurso);
}
