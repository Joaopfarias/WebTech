package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modelos.Disciplina;
import DAO.disciplinaDAO;

public final class disciplina_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Disciplinas</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estiloDscp.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <a href=\"principalADM.jsp\"><img id = \"logo\" src=\"img/logo1.png\"/></a>\n");
      out.write("            <a href=\"index.jsp\"><spam class=\"link\">Sair</spam></a>\n");
      out.write("            <a href=\"perfil.html\"><spam class=\"link\">Perfil</spam></a>\n");
      out.write("            <a href=\"criarUsuario2.jsp\"><spam class=\"link\">Usuários</spam></a>\n");
      out.write("            <a href=\"disciplina.html\"><spam class=\"link\">Disciplinas</spam></a>\n");
      out.write("            <a href=\"contatos.html\"><spam class=\"link\">Contatos</spam></a>\n");
      out.write("        </header><br/>\n");
      out.write("        \n");
      out.write("        ");

            try
            {
                Disciplina dsp = new Disciplina();
                disciplinaDAO dsc = new disciplinaDAO();
                dsp.setNomeDscp(request.getParameter("txtNomeDscp"));
                dsp.setCargaHor(request.getParameter("txtCargaHor"));
                dsc.InserirDscp(dsp);
                response.sendRedirect("disciplina2.jsp");
            }
            catch(Exception erro)
            {
                throw new RuntimeException("Erro 7 " + erro);
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br/><footer>\n");
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
