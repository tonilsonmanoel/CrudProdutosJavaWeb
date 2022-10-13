<%-- 
    Document   : listar
    Created on : 09/10/2022, 12:23:55
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.com.controle.Produto"%>
<%@page import="br.com.DAO.ManterProduto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Produtos</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <!-- Linha para utilizar o JavaScript -->
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
       
    </head>
    <body>
 <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Codigo</th>
      <th scope="col">Nome</th>
      <th scope="col">Preço</th>
      <th scope="col">Categoria</th>
      <th scope="col">Quantidade</th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  
  
        <%
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
              
        %>
              
            <tr>
              <th scope="row"><%=vcodigo%></th>
              <td><%=vnome%></td>
              <td><%=vpreco%></td>
              <td><%=vcategoria%></td>
              <td><%=vquantidade%></td>
            
              <td><a href="busca.do?codigo=<%=vcodigo%>" >Alterar</a></td>
              <td>
                   <a href="del?codigo=<%=vcodigo%>" onclick="return confirm('Confirma exclusão do registro <%=vnome%>?')">excluir </a>   
                 
              </td>
            </tr>
          
            <%} 
        %>
         
        </table>
    </body>
</html>
