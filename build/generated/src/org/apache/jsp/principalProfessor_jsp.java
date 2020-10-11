package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principalProfessor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Professor</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo2.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <a href=\"index.html\"><spam id=\"texto1\">Sair</spam></a>\n");
      out.write("        </header><br/>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"perfil.html\"><img src=\"img/perfil.png\" id=\"imagem1\"/></a></td>\n");
      out.write("                <td><a href=\"notas.html\"><img src=\"img/nota.png\" id=\"imagem2\"/></a></td>\n");
      out.write("                <td><a href=\"notas.html\"><img src=\"img/preseca.png\" id=\"imagem5\"/></a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><a id=\"texto2\" href=\"perfil.html\">Perfil</a></td>\n");
      out.write("                <td><a id=\"texto3\" href=\"notas.html\">Área de notas</a></td>\n");
      out.write("                <td><a id=\"texto7\" href=\"notas.html\">Área de faltas</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><br/></td>\n");
      out.write("                <td><br/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"anexo.html\"><img src=\"img/anexo.png\" id=\"imagem3\"></a></td>\n");
      out.write("                <td><a href=\"contatos.html\"><img src=\"img/contato.png\" id=\"imagem4\"/></a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><a id=\"texto4\" href=\"anexo.html\">Anexos e links</a></td>\n");
      out.write("                <td><a id=\"texto5\" href=\"contatos.html\">Contatos</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table><br/>\n");
      out.write("        <footer>\n");
      out.write("            <spam class=\"texto6\">Telefone: (11) 2615-7272</spam><br/><br/>\n");
      out.write("            <spam class=\"texto6\">E-mail: atendimentoNorte@cruzeirodonorte.com.br</spam><br/><br/>\n");
      out.write("            <spam class=\"texto6\">Endereço: Rua Mafalda, 1000 - São Paulo - SP - CEP: 03320-214</spam><br/><br/>\n");
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
