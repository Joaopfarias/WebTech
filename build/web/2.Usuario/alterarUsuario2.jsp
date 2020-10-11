<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criar usuário</title>
        <link rel="stylesheet" href="css/estilo4.css"/>
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
                        <li class="nav-item">
                            <a class="nav-link" href="usuarios.jsp">Usuários</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="disciplinas.jsp">Disciplinas</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="contatos.jsp">Contatos<span class="sr-only">(Página atual)</span></a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Cadastros
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <a class="dropdown-item" href="criarUsuario2.jsp">Cadastrar Usuario</a>
                                <a class="dropdown-item" href="criarDisciplina2.jsp">Cadastrar Disciplina</a>
                                <a class="dropdown-item" href="criarCurso2.jsp">Cadastrar Curso</a>
                                <a class="dropdown-item" href="criarTurma2">Cadastrar Turma</a>
                                <a class="dropdown-item" href="criarSemestre2">Cadastrar Semestre</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="index.jsp">Sair</a>
                        </li>
                    </ul>
                </div>
            </nav></br>
        <main>  
            <form action="alterarUsuario.jsp" method="post">
                <h1>Novo usuário:</h1><br/><br/>
                Nome: <input type="text" name="txtnome" placeholder="Digite seu nome" required="required"/><br/><br/>
                E-mail: <input type="email" name="txtemail" placeholder="Digite seu e-mail" required="required"/><br/><br/>
                Senha: <input type="password" name="txtsenha" placeholder="Digite sua senha" required="required"/><br/><br/>
                Curso: <input type="text" name="txtcurso" placeholder="Digite o nome do curso" required="required"/><br/><br/>
                Tipo usuário: <select name="txttipousuario" required="required">
                    <option>Professor</option>
                    <option>Aluno</option>
                    <option>Administrador de Sistemas</option>
                </select>
                <br/><br/><button type="submit" id="botao">Cadastrar</button><br/><br/>
            </form><br/><br/>
        </main></br>
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
                        <spam>E-mail: AtendimentoNorte@cruzeirFodonorte.com.br</spam>
                    </div>
                </div>
            </div></br>
        </footer>
    </body>
</html>

