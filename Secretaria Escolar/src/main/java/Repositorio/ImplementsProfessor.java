package Repositorio;

import Interfaces.GerenciarProfessor;
import Pessoas.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementsProfessor implements GerenciarProfessor {

    private List<Professor> professores;
    Professor professor = new Professor();
    public ImplementsProfessor(){
        professores = new ArrayList<Professor>();
    }
    @Override
    public void cadastroProfessor(Professor professor) {
        professores.add(professor);
    }
    @Override
    public void listarProfessor(){
        int cont = 0;
        for (int i = 0; i < professores.size(); i++) {
            //System.out.println(dados.toString());
            cont++;
            System.out.print("\nId: " + professores.get(i).getIdFunc() + "\nNome: " + professores.get(i).getNome() + "\nSexo: " + professores.get(i).getSexo() + "\nEmail: " + professores.get(i).getEmail() + "\nData de Nascimento: " + professores.get(i).getData_nascimento());
        }
    }
    @Override
    public void buscarProfessor(String idFunc) {
        int i;
        try {

        for (i = 0; i < professores.size(); i++) {
            if (professores.get(i).getIdFunc().equals(idFunc)) {
                System.out.println("Matrícula: " +  professores.get(i).getIdFunc() + "\nNome: " + professores.get(i).getNome() + "\nSexo: " + professores.get(i).getSexo() + "\nEmail: " + professores.get(i).getEmail() + "\nData de Nascimento: " + professores.get(i).getData_nascimento());
            }
        }
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("\nId inválido! (%s)",
                    e.getMessage());
        }

    }
    @Override
    public void alterarProfessor(String idFunc) {
        Scanner leia = new Scanner(System.in);
        int i;
        try {
        for (i = 0; i < professores.size(); i++) {
            if (professores.get(i).getIdFunc().equals(idFunc)) {
                System.out.println("Ok! Vamos alterar o cadastro de " + professores.get(i).getIdFunc());
                System.out.println("Nome:");
                String nome = leia.nextLine();
                professores.get(i).setNome(nome);
                do {
                    System.out.println("Id:");
                    idFunc = leia.nextLine();
                } while (validacaoId(idFunc) == false);
                professores.get(i).setIdFunc(idFunc);
                System.out.println("Cargo:");
                String cargo = leia.nextLine();
                professores.get(i).setCargo(cargo);
                System.out.println("Sexo:");
                char sexo = leia.next().charAt(0);
                professores.get(i).setSexo(sexo);
                System.out.println("Email:");
                String email = leia.nextLine();
                professores.get(i).setEmail(email);
                System.out.println("Lara: O registro foi alterado com sucesso! ");
            }
        }
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("\nMatrícula inválida! (%s)",
            e.getMessage());
        }
    }
    @Override
    public void removerProfessor(String idFunc) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < professores.size(); i++) {
            try {
                if (professores.get(i).getIdFunc().equals(idFunc)) {
                    professores.remove(i);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.printf("\nErro: Id inválido (%s).",
                        e.getMessage());
            }
        }
    }
    public boolean validacaoId(String matricula) {
        int i;
        boolean valido = true;
        for (i = 0; i < professores.size(); i ++) {
            if (professores.get(i).getIdFunc().equals(matricula)) {
                System.out.println("Matrícula já existente!");
                valido = false;
            }
        }
        return valido;
    }
}
