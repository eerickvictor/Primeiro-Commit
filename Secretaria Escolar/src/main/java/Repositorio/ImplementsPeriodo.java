package Repositorio;
import Interfaces.GerenciarPeriodo;
import Pessoas.*;
import java.util.List;
import java.util.ArrayList;

public class ImplementsPeriodo implements GerenciarPeriodo {
    private List<Periodo> periodos;
    Periodo periodo = new Periodo();
    public ImplementsPeriodo(){
        periodos = new ArrayList<>();
    }
    @Override
    public void cadastrarPeriodo(Periodo periodo) {
        periodos.add(periodo);
    }
    @Override
    public void mostrarPeriodos() {
        int i;
        for (i= 0; i < periodos.size(); i++) {
            System.out.println("Id Periodo:\n" + periodos.get(i).getIdPeriodo() + "\n" + periodos.get(i).getDisciplinas());
        }
    }
}
