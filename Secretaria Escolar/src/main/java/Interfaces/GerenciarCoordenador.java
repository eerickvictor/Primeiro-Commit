package Interfaces;

import Pessoas.Coordenador;

public interface GerenciarCoordenador {
    void cadastroCoordenador(Coordenador coordenador);
    Coordenador buscarCoordenador(String idFunc);
    void alterarCoordenador(String idFunc);
    /*void removerCoordenador();
    */
    void loginCoordenador();



}
