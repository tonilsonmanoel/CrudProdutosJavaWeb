package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.com.controle.Produto;
import br.com.DAO.ManterProduto;

public final class listar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Listar Produtos</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Linha para utilizar o JavaScript -->\n");
      out.write("       <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <table class=\"table table-striped\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">Codigo</th>\n");
      out.write("      <th scope=\"col\">Nome</th>\n");
      out.write("      <th scope=\"col\">Preço</th>\n");
      out.write("      <th scope=\"col\">Categoria</th>\n");
      out.write("      <th scope=\"col\">Quantidade</th>\n");
      out.write("      <th scope=\"col\"></th>\n");
      out.write("      <th scope=\"col\"></th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("        ");

          String vcodigo="";
          String vnome="";
          String vpreco="";
          String vcategoria="";
          String vquantidade="";
          //String ac = (String) request.getAttribute("relatorio");
         
           ManterProduto dao = new ManterProduto();
           
           Produto po = new Produto();
            
             ArrayList<Produto> nt = dao.pesquisarTudo();
             
            for (int i = 0; i < nt.size(); i++) {                
                po = nt.get(i);
              vcodigo= String.valueOf(po.getCodigo()).toString();
              vnome = String.valueOf(po.getNome()).toString();
              vpreco = String.valueOf(po.getPreco()).toString();
              vcategoria = String.valueOf(po.getCategoria()).toString();
              vquantidade = String.valueOf(po.getQuantidade()).toString();
              
        
      out.write("\n");
      out.write("              \n");
      out.write("            <tr>\n");
      out.write("              <th scope=\"row\">");
      out.print(vcodigo);
      out.write("</th>\n");
      out.write("              <td>");
      out.print(vnome);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(vpreco);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(vcategoria);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(vquantidade);
      out.write("</td>\n");
      out.write("            \n");
      out.write("              <td><a href=\"busca.do?codigo=");
      out.print(vcodigo);
      out.write("\" >Alterar</a></td>\n");
      out.write("              <td>\n");
      out.write("                   <a href=\"del?codigo=");
      out.print(vcodigo);
      out.write("\" onclick=\"return confirm('Confirma exclusão do registro ");
      out.print(vnome);
      out.write("?')\">excluir </a>   \n");
      out.write("                 \n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("          \n");
      out.write("            ");
} 
        
      out.write("\n");
      out.write("         \n");
      out.write("        </table>\n");
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
