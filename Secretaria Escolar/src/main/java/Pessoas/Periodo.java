package Pessoas;
import Pessoas.Disciplina;

import java.util.ArrayList;

public class Periodo {
    int idPeriodo;
    ArrayList<Disciplina> disciplinas_periodo = new ArrayList<>();
    public Periodo(int idPeriodo, ArrayList<Disciplina> disciplinas_periodo){
        this.idPeriodo = idPeriodo;
        this.disciplinas_periodo = disciplinas_periodo;
    }

    public Periodo() {

    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas_periodo) {
        this.disciplinas_periodo = disciplinas_periodo;

    }
    public int getIdPeriodo(){
        return idPeriodo;
    }
    public void setIdPeriodo(int idPeriodo){
        this.idPeriodo = idPeriodo;
    }
    public ArrayList<Disciplina> getDisciplinas(){
        return disciplinas_periodo;
    }

    @Override
    public String toString() {
        return "Periodo" + idPeriodo;
    }
}
