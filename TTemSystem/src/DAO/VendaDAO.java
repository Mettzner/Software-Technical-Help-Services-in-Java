package DAO;

import POJO.VendaPOJO;
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
public class VendaDAO {
    public static ConPooling cn = ConPooling.getInstance();
    
    public int inserirVenda(VendaPOJO vendapojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="INSERT INTO VENDA(CODVEN,CODIGOE,CODIGOP,DESCRICAO,COR,MARCA,MODELO,QTDE,VALOR,VALOR_DESC,VALOR_TOTAL,DATE) values (?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setInt(1, vendapojo.getCODVEN());
            p.setInt(2, vendapojo.getCODIGOE());
            p.setInt(3, vendapojo.getCODIGOP());
            p.setString(4, vendapojo.getDESCRICAO());
            p.setString(5, vendapojo.getCOR());
            p.setString(6, vendapojo.getMARCA());
            p.setString(7, vendapojo.getMODELO());
            p.setInt(8, vendapojo.getQTDE());
            p.setDouble(9, vendapojo.getVALOR());
            p.setString(10, vendapojo.getDATE());
            p.setDouble(11, vendapojo.getVALOR_DESC());
            p.setDouble(12, vendapojo.getVALOR_TOTAL());
               
            op=p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO 01 - Cadastro Venda - "+e);
        }       
        return op;
    }
    public List buscarVendaPorUsuario(String CODIGOE){
        List lista = new ArrayList();
        String sql="SELECT * FROM VENDA WHERE NOME LIKE '%"+CODIGOE+"%';";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                VendaPOJO vendapojo = new VendaPOJO();
                vendapojo.setCODVEN(rs.getInt("CODVEN"));
                vendapojo.setCODIGOE(rs.getInt("CODIGOE"));
                vendapojo.setCODIGOP(rs.getInt("CODIGOP"));
                vendapojo.setDESCRICAO(rs.getString("DESCRICAO"));
                vendapojo.setCOR(rs.getString("COR"));                       
                vendapojo.setMARCA(rs.getString("MARCA"));
                vendapojo.setMODELO(rs.getString("MODELO"));
                vendapojo.setQTDE(rs.getInt("QTDE"));
                vendapojo.setVALOR(rs.getDouble("VALOR"));
                vendapojo.setVALOR_DESC(rs.getDouble("VALOR_DESC"));
                vendapojo.setVALOR_TOTAL(rs.getDouble("VALOR_TOTAL"));
                vendapojo.setTIPO(rs.getString("TIPO"));
                vendapojo.setDATE(rs.getString("DATE"));
                //vendapojo.setCODIGOU(rs.getInt("CODIGOU"));
                lista.add(vendapojo);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return lista;
    }
    public VendaPOJO buscarVendaUnica(int CODVEN){
        VendaPOJO vendapojo = new VendaPOJO();
        String sql="SELECT * FROM VENDA WHERE CODVEN="+CODVEN+";";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            rs.next();
            
                vendapojo.setCODVEN(rs.getInt("ID_CONTATO"));
                vendapojo.setCODIGOE(rs.getInt("NOME"));
                vendapojo.setCODIGOU(rs.getInt("CPF"));
                vendapojo.setCODIGOP(rs.getInt("TIPO"));
                vendapojo.setDESCRICAO(rs.getString("STATUS"));
                vendapojo.setCOR(rs.getString("FUNCAO"));
                vendapojo.setMARCA(rs.getString("TELEFONE"));
                vendapojo.setMODELO(rs.getString("CALULAR"));
                vendapojo.setQTDE(rs.getInt("WHATSAPP"));
                vendapojo.setVALOR(rs.getDouble("SITE"));
                vendapojo.setVALOR_DESC(rs.getDouble("CEP"));
                vendapojo.setVALOR_TOTAL(rs.getDouble("ENDERECO"));
                vendapojo.setTIPO(rs.getString("BAIRRO"));
                vendapojo.setDATE(rs.getString("BAIRRO"));

        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return vendapojo;
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
    public int alterarContato(VendaPOJO vendapojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="UPDATE VENDA SET CODIGOP=?,CODIGOE=?,CODIGOU=?,DESCRICAO=?,COR=?,MARCA=?,MODELO=?,QTDE=?,VALOR,VALOR_DESC=?,VALOR_TOTAL=?,TIPO=?,DATE=? WHERE CODVEN=?;";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setInt(1, vendapojo.getCODIGOP());
            p.setInt(2, vendapojo.getCODIGOE());
            p.setInt(3, vendapojo.getCODIGOU());
            p.setString(4, vendapojo.getDESCRICAO());
            p.setString(5, vendapojo.getCOR());
            p.setString(6, vendapojo.getMARCA());
            p.setString(7, vendapojo.getMODELO());
            p.setInt(8, vendapojo.getQTDE());
            p.setDouble(9, vendapojo.getVALOR());
            p.setDouble(10, vendapojo.getVALOR_DESC());
            p.setDouble(11, vendapojo.getVALOR_TOTAL());
            p.setString(12, vendapojo.getTIPO());
            p.setString(13, vendapojo.getDATE());
            
            op=p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO 04 - Alterar Contato - "+e);
        }   
        cn.retConnection(con);
        return op;
    }
    public static ResultSet carregaTabela() throws SQLException
    {
        Connection con = cn.getConnection();
        PreparedStatement pstmt = cn.getConnection().prepareStatement(
                
                "SELECT CODIGOE, NOME, CPF FROM ENTCAD;");
        ResultSet rs = pstmt.executeQuery();
        cn.retConnection(con);
        return rs;
    }
        public static ResultSet carregaTabelaPro() throws SQLException
    {
        Connection con = cn.getConnection();
        PreparedStatement pstmt = cn.getConnection().prepareStatement(
                
                "SELECT CODIGOP, DESCRICAO, COR, MARCA, MODELO, PRECO FROM PRODCAD;");
        ResultSet rs = pstmt.executeQuery();
        cn.retConnection(con);
        return rs;
    }
    
}