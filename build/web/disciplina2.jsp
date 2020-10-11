<%--
    Document   : disciplina2
    Created on : 22/09/2020, 18:47:01
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplinas</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head
    <body>
        <style>
            .img1
            {
                width: 250px
            }
            #img1
            {
                width: 275px
            }
            .tamanho
            {
                font-size: 14px
            }
            #footer{
                margin-top: 242.9px;
                border-top: 1px solid black;
                position:absolute;
                bottom:0;
                width:100%;
                flex-shrink: 0;
            }
            button{
               margin-left: 110px;                
            }
        </style>
        <div class="container-fluid">
            <nav class="navbar navbar-expand-sm bg-primary fixed-top navbar-dark">
                <ul class="navbar-nav">
                    <a href="principalADM.jsp" class="nav-item"><img src="img/logo1.png" class="navbar-brand nav-link"></a>
                    <li class="nav-item"><a href="perfil.jsp" class="nav-link">Perfil</a></li>
                    <li class="nav-item"><a href="criarUsuario2.jsp" class="nav-link">Usuários</a></li>
                    <li class="nav-item"><a href="disciplina.jsp" class="nav-link">Disciplinas</a></li>
                    <li class="nav-item"><a href="contatos.jsp" class="nav-link">Contatos</a></li>
                    <li class="nav-item"><a href="index.jsp" class="nav-link">Sair</a></li>
                </ul>
            </nav>
        </div><br/><br/><br/><br/><br/><br/>
        <div class="container-fluid">
            <form action="disciplina.jsp" method="post"  class="alert alert-primary">
                <h1 class="text-center">Nova Disciplina:</h1><br/>
                <div class="form-row">
                    <div class="col-md-6">
                        Nome da Disciplina:<br/><br/>
                        <input type="text" name="txtNomeDscp" placeholder="Digite a disciplina" required="required" class="form-control"/>
                    </div>
                    <div class="col-md-6">
                        Carga Horaria:<br/><br/>
                        <input type="number" name="txtCargaHor" placeholder="Digite a carga horaria" required="required" class="form-control"/><br/><br/>
                    </div>
                    <div class="text-center col-md-11">
                        <button type="submit" id="botao" class="btn btn-primary">Cadastrar</button><br/><br/><br/>
                    </div>
                </div>
            </form>
        </div>
        <div class="container-fluid" id="footer">
            <div class="row bg-warning">
                <div class="col-md-4">
                    <strong>Telefone:</strong><span class="tamanho"> (11) 2615-7272</spam>
                </div>
                <div class="col-md-4">
                    <strong>E-mail:</strong> <span class="tamanho">atendimentoNorte@cruzeirodonorte.com.br</span><br/><br/>
                </div>
                <div class="col-md-4">
                    <strong>Endereço:</strong> <span class="tamanho">Rua Mafalda, 1000 - São Paulo - SP - CEP: 03320-214</span><br/><br/>
                </div>
            </div>
        </div>
    </body>
</html>
