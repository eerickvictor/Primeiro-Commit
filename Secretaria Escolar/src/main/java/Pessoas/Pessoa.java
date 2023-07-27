package Pessoas;

public abstract class Pessoa {

    //Logo abaixo estão sendo definidas os atributos da classe Pessoas.Pessoas
    private String nome;
    private char sexo;
    private String email;
    private String senha;
    private String data_nascimento;

    //Esse carinha logo abaixo é o CONSTRUTOR, que basicamente armazena um espaço na memoria do pc para os valores que vão ser atribuidos, ele inicializa um valor que ainda não foi declarado
    public Pessoa(String nome, char sexo, String email, String senha, String data_nascimento){
        this.nome = nome;
        this.senha = senha;
        this.sexo = sexo;
        this.email = email;
        this.data_nascimento = data_nascimento;
    }
    public Pessoa(){

    }
    //Metodo GETER é uma forma de acessar os atributos que foram atribuidos de maneira não publica, acessando e demostrando seu valor em um determinado momento
    //Metodo SETER é uma forma de acessar é modificar os valore de um atributo não publico
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getData_nascimento(){
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString(){
        return "\nNome: " + getNome() + "\nSexo: " + getSexo() + "\nEmail: " + getEmail() + "\nSenha: " + getSenha() + "\nData de Nascimento: " + getData_nascimento();
    }

}
