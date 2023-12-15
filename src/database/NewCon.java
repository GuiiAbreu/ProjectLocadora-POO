package Locadora.database;

import java.sql.SQLException;

public class NewCon {
    public static void main(String[] args) {
        ConFactory conFactory = new ConFactory();
        try {
            if(conFactory.getConnection()!=null){
                System.out.println("Conectado");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

