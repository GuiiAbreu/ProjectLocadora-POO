package Locadora.controller;

import Locadora.database.ExceptionDAO;
import Locadora.model.Filme;
import java.sql.SQLException;
import java.util.ArrayList;


public class FilmeController {
    
    public boolean cadastrarFilme(String titulo, String genero, String sinopse, Integer duração) throws ExceptionDAO, ClassNotFoundException{
        
        if(titulo != null && titulo.length()>0 && genero != null && genero.length()>0 && sinopse != null && sinopse.length()>0 && duração != null && duração > 0){
            
            Filme filme = new Filme(titulo, genero, sinopse, duração);
            filme.cadastrarFilme(filme);
            return true;
        }
        return (false);
    }
    
    public ArrayList<Filme> listarFilmes(String nome) throws ExceptionDAO, SQLException, ClassNotFoundException{
        return new Filme().listarFilmes(nome);
    }
    
    public boolean alterarFilme(int codFilme, String titulo, String genero, String sinopse, Integer duração) throws ExceptionDAO, ClassNotFoundException{
        
        if(titulo != null && titulo.length()>0 && genero != null && genero.length()>0 && sinopse != null && sinopse.length()>0 && duração != null && duração > 0){
            
            Filme filme = new Filme(titulo, genero, sinopse, duração);
            filme.setCodFilme(codFilme);
            filme.alterarFilme(filme);
            return true;
        }
        return (false);
    }
    
    public boolean apagarFilme(int codFilme) throws ExceptionDAO, ClassNotFoundException {
        if (codFilme == 0) 
            return false;
        else {
            Filme filme = new Filme();
            filme.setCodFilme(codFilme);
            filme.apagarFilme(filme);
            return true;    
        }
    }
}