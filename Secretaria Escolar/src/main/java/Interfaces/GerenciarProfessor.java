package Interfaces;
import Pessoas.*;
public interface GerenciarProfessor {
    void cadastroProfessor(Professor cadProfessor);

    void listarProfessor();

    void buscarProfessor(String idFunc);

    void alterarProfessor(String idFunc);

    void removerProfessor(String idFunc);
}
