<%-- 
    Document   : CadastroProduto
    Created on : 09/10/2022, 11:15:55
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produto</title>
         <!-- Linha para utilizar o bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <!-- Linha para utilizar o JavaScript -->
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
       
    </head>
    <body>
    <center>
        <h1>Cadastro de Produto</h1>
        <form action="cadastro.do" method="POST">
            Nome do Produto: <input type="text" name="nomeProduto"><br><br>
            Preço do produto: <input type="text" name="precoProduto"><br><br>
            Categoria: <input type="text" name="categoriaProduto"><Br><br>
            Quantidade: <input type="text" name="quantidadeProduto" size="8"><br><br>
            <input type="submit" value="Cadastrar">
            
        </form>
     </center>
    </body>
</html>
