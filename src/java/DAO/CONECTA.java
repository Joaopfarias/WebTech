
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class CONECTA {
    public Connection getConexao()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/cruzeiroNorte?useTimezone=true&serverTimezone=America/Sao_Paulo","root","Joao2106.");
        }
        catch(Exception erro)
        {
            throw new RuntimeException("Erro: " + erro);
        }
    }
}
