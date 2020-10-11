<%-- 
    Document   : alteraUsuario
    Created on : 11/09/2020, 00:31:56
    Author     : vryam
--%>

<%@page import="DAO.usuarioDAO"%>
<%@page import="Modelos.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            try
            {
                Usuario usu = new Usuario();
                usuarioDAO usd = new usuarioDAO();
                usu.setNome(request.getParameter("txtnome"));
                usu.setEmail(request.getParameter("txtemail"));
                usu.setSenha(request.getParameter("txtsenha"));
                usu.setCurso(request.getParameter("txtcurso"));
                usu.setTipoUsuario(request.getParameter("txttipousuario"));
                usu.setRGM(Integer.parseInt(request.getParameter("rgm")));
                usd.Alterar(usu);
                response.sendRedirect("index.jsp");
            }
            catch(Exception erro)
            {
                throw new RuntimeException("Erro 8: " + erro);
            }
        %>
    </body>
</html>
