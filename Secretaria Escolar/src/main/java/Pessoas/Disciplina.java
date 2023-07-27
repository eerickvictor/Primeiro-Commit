package Pessoas;

public class Disciplina {
    String nomeDisciplina, codigoDisciplina;
    String media;
    Periodo p;
    public Disciplina(String nomeDisciplina, String codigoDisciplina, String media){
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.media = media;
    }

    public Disciplina() {

    }

    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    public String getCodigoDisciplina(){
        return codigoDisciplina;
    }
    public void setCodigoDisciplina(String codigoDisciplina){
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getMedia(){
        return media;
    }
    public void setMedia(String media){
        this.media = media;
    }
    public String toString(){
        return "Disciplina: " + getNomeDisciplina() + "\nCodigo da Disciplina: " + getCodigoDisciplina();
    }

}
