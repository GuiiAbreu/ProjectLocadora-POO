package Locadora.database;

import Locadora.model.Filme;
import Locadora.model.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ItemDAO {
     public void cadastrarItem(Item item) throws ExceptionDAO, ClassNotFoundException{
        
        String sql = "insert into item (codFilme, preço, tipo) values (?,?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, item.getFilme().getCodFilme());
            pStatement.setDouble(2, item.getPreço());
            pStatement.setString(3, item.getTipo());
            pStatement.execute();
        } catch (SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar o item: " + e);
        } finally {
            try {
                if (pStatement != null) {pStatement.close();}
            } catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            } try {
                if (connection != null) {connection.close();}
            } catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
    }
    
     public ArrayList<Item> listarItem (String titulo) throws ExceptionDAO, SQLException, ClassNotFoundException{
        String sql = "select it.codItem, it.preço, it.tipo, fi.codFilme, fi.titulo "
                + "from item it, filme fi where it.codFilme = fi.codFilme and "
                + "fi.titulo like '%" + titulo + "%' order by fi.titulo";
        
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Item> itens = null;
                
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery();
            
            if(rs != null){
                itens = new ArrayList<>();
                while (rs.next()) {
                    Item item = new Item();
                    item.setCodItem(rs.getInt("CodItem"));
                    item.setPreço(rs.getDouble("Preço"));
                    item.setTipo(rs.getString("Tipo"));
                    Filme filme = new Filme();
                    filme.setCodFilme(rs.getInt("CodFilme"));               
                    filme.setTitulo(rs.getString("Titulo"));
                    item.setFilme(filme);
                    itens.add(item);
                }
            }
                    
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao consultar itens: " + e);
        } finally {
            try {
                if(pStatement!=null) {pStatement.close();}
            } catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar o pStatemnet: " + e);
            }
            try {
                if(connection!=null) {connection.close();}
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
        return itens;
    }
     
    public void alterarItem(Item item) throws ExceptionDAO, ClassNotFoundException{
        
        String sql = "update item set codFilme = ?, preço = ?, tipo = ? where codItem = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, item.getFilme().getCodFilme());
            pStatement.setDouble(2, item.getPreço());
            pStatement.setString(3, item.getTipo());
            pStatement.setInt(4, item.getCodItem());
            pStatement.execute();
        } catch (SQLException e){
            throw new ExceptionDAO("Erro ao alterar o item: " + e);
        } finally {
            try {
                if (pStatement != null) {pStatement.close();}
            } catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            } try {
                if (connection != null) {connection.close();}
            } catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
    }
    
    public void apagarItem(Item item) throws ExceptionDAO, ClassNotFoundException{
        
        String sql = "Delete from item where codItem = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, item.getCodItem());
            pStatement.execute();
        } catch (SQLException e){
            throw new ExceptionDAO("Erro ao apagar o item: " + e);
        } finally {
            try {
                if (pStatement != null) {pStatement.close();}
            } catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            } try {
                if (connection != null) {connection.close();}
            } catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
    }
}
