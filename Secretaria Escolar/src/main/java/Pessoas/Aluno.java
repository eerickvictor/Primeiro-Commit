package Pessoas;
import java.util.ArrayList;
public class Aluno extends Pessoa {
    private String matricula;
    private String status = "sem status";
    private double faltas;

    private double media;
    public Aluno(String nome, String matricula, char sexo, String email, String senha, String data_nascimento, String status, double faltas, double media){
        super(nome, sexo, email, senha, data_nascimento);
        this.matricula = matricula;
        this.status = status;
        this.faltas = faltas;
    }
    public Aluno(){

    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String Status) {
        this.status = status;
    }
    public void setFaltas(double faltas) {
        this.faltas = faltas;
    }
    public double getFaltas() {
        return faltas;
    }
    public void setMedia(double media){
        this.media = media;
    }
public double getMedia(){
        return media;
}
public String  Status(){
        if (media > 7) {
            status = "Aprovado!";
        } else {
            status = "Reprovado!";
        }
        return status;
}
    @Override
    public String toString(){
        return "\nMatricula: " + matricula;
    }
}
