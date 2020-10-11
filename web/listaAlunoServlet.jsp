<%-- 
    Document   : listaAlunoServlet
    Created on : 10/10/2020, 17:15:38
    Author     : joao_
--%>

<%@page import="Modelos.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.usuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    try {
        out.print("<table border=1 class='table table-striped' id='tabela'>");
        out.print("<tr>");
        out.print("<th>RGM</th><th>Nome</th><th>E-mail</th><th>Curso</th>");
        out.print("</tr>");
        out.print("</table>");
        usuarioDAO usd = new usuarioDAO();
        ArrayList<Usuario> lista = usd.listarAluno();
        for (int num = 0; num < lista.size(); num++) {
            out.print("<tr>");
            out.print("<td>" + lista.get(num).getRGM() + "</td>");
            out.print("<td><a href='lancarNotas2.jsp'>" + lista.get(num).getNome() + "</a></td>");
            out.print("<td>" + lista.get(num).getEmail() + "</td>");
            out.print("<td>" + lista.get(num).getCurso() + "</td>");
            out.print("</tr>");
        }
    } catch (Exception erro) {
        throw new RuntimeException("Erro 10: " + erro);
    }
%>
