package Pessoas;

public class Coordenador extends Funcionario {
    private double salario;
    public Coordenador(String cargo, String idFunc, double salario, String nome, char sexo, String email, String senha, String data_nascimento) {
        super(cargo, idFunc, salario, nome, sexo, email, senha, data_nascimento);
        this.salario = salario;
    }
    public Coordenador(){
        super();
    }


}
