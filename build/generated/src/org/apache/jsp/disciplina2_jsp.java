package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class disciplina2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Disciplinas</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("    </head\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .img1\n");
      out.write("            {\n");
      out.write("                width: 250px\n");
      out.write("            }\n");
      out.write("            #img1\n");
      out.write("            {\n");
      out.write("                width: 275px\n");
      out.write("            }\n");
      out.write("            .tamanho\n");
      out.write("            {\n");
      out.write("                font-size: 14px\n");
      out.write("            }\n");
      out.write("            #footer{\n");
      out.write("                margin-top: 242.9px;\n");
      out.write("                border-top: 1px solid black;\n");
      out.write("                position:absolute;\n");
      out.write("                bottom:0;\n");
      out.write("                width:100%;\n");
      out.write("                flex-shrink: 0;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("               margin-left: 110px;                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <nav class=\"navbar navbar-expand-sm bg-primary fixed-top navbar-dark\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <a href=\"principalADM.jsp\" class=\"nav-item\"><img src=\"img/logo1.png\" class=\"navbar-brand nav-link\"></a>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"perfil.jsp\" class=\"nav-link\">Perfil</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"criarUsuario2.jsp\" class=\"nav-link\">Usuários</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"disciplina.jsp\" class=\"nav-link\">Disciplinas</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"contatos.jsp\" class=\"nav-link\">Contatos</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"index.jsp\" class=\"nav-link\">Sair</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div><br/><br/><br/><br/><br/><br/>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <form action=\"disciplina.jsp\" method=\"post\"  class=\"alert alert-primary\">\n");
      out.write("                <h1 class=\"text-center\">Nova Disciplina:</h1><br/>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        Nome da Disciplina:<br/><br/>\n");
      out.write("                        <input type=\"text\" name=\"txtNomeDscp\" placeholder=\"Digite a disciplina\" required=\"required\" class=\"form-control\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        Carga Horaria:<br/><br/>\n");
      out.write("                        <input type=\"number\" name=\"txtCargaHor\" placeholder=\"Digite a carga horaria\" required=\"required\" class=\"form-control\"/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text-center col-md-11\">\n");
      out.write("                        <button type=\"submit\" id=\"botao\" class=\"btn btn-primary\">Cadastrar</button><br/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\" id=\"footer\">\n");
      out.write("            <div class=\"row bg-warning\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <strong>Telefone:</strong><span class=\"tamanho\"> (11) 2615-7272</spam>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <strong>E-mail:</strong> <span class=\"tamanho\">atendimentoNorte@cruzeirodonorte.com.br</span><br/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <strong>Endereço:</strong> <span class=\"tamanho\">Rua Mafalda, 1000 - São Paulo - SP - CEP: 03320-214</span><br/><br/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
