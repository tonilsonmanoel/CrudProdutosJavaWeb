/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.controle.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ManterProduto extends DAO {
    public void inserir(Produto pd) throws Exception{
        try {
            abrirBanco();
            String query = "INSERT INTO produtos(codigo,nome,preco,categoria,quantidade) value(null,?,?,?,?)";
            ps= (PreparedStatement) con.prepareStatement(query);
            ps.setString(1, pd.getNome());
            ps.setDouble(2, pd.getPreco());
            ps.setString(3, pd.getCategoria());
            ps.setInt(4, pd.getQuantidade());
            ps.execute();
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro"+ e.getMessage());
        }   
    }
    
    public ArrayList pesquisarTudo(){
        ArrayList<Produto> listapo = new ArrayList<Produto>();
       
        try {
            abrirBanco();
            String query = "select * FROM produtos";
            ps = con.prepareStatement(query);
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                Produto ntcben = new Produto();
                ntcben.setCodigo(rs.getInt("codigo"));
                ntcben.setNome(rs.getString("nome"));
                ntcben.setPreco(rs.getDouble("preco"));
                ntcben.setCategoria(rs.getString("categoria"));
                ntcben.setQuantidade(rs.getInt("quantidade"));
                listapo.add(ntcben);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return listapo;
    }
    //Inicio metodo deletar banco
    public void deletar(Produto po) throws Exception{
        try {
            abrirBanco();
            String query = "DELETE FROM produtos WHERE codigo=?";
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setInt(1, po.getCodigo());
            ps.execute();
            fecharBanco();
            
        } catch (Exception e) {
            System.out.println("Error"+ e.getMessage());
        }
    }
    //fim metodo deletar banco
    public  Produto pesquisar(Produto po) throws Exception{
        try {
            abrirBanco();
            String query = "select * FROM produtos where codigo=?";
            ps= con.prepareStatement(query);
            ps.setInt(1, po.getCodigo());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                po.setCodigo(rs.getInt("codigo"));
                po.setNome(rs.getString("nome"));
                po.setPreco(rs.getDouble("preco"));
                po.setCategoria(rs.getString("categoria"));
                po.setQuantidade(rs.getInt("quantidade"));
                return po;
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
        return null;
    }
    
    public void atulizar(Produto po) throws Exception{
        try {
            abrirBanco();
            String query="UPDATE produtos SET nome=?,preco=?,categoria=?,quantidade=? WHERE codigo=?";
            ps = con.prepareStatement(query);
           ps.setString(1, po.getNome());
           ps.setDouble(2, po.getPreco());
           ps.setString(3, po.getCategoria());
           ps.setInt(4, po.getQuantidade());
           ps.setInt(5, po.getCodigo());
           ps.executeUpdate();
           fecharBanco();
        } catch (Exception e) {
            System.out.println("Error "+ e.getMessage());
        }
    }
    
    
}
