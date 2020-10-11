
package DAO;

import Modelos.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class disciplinaDAO {
    
    private Connection con;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList <Disciplina> lista = new ArrayList<>();
    
    public disciplinaDAO(){
        con = new CONECTA().getConexao();
    }
    
    public void InserirDscp(Disciplina disciplina)
    {
        String sql = "INSERT INTO DISCIPLINA(NOME, CARGAHORARIA, CURSOS) VALUES(?,?,?)";
        try
        {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, disciplina.getNOME());
            stmt.setInt(2, disciplina.getCARGAHORARIA());
            stmt.setString(3, disciplina.getCURSOS());
            stmt.execute();
            stmt.close();
        }
        catch(SQLException erro)
        {
            throw new RuntimeException("Erro 2: " + erro);
        }
    }
    
    public void DeletarDscp(int ID)
    {
        String sql = "DELETE FROM DISCIPLINA WHERE ID = " + ID;
        try
        {
            st = con.createStatement();
            st.execute(sql);
            st.close();
        }
        catch(SQLException erro)
        {
            throw new RuntimeException("Erro 3: " + erro);
        }
    }
    
    public void AlterarDscp(Disciplina disciplina)
    {
        String sql = "UPDATE DISCIPLINA SET NOME = ?, CARGAHORARIA = ?, CURSOS = ? WHERE ID = ?";
        try
        {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, disciplina.getNOME());
            stmt.setInt(2, disciplina.getCARGAHORARIA());
            stmt.setString(3, disciplina.getCURSOS());
            stmt.setInt(4, disciplina.getID());
            stmt.execute();
            stmt.close();
        }
        catch(SQLException erro)
        {
            throw new RuntimeException("Erro 4: " + erro);
        }
    }
    
    public ArrayList<Disciplina> listarTodasDscp()
    {
        String sql = "SELECT ID, NOME, CARGAHORARIA, CURSOS FROM DISCIPLINA";
        try
        {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                Disciplina disciplina = new Disciplina();
                disciplina.setID(rs.getInt("ID"));
                disciplina.setNOME(rs.getString("NOME"));
                disciplina.setCARGAHORARIA(rs.getInt("CARGAHORARIA"));
                disciplina.setCURSOS(rs.getString("CURSOS"));
                lista.add(disciplina);
            }
        }
        catch(SQLException erro)
        {
            throw new RuntimeException("Erro 5: " + erro);
        }
        return lista;
    }
}

