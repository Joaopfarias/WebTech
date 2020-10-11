<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DAO.CONECTA"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
    <body></br></br></br>
        <style>
            body{

                background-image: url("img/login-background.png");
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: cover;
                background-size: 100% 100%;
            }
        </style>
        <%
            CONECTA con = new CONECTA();
            Connection c = con.getConexao();
        %>
        <main class="d-flex justify-content-center">
            <section class="alert-primary col-md-3" style="background-color: rgb(250, 250, 250, 0.8);border-radius: 8px">
                <form id="formulario" action="index.jsp" class="text-center"></br>
                    <img class="mb-4" src="img/baixados.png" alt="" width="172" height="172" style="border-radius: 50%">
                    <input id="texto" type="text" name="login" placeholder="Digite seu RGM"  class="texto col-md-12 form-control"/>
                    <input class="texto col-md-12 form-control" type="password" name="senha" placeholder="Digite sua senha"/><br/><br/>
                    <button type="submit" id="botao" class="btn btn-primary">Entrar</button><br/><br/>
                </form>
            </section>
        </main>
        <%
            if (c != null) {
                if ((request.getParameter("login") != null) && (request.getParameter("senha") != null)) {
                    String login, senha;
                    login = request.getParameter("login");
                    senha = request.getParameter("senha");
                    Statement st;
                    ResultSet rs;
                    st = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
                    rs = st.executeQuery("SELECT rgm, aes_decrypt(senha,'mysql') from admsistema where rgm ='" + login + "' and  AES_DECRYPT(senha,'mysql') ='" + senha + "'");
                    if (rs.next()) {
                        response.sendRedirect("TelaPrincipal.jsp?login='"+login+"'");
                    }
                }
            } else {
                System.out.println("Não foi possível logar");
            }
        %>
    </body>
</html>
