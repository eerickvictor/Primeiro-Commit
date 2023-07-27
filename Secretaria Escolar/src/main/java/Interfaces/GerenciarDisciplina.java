package Interfaces;

import Pessoas.Disciplina;

import java.util.ArrayList;

public interface GerenciarDisciplina {
    void cadastroDisciplina(Disciplina cadDisciplina);
    void listarDisciplina();
    void registrarNotas();
    ArrayList<Disciplina> getDisciplinas();
}
