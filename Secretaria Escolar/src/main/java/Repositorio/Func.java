package Repositorio;

import Pessoas.Aluno;

import java.util.*;

import java.util.ArrayList;
import java.util.List;
public class Func {
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public void setArray(List<Aluno> alunos){
        this.alunos = alunos;
    }
    public Func() {

    }
    public void cadastrarMédia(String matricula) {
        Scanner input = new Scanner(System.in);
        String  media;
        int i;
        try {
            for (i = 0; i <  alunos.size(); i++) {
                if (matricula.equals(alunos.get(i).getMatricula())) {
                    System.out.println("Informe a média do Aluno " + alunos.get(i).getNome() + ":");
                    media = input.next();
                    //alunos.get(i).setMedia(media);
                    System.out.println("Média cadastrada com sucesso!");
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Matrícula não encontrada! :(");
        }
    }

    public void alterarMédia(String matricula) {
        Scanner input = new Scanner(System.in);
        String media;
        int i;
        try {
            for (i = 0; i < alunos.size(); i++) {
                if (matricula.equals(alunos.get(i).getMatricula())) {
                    System.out.println("Informe a nova Média  do Aluno " + alunos.get(i).getNome() + ":");
                    media = input.next();
                    //alunos.get(i).setMedia(media);
                    System.out.println("Média alterada com sucesso!");
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Matrícula não encontrada! :(");
        }

    }
    public void removerMédia(String matricula) {
        int i;
        for (i=0; i < alunos.size(); i++) {
            if (matricula.equals(alunos.get(i).getMatricula())) {
            }
        }
    }


}
