package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principalADM_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Criar usuário</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
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
      out.write("        </style>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <nav class=\"navbar navbar-expand-sm bg-primary fixed-top navbar-dark\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <a href=\"principalADM.jsp\" class=\"nav-item\"><img src=\"img/logo1.png\" class=\"navbar-brand nav-link\"></a>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"perfil.jsp\" class=\"nav-link\">Perfil</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"criarUsuario2.jsp\" class=\"nav-link\">Usuários</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"disciplina.jsp\" class=\"nav-link\">Disciplinas</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"contatos.jsp\" class=\"nav-link\">Contatos</a></li>\n");
      out.write("                   <li class=\"nav-item\"><a href=\"index.jsp\" class=\"nav-link\">Sair</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <figure class=\"text-center\">\n");
      out.write("                        <img src=\"img/perfil.png\" class=\"img1\"/>\n");
      out.write("                        <a href=\"perfil.jsp\"><figcaption>Perfil</figcaption></a>\n");
      out.write("                    </figure> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <figure class=\"text-center\">\n");
      out.write("                        <img src=\"img/usuario.jpg\" class=\"img1\"/>\n");
      out.write("                        <a href=\"criarUsuario2.jsp\"><figcaption>Usuários</figcaption></a>\n");
      out.write("                    </figure> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <figure class=\"text-center\">\n");
      out.write("                        <img src=\"img/disciplina.jpg\" id=\"img1\"/>\n");
      out.write("                        <a href=\"disciplina.jsp\"><figcaption>Disciplinas</figcaption></a>\n");
      out.write("                    </figure> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <figure class=\"text-center\">\n");
      out.write("                        <img src=\"img/contato.png\" class=\"img1\"/>\n");
      out.write("                        <a href=\"contato.jsp\"><figcaption>Contatos</figcaption></a>\n");
      out.write("                    </figure> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </main>    \n");
      out.write("        <div class=\"container-fluid fixed-bottom\">\n");
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
