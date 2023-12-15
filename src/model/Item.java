package Locadora.model;

import Locadora.database.ExceptionDAO;
import Locadora.database.ItemDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Item implements Serializable {
    private Integer codItem;
    private String tipo;
    private double preço;
    private Date dataLocação;
    private Date dataDevolução;
    private Filme filme;
    private Cliente cliente;
    
    public Item(){
        
    }

    public Item(Integer codFilme, String tipo, double preço) {
        this.tipo = tipo;
        this.preço = preço;  
        Filme filme = new Filme();
        filme.setCodFilme(codFilme);
        this.filme = filme;
    }

    public Integer getCodItem() {
        return codItem;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public Date getDataLocação() {
        return dataLocação;
    }

    public void setDataLocação(Date dataLocação) {
        this.dataLocação = dataLocação;
    }

    public Date getDataDevolução() {
        return dataDevolução;
    }

    public void setDataDevolução(Date dataDevolução) {
        this.dataDevolução = dataDevolução;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void cadastrarItem (Item item) throws ExceptionDAO, ClassNotFoundException{
        new ItemDAO().cadastrarItem(item);
    }
    
    public ArrayList<Item> listarItens(String titulo) throws ExceptionDAO, SQLException, ClassNotFoundException {
        return new ItemDAO().listarItem(titulo);
    }
    
    public void alterarItem(Item item) throws ExceptionDAO, ClassNotFoundException{
        new ItemDAO().alterarItem(item);
    }
    
    public void apagarItem(Item item) throws ExceptionDAO, ClassNotFoundException {
        new ItemDAO().apagarItem(item);
    }
}
