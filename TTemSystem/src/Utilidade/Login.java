/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidade;

import Cadastros.UsuarioCadastro;
import DAO.UsuarioDAO;
import POJO.UsuarioPOJO;
import Utilidade.JanelaPrincipal;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import sun.security.provider.MD5;



public class Login extends javax.swing.JFrame {

    UsuarioDAO usuariodao = new UsuarioDAO();
    UsuarioPOJO usuariopojo = new UsuarioPOJO();
    public Login() {
        initComponents();
    }
    
    

    public String digest(String password) throws NoSuchAlgorithmException, 
            UnsupportedEncodingException {
        MessageDigest algoritmo = MessageDigest.getInstance("SHA-256");
      byte digestMessage[] = algoritmo.digest(password.getBytes("UTF-8"));
      StringBuilder hexPassword = new StringBuilder();
      for (byte aByte : digestMessage) {
         hexPassword.append(String.format("%02X", 0xFF & aByte));
      }
      return hexPassword.toString();
   }
    public String cadastrar(String senha)
    {
        //String mesa=""+TSenha.getPassword();
        try {
            senha=digest(senha);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuarioCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(senha);
        //loginDAO l = new loginDAO();
        //l.cadastroUsuario(TEmail.getText(), mesa);
        return senha;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PSenha = new javax.swing.JPasswordField();
        BSair = new javax.swing.JButton();
        Status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        BEntrar.setText("Entrar");
        BEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEntrarActionPerformed(evt);
            }
        });
        BEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BEntrarKeyPressed(evt);
            }
        });

        jLabel3.setText("TTemSistema");

        PSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSenhaActionPerformed(evt);
            }
        });
        PSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PSenhaKeyPressed(evt);
            }
        });

        BSair.setText("Sair");
        BSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSairActionPerformed(evt);
            }
        });

        Status.setText("Digite seu login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(TLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(Status))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BEntrar)
                    .addComponent(BSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Status)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(345, 296));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEntrarActionPerformed
        String usuario=TLogin.getText();
        String senha=PSenha.getText();
        senha=cadastrar(senha);
        usuariopojo=usuariodao.verificarLogin(usuario, senha);
        System.out.println("CODIGOU "+usuariopojo.getCODIGOU());
        if(usuariopojo.getCODIGOU()!=0){
            JanelaPrincipal principal = new JanelaPrincipal(usuariopojo);
            principal.setVisible(true);
            this.dispose();
        }else{
            Status.setText("INCORRETOS");
            Status.setForeground(Color.red);
            
            
        }     
        
            /*String usuario=TLogin.getText();
            String senha=PSenha.getText();
            usuariopojo=usuariodao.verificarLogin(usuario, senha);
            System.out.println("CODIGOU "+usuariopojo.getCODIGOU());
            if(usuariopojo.getCODIGOU()!=0){
                JanelaPrincipal principal = new JanelaPrincipal(usuariopojo);
                principal.setVisible(true);
                this.dispose();
            }else{
                Status.setText("INCORRETOS");
             Status.setForeground(Color.red);
            }*/
            /*if(TLogin.getText().equals("adm")&&PSenha.getText().equals("adm")){
                JanelaPrincipal principal = new JanelaPrincipal();
                principal.setVisible(true);
                
                
        dispose();
         
        }else{
    
            JOptionPane.showMessageDialog(null, "Acesso Negado!");
            
        }  */ 
          
        
    }//GEN-LAST:event_BEntrarActionPerformed

    private void BSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSairActionPerformed
    System.exit(0);
    }//GEN-LAST:event_BSairActionPerformed

    private void BEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BEntrarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER);
        String usuario=TLogin.getText();
        String senha=PSenha.getText();
        usuariopojo=usuariodao.verificarLogin(usuario, senha);
        System.out.println("USUARIO "+usuariopojo.getUSUARIO());
        if(usuariopojo.getCODIGOU() != 0){
            JanelaPrincipal principal = new JanelaPrincipal(usuariopojo);
            principal.setVisible(true);
            this.dispose();
        }else{
            Status.setText("INCORRETOS");
            Status.setForeground(Color.red);
        } 
    }//GEN-LAST:event_BEntrarKeyPressed

    private void PSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PSenhaActionPerformed

    private void PSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PSenhaKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String usuario=TLogin.getText();
        String senha=PSenha.getText();
        usuariopojo=usuariodao.verificarLogin(usuario, senha);
        System.out.println("USUARIO "+usuariopojo.getUSUARIO());
        if(usuariopojo.getCODIGOU() != 0){
            JanelaPrincipal principal = new JanelaPrincipal(usuariopojo);
            principal.setVisible(true);
            this.dispose();
        }else{
            Status.setText("INCORRETOS");
            Status.setForeground(Color.red);
        }
       }
        
        
        
        //if(TLogin.getText().equals("adm")&&PSenha.getText().equals("adm"));//{
                //JanelaPrincipal principal = new JanelaPrincipal();
                //principal.setVisible(true);  
    }//GEN-LAST:event_PSenhaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEntrar;
    private javax.swing.JButton BSair;
    private javax.swing.JPasswordField PSenha;
    private javax.swing.JLabel Status;
    private javax.swing.JTextField TLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}