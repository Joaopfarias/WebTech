<%-- 
    Document   : listaAlunos
    Created on : 10/10/2020, 15:20:12
    Author     : joao_
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelos.Usuario"%>
<%@page import="DAO.usuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/estilo5.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Alunos</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="TelaPrincipal.jsp"><img src="img/Icone.png" width="50" height="50" class="d-inline-block align-top" alt=""></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Alterna navegação">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse text-right" id="navbarToggleExternalContent">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="perfil.jsp">Perfil</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="lancarNotas2.jsp">Notas<span class="sr-only">(Página atual)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="lancarFaltas2.jsp">Faltas</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="disciplinasProfessor.jsp">Disciplinas</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Sair</a>
                    </li>
                </ul>
            </div>
        </nav></br>

        <script>
            function buscarAluno() {
                var disciplina = $("#txtdisciplina").val();
                $(function () {
                    $.ajax({
                        url: "listaAlunoServlet.jsp",
                        type: "GET",
                        data: "disciplina=" + disciplina,
                        success: function (data) {
                            $("#tabela").html(data);
                            alert("sa");
                        },
                        error: function (xhr) {
                            alert(xhr.responseText);
                        }
                    });
                });
            }
        </script>

        <div class="container-fluid mb-3">
            <div class="form-row justify-content-center">
                <div class="col-md-8">
                    Disciplina: <br/>
                    <select name="txtdisciplina" id="txtdisciplina" required="required" class="form-control">
                        <option>Qualidade de Software</option>
                        <option>Análise e Projeto de Sistemas</option>
                        <option>Computação Paralela e Distribuida</option>
                    </select>
                </div>
                <div class="text-center col-md-2"><br/>
                    <button type="submit" id="botao" class="btn btn-primary form-control" onclick="buscarAluno()">Buscar</button><br/><br/>
                </div>
            </div>
        </div>

        <%
            try {
                out.print("<table border=1 class='table table-striped'>");
                out.print("<tr>");
                out.print("<th>RGM</th><th>Nome</th><th>E-mail</th><th>Curso</th>");
                out.print("</tr>");
                usuarioDAO usd = new usuarioDAO();
                ArrayList<Usuario> lista = usd.listarAluno();
                for (int num = 0; num < lista.size(); num++) {
                    out.print("<tr>");
                    out.print("<td>" + lista.get(num).getRGM() + "</td>");
                    out.print("<td><a href='lancarNotas2.jsp?RGM=" + lista.get(num).getRGM()
                            + "&NOME=" + lista.get(num).getNome()
                            + "&CURSO=" + lista.get(num).getCurso() + "'>"
                            + lista.get(num).getNome() + "</a></td>"
                    );
                    out.print("<td>" + lista.get(num).getEmail() + "</td>");
                    out.print("<td>" + lista.get(num).getCurso() + "</td>");
                    out.print("</tr>");
                }
                out.print("</table>");
            } catch (Exception erro) {
                throw new RuntimeException("Erro 10: " + erro);
            }
        %>

        </br></br></br><footer class="page-footer font-small pt-3 text-black bg-light" style="position: fixed;bottom: 0;width: 100%;">
            <div class="container-fluid text-center text-md-left">
                <div class="row">
                    <div class="col-md-3">
                        <spam>Telefone: (11) 2615-7272</spam>
                    </div>
                    <div class="col-md-5">
                        <spam>Endereço: Rua Mafalda, 1000 - São Paulo - SP - CEP: 03320-214</spam>
                    </div>
                    <div class="col-md-4">
                        <spam>E-mail: AtendimentoNorte@cruzeirodonorte.com.br</spam>
                    </div>
                </div>
            </div></br>
        </footer>
    </body>
</html>

