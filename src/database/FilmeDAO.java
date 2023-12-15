package Locadora.database;     


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Locadora.model.Filme;
import java.util.ArrayList;
import java.sql.ResultSet;

public class FilmeDAO {
    public void cadastrarFilme(Filme filme) throws ExceptionDAO, ClassNotFoundException{
        
        String sql = "insert into filme (titulo, gênero, sinopse, duração) values (?,?,?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, filme.getTitulo());
            pStatement.setString(2, filme.getGenero());
            pStatement.setString(3, filme.getSinopse());
            pStatement.setInt(4, filme.getDuração());
            pStatement.execute();
        } catch (SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar o filme: " + e);
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
    
    
    public ArrayList<Filme> listarFilmes (String titulo) throws ExceptionDAO, SQLException, ClassNotFoundException{
        String sql = "select * from filme where titulo like '%" + titulo + "%' order by titulo";
        
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Filme> filmes = null;
                
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery();
            
            if(rs != null){
                filmes = new ArrayList<>();
                while (rs.next()) {
                    Filme filme = new Filme();
                    filme.setCodFilme(rs.getInt("CodFilme"));
                    filme.setTitulo(rs.getString("Titulo"));
                    filme.setGenero(rs.getString("Gênero"));
                    filme.setSinopse(rs.getString("Sinopse"));
                    filme.setDuração(rs.getInt("Duração"));
                    filmes.add(filme);
                }
            }
                    
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao consultar filmes: " + e);
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
        return filmes;
    }
    
    public void alterarFilme(Filme filme) throws ExceptionDAO, ClassNotFoundException {
        String sql = "Update filme set titulo = ?, gênero = ?, sinopse = ?, duração = ?, where codFilme = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, filme.getTitulo());
            pStatement.setString(2, filme.getGenero());
            pStatement.setString(3, filme.getSinopse());
            pStatement.setInt(4, filme.getDuração());
            pStatement.setInt(5, filme.getCodFilme());
            pStatement.execute();
            
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao alterar filme: " + e);
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
    }
    
    
    public void apagarFilme(Filme filme) throws ExceptionDAO, ClassNotFoundException{
        
        String sql = "Delete from filme where codFilme = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, filme.getCodFilme());
            pStatement.execute();
        } catch (SQLException e){
            throw new ExceptionDAO("Erro ao apagar o filme: " + e);
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