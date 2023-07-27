package Interfaces;

import Pessoas.Turma;

public interface GerenciarTurma {
    void cadastroTurma(Turma cadTurma);
    void listarTurma();
    Turma buscarTurma(String idTurma);
    void alterarTurma(String idTurma);
    void removerTurma(String idTurma);
}
