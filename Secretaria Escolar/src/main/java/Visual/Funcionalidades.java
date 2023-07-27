package Visual;

import java.util.Scanner;

public class Funcionalidades {
    static Scanner input = new Scanner(System.in);

    public static void Inicio(){
        System.out.println("\n    1. Cadastrar" +
                "\n    2. Buscar" +
                "\n    3. Alterar" +
                "\n    4. Excluir"+
                "\n    5. Atribuir" +
                "\n    6. ..." +
                "\n    7. ..." +
                "\n    8. ..." +
                "\n    9. Sobre" +
                "\n\n    0. Fechar Programa");
        System.out.println("Informe uma das opções");
    }

    public static void funcionalidades(){
        System.out.println("\n    1. Sobre" +
                "\n    2. Cursos Disponiveis" +
                "\n    3. Inscreva-se" +
                "\n    4. Login" +
                "\n    4. Login" +
                "\n\n    0. Fechar Programa");
        System.out.println("Informe uma das opções");
    }

    public static void funcionalidadesSobre(){
        System.out.println("\n    1. Conhecer Desenvolvedores" +
                "\n    2. OBjetivos do Sistema" +
                "\n\n    0. Voltar para o Menu Incial");
        System.out.println("Informe uma das opções");
    }
    public static void funcionalidadesIncrever(){
        System.out.println("\n    1. Estudante" +
                "\n    2. Educador" +
                "\n    3. Coordenador" +
                "\n    0. Voltar para o Menu Incial");
    }
    public static void funcionalidadesLogin(){
        System.out.println("\n    1. Estudante" +
                "\n    2. Educador" +
                "\n    3. Coordenador" +
                "\n    0. Voltar para o Menu Incial");
    }
    public void funcionalidadesAluno(){
        System.out.println("\n    1. Portal do Aluno " +
                "\n    2. Financeiro " +
                "\n    3. Avaliar Educadores" +
                "\n\n    0. Voltar para o Menu Incial");
    }
    public static void funcionalidadesPortalAluno(){
        System.out.println("\n    1. Grade Curricular " +
                "\n    2.  Financeiro" +
                "\n    3.  Avaliar Educadores" +
                "\n\n    0. Voltar para o Menu Incial");
    }
    public void funcionalidadesProfessor(){
        System.out.println("\n    1. Portal do Educador" +
                "\n    2. " +
                "\n    3. " +
                "\n\n    0. Voltar para o Menu Incial");
    }
    public static void funcionalidadesEducador(){
        System.out.println("\n    1. Registrar Notas" +
                "\n    2. Registrar faltas " +
                "\n    3. " +
                "\n\n    0. Voltar para o Menu Incial");
    }
    public static void funcionalidadesCoordenador(){
        System.out.println("\n    1. Realizar Cadastro(s)" +
                "\n    2. Realizar Busca(s)" +
                "\n    3. Realizar Alteração(ões)" +
                "\n    4. Remover Cadastro(s)" +
                "\n\n    0. Voltar para o Menu Incial");
    }
    public void Cadastro (){
        System.out.println("\n    1.Cadastrar Aluno(s)" +
                "\n    2. Cadastrar Professor(s)" +
                "\n    3. Cadastrar Curso(s)" +
                "\n    4. Cadastrar Turma(s)" +
                "\n\n    0. Voltar ");
    }
    public void Busca (){
        System.out.println("\n    1. Buscar Aluno(s)" +
                "\n    2. Buscar Professor(s)" +
                "\n    3. Buscar Curso(s)" +
                "\n    4. Buscar Turma(s)" +
                "\n\n    0. Voltar para o Menu Inicial");
    }
    public void Alterar (){
        System.out.println("\n    1. Alterar Aluno(s)" +
                "\n    2. Alterar Professor(s)" +
                "\n    3. Alterar Curso(s)" +
                "\n    4. Alterar Turma(s)" +
                "\n\n    0. Voltar para o menu");
    }
    public void Remover (){
        System.out.println("\n    1. Remover Aluno(s)" +
                "\n    2. Remover Professor(s)" +
                "\n    3. Remover Curso(s)" +
                "\n    4. Remover Turma(s)" +
                "\n\n    0. Voltar para o menu");
    }
    public void Atribuir() {
        System.out.println("\n    1. Atribuir Faltas" +
                "\n    2. Atribuir média geral" +
                "\n    0. Voltar para o menu");
    }
    public void funcionalidadesCoordenadorCadastrarAluno(){
        System.out.println("\n    1. Aluno" +
                "\n    2. Aluno Bolsista" +
                "\n    0. Voltar para o menu");
    }


}