package Repositorio;

import Interfaces.GerenciarAluno;
import Pessoas.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementsAluno implements GerenciarAluno {
    private List<Aluno> alunos;
    private double media;
    Aluno aluno = new Aluno();
    public ImplementsAluno(){
        alunos = new ArrayList<Aluno>();
    }
    public void levarArray() {
       Func func = new Func();
       func.setArray(alunos);
    }

    @Override
    public void cadastroAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    @Override
    public void listarAluno(){
        int cont = 0;
        for (int i = 0; i < alunos.size(); i++) {
            //System.out.println(dados.toString());
            cont++;
            System.out.print("\nNome: " + alunos.get(i).getNome() + "\nMatricula: " + alunos.get(i).getMatricula() + "\nSexo: " + alunos.get(i).getSexo() + "\nEmail: " + alunos.get(i).getEmail() + "\nData de Nascimento: " + alunos.get(i).getData_nascimento() + "\n\n");
        }
    }
    @Override
    public void buscarAluno(String matricula) {
            int i;
            try {
                for (i = 0; i < alunos.size(); i++) {
                    if (alunos.get(i).getMatricula().equals(matricula)) {
                        System.out.print("\nNome: " + alunos.get(i).getNome() + "\nMatricula: " + alunos.get(i).getMatricula() + "\nSexo: " + alunos.get(i).getSexo() + "\nEmail: " + alunos.get(i).getEmail() + "\nData de Nascimento: " + alunos.get(i).getData_nascimento() + "\nNúmero de faltas: " + alunos.get(i).getFaltas() + "Média geral: " + alunos.get(i).getMedia() + "Situação: " + alunos.get(i).Status());
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.printf("\nId inválido! (%s)",
                        e.getMessage());
            }
    }
    @Override
    public void alterarAluno(String matricula) {
        Scanner leia = new Scanner(System.in);
        int i;
        try {
            for (i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula().equals(matricula)) {
                System.out.println("Ok! Vamos alterar o cadastro de " + alunos.get(i).getMatricula());
                System.out.println("Nome:");
                String nome = leia.nextLine();
                alunos.get(i).setNome(nome);
                System.out.println("Matricula:");
                matricula = leia.nextLine();
                alunos.get(i).setMatricula(matricula);
                System.out.println("Sexo:");
                char sexo = leia.next().charAt(0);
                alunos.get(i).setSexo(sexo);
                leia.nextLine();
                System.out.println("Email:");
                String email = leia.nextLine();
                alunos.get(i).setEmail(email);
                System.out.println("Data de Nascimento:");
                String data_nascimento = leia.nextLine();
                alunos.get(i).setData_nascimento(data_nascimento);
                System.out.println("Lara: O registro foi alterado com sucesso! ");
            }
        }
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("\nMatrícula inválida! (%s)",
                    e.getMessage());
        }

    }
    @Override
    public void removerAluno(String matricula) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < alunos.size(); i++) {
            try {
                if (alunos.get(i).getMatricula().equals(matricula)) {
                    alunos.remove(i);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.printf("\nErro: posição inválida (%s).",
                        e.getMessage());
            }
        }
    }
    @Override
    public void loginAluno(){
        String email = null, senha = null;

        if(email.equals(aluno.getEmail()) && (senha.equals(aluno.getSenha()))){
            System.out.println("Login efetuado com sucesso");
        }

    }
    public boolean validacaoId(String matricula) {
        int i;
        boolean valido = true;
        for (i = 0; i < alunos.size(); i ++) {
            if (alunos.get(i).getMatricula().equals(matricula)) {
                System.out.println("Matrícula já existente!");
                valido = false;
            }
        }
        return valido;
    }
    public void atribuirFaltas(String matricula) {
        int i;
        Scanner input = new Scanner(System.in);
        double faltas;
        try {
            for (i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getMatricula().equals(matricula)) {
                    System.out.println("Digite o número de faltas para o aluno " + alunos.get(i).getNome());
                    faltas = input.nextDouble();
                    alunos.get(i).setFaltas(faltas);
                    System.out.println("Faltas adicionadas com sucesso!");
                }
            }
        }  catch (IndexOutOfBoundsException e) {
            System.out.printf("\nMatrícula inválida! (%s)",
                    e.getMessage());
        }
    }
    public void atribuirMediaGeral(String matricula){
        int i;
        double media;
        Scanner input = new Scanner(System.in);
        try {
            for (i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getMatricula().equals(matricula)) {
                    System.out.println("Digite a média geral para o aluno " + alunos.get(i).getNome());
                    media = input.nextDouble();
                    alunos.get(i).setMedia(media);
                    System.out.println("Média geral inserida com sucesso!");
                }
            }
        }  catch (IndexOutOfBoundsException e) {
            System.out.printf("\nMatrícula inválida! (%s)",
                    e.getMessage());
        }
    }
}

