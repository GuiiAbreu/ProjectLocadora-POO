package Locadora.database;

import Locadora.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO {
    
    public void cadastrarCliente(Cliente cliente) throws ExceptionDAO, ClassNotFoundException {
        String sql = "insert into cliente (nome, cpf, email, endereço, dtnascimento) values (?,?,?,?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cliente.getNome());
            pStatement.setString(2, cliente.getCpf());
            pStatement.setString(3, cliente.getEmail());
            pStatement.setString(4, cliente.getEndereco());
            pStatement.setDate(5, new Date(cliente.getDtNascimento().getTime()));
            pStatement.execute();
        } catch (SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar o cliente: " + e);
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
    
    public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDAO, ClassNotFoundException {
        String sql = "select * from cliente where nome like '%" + nome + "%' order by nome";
        
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Cliente> clientes = null;
        
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery();
            
            if (rs != null) {
                clientes = new ArrayList<>();
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setCodCliente(rs.getInt("codCliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setEndereco(rs.getString("endereço"));
                    cliente.setDtNascimento(rs.getDate("dtnascimento"));
                    clientes.add(cliente);
                }
            }
            
        } catch (SQLException e) {
            try {
                throw new ExceptionDAO ("erro ao consultar clientes: " + e);
            } catch (ExceptionDAO ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                if (connection != null) {connection.close();}               
            } catch (SQLException e) {
                try {
                    throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
                } catch (ExceptionDAO ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        }
        return clientes;
    }
    
    public void alterarCliente(Cliente cliente) throws ExceptionDAO, ClassNotFoundException {
        String sql = "Update cliente set nome = ?, cpf = ?, email = ?, endereço = ?, dtnascimento = ? where codCliente = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cliente.getNome());
            pStatement.setString(2, cliente.getCpf());
            pStatement.setString(3, cliente.getEmail());
            pStatement.setString(4, cliente.getEndereco());
            pStatement.setDate(5, new Date(cliente.getDtNascimento().getTime()));
            pStatement.setInt(6, cliente.getCodCliente());
            pStatement.execute();
            
        } catch (SQLException e){
            throw new ExceptionDAO("Erro ao alterar o cliente: " + e);
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
    
    public void apagarCliente(Cliente cliente) throws ExceptionDAO, ClassNotFoundException {
        String sql = "Delete from cliente where codCliente = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConFactory().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, cliente.getCodCliente());       
            pStatement.execute();
        } catch (SQLException e){
            throw new ExceptionDAO("Erro ao apagar o cliente: " + e);
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
