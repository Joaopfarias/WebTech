package DAO;

import Modelos.Notas;
import Modelos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class usuarioDAO {

    private Connection con;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Usuario> lista = new ArrayList<>();

    public usuarioDAO() {
        con = new CONECTA().getConexao();
    }

    public void InserirADM(Usuario usuario) {
        String sql = "INSERT INTO ADMSISTEMA (NOME,EMAIL,SENHA,TIPOUSUARIO) VALUES(?,?,?,?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getTipoUsuario());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro 2: " + erro);
        }
    }

    public void InserirAluno(Usuario usuario) {
        String sql = "INSERT INTO ALUNO (NOME,EMAIL,SENHA,CURSO,TIPOUSUARIO) VALUES(?,?,?,?,?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getCurso());
            stmt.setString(5, usuario.getTipoUsuario());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro 2: " + erro);
        }
    }

    public void InserirProfessor(Usuario usuario) {
        String sql = "INSERT INTO PROFESSOR (NOME,EMAIL,SENHA,TIPOUSUARIO) VALUES(?,?,aes_encrypt(?,'mysql'),?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getTipoUsuario());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro 2: " + erro);
        }
    }

    public void Deletar(int RGM) {
        String sql = "DELETE FROM USUARIO WHERE RGM = " + RGM;
        try {
            st = con.createStatement();
            st.execute(sql);
            st.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro 3: " + erro);
        }
    }

    public void Alterar(Usuario usuario) {
        String sql = "UPDATE USUARIO SET NOME = ?, EMAIL = ?, SENHA = ? WHERE RGM = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getCurso());
            stmt.setString(5, usuario.getTipoUsuario());
            stmt.setInt(5, usuario.getRGM());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro 4: " + erro);
        }
    }

    public ArrayList<Usuario> listarTodos() {
        String sql = "SELECT RGM, NOME, EMAIL, TIPOUSUARIO FROM ADMSISTEMA UNION "
                + "SELECT RGM, NOME, EMAIL, TIPOUSUARIO FROM PROFESSOR UNION "
                + "SELECT RGM, NOME, EMAIL, TIPOUSUARIO FROM ALUNO";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setRGM(rs.getInt("RGM"));
                usuario.setNome(rs.getString("NOME"));
                usuario.setEmail(rs.getString("EMAIL"));
                //usuario.setCurso(rs.getString("CURSO"));
                usuario.setTipoUsuario(rs.getString("TIPOUSUARIO"));
                lista.add(usuario);
            }
        } catch (SQLException erro) {
            throw new RuntimeException("Erro 5: " + erro);
        }
        return lista;
    }

    public ArrayList<Usuario> listarAluno() {
        String sql = "SELECT RGM, NOME, EMAIL, CURSO FROM ALUNO";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setRGM(rs.getInt("RGM"));
                usuario.setNome(rs.getString("NOME"));
                usuario.setEmail(rs.getString("EMAIL"));
                usuario.setCurso(rs.getString("CURSO"));
                lista.add(usuario);
            }
        } catch (SQLException erro) {
            throw new RuntimeException("Erro 5: " + erro);
        }
        return lista;
    }

    public void LancaNotas(Notas Notas) {
        String sql = "UPDATE RECURSOS SET NOTA1 = ?, NOTA2 = ?, NOTA3 = ?,"
                + "NOTA4 = ?, NOTAAF = ?, NOTAFINAL = ? WHERE RGM = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setFloat(1, Notas.getNOTA1());
            stmt.setFloat(2, Notas.getNOTA2());
            stmt.setFloat(3, Notas.getNOTA3());
            stmt.setFloat(4, Notas.getNOTA4());
            stmt.setFloat(5, Notas.getNOTAAF());
            stmt.setFloat(6, Notas.getNOTAFINAL());
            stmt.setInt(7, Notas.getRGM());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro 4: " + erro);
        }
    }
}
