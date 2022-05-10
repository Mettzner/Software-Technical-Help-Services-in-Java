/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastros;


import DAO.EntidadeDAO;
import MODEL.EntidadeMODEL;
import POJO.EntidadePOJO;
//import Valida.RoundedBorder;
import Valida.VerificaCPF;
import ViaCEP.ViaCEP;
import ViaCEP.ViaCEPException;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class EntidadeCadastro extends javax.swing.JInternalFrame {
    
    EntidadeDAO entidadedao = new EntidadeDAO();
    EntidadeMODEL entidademodel = new EntidadeMODEL();
    EntidadePOJO entidadepojo = new EntidadePOJO();

    /**
     * Creates new form CadastroEntidade
     */
    
    
    public void limparCampos(){
        TECodigo.setText("0");
        TENome.setText("");
        TECpf.setText("");
        TEEmail.setText("");
        TETelefone.setText("");
        TEWhatsapp.setText("");
        TECelular.setText("");
        TEEndereco.setText("");
        TECidade.setText("");
        TEBairro.setText("");
        TEUF.setText("");
        TENumero.setText("");
        TESite.setText("");
        TDTCad.setText("");
        TEPais.setText("");
        TEComplemento.setText("");
        TECep.setText("");
        CF1.setText("");
        CF2.setText("");
        CF3.setText("");
    }
    public void pegar_dados(){
      entidadepojo.setCODIGOE(Integer.parseInt(TECodigo.getText()));
      entidadepojo.setNOME(TENome.getText());
      entidadepojo.setCPF(TECpf.getText());
      entidadepojo.setEMAIL(TEEmail.getText());
      entidadepojo.setTELEFONE(TETelefone.getText());
      entidadepojo.setWHATSAPP(TEWhatsapp.getText());
      entidadepojo.setCELULAR(TECelular.getText());
      entidadepojo.setENDERECO(TEEndereco.getText());
      entidadepojo.setCIDADE(TECidade.getText());
      entidadepojo.setBAIRRO(TEBairro.getText());
      entidadepojo.setUF(TEUF.getText());
      entidadepojo.setNUMERO(TENumero.getText());
      entidadepojo.setSITE(TESite.getText());
      entidadepojo.setDT_CADASTRO(TDTCad.getText());
      entidadepojo.setPAIS(TEPais.getText());
      entidadepojo.setCOMPLEMENTO(TEComplemento.getText());
      {{if(CF1.isSelected()){
            }entidadepojo.setFUNCAO(""+1);}
      {if(CF2.isSelected()){
            }entidadepojo.setFUNCAO(""+2);}
      {if(CF3.isSelected()){
            }entidadepojo.setFUNCAO(""+3);}
              
            
            
           {if(CF1.isSelected())
            if(CF2.isSelected())    
            if(CF3.isSelected())
                entidadepojo.setFUNCAO(""+123);}
       
           {if(CF2.isSelected())    
            if(CF3.isSelected())
                entidadepojo.setFUNCAO(""+23);}
           
           {if(CF1.isSelected())
            if(CF2.isSelected())    
                entidadepojo.setFUNCAO(""+12);}
           
           {if(CF1.isSelected())
            if(CF3.isSelected())    
                entidadepojo.setFUNCAO(""+13);}
            
      if(RBFisica.isSelected()){
          entidadepojo.setTIPO(0);
      }else{
          entidadepojo.setTIPO(1);
      }   
      if(SEAtivo.isSelected()){
          entidadepojo.setSTATUS(1);
      }else{
          entidadepojo.setSTATUS(2);
      }
    }
    }
    public EntidadeCadastro() {
        initComponents();
        PFornecedor.setVisible(false);
        TECidade.setEnabled(false);
        TFCodigo.setEnabled(false);
        TECodigoF.setEnabled(false);
        TECodigo.setEnabled(false);
        //TDTCad.setEnabled(false);
        TECnpj.setVisible(false);
        //TECpf.setVisible(false);
        BEEditar.setEnabled(false);
        BEExcluir.setEnabled(false);
    
    }   
    
    
    public void carregar_cpf(){
    VerificaCPF v = new VerificaCPF();
    
        Boolean resultado = v.verificar(TECpf.getText());
    if (resultado){
        TLValidar.setText("CPF VÁLIDO");
        TLValidar.setForeground(Color.GREEN);
   }else{
        TLValidar.setText("CPF INVÁLIDO");
        TLValidar.setForeground(Color.RED);
            
    }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField24 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        TECodigo = new javax.swing.JTextField();
        TENome = new javax.swing.JTextField();
        TEEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TESite = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        BESair = new javax.swing.JButton();
        BEExcluir = new javax.swing.JButton();
        BEEditar = new javax.swing.JButton();
        BENovo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        TEBairro = new javax.swing.JTextField();
        TECidade = new javax.swing.JTextField();
        TEComplemento = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TENumero = new javax.swing.JTextField();
        TEEndereco = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TEUF = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        PFornecedor = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TECodigoF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TCFObs = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TFCodigo = new javax.swing.JTextField();
        TECep = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        TEPais = new javax.swing.JTextField();
        BBuscarCep = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CF3 = new javax.swing.JCheckBox();
        CF1 = new javax.swing.JCheckBox();
        CF2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SEBloqueado = new javax.swing.JCheckBox();
        SEAtivo = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        TECpf = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TDTCad = new javax.swing.JFormattedTextField();
        RBFisica = new javax.swing.JRadioButton();
        RBJuridica = new javax.swing.JRadioButton();
        TECnpj = new javax.swing.JFormattedTextField();
        TLValidar = new javax.swing.JLabel();
        ECGravar = new javax.swing.JButton();
        TETelefone = new javax.swing.JFormattedTextField();
        TECelular = new javax.swing.JFormattedTextField();
        TEWhatsapp = new javax.swing.JFormattedTextField();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 257, 762, 10);

        jLabel1.setText("Código");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(25, 14, 60, 14);

        TECodigo.setText("0");
        TECodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TECodigoActionPerformed(evt);
            }
        });
        getContentPane().add(TECodigo);
        TECodigo.setBounds(25, 34, 63, 20);
        getContentPane().add(TENome);
        TENome.setBounds(91, 92, 415, 20);
        getContentPane().add(TEEmail);
        TEEmail.setBounds(91, 154, 415, 20);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 95, 50, 14);

        jLabel3.setText("CPF/CNPJ:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 130, 80, 14);

        jLabel4.setText("E-mail:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(53, 157, 50, 14);

        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(91, 180, 70, 14);

        jLabel6.setText("Celular:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 180, 60, 14);
        getContentPane().add(TESite);
        TESite.setBounds(91, 231, 413, 20);

        jLabel7.setText("Site:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(63, 234, 40, 14);

        jLabel9.setText("Tipo:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(106, 14, 40, 14);

        jLabel18.setText("Whatsapp:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(380, 180, 80, 14);

        BESair.setText("Sair");
        BESair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BESairActionPerformed(evt);
            }
        });
        getContentPane().add(BESair);
        BESair.setBounds(51, 491, 100, 50);

        BEExcluir.setText("Excluir");
        BEExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BEExcluir);
        BEExcluir.setBounds(241, 491, 100, 50);

        BEEditar.setText("Editar");
        BEEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BEEditar);
        BEEditar.setBounds(370, 491, 100, 50);

        BENovo.setText("Novo");
        BENovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BENovoActionPerformed(evt);
            }
        });
        getContentPane().add(BENovo);
        BENovo.setBounds(503, 491, 100, 50);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(190, 30, 10, 30);

        jLabel21.setText("Número:");

        jLabel23.setText("CEP:");

        jLabel24.setText("Endereço:");

        jLabel25.setText("Bairro:");

        jLabel26.setText("Pais:");

        jLabel27.setText("Complemento:");

        jLabel28.setText("Cidade:");

        jLabel29.setText("UF:");

        PFornecedor.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setText("Código:");

        TECodigoF.setText("0");

        jLabel12.setText("Observação:");

        jLabel14.setText("Cod. For:");

        TFCodigo.setText("0");

        javax.swing.GroupLayout PFornecedorLayout = new javax.swing.GroupLayout(PFornecedor);
        PFornecedor.setLayout(PFornecedorLayout);
        PFornecedorLayout.setHorizontalGroup(
            PFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TCFObs)
                    .addGroup(PFornecedorLayout.createSequentialGroup()
                        .addGroup(PFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PFornecedorLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TECodigoF, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addGroup(PFornecedorLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PFornecedorLayout.setVerticalGroup(
            PFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TECodigoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TCFObs, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            TECep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TECep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TECepFocusLost(evt);
            }
        });
        TECep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TECepActionPerformed(evt);
            }
        });
        TECep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TECepKeyPressed(evt);
            }
        });

        BBuscarCep.setText("Buscar");
        BBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel28)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)))
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TEBairro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(TECidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TEUF, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TEPais, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TENumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(TEEndereco)
                    .addComponent(TEComplemento)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TECep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(BBuscarCep)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(TECep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBuscarCep))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TEEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TEBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel21)
                            .addComponent(TENumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TECidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(TEUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(TEPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(TEComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 278, 762, 207);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CF3.setText("Fornecedor");
        CF3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CF3ItemStateChanged(evt);
            }
        });
        CF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF3ActionPerformed(evt);
            }
        });
        jPanel3.add(CF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 100, -1));

        CF1.setText("Funcionário");
        jPanel3.add(CF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 20));

        CF2.setText("Cliente");
        CF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF2ActionPerformed(evt);
            }
        });
        jPanel3.add(CF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel8.setText("Função:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(200, 10, 161, 63);

        jLabel10.setText("Status:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 10, 60, 14);

        SEBloqueado.setText("Bloqueado");
        getContentPane().add(SEBloqueado);
        SEBloqueado.setBounds(400, 50, 90, 23);

        SEAtivo.setText("Ativo");
        getContentPane().add(SEAtivo);
        SEAtivo.setBounds(400, 30, 70, 23);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(370, 30, 11, 29);

        try {
            TECpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TECpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TECpfFocusLost(evt);
            }
        });
        TECpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TECpfActionPerformed(evt);
            }
        });
        TECpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TECpfKeyPressed(evt);
            }
        });
        getContentPane().add(TECpf);
        TECpf.setBounds(95, 123, 120, 20);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("FOTO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(76, 76, 76))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel15)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(540, 60, 200, 184);

        jLabel13.setText("Data Cad.");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(560, 20, 60, 14);

        try {
            TDTCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(TDTCad);
        TDTCad.setBounds(620, 20, 110, 20);

        buttonGroup1.add(RBFisica);
        RBFisica.setText("Física");
        RBFisica.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RBFisicaItemStateChanged(evt);
            }
        });
        getContentPane().add(RBFisica);
        RBFisica.setBounds(106, 33, 80, 23);

        buttonGroup1.add(RBJuridica);
        RBJuridica.setSelected(true);
        RBJuridica.setText("Jurídica");
        RBJuridica.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RBJuridicaItemStateChanged(evt);
            }
        });
        RBJuridica.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RBJuridicaStateChanged(evt);
            }
        });
        RBJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBJuridicaActionPerformed(evt);
            }
        });
        getContentPane().add(RBJuridica);
        RBJuridica.setBounds(106, 56, 80, 23);

        try {
            TECnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TECnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TECnpjActionPerformed(evt);
            }
        });
        getContentPane().add(TECnpj);
        TECnpj.setBounds(229, 123, 120, 20);

        TLValidar.setText("Digite o CPF");
        getContentPane().add(TLValidar);
        TLValidar.setBounds(430, 130, 90, 14);

        ECGravar.setText("Gravar");
        ECGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECGravarActionPerformed(evt);
            }
        });
        getContentPane().add(ECGravar);
        ECGravar.setBounds(629, 491, 104, 50);

        try {
            TETelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(TETelefone);
        TETelefone.setBounds(90, 200, 130, 20);

        try {
            TECelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(TECelular);
        TECelular.setBounds(240, 200, 120, 20);

        try {
            TEWhatsapp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TEWhatsapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEWhatsappActionPerformed(evt);
            }
        });
        getContentPane().add(TEWhatsapp);
        TEWhatsapp.setBounds(380, 200, 120, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BEEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEEditarActionPerformed
    
    }//GEN-LAST:event_BEEditarActionPerformed

    private void BEExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEExcluirActionPerformed
    
    }//GEN-LAST:event_BEExcluirActionPerformed

    private void BESairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BESairActionPerformed
        this.dispose();
    }//GEN-LAST:event_BESairActionPerformed

    private void TECodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TECodigoActionPerformed
   
    }//GEN-LAST:event_TECodigoActionPerformed

    private void TECepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TECepFocusLost
       
    }//GEN-LAST:event_TECepFocusLost

    private void BBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarCepActionPerformed
        ViaCEP viacep = new ViaCEP();
        
        try {
            viacep.buscar(TECep.getText());
            TEBairro.setText(viacep.getBairro());
            TEEndereco.setText(viacep.getLogradouro());
            TECidade.setText(viacep.getLocalidade());
            TEUF.setText(viacep.getUf());
            
        } catch (ViaCEPException ex) {
            Logger.getLogger(EntidadeCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_BBuscarCepActionPerformed

    private void TECepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TECepKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                BBuscarCep.doClick();
            }           
    }//GEN-LAST:event_TECepKeyPressed

    private void TECepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TECepActionPerformed
    
    }//GEN-LAST:event_TECepActionPerformed

    private void TECpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TECpfActionPerformed
        
    }//GEN-LAST:event_TECpfActionPerformed

    private void CF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF2ActionPerformed

    }//GEN-LAST:event_CF2ActionPerformed

    private void CF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF3ActionPerformed
    
    }//GEN-LAST:event_CF3ActionPerformed

    private void CF3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CF3ItemStateChanged
        if(CF3.isSelected()!=true)
        {
            PFornecedor.setVisible(false);
        }else{
            PFornecedor.setVisible(true);
        }
    }//GEN-LAST:event_CF3ItemStateChanged

    private void TECnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TECnpjActionPerformed
    
    }//GEN-LAST:event_TECnpjActionPerformed

    private void RBJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBJuridicaActionPerformed
    
    }//GEN-LAST:event_RBJuridicaActionPerformed

    private void RBJuridicaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RBJuridicaItemStateChanged
        if(RBJuridica.isSelected()!=true)
        {
            TECnpj.setVisible(false);
        }else{
            TECnpj.setVisible(true);
        }
    }//GEN-LAST:event_RBJuridicaItemStateChanged

    private void RBJuridicaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RBJuridicaStateChanged
        
    }//GEN-LAST:event_RBJuridicaStateChanged

    private void RBFisicaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RBFisicaItemStateChanged
        if(RBFisica.isSelected()!=true)
        {
            TECpf.setVisible(false);
        }else{
            TECpf.setVisible(true);
        }
    }//GEN-LAST:event_RBFisicaItemStateChanged

    private void TECpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TECpfKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        BBuscarCep.doClick();
        }
    }//GEN-LAST:event_TECpfKeyPressed

    private void TECpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TECpfFocusLost
           carregar_cpf();
    }//GEN-LAST:event_TECpfFocusLost

    private void ECGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECGravarActionPerformed
                   pegar_dados();
            try {
                //entidademodel.verificar_campos(entidadepojo);
                entidadedao.inserirUsuario(entidadepojo);
            }catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+e.getMessage()+" é obrigatório");
            }
                JOptionPane.showMessageDialog(null, "Pronto!");
                limparCampos();
                           
//ECGravar.setBorder(new RoundedBorder(50));
    }//GEN-LAST:event_ECGravarActionPerformed

    private void BENovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BENovoActionPerformed
        limparCampos();
    }//GEN-LAST:event_BENovoActionPerformed

    private void TEWhatsappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEWhatsappActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEWhatsappActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarCep;
    private javax.swing.JButton BEEditar;
    private javax.swing.JButton BEExcluir;
    private javax.swing.JButton BENovo;
    private javax.swing.JButton BESair;
    private javax.swing.JCheckBox CF1;
    private javax.swing.JCheckBox CF2;
    private javax.swing.JCheckBox CF3;
    private javax.swing.JButton ECGravar;
    private javax.swing.JPanel PFornecedor;
    private javax.swing.JRadioButton RBFisica;
    private javax.swing.JRadioButton RBJuridica;
    private javax.swing.JCheckBox SEAtivo;
    private javax.swing.JCheckBox SEBloqueado;
    private javax.swing.JTextField TCFObs;
    private javax.swing.JFormattedTextField TDTCad;
    private javax.swing.JTextField TEBairro;
    private javax.swing.JFormattedTextField TECelular;
    private javax.swing.JFormattedTextField TECep;
    private javax.swing.JTextField TECidade;
    private javax.swing.JFormattedTextField TECnpj;
    private javax.swing.JTextField TECodigo;
    private javax.swing.JTextField TECodigoF;
    private javax.swing.JTextField TEComplemento;
    private javax.swing.JFormattedTextField TECpf;
    private javax.swing.JTextField TEEmail;
    private javax.swing.JTextField TEEndereco;
    private javax.swing.JTextField TENome;
    private javax.swing.JTextField TENumero;
    private javax.swing.JTextField TEPais;
    private javax.swing.JTextField TESite;
    private javax.swing.JFormattedTextField TETelefone;
    private javax.swing.JTextField TEUF;
    private javax.swing.JFormattedTextField TEWhatsapp;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JLabel TLValidar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField24;
    // End of variables declaration//GEN-END:variables
}
