package DAO;

import POJO.EntidadePOJO;
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
public class EntidadeDAO {
    public static ConPooling cn = ConPooling.getInstance();
    
    public int inserirUsuario(EntidadePOJO entidadepojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="INSERT INTO ENTCAD(CODIGOE, NOME,CPF,EMAIL,CELULAR,WHATSAPP,TELEFONE,CEP,ENDERECO,CIDADE,UF,BAIRRO,NUMERO,COMPLEMENTO,PAIS,SITE,FUNCAO,TIPO,STATUS,DT_CADASTRO,DT_EXCLUSAO) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setInt(1, entidadepojo.getCODIGOE());
            p.setString(2, entidadepojo.getNOME());
            p.setString(3, entidadepojo.getCPF());
            p.setString(4, entidadepojo.getEMAIL());
            p.setString(5, entidadepojo.getCELULAR());
            p.setString(6, entidadepojo.getWHATSAPP());
            p.setString(7, entidadepojo.getTELEFONE());
            p.setString(8, entidadepojo.getCEP());
            p.setString(9, entidadepojo.getENDERECO());
            p.setString(10, entidadepojo.getCIDADE());
            p.setString(11, entidadepojo.getUF());
            p.setString(12, entidadepojo.getBAIRRO());
            p.setString(13, entidadepojo.getNUMERO());
            p.setString(14, entidadepojo.getCOMPLEMENTO());
            p.setString(15, entidadepojo.getPAIS());
            p.setString(16, entidadepojo.getSITE());
            p.setString(17, entidadepojo.getFUNCAO());
            p.setInt(18, entidadepojo.getTIPO());
            p.setInt(19, entidadepojo.getSTATUS());
            p.setString(20, entidadepojo.getDT_CADASTRO());
            p.setString(21, entidadepojo.getDT_EXCLUSAO());
            
            
            
            
                      
            op=p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO 01 - Cadastro Contato - "+e);
        }       
        return op;
    }
    public List buscarContatos(String NOME){
        List lista = new ArrayList();
        String sql="SELECT * FROM ENTCAD WHERE NOME LIKE '%"+NOME+"%';";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                EntidadePOJO entidadepojo = new EntidadePOJO();
                entidadepojo.setCODIGOE(rs.getInt("CODIGOE"));
                entidadepojo.setNOME(rs.getString("NOME"));
                entidadepojo.setCPF(rs.getString("CPF"));
                entidadepojo.setTIPO(rs.getInt("TIPO"));
                entidadepojo.setSTATUS(rs.getInt("STATUS"));
                entidadepojo.setFUNCAO(rs.getString("FUNCAO"));                       
                entidadepojo.setTELEFONE(rs.getString("TELEFONE"));
                entidadepojo.setCELULAR(rs.getString("CELULAR"));
                entidadepojo.setWHATSAPP(rs.getString("WHATSAPP"));
                entidadepojo.setSITE(rs.getString("SITE"));
                entidadepojo.setCEP(rs.getString("CEP"));
                entidadepojo.setENDERECO(rs.getString("ENDERECO"));
                entidadepojo.setBAIRRO(rs.getString("BAIRRO"));
                entidadepojo.setCIDADE(rs.getString("CIDADE"));
                entidadepojo.setUF(rs.getString("UF"));
                entidadepojo.setNUMERO(rs.getString("NUMERO"));
                entidadepojo.setPAIS(rs.getString("PAIS"));
                entidadepojo.setCOMPLEMENTO(rs.getString("COMPLEMENTO"));
                entidadepojo.setDT_CADASTRO(rs.getString("DT_CADASTRO"));
                entidadepojo.setDT_EXCLUSAO(rs.getString("DT_EXCLUSAO"));
                entidadepojo.setEMAIL(rs.getString("EMAIL"));
                lista.add(entidadepojo);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return lista;
    }
    public EntidadePOJO buscarContatoUnico(int CODIGOE){
        EntidadePOJO entidadepojo = new EntidadePOJO();
        String sql="SELECT * FROM ENTCAD WHERE ID_CONTATO="+CODIGOE+";";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            rs.next();
            
                entidadepojo.setCODIGOE(rs.getInt("ID_CONTATO"));
                entidadepojo.setNOME(rs.getString("NOME"));
                entidadepojo.setCPF(rs.getString("CPF"));
                entidadepojo.setTIPO(rs.getInt("TIPO"));
                entidadepojo.setSTATUS(rs.getInt("STATUS"));
                entidadepojo.setFUNCAO(rs.getString("FUNCAO"));
                entidadepojo.setTELEFONE(rs.getString("TELEFONE"));
                entidadepojo.setCELULAR(rs.getString("CALULAR"));
                entidadepojo.setWHATSAPP(rs.getString("WHATSAPP"));
                entidadepojo.setSITE(rs.getString("SITE"));
                entidadepojo.setCEP(rs.getString("CEP"));
                entidadepojo.setENDERECO(rs.getString("ENDERECO"));
                entidadepojo.setBAIRRO(rs.getString("BAIRRO"));
                entidadepojo.setCIDADE(rs.getString("CIDADE"));
                entidadepojo.setUF(rs.getString("UF"));
                entidadepojo.setNUMERO(rs.getString("NUMERO"));
                entidadepojo.setPAIS(rs.getString("PAIS"));
                entidadepojo.setDT_CADASTRO(rs.getString("DT_CADASTRO"));
                entidadepojo.setDT_EXCLUSAO(rs.getString("DT_EXCLUSAO"));
                entidadepojo.setEMAIL(rs.getString("EMAIL"));
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return entidadepojo;
    }
    public int removerContato(int CODIGOE){
        int confirma=0;
        String sql="DELETE FROM ENTCAD WHERE CODIGOE="+CODIGOE;
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
    public int alterarContato(EntidadePOJO entidadepojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="UPDATE ENTCAD SET NOME=?,CPF=?,EMAIL=?,CELULAR=?,WHATSAPP=?,ENDERECO=?,CIDADE=?,TELEFONE=?,BAIRRO=?,NUMERO=?,NUMERO=?,DT_CADASTRO=?,UF=?,SITE=?,FUNCAO=?,DT_EXCLUSAO=?,PAIS=?,COMPLEMENTO=?,TIPO=?,STATUS=? WHERE CODIGOE=?;";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, entidadepojo.getNOME());
            p.setString(2, entidadepojo.getCPF());
            p.setString(3, entidadepojo.getEMAIL());
            p.setString(4, entidadepojo.getCELULAR());
            p.setString(5, entidadepojo.getWHATSAPP());
            p.setString(6, entidadepojo.getENDERECO());
            p.setString(7, entidadepojo.getCIDADE());
            p.setString(8, entidadepojo.getTELEFONE());
            p.setString(9, entidadepojo.getBAIRRO());
            p.setString(10, entidadepojo.getNUMERO());
            p.setString(11, entidadepojo.getDT_CADASTRO());
            p.setString(12, entidadepojo.getUF());
            p.setString(13, entidadepojo.getSITE());
            p.setString(14, entidadepojo.getFUNCAO());
            p.setString(17, entidadepojo.getDT_EXCLUSAO());
            p.setString(18, entidadepojo.getPAIS());
            p.setString(19, entidadepojo.getCOMPLEMENTO());
            p.setInt(20, entidadepojo.getTIPO());
            p.setInt(21, entidadepojo.getSTATUS());
            p.setInt(22, entidadepojo.getCODIGOE());
            op=p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO 04 - Alterar Contato - "+e);
        }   
        cn.retConnection(con);
        return op;
    }
}
    /*public UsuarioPOJO trazerCodigo (int ID_CONTATO){
        UsuarioPOJO usuariopojo = new UsuarioPOJO();
        String sql="SELECT * FROM ENTCAD WHERE CODIGOE=(SELECT MAX(ID_CONTATO) FROM CONTATO);";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            rs.next();
                usuariopojo.setCodigo(rs.getInt("ID_CONTATO"));               
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return usuariopojo;
        
    }    
}*/ 

