package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;

public class Conexao {
    public static Connection getConexao() throws  Exception{
        Connection conn = null;
        String host = "jdbc:mysql://localhost:3306/sistema_escolar";
        String user = "root";
        String psw = "root1123";

        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(host, user, psw);
            System.out.println("Conexao feita");
        }
        catch(Exception e){
            e.getMessage();
            System.out.println("ERRO!!!");
        }
        return  conn;
    }
}
