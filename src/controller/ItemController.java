package Locadora.controller;

import Locadora.database.ExceptionDAO;
import Locadora.model.Item;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemController {
    
     public boolean cadastrarItem(Integer codFilme, String tipo, double preço) throws ExceptionDAO, ClassNotFoundException{
         if(codFilme > 0 && tipo != null && preço > 0){
            Item item = new Item(codFilme, tipo, preço);
            item.cadastrarItem(item);
            return true;
         } else {
            return false;
         }     
     }
     
     public ArrayList<Item> listarItens (String titulo) throws ExceptionDAO, SQLException, ClassNotFoundException {
         return new Item().listarItens(titulo);
     }
     
     public boolean alterarItem(Integer codItem, Integer codFilme, String tipo, double preço) throws ExceptionDAO, ClassNotFoundException{
         if(codFilme > 0 && tipo != null && preço > 0){
            Item item = new Item(codFilme, tipo, preço);
            item.setCodItem(codItem);
            item.alterarItem(item);
            return true;
         } else {
            return false;
         }     
     }
     
     public boolean apagarItem(int codItem) throws ExceptionDAO, ClassNotFoundException {
        if (codItem == 0) 
            return false;
        else {
            Item item = new Item();
            item.setCodItem(codItem);
            item.apagarItem(item);
            return true;    
        }
    }
}
