package Locadora.model;

import Locadora.database.ExceptionDAO;
import Locadora.database.FilmeDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

public class Filme implements Serializable {
    
    private Integer codFilme;
    private String titulo;
    private String genero;
    private String sinopse;
    private Integer duração;
    private ArrayList<Item> itens;

    public Filme() {this.itens = new ArrayList<>();}
    
    

    /*public Filme(String titulo, String genero, String sinopse, Integer codFilme) {
        this.itens = new ArrayList<>();
        this.codFilme = codFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duração = duração;
    }*/

    public Filme(String titulo, String genero, String sinopse, Integer duração) {
        this.codFilme = codFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duração = duração;
    }
     
    
    public Integer getCodFilme() {
        return codFilme;
    }

    public void setCodFilme(Integer codFilme) {
        this.codFilme = codFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getDuração() {
        return duração;
    }

    public void setDuração(Integer duração) {
        this.duração = duração;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    
    public void cadastrarFilme (Filme filme) throws ExceptionDAO, ClassNotFoundException{
        new FilmeDAO().cadastrarFilme(filme);
    }
    
    public ArrayList<Filme> listarFilmes(String nome) throws ExceptionDAO, SQLException, ClassNotFoundException{
        return new FilmeDAO().listarFilmes(nome);
    }

    public void alterarFilme(Filme filme) throws ExceptionDAO, ClassNotFoundException {
        new FilmeDAO().alterarFilme(filme);
    }
    
    public void apagarFilme(Filme filme) throws ExceptionDAO, ClassNotFoundException {
        new FilmeDAO().apagarFilme(filme);
    }
    
    @Override
    public String toString() {
        return "Filme{" + "codFilme=" + codFilme + ", titulo=" + titulo + ", genero=" + genero + ", dura\u00e7\u00e3o=" + duração + ", itens=" + itens + '}';
    }
    
    
}
