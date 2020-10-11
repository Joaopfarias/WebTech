<%@page import="java.util.ArrayList"%>
<%@page import="Modelos.Usuario"%>
<%@page import="DAO.usuarioDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DAO.CONECTA"%>
<%
    CONECTA con = new CONECTA();
    Connection c = con.getConexao();
    usuarioDAO usd = new usuarioDAO();
    if (c != null) {
        if ((request.getParameter("rgm") != null)) {
            String rgm = request.getParameter("rgm");
            Statement st;
            ResultSet rs;
            st = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
            rs = st.executeQuery("SELECT NOME FROM ALUNO WHERE RGM ='" + rgm + "'");
            if (rs.next()) {
                    out.print(rs.getString("NOME"));
            }
        }
    } else {
        System.out.println("Não foi possível encontrar o Aluno");
    }
%>