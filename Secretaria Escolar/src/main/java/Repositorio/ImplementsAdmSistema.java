package Repositorio;

import Interfaces.GerenciarCoordenador;
import Pessoas.Coordenador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementsAdmSistema implements GerenciarCoordenador {
    private List<Coordenador> coordenadores;
    Coordenador coordenador = new Coordenador();
    Scanner input = new Scanner(System.in);
    public ImplementsAdmSistema(){
        coordenadores = new ArrayList<Coordenador>();
    }
    @Override
    public void cadastroCoordenador(Coordenador coordenador) {
        coordenadores.add(coordenador);
    }

    @Override
    public Coordenador buscarCoordenador(String idFunc) {
        int i, cont = 0;
        Coordenador coordenador1 = null;
        for (i = 0; i < coordenadores.size(); i++) {
            //System.out.println(dados.toString());
            cont++;
            Coordenador coordenador = coordenadores.get(i);
            if(coordenador.getIdFunc().equals(idFunc)){
                coordenador1 = coordenador;
            }
        }
        if (cont == 0){
            System.out.println("----------------------------------------------\nNenhum registros foi encontrado!" +
                    "\n     Você precisa registrar o Coordenador." +
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
        return coordenador1;
    }
    @Override
    public void alterarCoordenador(String idFunc) {
        Scanner leia = new Scanner(System.in);
        int i;

        for (i = 0; i < coordenadores.size(); i++) {
            if (idFunc.equals(coordenadores.get(i).getIdFunc())) {
                System.out.println("Ok! Vamos alterar o cadastro de " + coordenadores.get(i).getIdFunc());
                System.out.println("Nome:");
                String nome = leia.next();
                coordenadores.get(i).setNome(nome);
                System.out.println("Id:");
                idFunc = leia.next();
                coordenadores.get(i).setIdFunc(idFunc);
                System.out.println("Cargo:");
                String cargo = leia.next();
                coordenadores.get(i).setCargo(cargo);
                System.out.println("Sexo:");
                char sexo = leia.next().charAt(0);
                coordenadores.get(i).setSexo(sexo);
                System.out.println("Email:");
                String email = leia.next();
                coordenadores.get(i).setEmail(email);
                System.out.println("Lara: O registro foi alterado com sucesso! ");
                //seguir = true;
            }
        }
    }

    @Override
    public void loginCoordenador() {

    }

    public void loginCoordenador(ImplementsAdmSistema listaCadCoordenador){
        String email = null, senha = null;

        if(email.equals(coordenador.getEmail()) && (senha.equals(coordenador.getSenha()))){
            System.out.println("Login efetuado com sucesso");
        }
    }
}

