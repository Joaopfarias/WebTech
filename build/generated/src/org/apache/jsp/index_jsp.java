package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelos.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import DAO.CONECTA;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body></br></br></br>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("\n");
      out.write("                background-image: url(\"img/login-background.png\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-size: 100% 100%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        ");

            CONECTA con = new CONECTA();
            Connection c = con.getConexao();
        
      out.write("\n");
      out.write("        <main class=\"d-flex justify-content-center\">\n");
      out.write("            <section class=\"alert-primary col-md-3\" style=\"background-color: rgb(250, 250, 250, 0.8);border-radius: 8px\">\n");
      out.write("                <form id=\"formulario\" action=\"index.jsp\" class=\"text-center\"></br>\n");
      out.write("                    <img class=\"mb-4\" src=\"img/baixados.png\" alt=\"\" width=\"172\" height=\"172\" style=\"border-radius: 50%\">\n");
      out.write("                    <input id=\"texto\" type=\"text\" name=\"login\" placeholder=\"Digite seu RGM\"  class=\"texto col-md-12 form-control\"/>\n");
      out.write("                    <input class=\"texto col-md-12 form-control\" type=\"password\" name=\"senha\" placeholder=\"Digite sua senha\"/><br/><br/>\n");
      out.write("                    <button type=\"submit\" id=\"botao\" class=\"btn btn-primary\">Entrar</button><br/><br/>\n");
      out.write("                </form>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        ");

            if (c != null) {
                if ((request.getParameter("login") != null) && (request.getParameter("senha") != null)) {
                    String login, senha;
                    login = request.getParameter("login");
                    senha = request.getParameter("senha");
                    Statement st;
                    ResultSet rs;
                    st = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
                    rs = st.executeQuery("SELECT RGM, SENHA from ADMSISTEMA where RGM ='" + login + "' and  SENHA ='" + senha + "'");
                    if (rs.next()) {
                        response.sendRedirect("principalADM.jsp");
                        Usuario usu = new Usuario();
                        usu.setRGM(Integer.parseInt(login));
                    }
                }
            } else {
                System.out.println("Não foi possível logar");
            }
        
      out.write("\n");
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
