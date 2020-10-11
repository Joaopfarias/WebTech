package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelos.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import DAO.CONECTA;

public final class lancarNotas2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lançamento de Notas</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("    </head\n");
      out.write("    <body id=\"body\">\n");
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
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"lancarNotas2.jsp\">Notas<span class=\"sr-only\">(Página atual)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"lancarFaltas2.jsp\">Faltas</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"disciplinasProfessor.jsp\">Disciplinas</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Sair</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav></br>\n");
      out.write("        <style>\n");
      out.write("            input:invalid {\n");
      out.write("                border-color: red !important;\n");
      out.write("            }\n");
      out.write("            input:valid {\n");
      out.write("                border-color: green !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            window.onload = function () {\n");
      out.write("\n");
      out.write("                txtn4 = document.getElementById(\"txtn4\");\n");
      out.write("                txtn4.onkeyup = funcao1;\n");
      out.write("                txtaf = document.getElementById(\"txtaf\");\n");
      out.write("                txtaf.onkeyup = funcao2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function funcao1() {\n");
      out.write("                var txtn1 = document.getElementById(\"txtn1\");\n");
      out.write("                var txtn2 = document.getElementById(\"txtn2\");\n");
      out.write("                var txtn3 = document.getElementById(\"txtn3\");\n");
      out.write("                var txtn4 = document.getElementById(\"txtn4\");\n");
      out.write("                result = document.getElementById(\"txtnf\");\n");
      out.write("                result.value = parseFloat(txtn1.value) + parseFloat(txtn2.value) + parseFloat(txtn3.value) + parseFloat(txtn4.value);\n");
      out.write("            }\n");
      out.write("            function funcao2() {\n");
      out.write("\n");
      out.write("                var txtn1 = document.getElementById(\"txtn1\");\n");
      out.write("                var txtn2 = document.getElementById(\"txtn2\");\n");
      out.write("                var txtn3 = document.getElementById(\"txtn3\");\n");
      out.write("                var txtn4 = document.getElementById(\"txtn4\");\n");
      out.write("                var txtaf = document.getElementById(\"txtaf\");\n");
      out.write("                result = document.getElementById(\"txtnf\");\n");
      out.write("                result.value = parseFloat(txtn1.value) + parseFloat(txtn2.value) + parseFloat(txtn3.value) + parseFloat(txtn4.value) + parseFloat(txtaf.value);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function buscarRGM() {\n");
      out.write("                var rgm = document.getElementById(\"txtrgm\").value;\n");
      out.write("                if (rgm == \"\") {\n");
      out.write("                    alert(\"Preencha o campo de RGM\");\n");
      out.write("                } else {\n");
      out.write("                    $(function () {\n");
      out.write("                        var rgm = $(\"#txtrgm\").val();\n");
      out.write("                        $.ajax({\n");
      out.write("                            url: \"lancarNome.jsp\",\n");
      out.write("                            type: \"GET\",\n");
      out.write("                            data: \"rgm=\" + rgm,\n");
      out.write("                            success: function (data) {\n");
      out.write("                                if (data != \"\") {\n");
      out.write("                                    $(\"#txtnome\").val(data);\n");
      out.write("                                }\n");
      out.write("                            },\n");
      out.write("                            error: function (xhr) {\n");
      out.write("                                alert(xhr.responseText);\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                        $.ajax({\n");
      out.write("                            url: \"lancarCurso.jsp\",\n");
      out.write("                            type: \"GET\",\n");
      out.write("                            data: \"rgm=\" + rgm,\n");
      out.write("                            success: function (data) {\n");
      out.write("                                $(\"#txtcurso\").val(data);\n");
      out.write("                            },\n");
      out.write("                            error: function (xhr) {\n");
      out.write("                                alert(xhr.responseText);\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid mb-3\">\n");
      out.write("            <form action=\"lancarNotas.jsp\" method=\"post\"  class=\"alert alert-primary bg-light\">\n");
      out.write("                <h1 class=\"text-center\">Lançar Notas:</h1><br/>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        RGM:<br/><br/>\n");
      out.write("                        <input type=\"text\" name=\"txtrgm\" id=\"txtrgm\" pattern=\"[300000-499999s]+$\" placeholder=\"Digite o RGM do Aluno\" required=\"required\" class=\"form-control\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"co1-md-1\"></br></br>\n");
      out.write("                        <input type=\"button\" class=\"btn btn-primary\" name=\"btnRGM\" id=\"btnRGM\" style=\"font-size: 15.09px;\" VALUE=\"Buscar RGM\" onclick=\"buscarRGM()\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        Nome:<br/><br/>\n");
      out.write("                        <input type=\"text\" name=\"txtnome\" id=\"txtnome\" placeholder=\"\" required=\"required\" class=\"form-control\" disabled=\"true\"/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        Curso:<br/><br/>\n");
      out.write("                        <input type=\"text\" name=\"txtcurso\" id=\"txtcurso\" placeholder=\"\" required=\"required\" class=\"form-control\" disabled=\"true\"/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    Disciplina: <br/><br/>\n");
      out.write("                    <select name=\"txtdisciplina\" id=\"txtdisciplina\" required=\"required\" class=\"form-control\">\n");
      out.write("                        <option></option>\n");
      out.write("                        <option>Qualidade de Software</option>\n");
      out.write("                        <option>Análise e Projeto de Sistemas</option>\n");
      out.write("                        <option>Computação Paralela e Distribuida</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                Nota 1:<br/><br/>\n");
      out.write("                <input type=\"number\" name=\"txtn1\" id=\"txtn1\" min=\"0\" max=\"10\" value=\"0.0\" required=\"required\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                Nota 2:<br/><br/>\n");
      out.write("                <input type=\"number\" name=\"txtn2\" id=\"txtn2\" min=\"0\" max=\"10\" value=\"0.0\" required=\"required\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                Nota 3:<br/><br/>\n");
      out.write("                <input type=\"number\" name=\"txtn3\" id=\"txtn3\" min=\"0\" max=\"10\" value=\"0.0\" required=\"required\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                Nota 4:<br/><br/>\n");
      out.write("                <input type=\"number\" name=\"txtn4\" id=\"txtn4\" min=\"0\" max=\"10\" value=\"0.0\" required=\"required\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                Nota AF:<br/><br/>\n");
      out.write("                <input type=\"number\" name=\"txtaf\" id=\"txtaf\" min=\"0\" max=\"10\" value=\"0.0\" required=\"required\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                Nota Final:<br/><br/>\n");
      out.write("                <input type=\"number\" name=\"txtnf\" id=\"txtnf\" min=\"0\" max=\"10\" value=\"0.0\" required=\"required\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("        </div></br>\n");
      out.write("        <div class=\"text-center col-md-12\">\n");
      out.write("            <button type=\"submit\" id=\"botao\" class=\"btn btn-primary\" onclick=\"buscarRGM()\">Lançar Notas</button><br/><br/><br/>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</br></br></br><footer class=\"page-footer font-small pt-3 text-black bg-light\" style=\"position: fixed;bottom: 0;width: 100%;\">\n");
      out.write("    <div class=\"container-fluid text-center text-md-left\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <spam>Telefone: (11) 2615-7272</spam>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-5\">\n");
      out.write("                <spam>Endereço: Rua Mafalda, 1000 - São Paulo - SP - CEP: 03320-214</spam>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <spam>E-mail: AtendimentoNorte@cruzeirodonorte.com.br</spam>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div></br>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
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
