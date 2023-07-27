//import Interfaces.*;
import Repositorio.*;
import Visual.*;
import CRUD.Crud;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Visual
        Funcionalidades visual = new Funcionalidades();
        Lara lara = new Lara();
        ImplementsAluno iAluno = new ImplementsAluno();
        ImplementsTurma iTurma = new ImplementsTurma();
        ImplementsCurso iCurso = new ImplementsCurso();
        ImplementsProfessor iProfessor = new ImplementsProfessor();
        //VARIÁVEIS
        int opcM = -1, opcDel;
        Scanner input = new Scanner(System.in);
        Crud Crud = new Crud();
        lara.laraMenu();
        do {

            visual.Inicio();
            opcM = input.nextInt();
            switch (opcM) {
                case 0:

                    System.out.println("-----------------------------------------------------------------" +
                            "\n Lara: \n   Ok! Foi um prazer te acompanhar!\nEspero" +
                            " que você também tenha" +
                            " gostado de interagir comigo." +
                            "\n-----------------------------------------------------------------\n" +
                            "          ***Programa finalizado.");
                    break;
                case 1:
                    int opcCad = -1;
                    while (opcCad != 0) {
                        visual.Cadastro();
                        opcCad = input.nextInt();
                        //cadastros
                        switch (opcCad) {
                            case 0:
                                break;
                            case 1:
                                Crud.CadastrarAluno(iAluno);
                                break;
                            case 2:
                                Crud.cadastoProfessor(iProfessor);
                                break;
                            case 3:
                                Crud.CadastrarCursos(iCurso);
                                break;
                            case 4:
                                Crud.cadastrarTurma(iTurma);
                                break;
                            default:
                                System.out.println("Opção incorreta!");
                                break;
                        }
                        break;
                    }
                    break;
                case 2:
                    int opcBus = -1;
                    while (opcBus != 0) {
                        visual.Busca();
                        opcBus = input.nextInt();
                        //buscas
                        switch (opcBus) {
                            case 1:
                                Crud.buscarAluno(iAluno);
                                break;
                            case 2:
                                Crud.buscarProfessor(iProfessor);
                                break;
                            case 3:
                                Crud.buscarCursos(iCurso);
                                break;
                            case 4:
                                Crud.buscarTurma(iTurma);
                                break;
                            default:
                                System.out.println("Opção incorreta!");
                                break;
                        }
                        break;
                    }
                    break;
                case 3:
                    int opcAlt = 1;
                    while (opcAlt != 0) {
                        visual.Alterar();
                        opcAlt = input.nextInt();
                        //alterações
                        switch (opcAlt) {
                            case 1:
                                Crud.alterarAluno(iAluno);
                                break;
                            case 2:
                                Crud.alterarProfessor(iProfessor);
                                break;
                            case 3:
                                Crud.alterarCursos(iCurso);
                                break;
                            case 4:
                                Crud.alterarTurma(iTurma);
                                break;
                            default:
                                System.out.println("Opção incorreta!");
                                break;
                        }
                        break;
                    }
                    break;
                case 4:
                    opcDel = -1;
                    while (opcDel != 0) {
                        visual.Remover();
                        opcDel = input.nextInt();
                        //remoções
                        switch (opcDel) {
                            case 0:
                                break;
                            case 1:
                                Crud.removerAluno(iAluno);
                                break;
                            case 2:
                                Crud.deletarProfessor(iProfessor);
                                break;
                            case 3:
                                Crud.removerCursos(iCurso);
                                break;
                            case 4:
                                Crud.removerTurma(iTurma);
                                break;
                            default:
                                System.out.println("Opção incorreta!");
                                break;
                        }
                        break;
                    }
                    break;
                case 5:
                    int opcAtribuir = -1;
                    while (opcAtribuir != 0) {
                        visual.Atribuir();
                        opcAtribuir = input.nextInt();
                        switch (opcAtribuir) {
                            case 1:
                                Crud.registrarFaltas(iAluno);
                                break;
                            case 2:
                                Crud.atribuirMedia(iAluno);
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }
                    break;
                case 9:
                    String sobre;
                    lara.laraFunc1();
                    Navegabilidade.Sobre.objetivos();
                    Navegabilidade.Sobre.lista();
                    System.out.println("Digite 0 para voltar a qualquer momento...");
                    sobre = input.nextLine();
                    break;
                default:
                    System.out.println("*          *         *" +
                            "-----------------------------------" +
                            "\n  Lara:\n    OPÇÃO INVÁLIDA!" +
                            "\n-----------------------------------\n");
                    break;
            }
        } while (opcM != 0);
    }
}