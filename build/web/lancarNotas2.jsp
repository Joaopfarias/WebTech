<%-- 
    Document   : TelaPrincipal
    Created on : 29/09/2020, 22:21:49
    Author     : joao_
--%>

<%@page import="Modelos.Usuario"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DAO.CONECTA"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lançamento de Notas</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head
    <body id="body">
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
        <style>
            input:invalid {
                border-color: red !important;
            }
            input:valid {
                border-color: green !important;
            }
        </style>
        <script>
            window.onload = function () {

                txtn4 = document.getElementById("txtn4");
                txtn4.onkeyup = funcao1;
                txtaf = document.getElementById("txtaf");
                txtaf.onkeyup = funcao2;
            }

            function funcao1() {
                var txtn1 = document.getElementById("txtn1");
                var txtn2 = document.getElementById("txtn2");
                var txtn3 = document.getElementById("txtn3");
                var txtn4 = document.getElementById("txtn4");
                result = document.getElementById("txtnf");
                result.value = parseFloat(txtn1.value) + parseFloat(txtn2.value) + parseFloat(txtn3.value) + parseFloat(txtn4.value);
            }
            function funcao2() {

                var txtn1 = document.getElementById("txtn1");
                var txtn2 = document.getElementById("txtn2");
                var txtn3 = document.getElementById("txtn3");
                var txtn4 = document.getElementById("txtn4");
                var txtaf = document.getElementById("txtaf");
                result = document.getElementById("txtnf");
                result.value = parseFloat(txtn1.value) + parseFloat(txtn2.value) + parseFloat(txtn3.value) + parseFloat(txtn4.value) + parseFloat(txtaf.value);
            }

            function buscarRGM() {
                var rgm = document.getElementById("txtrgm").value;
                if (rgm == "") {
                    alert("Preencha o campo de RGM");
                } else {
                    $(function () {
                        var rgm = $("#txtrgm").val();
                        $.ajax({
                            url: "lancarNome.jsp",
                            type: "GET",
                            data: "rgm=" + rgm,
                            success: function (data) {
                                if (data != "") {
                                    $("#txtnome").val(data);
                                }
                            },
                            error: function (xhr) {
                                alert(xhr.responseText);
                            }
                        });
                        $.ajax({
                            url: "lancarCurso.jsp",
                            type: "GET",
                            data: "rgm=" + rgm,
                            success: function (data) {
                                $("#txtcurso").val(data);
                            },
                            error: function (xhr) {
                                alert(xhr.responseText);
                            }
                        });
                    });
                }
            }
        </script>

        <div class="container-fluid mb-3">
            <form action="lancarNotas.jsp" method="post"  class="alert alert-primary bg-light">
                <h1 class="text-center">Lançar Notas:</h1><br/>
                <div class="form-row">
                    <div class="col-md-3">
                        RGM:<br/><br/>
                        <input type="text" name="txtrgm" id="txtrgm" pattern="[300000-499999s]+$" placeholder="Digite o RGM do Aluno" required="required" value="<%=request.getParameter("RGM")%>" disabled="true" class="form-control"/>
                    </div>
                    <div class="col-md-3">
                        Nome:<br/><br/>
                        <input type="text" name="txtnome" id="txtnome" placeholder="" required="required" value="<%=request.getParameter("NOME")%>"  class="form-control" disabled="true"/><br/><br/>
                    </div>
                    <div class="col-md-3">
                        Curso:<br/><br/>
                        <input type="text" name="txtcurso" id="txtcurso" placeholder="" required="required" value="<%=request.getParameter("CURSO")%>"  class="form-control" disabled="true"/><br/><br/>
                    </div>
                    <div class="col-md-3">
                        Disciplina: <br/><br/>
                        <select name="txtdisciplina" id="txtdisciplina" required="required" class="form-control">
                            <option><%=request.getParameter("DISCIPLINA")%></option>
                            <option>Qualidade de Software</option>
                            <option>Análise e Projeto de Sistemas</option>
                            <option>Computação Paralela e Distribuida</option>
                        </select>
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-3">
                        Nota 1:<br/><br/>
                        <input type="number" name="txtn1" id="txtn1" min="0.0" max="10.0" step=".01" value="0.0" required="required" class="form-control"/>
                    </div>
                    <div class="col-md-3">
                        Nota 2:<br/><br/>
                        <input type="number" name="txtn2" id="txtn2" min="0.0" max="10.0" step=".01" value="0.0" required="required" class="form-control"/>
                    </div>
                    <div class="col-md-3">
                        Nota 3:<br/><br/>
                        <input type="number" name="txtn3" id="txtn3" min="0.0" max="10.0" step=".01" value="0.0" required="required" class="form-control"/>
                    </div>
                    <div class="col-md-3">
                        Nota 4:<br/><br/>
                        <input type="number" name="txtn4" id="txtn4" min="0.0" max="10.0" step=".01" value="0.0" required="required" class="form-control"/>
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-6">
                        Nota AF:<br/><br/>
                        <input type="number" name="txtaf" id="txtaf" min="0.0" max="10.0" step=".01" value="0.0" required="required" class="form-control"/>
                    </div>
                    <div class="col-md-6">
                        Nota Final:<br/><br/>
                        <input type="number" name="txtnf" id="txtnf" min="0.0" max="10.0" step=".01" value="0.0" required="required" class="form-control" disabled="true"/>
                    </div>
                </div></br>
                <div class="text-center col-md-12">
                    <button type="submit" id="botao" class="btn btn-primary" onclick="buscarRGM()">Lançar Notas</button><br/><br/><br/>
                </div>
            </form>
        </div>

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
