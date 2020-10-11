<%-- 
    Document   : TelaPrincipal
    Created on : 29/09/2020, 22:21:49
    Author     : joao_
--%>

<%@page import="Modelos.Usuario"%>
<%@page import="DAO.usuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela Principal</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="TelaPrincipal.jsp"><img src="img/Icone.png" width="50" height="50" class="d-inline-block align-top" alt=""></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Alterna navegação">
                <span class="navbar-toggler-icon"><span class="sr-only">(Página atual)</span></span>
            </button>
            <div class="collapse navbar-collapse text-right" id="navbarToggleExternalContent">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="perfil.jsp">Perfil</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="lancarNotas2.jsp">Notas</a>
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
