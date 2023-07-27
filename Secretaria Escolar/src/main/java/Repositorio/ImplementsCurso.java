package Repositorio;

import Interfaces.GerenciarCurso;
import Pessoas.Curso;
import Pessoas.Periodo;
import Pessoas.Disciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementsCurso implements GerenciarCurso {
    private List<Curso> cursos;
    //Curso curso = new Curso();
    public ImplementsCurso(){
        cursos = new ArrayList<Curso>();
    }
    @Override
    public void cadastroCurso(Curso curso) {
        cursos.add(curso);
    }
    @Override
    public void listarCurso(){
        int cont = 0;
        for (Curso curso: cursos) {
            //System.out.println(dados.toString());
            cont++;
            System.out.println("\nId: " + curso.getIdCurso() + "\nNome: " + curso.getNome() + "\nAréa do Conhecimento: " + curso.getArea() + "\nPeriodos: " + curso.getQtdPeriodo() + "\n\n");

            for (Periodo periodo: curso.getPeriodos()) {
                System.out.println(periodo.getIdPeriodo() + "º Periodo: ");
                for (Disciplina disc: periodo.getDisciplinas()) {
                    System.out.println("Nome da Disciplina: " + disc.getNomeDisciplina() + "\nCódigo da Disciplina: " + disc.getCodigoDisciplina() + "\n");
                }
            }

        }
    }

    @Override
    public Curso buscarCurso(String idCurso) {
        int i, cont = 0;
        Curso cursos1 = null;
        for (i = 0; i < cursos.size(); i++) {
            //System.out.println(dados.toString());
            cont++;
            Curso curso;
            curso = cursos.get(i);
            if(cursos.get(i).getIdCurso().equals(idCurso)){
                cursos1 = (Curso) cursos;
            }
        }
        if (cont == 0){
            System.out.println("----------------------------------------------\nNenhum registros foi encontrado!" +
                    "\n     Você precisa registrar o Curso." +
                    "\n----------------------------------------------");
        }else if(cont == 1){
            System.out.println("----------------------------------------------\n" +
                    "Lara:\n    "+cont+" Registro foi encontrado.\\n\\n" +
                    "\n----------------------------------------------");
        }else{
            System.out.println("----------------------------------------------\n" +
                    "Lara:\n    "+cont+" Registros foram encontrados." +
                    "\n----------------------------------------------");
        }
        return cursos1;
    }
    @Override
    public void alterarCurso(String idCurso) {
        Scanner leia = new Scanner(System.in);
        int i;
        try {
        for (i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getIdCurso().equals(idCurso)) {
                System.out.println("Ok! Vamos alterar o cadastro de " + cursos.get(i).getIdCurso());
                System.out.println("Nome:");
                String nome = leia.nextLine();
                cursos.get(i).setNome(nome);
                System.out.println("Id:");
                idCurso = leia.nextLine();
                cursos.get(i).setIdCurso(idCurso);
                System.out.println("Área do conhecimento:");
                String area = leia.nextLine();
                cursos.get(i).setArea(area);
                System.out.println("Lara: O registro foi alterado com sucesso! ");
            }
        }
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("\nId inválido! (%s)",
                    e.getMessage());
        }
    }
    @Override
    public void deletarCurso(String idCurso) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < cursos.size(); i++) {
            try {
                if (cursos.get(i).getIdCurso().equals(idCurso)) {
                    cursos.remove(i);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.printf("\nErro: Id inválido (%s).",
                        e.getMessage());
            }
        }
    }

    public boolean  validacaoId(String idCurso) {
        int i;
        boolean validacao = true;
        for (i = 0; i <cursos.size(); i++) {
            if (cursos.get(i).getIdCurso().equals(idCurso)) {
                System.out.println("Id já existente!");
                validacao = false;
            }
        }
        return validacao;
    }

}

