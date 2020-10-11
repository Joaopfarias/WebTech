package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class criarDisciplina2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Disciplinas</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("    </head\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"TelaPrincipal.jsp\"><img src=\"img/Icone.png\" width=\"50\" height=\"50\" class=\"d-inline-block align-top\" alt=\"\"></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarToggleExternalContent\" aria-controls=\"navbarToggleExternalContent\" aria-expanded=\"false\" aria-label=\"Alterna navegação\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse text-right\" id=\"navbarToggleExternalContent\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"perfil.jsp\">Perfil</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"usuarios.jsp\">Usuários</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"disciplinas.jsp\">Disciplinas</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"contatos.jsp\">Contatos</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Cadastros<span class=\"sr-only\">(Página atual)</span></a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"criarUsuario2.jsp\">Cadastrar Usuario</a>\n");
      out.write("                            <a class=\"dropdown-item active\" href=\"criarDisciplina2.jsp\">Cadastrar Disciplina<span class=\"sr-only\">(Página atual)</span></a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"criarCurso2.jsp\">Cadastrar Curso</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"criarTurma2\">Cadastrar Turma</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"criarSemestre2\">Cadastrar Semestre</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Sair</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav></br>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <form action=\"criarDisciplina.jsp\" method=\"post\"  class=\"alert bg-light\">\n");
      out.write("                <h1 class=\"text-center\">Nova Disciplina:</h1><br/>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        Nome da Disciplina:<br/><br/>\n");
      out.write("                        <input type=\"text\" name=\"txtNOME\" id=\"txtNOME\" placeholder=\"Digite a disciplina\" required=\"required\" class=\"form-control\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        Carga Horaria:<br/><br/>\n");
      out.write("                        <input type=\"number\" name=\"txtCARGAHORARIA\" id=\"txtCARGAHORARIA\" placeholder=\"Digite a carga horaria\" required=\"required\" class=\"form-control\"/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        Curso: <br/><br/>\n");
      out.write("                        <select name=\"txtCURSOS\" id=\"txtCURSOS\" required=\"required\" class=\"form-control\">\n");
      out.write("                            <option></option>\n");
      out.write("                            <option>ADS</option>\n");
      out.write("                            <option>CDC</option>\n");
      out.write("                            <option>SDI</option>\n");
      out.write("                        </select><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text-center col-md-11\">\n");
      out.write("                        <button type=\"submit\" id=\"botao\" class=\"btn btn-primary\">Cadastrar</button><br/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        </br></br></br><footer class=\"page-footer font-small pt-3 text-black bg-light\" style=\"position: fixed;bottom: 0;width: 100%;\">\n");
      out.write("            <div class=\"container-fluid text-center text-md-left\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <spam>Telefone: (11) 2615-7272</spam>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <spam>Endereço: Rua Mafalda, 1000 - São Paulo - SP - CEP: 03320-214</spam>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <spam>E-mail: AtendimentoNorte@cruzeirodonorte.com.br</spam>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div></br>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
