package Repositorio;

import Interfaces.GerenciarTurma;
import Pessoas.Turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementsTurma implements GerenciarTurma {
    private List<Turma> turmas;
    Turma turma = new Turma();
    public ImplementsTurma(){
        turmas = new ArrayList<Turma>();
    }
    @Override
    public void cadastroTurma(Turma turma) {
        turmas.add(turma);
    }
    @Override
    public void listarTurma(){
        int cont = 0;
        for (int i = 0; i < turmas.size(); i++) {
            //System.out.println(dados.toString());
            cont++;
            System.out.print("\nId: " + turmas.get(i).getIdTurma() + "\n\n");
        }
    }
    @Override
    public Turma buscarTurma(String idTurma) {
        int i, cont = 0;
        Turma turma1 = null;
        for (i = 0; i < turmas.size(); i++) {
            //System.out.println(dados.toString());
            cont++;
            Turma turma = turmas.get(i);
            if(turma.getIdTurma().equals(idTurma)){
               turma1 = turma;
            }
        }
        if (cont == 0){
            System.out.println("----------------------------------------------\nNenhum registros foi encontrado!" +
                    "\n     Você precisa registrar o Turma." +
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
        return turma1;
    }
    @Override
    public void alterarTurma(String idTurma) {
        try {

            Scanner leia = new Scanner(System.in);
            int i;
            for (i = 0; i < turmas.size(); i++) {
                if (idTurma.equals(turmas.get(i).getIdTurma())) {
                    System.out.println("Ok! Vamos alterar o cadastro da turma " + turmas.get(i).getIdTurma());
                    System.out.println("Id:");
                    idTurma = leia.nextLine();
                    turmas.get(i).setIdTurma(idTurma);
                    System.out.println("Lara: O registro foi alterado com sucesso! ");
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("\nId inválido! (%s)",
                    e.getMessage());
        }
    }
    @Override
    public void removerTurma(String idTurma) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < turmas.size(); i++) {
            try {
                if (turmas.get(i).getIdTurma().equals(idTurma)) {
                    turmas.remove(i);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.printf("\nErro: Id inválido (%s).",
                        e.getMessage());
            }
        }
    }
    public boolean validacaoId(String idTurma) {
        int i;
        boolean valido = true;
        for (i = 0; i < turmas.size(); i ++) {
            if (turmas.get(i).getIdTurma().equals(idTurma)) {
                System.out.println("Id já existente!");
                valido = false;
            }
        }
        return valido;
    }
}
