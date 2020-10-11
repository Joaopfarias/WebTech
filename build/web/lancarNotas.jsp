<%-- 
    Document   : lancarNotas
    Created on : 05/10/2020, 12:56:53
    Author     : joao_
--%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DAO.CONECTA"%>
<%@page import="DAO.usuarioDAO"%>
<%@page import="Modelos.Notas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    CONECTA con = new CONECTA();
    Connection c = con.getConexao();
    PreparedStatement stmt;
    String sql = "UPDATE RECURSOS SET NOTA1 = ?, NOTA2 = ?, NOTA3 = ?,NOTA4 = ?, "
            + "NOTAAF = ?, NOTAFINAL = ?, DISCIPLINA = ? WHERE RGM = ?";
    try {
        stmt = c.prepareStatement(sql);
        stmt.setFloat(1, Float.parseFloat(request.getParameter("txtn1")));
        stmt.setFloat(2, Float.parseFloat(request.getParameter("txtn2")));
        stmt.setFloat(3, Float.parseFloat(request.getParameter("txtn3")));
        stmt.setFloat(4, Float.parseFloat(request.getParameter("txtn4")));
        stmt.setFloat(5, Float.parseFloat(request.getParameter("txtaf")));
        stmt.setFloat(6, Float.parseFloat(request.getParameter("txtnf")));
        stmt.setString(7, request.getParameter("txtdisciplina"));
        stmt.setInt(8, Integer.parseInt(request.getParameter("txtrgm")));
        stmt.execute();
        stmt.close();
        response.sendRedirect("lancarNotas2.jsp");
    } catch (SQLException erro) {
        throw new RuntimeException("Erro 4: " + erro);
    }

%>