/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.UsuarioPOJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class UsuarioDAO {
    public static ConPooling cn = ConPooling.getInstance();
    
    public int inserirUsuario(UsuarioPOJO usuariopojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="INSERT INTO USERCAD(CODIGOU,CODIGOE,NOME,USUARIO,SENHA,ACESSO) values (?,?,?,?,?,?);";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setInt(1, usuariopojo.getCODIGOU());
            p.setInt(2, usuariopojo.getCODIGOE());
            p.setString(3, usuariopojo.getNOME());
            p.setString(4, usuariopojo.getUSUARIO());
            p.setString(5, usuariopojo.getSENHA());
            p.setInt(6, usuariopojo.getACESSO());
            
            
           op=p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }       
        return op;
    }
    public List buscarContatos(String NOME){
        List lista = new ArrayList();
        String sql="SELECT * FROM USERCAD WHERE NOME LIKE '%"+NOME+"%';";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                UsuarioPOJO usuariopojo = new UsuarioPOJO();
                usuariopojo.setCODIGOU(rs.getInt("CODIGOU"));
                usuariopojo.setCODIGOE(rs.getInt("CODIGOE"));
                usuariopojo.setNOME(rs.getString("NOME"));
                usuariopojo.setUSUARIO(rs.getString("USUARIO"));
                usuariopojo.setSENHA(rs.getString("SENHA"));
                usuariopojo.setACESSO(rs.getInt("ACESSO"));
                lista.add(usuariopojo);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return lista;
    }
    public UsuarioPOJO buscarContatoUnico(int CODIGO){
        UsuarioPOJO usuariopojo = new UsuarioPOJO();
        String sql="SELECT * FROM USERCAD WHERE ID_CONTATO '%"+CODIGO+"%';";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            rs.next();
                usuariopojo.setCODIGOU(rs.getInt("CODIGOU"));
                usuariopojo.setCODIGOE(rs.getInt("CODIGOE"));
                usuariopojo.setNOME(rs.getString("NOME"));
                usuariopojo.setUSUARIO(rs.getString("USUARIO"));
                usuariopojo.setSENHA(rs.getString("SENHA"));
                usuariopojo.setACESSO(rs.getInt("ACESO"));
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return usuariopojo;
    }
    public int removerUsuario(int CODIGOU){
        int confirma=0;
        String sql="DELETE FROM USERCAD WHERE CODIGOU="+CODIGOU;
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            confirma=p.executeUpdate();
            
        } catch (SQLException e){
            JOptionPane.showConfirmDialog(null , e.getMessage());
        }
        cn.retConnection(con);        
        return confirma;
    }
    public int alterarContato(UsuarioPOJO usuariopojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="UPDATE USERCAD SET NOME=?, USUARIO=?, SENHA=?, ACESSO=?, CODIGOE=? WHERE CODIGOU=?;";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, usuariopojo.getNOME());
            p.setString(2, usuariopojo.getUSUARIO());
            p.setString(3, usuariopojo.getSENHA());
            p.setInt(4, usuariopojo.getACESSO());
            p.setInt(5, usuariopojo.getCODIGOE());
            p.setInt(6, usuariopojo.getCODIGOU());
            op=p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO 04 - Alterar Contato - ");
        }       
        return op;
    }

        
    public UsuarioPOJO verificarLogin(String usuario, String senha){
        UsuarioPOJO login = new UsuarioPOJO();
        Connection con = cn.getConnection();
        String sql="select * from usercad where usuario=? and senha=?;";
        try{
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, usuario);
            p.setString(2, senha);
            ResultSet rs=p.executeQuery();
            rs.next();
            login.setCODIGOU(rs.getInt("CODIGOU"));
            login.setUSUARIO(rs.getString("USUARIO"));
            login.setSENHA(rs.getString("SENHA"));
            login.setACESSO(rs.getInt("ACESSO"));
        }catch (SQLException e){
        }
        cn.retConnection(con);
        return login;
        }
}
   