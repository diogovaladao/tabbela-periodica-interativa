package Conexao;

// @author Diogo

import java.sql.*;
import javax.swing.JOptionPane;

 
public class Conection {

    private String DRIVER = "org.postgresql.Driver";
    private String URL = "jdbc:postgresql://localhost/projeto";
    private String USR = "postgres";
    private String PWD = "admin";
    private Connection con;

    private void createConexao(){
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USR, PWD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Connection getCon() {
        if(con == null){
            createConexao();
        }
        return con;
    }
    public void sdu(String sql){
        String teste = "";
        try {
            Statement sta = getCon().createStatement();
            sta.executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();            
        }
    }    

    public ResultSet busca(String sql){
        try {
            Statement sta = getCon().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static Conection instance = null;
    public static Conection getInstance(){
        if(instance == null){
            instance = new Conection();
        }
        return instance;
    }
}