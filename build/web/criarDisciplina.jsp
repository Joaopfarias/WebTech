<%-- 
    Document   : disciplina
    Created on : 22/09/2020, 13:52:43
    Author     : Usuario
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelos.Disciplina"%>
<%@page import="DAO.disciplinaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplinas</title>
        <link rel="stylesheet" href="css/estiloDscp.css"/>
    </head>
    <body>
        <header>
            <a href="principalADM.jsp"><img id = "logo" src="img/logo1.png"/></a>
            <a href="index.jsp"><spam class="link">Sair</spam></a>
            <a href="perfil.html"><spam class="link">Perfil</spam></a>
            <a href="criarUsuario2.jsp"><spam class="link">Usuários</spam></a>
            <a href="disciplina.html"><spam class="link">Disciplinas</spam></a>
            <a href="contatos.html"><spam class="link">Contatos</spam></a>
        </header><br/>
        
        <%
            try
            {
                Disciplina dsp = new Disciplina();
                disciplinaDAO dsc = new disciplinaDAO();
                dsp.setNOME(request.getParameter("txtNOME"));
                dsp.setCARGAHORARIA(Integer.parseInt(request.getParameter("txtCARGAHORARIA")));
                dsp.setCURSOS(request.getParameter("txtCURSOS"));
                dsc.InserirDscp(dsp);
                response.sendRedirect("criarDisciplina2.jsp");
            }
            catch(Exception erro)
            {
                throw new RuntimeException("Erro 7 " + erro);
            }
        %>
        
        <br/><footer>
            <spam class="texto6">Telefone: (11) 2615-7272</spam><br/><br/>
            <spam class="texto6">E-mail: atendimentoNorte@cruzeirodonorte.com.br</spam><br/><br/>
            <spam class="texto6">Endereço: Rua Mafalda, 1000 - São Paulo - SP - CEP: 03320-214</spam><br/><br/>
        </footer>
    </body>
</html>
