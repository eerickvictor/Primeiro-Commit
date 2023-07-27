package Interfaces;
import Pessoas.*;
public interface GerenciarAluno {
    void cadastroAluno(Aluno cadAluno);
    void listarAluno();
    void buscarAluno(String cadAluno);
    void alterarAluno(String matricula);
    void loginAluno();
    void removerAluno(String matricula);
}
