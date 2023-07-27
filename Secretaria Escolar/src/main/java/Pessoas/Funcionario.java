package Pessoas;

public class Funcionario extends Pessoa{
    String cargo;
    double salario;
    String idFunc;
    public Funcionario(String cargo, String idFunc, double salario, String nome, char sexo, String email, String senha, String data_nascimento){
        super(nome, sexo, email, senha, data_nascimento);
        this.cargo = cargo;
        this.salario = salario;
        this.idFunc = idFunc;
    }

    public Funcionario() {

    }

    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public String getIdFunc(){
        return idFunc;
    }
    public void setIdFunc(String idFunc){
        this.idFunc = idFunc;
    }

    @Override
    public String toString(){
        return "\nCargo: " + cargo + "\nSalario: " + salario;
    }
}
