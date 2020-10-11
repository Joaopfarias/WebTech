<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import='Modelos.Usuario'%>
<%@page import='DAO.usuarioDAO'%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>criarUsuario Servlet</title>
    </head>
    <body>
        <%
            try {
                Usuario usu = new Usuario();
                String tipou = request.getParameter("txttipousuario");
                if (tipou.equals("Aluno")) {
                    usuarioDAO usd = new usuarioDAO();
                    usu.setNome(request.getParameter("txtnome"));
                    usu.setEmail(request.getParameter("txtemail"));
                    usu.setSenha(request.getParameter("txtsenha"));
                    usu.setCurso(request.getParameter("txtcurso"));
                    usu.setTipoUsuario(request.getParameter("txttipousuario"));
                    usd.InserirAluno(usu);
                    response.sendRedirect("criarUsuario2.jsp");
                }
                else if (tipou.equals("Professor")) {
                    usuarioDAO usd = new usuarioDAO();
                    usu.setNome(request.getParameter("txtnome"));
                    usu.setEmail(request.getParameter("txtemail"));
                    usu.setSenha(request.getParameter("txtsenha"));
                    usu.setTipoUsuario(request.getParameter("txttipousuario"));
                    usd.InserirProfessor(usu);
                    response.sendRedirect("criarUsuario2.jsp");
                }
                else if (tipou.equals("Administrador de Sistemas")) {
                    usuarioDAO usd = new usuarioDAO();
                    usu.setNome(request.getParameter("txtnome"));
                    usu.setEmail(request.getParameter("txtemail"));
                    usu.setSenha(request.getParameter("txtsenha"));
                    usu.setTipoUsuario(request.getParameter("txttipousuario"));
                    usd.InserirADM(usu);
                    response.sendRedirect("criarUsuario2.jsp");
                }
            } catch (Exception erro) {
                throw new RuntimeException("Erro 7 " + erro);
            }
        %>
    </body>
</html>
