package Pessoas;

public class Professor extends Funcionario{
    double classificação;
    String formação;
    String data_nascimento;
    public Professor(double classificação, String formação, String cargo, double salario, String idFunc, String nome, char sexo, String email, String senha, String data_nascimento) {
        super(cargo,  idFunc, salario, nome, sexo, email, senha, data_nascimento);
    }
    public Professor() {

    }
    public double getClassificação(){
        return classificação;
    }
    public void setClassificação(double classificação){
        this.classificação = classificação;
    }
    public String getFormação(){
        return formação;
    }
    public void setFormação(String formação){
        this.classificação = classificação;
    }
    @Override
    public String toString(){
        return "\nClassificação: " + getClassificação() + "\nFormação: " + getFormação();
    }

}
