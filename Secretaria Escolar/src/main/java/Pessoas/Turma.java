package Pessoas;

import java.util.ArrayList;

public class Turma {
    private int qtdAlunos;
    private String idTurma;
    ArrayList<Aluno> alunos = new ArrayList<>();
    Curso curso = new Curso();
    public Turma(String idTurma){
        this.idTurma = idTurma;

    }
    public Turma(){
        super();
    }
    public String getIdTurma(){
        return idTurma;
    }
    public void setIdTurma(String idTurma){
        this.idTurma = idTurma;
    }
    public int getQtdAlunos(){
        return qtdAlunos;
    }
    public void setQtdAlunos(int qtdAlunos){
        this.qtdAlunos = qtdAlunos;
    }

    }

