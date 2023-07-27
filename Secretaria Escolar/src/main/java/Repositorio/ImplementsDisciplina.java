package Repositorio;

import Pessoas.*;

import java.util.ArrayList;

public class ImplementsDisciplina {
    //private List<Disciplina> disciplinas;
    Disciplina disciplina = new Disciplina();
    Aluno aluno = new Aluno();
    ArrayList<Disciplina> disciplinas = new ArrayList<>();
    public ImplementsDisciplina(){

    }
    public void cadastrarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void listarDisciplina(){
        int cont = 0;
        for (int i = 0; i < disciplinas.size(); i++) {
            //System.out.println(dados.toString());
            cont++;
            System.out.print("\nCodigo Disciplina: " + disciplinas.get(i).getCodigoDisciplina() + "\nNome: " + disciplinas.get(i).getNomeDisciplina() + "\n\n");
        }
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public boolean validacaoId(String codigoDisciplina) {
        int i;
        boolean validacao = true;
        for (i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getCodigoDisciplina().equals(codigoDisciplina)) {
                System.out.println("Código já Existente!");
                validacao = false;
            }
        }
        return validacao;
    }

}
