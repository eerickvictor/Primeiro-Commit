package Pessoas;

import java.util.ArrayList;
import java.util.List;

public class Curso{
    private String idCurso, nome, area, disciplina, codigoDisciplina;
    private double  mensalidade, notaBase;
    private int qtdPeriodo;
    private List<Curso> alunos;
        ArrayList<Periodo> periodos_curso = new ArrayList<>();
    public Curso(String idCurso, String nome, String area, int qtdPeriodo, double mensalidade, double notaBase, ArrayList<Periodo> periodos_curso){
        this.idCurso = idCurso;
        this.nome = nome;
        this.area = area;
        this.qtdPeriodo = qtdPeriodo;
        this.mensalidade = mensalidade;
        this.periodos_curso = periodos_curso;
    }
    public Curso(){
        super();
    }
    public String getIdCurso(){
        return idCurso;
    }
    public void setIdCurso(String idCurso){
        this.idCurso = idCurso;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String area){
        this.area = area;
    }
    public int getQtdPeriodo() {
        return qtdPeriodo;
    }
    public void setQtdPeriodo(int qtdPeriodo){
        this.qtdPeriodo = qtdPeriodo;
    }
    public double getMensalidade(){
        return mensalidade;
    }
    public void setMensalidade(double mensalidade){
        this.mensalidade = mensalidade;
    }
    public double getNotaBase(){
        return notaBase;
    }
    public void setNotaBase(double notaBase){
        this.notaBase = this.notaBase;
    }

    public void setPeriodos(ArrayList<Periodo> periodos_curso){
        this.periodos_curso = periodos_curso;
    }
    public ArrayList<Periodo> getPeriodos() {
        return periodos_curso;
    }
    public void Disciplinas(){

    }
    @Override
    public String toString(){
        return "\nid do Curso: " + getIdCurso() + "\nNome: " + getNome() + "\nArea: " + getArea() + "\nPeriodo: " + getQtdPeriodo() + "\nValor da Mensalidade: " + getMensalidade();
    }
}
