package DAO;


import static DAO.VendaDAO.cn;
import POJO.ProdutoPOJO;
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
public class ProdutoDAO {
    public static ConPooling cn = ConPooling.getInstance();
    
    public int inserirProduto(ProdutoPOJO produtopojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="INSERT INTO PRODCAD(CODIGOP,DESCRICAO,MODELO,MARCA,COR,PRECO,CUSTO,QTDE) values (?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setInt(1, produtopojo.getCODIGOP());
            p.setString(2, produtopojo.getDESCRICAO());
            p.setString(3, produtopojo.getMODELO());
            p.setString(4, produtopojo.getMARCA());   
            p.setString(5, produtopojo.getCOR()); 
            p.setString(6, produtopojo.getPRECO());
            p.setString(7, produtopojo.getCUSTO());
            p.setInt(8, produtopojo.getQTDE());
            //p.setString(10, produtopojo.getOBS_FORNECEDOR());
            //p.setString(11, produtopojo.getDESC_MARCA());
            //p.setString(12, produtopojo.getDESC_COR());
            //p.setInt(6, produtopojo.getCODFOR());
                      
            op=p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO 01 - Cadastro Produto - "+e);
        }       
        return op;
    }
    public List buscarProduto(String DESCRICAO){
        List lista = new ArrayList();
        String sql="SELECT * FROM PRODCAD WHERE DESCRICAO LIKE '%"+DESCRICAO+"%';";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                ProdutoPOJO produtopojo = new ProdutoPOJO();
                produtopojo.setCODIGOP(rs.getInt("CODIGOP"));
                produtopojo.setDESCRICAO(rs.getString("DESCRICAO"));
                produtopojo.setMODELO(rs.getString("MODELO"));
                produtopojo.setMARCA(rs.getString("MARCA"));
                produtopojo.setPRECO(rs.getString("PRECO"));                           
                produtopojo.setQTDE(rs.getInt("QTDE"));
                produtopojo.setCOR(rs.getString("COR"));
                produtopojo.setCUSTO(rs.getString("CUSTO"));
                //produtopojo.setCODFOR(rs.getInt("SITE"));
                //produtopojo.setOBS_FORNECEDOR(rs.getString("FUNCAO2"));
                //produtopojo.setDESC_MARCA(rs.getString("STATUS"));
                //produtopojo.setDESC_COR(rs.getString("FUNCAO"));
                lista.add(produtopojo);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return lista;
    }
    public ProdutoPOJO buscarProdutoUnico(int CODIGOP){
        ProdutoPOJO produtopojo = new ProdutoPOJO();
        String sql="SELECT * FROM PRODCAD WHERE ID_CONTATO="+CODIGOP+";";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            rs.next();
            
                produtopojo.setCODIGOP(rs.getInt("CODIGOP"));
                produtopojo.setDESCRICAO(rs.getString("DESCRICAO"));
                produtopojo.setMODELO(rs.getString("MODELO"));
                produtopojo.setMARCA(rs.getString("MARCA"));
                produtopojo.setCOR(rs.getString("COR"));
                produtopojo.setPRECO(rs.getString("PRECO"));
                produtopojo.setCUSTO(rs.getString("CUSTO"));
                produtopojo.setQTDE(rs.getInt("QTDE"));
               //produtopojo.setDESC_COR(rs.getString("FUNCAO2"));
               //produtopojo.setDESC_MARCA(rs.getString("STATUS"));
               //produtopojo.setCODFOR(rs.getInt("FUNCAO3"));
               //produtopojo.setOBS_FORNECEDOR(rs.getString("SITE"));
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return produtopojo;
    }
    public int removerProduto(int CODIGOP){
        int confirma=0;
        String sql="DELETE FROM PRODCAD WHERE CODIGOP="+CODIGOP;
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
    public int alterarProduto(ProdutoPOJO produtopojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="UPDATE PRODCAD SET DESCRICAO=?,MODELO=?,MARCA=?,COR=?,QTDE=?,PRECO=?,CUSTO=? WHERE CODIGOP=?;";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            
            p.setString(1, produtopojo.getDESCRICAO());
            p.setString(2, produtopojo.getMODELO());
            p.setString(3, produtopojo.getMARCA());           
            p.setString(4, produtopojo.getCOR());
            p.setInt(5, produtopojo.getQTDE());
            p.setString(6, produtopojo.getPRECO());
            p.setString(7, produtopojo.getCUSTO());
            p.setInt(8, produtopojo.getCODIGOP());
            op=p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO 04 - Alterar produto - "+e);
        }   
        cn.retConnection(con);
        System.out.println(""+op);
        return op;
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
        /*           public int alterarContato(ProdutoPOJO produtopojo){
        int op=0;
        
        Connection con = cn.getConnection();
        //pegando a conexão com o banco de dados
        String sql="UPDATE PRODCAD DESCRICAO=?,MODELO=?,MARCA=?,COR=?,PRECO=?,CUSTO=?,QUANTIDADE=? WHERE CODIGOP=?;";
        //um dos metodos para alterar dados no banco de dados
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, produtopojo.getDESCRICAO());
            p.setString(2, produtopojo.getMODELO());
            p.setString(3, produtopojo.getMARCA());
            p.setString(4, produtopojo.getCOR());
            p.setString(5, produtopojo.getPRECO());
            p.setString(6, produtopojo.getCUSTO());
            p.setInt(7, produtopojo.getQTDE());
            op=p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null,"ERRO 08 - Alterar Produto"+e);
            //comando para gerar uma mensagem se acontecer algum erro
        }
        cn.retConnection(con);
        //try/catch serve para tratamento de exceções
        return op;
    */
    
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

