package Locadora.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import Locadora.database.ClienteDAO;
import Locadora.database.ExceptionDAO;

public class Cliente implements Serializable {
    private Integer codCliente;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private Date dtNascimento;
    private ArrayList<Item> itens = new ArrayList<Item>();

    public Cliente() {}

    public Cliente(String nome, String cpf, String endereco, String email, Date dtNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.dtNascimento = dtNascimento;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void cadastrarCliente(Cliente cliente) throws ExceptionDAO, ClassNotFoundException{
        new ClienteDAO().cadastrarCliente(cliente);
    }

    public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDAO, ClassNotFoundException {
        return new ClienteDAO().listarClientes(nome);
    }   
    
    public void alterarCliente(Cliente cliente) throws ExceptionDAO, ClassNotFoundException{
        new ClienteDAO().alterarCliente(cliente);
    }
    
    public void apagarCliente(Cliente cliente) throws ExceptionDAO, ClassNotFoundException{
        new ClienteDAO().apagarCliente(cliente);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + codCliente + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", email=" + email + ", dtNascimento=" + dtNascimento + ", itens=" + itens + '}';
    } 
}
