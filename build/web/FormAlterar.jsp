<%-- 
    Document   : FormAlterar
    Created on : 09/10/2022, 19:31:35
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
       <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
       <title>Alterar</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
    </head>
  <body>
       <%  
       
        
         String vcodigo = (String) request.getAttribute("uCodigo").toString();
         String vnome    = (String) request.getAttribute("uNome").toString();
         String vpreco   = (String) request.getAttribute("uPreco").toString();
         String vcategoria =(String) request.getAttribute("uCategoria").toString();
        String vquantidade =(String) request.getAttribute("uQuantidade").toString();
    %>
      <form action="alter.do" method="POST">
          <input type="hidden" name="codigo" value="<%=vcodigo%>">
          Nome do Produto: <input type="text" name="nome" value="<%=vnome%>"><br>
          Preço do produto: <input type="text" name="preco" value="<%=vpreco%>"><br>
          Categoria:  <input type="text" name="categoria" value="<%=vcategoria%>"><br>
          Quantidade:  <input type="text" name="quantidade" value="<%=vquantidade%>"><br>
          <input type="submit" value="Alterar">
          
      </form>
        
    
  </body>
   
</html>
