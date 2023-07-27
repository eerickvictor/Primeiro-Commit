package CRUD;
import Database.CrudAluno;
import Pessoas.*;
import Repositorio.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crud {
     Scanner input = new Scanner(System.in);
     int opc;
     int opcao;
     Pessoa pessoa;
     Aluno aluno = new Aluno();
     Professor professor = new Professor();
     Coordenador coordenador = new Coordenador();
     Periodo periodo = new Periodo();
     Disciplina disciplina = new Disciplina();
     Curso curso = new Curso();
     Turma turma = new Turma();
     String nome, idFunc, email, data_nascimento, cargo, tipo;
     char sexo;
     double salario;
     //ArrayLists
     List<Periodo> periodos = new ArrayList<>();
     ArrayList<Disciplina> disciplinas = new ArrayList<>();
     List<Turma> turmas = new ArrayList<>();
     List<Curso> cursos = new ArrayList<>();
     public void cadastoProfessor(ImplementsProfessor listaCadProf){
         int opc;
         String nome, idFunc, email, data_nascimento;
         char sexo;
         double salario;
         do {
             Professor professor = new Professor();
         System.out.println("Nome: ");
         nome = input.nextLine();
         professor.setNome(nome);
         do {
             System.out.println("Matricula: ");
         idFunc = input.next();
         } while(listaCadProf.validacaoId(idFunc) == false);
         professor.setIdFunc(idFunc);
         System.out.println("Sexo: (use M ou F) ");
         sexo = input.next().charAt(0);
         professor.setSexo(sexo);
         input.nextLine();
         System.out.println("Email: ");
         email = input.nextLine();
         professor.setEmail(email);
         System.out.println("Data de Nascimento: ");
         data_nascimento = input.nextLine();
         professor.setData_nascimento(data_nascimento);
         System.out.println("Salario: ");
         salario = input.nextDouble();
         professor.setSalario(salario);
         listaCadProf.cadastroProfessor(professor);
         System.out.println("Professor cadastrado com Sucesso!");
         System.out.println("\n 0. Voltar ao menu \n 1. Cadastrar novo Professor \n Por favor, insira um número: ");
         opc = input.nextInt();
         input.nextLine();
         } while (opc == 1);
     }
     public void buscarProfessor(ImplementsProfessor listaCadProf){
         String idFunc;
         int opc;
         System.out.println("Id: ");
         idFunc = input.next();
         System.out.println("A conta que você procura contêm as seguintes informações: ");
         listaCadProf.buscarProfessor(idFunc);
         System.out.println("Informe 0 para voltar ao menu.)");
         opc = input.nextInt();
     }
     public void alterarProfessor(ImplementsProfessor listaCadProf){
         System.out.println("Informe a matrícula do professor que deseja alterar.");
         String idFunc = input.next();
         listaCadProf.alterarProfessor(idFunc);
     }
     public void deletarProfessor(ImplementsProfessor listaCadProf){
         Scanner input = new Scanner(System.in);
         String idFunc;
         System.out.println("\nInforme o Id do Professor para exclusão:  ");
         idFunc = input.next();
        listaCadProf.removerProfessor(idFunc);
     }
     public void CadastrarAluno(ImplementsAluno listaCadAluno){
         int opcao;
         String matricula, nome, email, data_nascimento;
         Scanner input = new Scanner(System.in);
         char sexo;
         do {
         Aluno aluno = new Aluno();
         System.out.println("Nome: ");
         nome = input.nextLine();
         aluno.setNome(nome);
         do {
             System.out.println("Matricula: ");
         matricula = input.nextLine();
         } while(listaCadAluno.validacaoId(matricula) == false);
         aluno.setMatricula(matricula);
         System.out.println("Sexo: (Use M ou F) ");
         sexo = input.next().charAt(0);
         aluno.setSexo(sexo);
         input.nextLine();
         System.out.println("Email: ");
         email = input.nextLine();
         aluno.setEmail(email);
         System.out.println("Data de Nascimento: ");
         data_nascimento = input.nextLine();
         aluno.setData_nascimento(data_nascimento);
         listaCadAluno.cadastroAluno(aluno);
         try{
             CrudAluno.cadastrarAluno(aluno);
             System.out.println("Aluno Cadastrado com sucesso!");
         }catch(Exception e){
             System.out.println("Ocorreu um erro ao realizar o cadastro do aluno: " + e.getMessage());
         }
             System.out.println("\n 0. Voltar ao menu \n 1. Cadastrar novo Aluno \n Por favor, insira um número: ");
             opcao = input.nextInt();
             input.nextLine();
         } while (opcao == 1);
    }
    public void buscarAluno(ImplementsAluno listaCadAluno){
        System.out.println("matricula: ");
        idFunc = input.next();
        System.out.println("o Aluno que você procura contêm as seguintes informações: ");
        listaCadAluno.buscarAluno(idFunc);
        System.out.println("Informe 0 para voltar ao menu.)");
        opc = input.nextInt();
    }
    public void alterarAluno(ImplementsAluno listaCadAluno){
        System.out.println("Informe a matrícula do Aluno que deseja alterar.");
        String matricula = input.next();
        listaCadAluno.alterarAluno(matricula);
    }
    public void removerAluno(ImplementsAluno listaCadAluno){
        Scanner input = new Scanner(System.in);
        String matricula;
        System.out.println("\nInforme a matrícula do Aluno para exclusão:  ");
        matricula = input.next();
        listaCadAluno.removerAluno(matricula);
    }
    public void cadastrarTurma(ImplementsTurma listaCadTurma){
         Turma turma = new Turma();
         String idTurma;
         do {
        System.out.println("Id: ");
         idTurma = input.nextLine();
         } while (listaCadTurma.validacaoId(idTurma) == false);
        turma.setIdTurma(idTurma);
        listaCadTurma.cadastroTurma(turma);
    }
    public void buscarTurma(ImplementsTurma listaCadTurma) {
       listaCadTurma.listarTurma();
            }

    public void alterarTurma(ImplementsTurma listaCadTurma){
        System.out.println("Informe o id da turma que deseja alterar.");
        String idTurma = input.next();
        listaCadTurma.alterarTurma(idTurma);
     }

    public void removerTurma(ImplementsTurma listaCadTurma) {
        Scanner input = new Scanner(System.in);
        String idTurma;
        System.out.println("\nInforme o Id da turma para exclusão:  ");
        idTurma = input.next();
        listaCadTurma.removerTurma(idTurma);
    }
    public void CadastrarCursos(ImplementsCurso listCadCursos){
         ImplementsDisciplina listCadDisciplina = new ImplementsDisciplina();
         ImplementsPeriodo listaCadPeriodo = new ImplementsPeriodo();
        ArrayList<Disciplina> disciplinas_periodo;
        ArrayList<Periodo> periodos_curso;
        int opcao;
        do {
          Curso curso = new Curso();
            Scanner resposta = new Scanner(System.in);
            periodos_curso = new ArrayList<Periodo>();
            String idCurso;
            do {
                System.out.println("Id: ");
                idCurso = input.nextLine();
            } while (listCadCursos.validacaoId(idCurso) == false);
            turma.setIdTurma(idCurso);
            curso.setIdCurso(idCurso);
            System.out.println("Nome: ");
            String nomeCurso = input.nextLine();
            curso.setNome(nomeCurso);
            System.out.println("Area do conhecimento: ");
            String area = input.nextLine();
            curso.setArea(area);
            System.out.println("Quantidade de periodos: ");
            int qtdPeriodo = input.nextInt();
            curso.setQtdPeriodo(qtdPeriodo);
            for(int i = 1; i <= qtdPeriodo; i++) {
                periodo = new Periodo();
                int idPeriodo;
                disciplinas_periodo = new ArrayList<Disciplina>();
                System.out.println( i+  "º Periodo \n");
                idPeriodo = i;
                periodo.setIdPeriodo(idPeriodo);
                System.out.println("Quantidade de Disciplinas: ");
                int qtdDisciplinas = input.nextInt();
                input.nextLine();
                int c;
                for (c = 1; c <= qtdDisciplinas; c++) {
                    disciplina = new Disciplina();
                    System.out.println("Nome da " + c + "º Disciplina: ");
                    String nomeDisciplina = input.nextLine();
                    disciplina.setNomeDisciplina(nomeDisciplina);
                    String codigoDisciplina;
                    do {
                        System.out.println("Codigo da " + c + "º Disciplina: ");
                        codigoDisciplina = input.nextLine();
                    } while (listCadDisciplina.validacaoId(codigoDisciplina) == false);
                    disciplina.setCodigoDisciplina(codigoDisciplina);
                    listCadDisciplina.cadastrarDisciplina(disciplina);
                    disciplinas_periodo.add(disciplina);
                    System.out.println("\n" + c + "ª Disciplina Cadastrada com Sucesso!\n");
                }
                periodo.setDisciplinas(disciplinas_periodo);
                periodos_curso.add(periodo);
                listaCadPeriodo.cadastrarPeriodo(periodo);
                System.out.println("\n" + i + "ª Período Cadastrado com Sucesso!\n");
            }
            curso.setPeriodos(periodos_curso);
            listCadCursos.cadastroCurso(curso);
            System.out.println("\nCurso Cadastrado com Sucesso!\n");
            System.out.println("\n\n 1. Cadastrar novo Curso" +
                    "\n 2. Voltar ao Menu " +
                    "\n Insira um número: ");
            opcao = resposta.nextInt();
        } while (opcao == 1);
    }
    public void buscarCursos(ImplementsCurso listCadCursos){
        listCadCursos.listarCurso();
            }

    public void alterarCursos(ImplementsCurso listCadCursos){
        System.out.println("Informe o id do Curso que deseja alterar.");
        String idCurso = input.next();
        listCadCursos.alterarCurso(idFunc);
     }

    public void removerCursos(ImplementsCurso listCadCursos) {
        Scanner input = new Scanner(System.in);
        String idCurso;
        System.out.println("\nInforme o Id do Curso para exclusão:  ");
        idCurso = input.next();
        listCadCursos.deletarCurso(idCurso);

    }

    public void registrarFaltas(ImplementsAluno listaCadAluno){
         String matricula;
         Scanner input = new Scanner(System.in);
        System.out.println("Informe a matrícula do Aluno que deseja inserir faltas: ");
        matricula = input.next();
        listaCadAluno.atribuirFaltas(matricula);

    }

  public void atribuirMedia(ImplementsAluno listacadAluno){
        Scanner input = new Scanner(System.in);
         String matricula;
      System.out.println("Digite a matrícula do Aluno que deseja inserir média geral: ");
      matricula = input.next();
      listacadAluno.atribuirMediaGeral(matricula);
  }
    public void loginCoordenador(ImplementsAdmSistema listaCadCoordenador){
        String email = null, senha = null;
        System.out.println("Email: ");
        email = input.next();
        System.out.println("Senha: ");
        senha = input.next();
        listaCadCoordenador.loginCoordenador();
    }


}
