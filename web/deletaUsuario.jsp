<%@page import="DAO.usuarioDAO"%>
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
                usuarioDAO usd = new usuarioDAO();
                usd.Deletar(Integer.parseInt(request.getParameter("rgm")));
                response.sendRedirect("index.jsp");
            }
            catch(Exception erro)
            {
                throw new RuntimeException("Erro 9: " + erro);
            }
        %>
    </body>
</html>
