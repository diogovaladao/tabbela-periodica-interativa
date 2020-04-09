package DAO;

import Bean.Usuario;
import Conexao.Conection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

// @author Diogo
public class DAOUsuario {

    public static void saveUsuario(Usuario usu) {
        String sql = "INSERT INTO USUARIO (NOME,SENHA,LOGIN,PONTUACAO) VALUES"
                + "('" + usu.getNome() + "','" + usu.getSenha() + "','" + usu.getLogin() + "','" + usu.getPontuacao() + "')";
        Conection.getInstance().sdu(sql);
    }
    
    public static void alterarUsuario(int cod, int ponto) {
        String sql = "UPDATE USUARIO SET "
                + "PONTUACAO = '" + ponto + "'"
                + "WHERE IDUSUARIO = '" + cod + "'";
        Conection.getInstance().sdu(sql);
    }

    public static Vector<Usuario> buscarUsuario(String nome) {        
        String sql = "SELECT * FROM USUARIO "
                + "WHERE NOME LIKE '" + nome + "%'"
                + "ORDER BY PONTUACAO DESC";
        try {
            ResultSet rs = Conection.getInstance().busca(sql);
            Vector<Usuario> lista = new Vector<Usuario>();
            while (rs.next()) {
                Usuario usu = new Usuario();
                usu.setIdusuario(rs.getInt("IDUSUARIO"));
                usu.setNome(rs.getString("NOME"));
                usu.setPontuacao(rs.getInt("PONTUACAO"));
                usu.setSenha(rs.getString("SENHA"));
                usu.setLogin(rs.getString("LOGIN"));
                lista.add(usu);
            }
            return lista;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }   

    private static DAOUsuario instance = null;

    public static DAOUsuario getInstance() {
        if (instance == null) {
            instance = new DAOUsuario();
        }
        return instance;
    }
}