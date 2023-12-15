package Locadora.controller;

import Locadora.database.ExceptionDAO;
import Locadora.model.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author guilh
 */
public class ClienteController {
    
    public boolean cadastrarCliente(String nome, String cpf, String endereco, String email, String dtNascimento) throws ParseException, ExceptionDAO, ClassNotFoundException{
        
        if(nome != null && nome.length()>0 && validarCPF(cpf) && endereco != null && endereco.length()>0 
                && email != null && email.length()>0 && validarData(dtNascimento)){
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dtNascimento);
            Cliente cliente = new Cliente(nome, cpf, endereco, email, data);
            cliente.cadastrarCliente(cliente);
            return true;
        }
        return false;
    }
    
    public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDAO, ClassNotFoundException {
        return new Cliente().listarClientes(nome);
    }
    
    public boolean alterarCliente(int codCliente, String nome, String cpf, String endereco, String email, String dtNascimento) throws ParseException, ExceptionDAO, ClassNotFoundException{
        
        if(nome != null && nome.length()>0 && validarCPF(cpf) && endereco != null && endereco.length()>0 
                && email != null && email.length()>0 && validarData(dtNascimento)){
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dtNascimento);
            Cliente cliente = new Cliente(nome, cpf, endereco, email, data);
            cliente.setCodCliente(codCliente);
            cliente.alterarCliente(cliente);
            return true;
        }
        return false;
    }
    
    public boolean apagarCliente(int codCliente) throws ExceptionDAO, ClassNotFoundException {
        if(codCliente == 0)
            return false;
            else {
            Cliente cliente = new Cliente();
            cliente.setCodCliente(codCliente);
            cliente.apagarCliente(cliente);
            return true;
        }
    }
    
    public boolean validarCPF(String cpf){
        for(int i=0; i < cpf.length(); i++){
            if(!Character.isDigit(cpf.charAt(i))){
                if(!( i==3 || i==7 ||i==11)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean validarData(String data){
        for(int i=0; i < data.length(); i++){
            if(!Character.isDigit(data.charAt(i))){
                if(!( i==2 || i==5)){
                    return false;
                }
            }
        }
        return true;
    }
}

