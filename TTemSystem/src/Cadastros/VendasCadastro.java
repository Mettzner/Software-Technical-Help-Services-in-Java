/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastros;

import DAO.EntidadeDAO;
import DAO.ProdutoDAO;
import DAO.VendaDAO;
import MODEL.EntidadeMODEL;
import MODEL.ProdutoMODEL;
import MODEL.VendaMODEL;
import POJO.EntidadePOJO;
import POJO.ProdutoPOJO;
import POJO.UsuarioPOJO;
import POJO.VendaPOJO;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VendasCadastro extends javax.swing.JInternalFrame {
    
    EntidadeMODEL entidademodel = new EntidadeMODEL();
    EntidadePOJO entidadepojo = new EntidadePOJO();
    VendaDAO vendadao = new VendaDAO();
    VendaPOJO vendapojo = new VendaPOJO();
    VendaMODEL vendamodel = new VendaMODEL();
    EntidadeDAO entidadedao = new EntidadeDAO();
    ProdutoDAO produtodao = new ProdutoDAO();
    ProdutoMODEL produtomodel = new ProdutoMODEL();
    ProdutoPOJO produtopojo = new ProdutoPOJO();
   
    public void esconderTudo(){
        PainelValores.setVisible(false);
        PainelBotoes.setVisible(false);
        PainelLabel.setVisible(false);
        jPanel1.setVisible(false);
        TTabelaItens.setVisible(false);
        scrollpane1.setVisible(false);
    }
    
        public void aparecerTudo(){
        PainelValores.setVisible(true);
        PainelBotoes.setVisible(true);
        PainelLabel.setVisible(true);
        jPanel1.setVisible(true);
        TTabelaItens.setVisible(true);
        scrollpane1.setVisible(true);
    }
        public void limparCampos(){
            DescCli.setText("");
            CodCliente.setText("");
            CodVendedor.setText("");
            DescVendedor.setText("");
            CodigoProduto.setText("");
            DescProduto.setText("");
            CodigoCor.setText("");
            CodModelo.setText("");
            CodMarca.setText("");
            Quantidade.setText("");
            Preco.setText("");
        }
        
        
    
    public void pegar_dados() {
      entidadepojo.setNOME(DescCli.getText());
      vendapojo.setCODIGOU(Integer.parseInt(CodVendedor.getText()));
      entidadepojo.setCODIGOE(Integer.parseInt(CodCliente.getText()));
      vendapojo.setNOMECLI(DescCli.getText());
      vendapojo.setNOMEVEN(DescVendedor.getText());
      vendapojo.setCODIGOP(Integer.parseInt(CodigoProduto.getText()));
      vendapojo.setDESCRICAO(DescProduto.getText());
      vendapojo.setCOR(CodigoCor.getText());
      vendapojo.setMARCA(CodMarca.getText());
      vendapojo.setMODELO(CodModelo.getText());
      vendapojo.setQTDE(Integer.parseInt(Quantidade.getText()));
      vendapojo.setVALOR(Integer.parseInt(Preco.getText()));
      vendapojo.setVALOR_DESC(Double.parseDouble(CValorDesc.getText()));
      vendapojo.setVALOR_TOTAL(Double.parseDouble(CValorTotal.getText()));
      }

//(Integer.parseInt(.getText()));   
    public VendasCadastro() {   
        initComponents();
        esconderBusca();
        esconderBuscaVE();
        esconderBuscaPRO();
                
        }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBuscaCliente = new javax.swing.JPanel();
        TNomeBuscaCliente = new javax.swing.JTextField();
        BotaoBuscaCliente = new javax.swing.JButton();
        scrollBuscaCliente = new javax.swing.JScrollPane();
        TabelaBusca = new javax.swing.JTable();
        BotaoSairCliente = new javax.swing.JButton();
        PainelBuscaProdutos = new javax.swing.JPanel();
        TNomeBuscaPro = new javax.swing.JTextField();
        BotaoBuscaPro = new javax.swing.JButton();
        scrollBuscaPro = new javax.swing.JScrollPane();
        TabelaBusca3 = new javax.swing.JTable();
        BotaoSairPro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        PainelBuscaVendedor = new javax.swing.JPanel();
        TNomeBuscaVe = new javax.swing.JTextField();
        BotaoBuscaVe = new javax.swing.JButton();
        scrollBuscaVe = new javax.swing.JScrollPane();
        TabelaBusca2 = new javax.swing.JTable();
        BotaoSairVe = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        scrollpane1 = new javax.swing.JScrollPane();
        TTabelaItens = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        PainelValores = new javax.swing.JPanel();
        CValorDesc = new javax.swing.JTextField();
        LValor2 = new javax.swing.JLabel();
        LValorTotal2 = new javax.swing.JLabel();
        CQuantidade = new javax.swing.JTextField();
        CValorTotal = new javax.swing.JTextField();
        LQuantidade2 = new javax.swing.JLabel();
        CValor = new javax.swing.JTextField();
        LValorDesc2 = new javax.swing.JLabel();
        PainelBotoes = new javax.swing.JPanel();
        BSairVenda = new javax.swing.JButton();
        BCancelarVenda = new javax.swing.JButton();
        BGravarVenda = new javax.swing.JButton();
        BFecharVenda = new javax.swing.JButton();
        BIncluirVenda = new javax.swing.JButton();
        PainelLabel = new javax.swing.JPanel();
        Preco = new javax.swing.JTextField();
        LPreco = new javax.swing.JLabel();
        Quantidade = new javax.swing.JTextField();
        LQuantidade = new javax.swing.JLabel();
        CodModelo = new javax.swing.JTextField();
        LModelo = new javax.swing.JLabel();
        CodMarca = new javax.swing.JTextField();
        LMarca = new javax.swing.JLabel();
        CodigoCor = new javax.swing.JTextField();
        LCorProduto = new javax.swing.JLabel();
        AparecerBuscarLabelProduto = new javax.swing.JLabel();
        CodigoProduto = new javax.swing.JTextField();
        LCodigoProduto = new javax.swing.JLabel();
        LDescricaoProduto = new javax.swing.JLabel();
        DescProduto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CodVendedor = new javax.swing.JTextField();
        CodCliente = new javax.swing.JTextField();
        DescVendedor = new javax.swing.JTextField();
        DescCli = new javax.swing.JTextField();
        AparecerBuscarLabelVendedor = new javax.swing.JLabel();
        AparecerBuscarLabelCliente = new javax.swing.JLabel();
        BIncluirItem = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        PainelBuscaCliente.setBackground(new java.awt.Color(204, 204, 204));
        PainelBuscaCliente.setLayout(null);

        TNomeBuscaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TNomeBuscaClienteMouseClicked(evt);
            }
        });
        TNomeBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNomeBuscaClienteActionPerformed(evt);
            }
        });
        TNomeBuscaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TNomeBuscaClienteKeyPressed(evt);
            }
        });
        PainelBuscaCliente.add(TNomeBuscaCliente);
        TNomeBuscaCliente.setBounds(10, 21, 488, 20);

        BotaoBuscaCliente.setText("Ok");
        BotaoBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscaClienteActionPerformed(evt);
            }
        });
        PainelBuscaCliente.add(BotaoBuscaCliente);
        BotaoBuscaCliente.setBounds(516, 20, 74, 23);

        TabelaBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaBuscaMouseClicked(evt);
            }
        });
        scrollBuscaCliente.setViewportView(TabelaBusca);
        if (TabelaBusca.getColumnModel().getColumnCount() > 0) {
            TabelaBusca.getColumnModel().getColumn(0).setResizable(false);
            TabelaBusca.getColumnModel().getColumn(1).setResizable(false);
            TabelaBusca.getColumnModel().getColumn(2).setResizable(false);
        }

        PainelBuscaCliente.add(scrollBuscaCliente);
        scrollBuscaCliente.setBounds(10, 52, 580, 313);

        BotaoSairCliente.setText("Sair");
        BotaoSairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairClienteActionPerformed(evt);
            }
        });
        PainelBuscaCliente.add(BotaoSairCliente);
        BotaoSairCliente.setBounds(10, 376, 97, 23);

        getContentPane().add(PainelBuscaCliente);
        PainelBuscaCliente.setBounds(80, 80, 600, 410);

        PainelBuscaProdutos.setBackground(new java.awt.Color(204, 204, 204));

        TNomeBuscaPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TNomeBuscaProMouseClicked(evt);
            }
        });
        TNomeBuscaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNomeBuscaProActionPerformed(evt);
            }
        });
        TNomeBuscaPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TNomeBuscaProKeyPressed(evt);
            }
        });

        BotaoBuscaPro.setText("Ok");
        BotaoBuscaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscaProActionPerformed(evt);
            }
        });

        TabelaBusca3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Cor", "Marca", "Modelo", "Valorl"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaBusca3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaBusca3MouseClicked(evt);
            }
        });
        scrollBuscaPro.setViewportView(TabelaBusca3);
        if (TabelaBusca3.getColumnModel().getColumnCount() > 0) {
            TabelaBusca3.getColumnModel().getColumn(0).setResizable(false);
            TabelaBusca3.getColumnModel().getColumn(1).setResizable(false);
            TabelaBusca3.getColumnModel().getColumn(2).setResizable(false);
            TabelaBusca3.getColumnModel().getColumn(3).setResizable(false);
            TabelaBusca3.getColumnModel().getColumn(4).setResizable(false);
            TabelaBusca3.getColumnModel().getColumn(5).setResizable(false);
        }

        BotaoSairPro.setText("Sair");
        BotaoSairPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairProActionPerformed(evt);
            }
        });

        jLabel10.setText("Busca Produtos");

        javax.swing.GroupLayout PainelBuscaProdutosLayout = new javax.swing.GroupLayout(PainelBuscaProdutos);
        PainelBuscaProdutos.setLayout(PainelBuscaProdutosLayout);
        PainelBuscaProdutosLayout.setHorizontalGroup(
            PainelBuscaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBuscaProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelBuscaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelBuscaProdutosLayout.createSequentialGroup()
                        .addComponent(TNomeBuscaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoBuscaPro, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addGroup(PainelBuscaProdutosLayout.createSequentialGroup()
                        .addGroup(PainelBuscaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoSairPro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PainelBuscaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBuscaProdutosLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollBuscaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        PainelBuscaProdutosLayout.setVerticalGroup(
            PainelBuscaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBuscaProdutosLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelBuscaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TNomeBuscaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoBuscaPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE)
                .addComponent(BotaoSairPro)
                .addContainerGap())
            .addGroup(PainelBuscaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBuscaProdutosLayout.createSequentialGroup()
                    .addContainerGap(52, Short.MAX_VALUE)
                    .addComponent(scrollBuscaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );

        getContentPane().add(PainelBuscaProdutos);
        PainelBuscaProdutos.setBounds(80, 70, 600, 410);

        PainelBuscaVendedor.setBackground(new java.awt.Color(204, 204, 204));
        PainelBuscaVendedor.setLayout(null);

        TNomeBuscaVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TNomeBuscaVeMouseClicked(evt);
            }
        });
        TNomeBuscaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNomeBuscaVeActionPerformed(evt);
            }
        });
        TNomeBuscaVe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TNomeBuscaVeKeyPressed(evt);
            }
        });
        PainelBuscaVendedor.add(TNomeBuscaVe);
        TNomeBuscaVe.setBounds(10, 21, 488, 20);

        BotaoBuscaVe.setText("Ok");
        BotaoBuscaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscaVeActionPerformed(evt);
            }
        });
        PainelBuscaVendedor.add(BotaoBuscaVe);
        BotaoBuscaVe.setBounds(516, 20, 70, 23);

        TabelaBusca2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaBusca2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaBusca2MouseClicked(evt);
            }
        });
        scrollBuscaVe.setViewportView(TabelaBusca2);
        if (TabelaBusca2.getColumnModel().getColumnCount() > 0) {
            TabelaBusca2.getColumnModel().getColumn(0).setResizable(false);
            TabelaBusca2.getColumnModel().getColumn(1).setResizable(false);
            TabelaBusca2.getColumnModel().getColumn(2).setResizable(false);
        }

        PainelBuscaVendedor.add(scrollBuscaVe);
        scrollBuscaVe.setBounds(10, 50, 580, 313);

        BotaoSairVe.setText("Sair");
        BotaoSairVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairVeActionPerformed(evt);
            }
        });
        PainelBuscaVendedor.add(BotaoSairVe);
        BotaoSairVe.setBounds(10, 370, 97, 23);

        jLabel14.setText("Buscar Vendedor");
        PainelBuscaVendedor.add(jLabel14);
        jLabel14.setBounds(10, 0, 100, 14);

        getContentPane().add(PainelBuscaVendedor);
        PainelBuscaVendedor.setBounds(80, 70, 600, 410);

        TTabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Cor", "Marca", "Modelo", "Quantidade", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TTabelaItens.setColumnSelectionAllowed(true);
        TTabelaItens.getTableHeader().setReorderingAllowed(false);
        scrollpane1.setViewportView(TTabelaItens);
        TTabelaItens.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TTabelaItens.getColumnModel().getColumnCount() > 0) {
            TTabelaItens.getColumnModel().getColumn(0).setResizable(false);
            TTabelaItens.getColumnModel().getColumn(0).setPreferredWidth(80);
            TTabelaItens.getColumnModel().getColumn(1).setResizable(false);
            TTabelaItens.getColumnModel().getColumn(2).setResizable(false);
            TTabelaItens.getColumnModel().getColumn(3).setResizable(false);
            TTabelaItens.getColumnModel().getColumn(4).setResizable(false);
            TTabelaItens.getColumnModel().getColumn(5).setResizable(false);
            TTabelaItens.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(scrollpane1);
        scrollpane1.setBounds(10, 184, 764, 220);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 111, 765, 8);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 422, 742, 3);

        PainelValores.setLayout(null);
        PainelValores.add(CValorDesc);
        CValorDesc.setBounds(236, 44, 95, 62);

        LValor2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LValor2.setText("Valor");
        PainelValores.add(LValor2);
        LValor2.setBounds(10, 11, 40, 22);

        LValorTotal2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LValorTotal2.setText("Valor Total");
        PainelValores.add(LValorTotal2);
        LValorTotal2.setBounds(349, 11, 86, 22);

        CQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CQuantidadeActionPerformed(evt);
            }
        });
        PainelValores.add(CQuantidade);
        CQuantidade.setBounds(124, 44, 95, 62);
        PainelValores.add(CValorTotal);
        CValorTotal.setBounds(349, 44, 95, 62);

        LQuantidade2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LQuantidade2.setText("Quantidade");
        PainelValores.add(LQuantidade2);
        LQuantidade2.setBounds(124, 11, 90, 22);
        PainelValores.add(CValor);
        CValor.setBounds(10, 44, 96, 62);

        LValorDesc2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LValorDesc2.setText("Valor Desc.");
        PainelValores.add(LValorDesc2);
        LValorDesc2.setBounds(232, 11, 88, 22);

        getContentPane().add(PainelValores);
        PainelValores.setBounds(40, 440, 470, 120);

        PainelBotoes.setLayout(null);

        BSairVenda.setText("Sair");
        BSairVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSairVendaActionPerformed(evt);
            }
        });
        PainelBotoes.add(BSairVenda);
        BSairVenda.setBounds(184, 22, 60, 83);

        BCancelarVenda.setText("Cancelar");
        PainelBotoes.add(BCancelarVenda);
        BCancelarVenda.setBounds(91, 67, 83, 38);

        BGravarVenda.setText("Gravar");
        BGravarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGravarVendaActionPerformed(evt);
            }
        });
        PainelBotoes.add(BGravarVenda);
        BGravarVenda.setBounds(10, 67, 75, 38);

        BFecharVenda.setText("Fechar");
        PainelBotoes.add(BFecharVenda);
        BFecharVenda.setBounds(91, 22, 83, 39);

        BIncluirVenda.setText("Incluir");
        BIncluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIncluirVendaActionPerformed(evt);
            }
        });
        PainelBotoes.add(BIncluirVenda);
        BIncluirVenda.setBounds(10, 22, 75, 39);

        getContentPane().add(PainelBotoes);
        PainelBotoes.setBounds(520, 440, 250, 120);

        PainelLabel.setLayout(null);
        PainelLabel.add(Preco);
        Preco.setBounds(680, 37, 70, 20);

        LPreco.setText("Preço:");
        PainelLabel.add(LPreco);
        LPreco.setBounds(680, 17, 60, 14);
        PainelLabel.add(Quantidade);
        Quantidade.setBounds(570, 37, 100, 20);

        LQuantidade.setText("Quantidade:");
        PainelLabel.add(LQuantidade);
        LQuantidade.setBounds(570, 17, 90, 14);
        PainelLabel.add(CodModelo);
        CodModelo.setBounds(470, 37, 86, 20);

        LModelo.setText("Modelo:");
        PainelLabel.add(LModelo);
        LModelo.setBounds(470, 17, 80, 14);
        PainelLabel.add(CodMarca);
        CodMarca.setBounds(380, 37, 78, 20);

        LMarca.setText("Marca:");
        PainelLabel.add(LMarca);
        LMarca.setBounds(380, 17, 70, 14);
        PainelLabel.add(CodigoCor);
        CodigoCor.setBounds(300, 37, 70, 20);

        LCorProduto.setText("Cor:");
        PainelLabel.add(LCorProduto);
        LCorProduto.setBounds(300, 17, 50, 14);

        AparecerBuscarLabelProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_48px.png"))); // NOI18N
        AparecerBuscarLabelProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AparecerBuscarLabelProdutoMouseClicked(evt);
            }
        });
        PainelLabel.add(AparecerBuscarLabelProduto);
        AparecerBuscarLabelProduto.setBounds(160, 11, 24, 20);
        PainelLabel.add(CodigoProduto);
        CodigoProduto.setBounds(80, 11, 70, 20);

        LCodigoProduto.setText("Código:");
        PainelLabel.add(LCodigoProduto);
        LCodigoProduto.setBounds(30, 11, 60, 14);

        LDescricaoProduto.setText("Descrição:");
        PainelLabel.add(LDescricaoProduto);
        LDescricaoProduto.setBounds(10, 41, 70, 14);
        PainelLabel.add(DescProduto);
        DescProduto.setBounds(80, 37, 200, 20);

        getContentPane().add(PainelLabel);
        PainelLabel.setBounds(10, 120, 760, 60);

        jPanel1.setLayout(null);

        jLabel2.setText("Vendedor:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 90, 14);

        jLabel1.setText("Cliente:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 70, 14);
        jPanel1.add(CodVendedor);
        CodVendedor.setBounds(70, 60, 50, 20);

        CodCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CodClienteMouseClicked(evt);
            }
        });
        jPanel1.add(CodCliente);
        CodCliente.setBounds(70, 30, 50, 20);
        jPanel1.add(DescVendedor);
        DescVendedor.setBounds(130, 60, 245, 20);

        DescCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DescCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DescCliFocusLost(evt);
            }
        });
        DescCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescCliActionPerformed(evt);
            }
        });
        jPanel1.add(DescCli);
        DescCli.setBounds(130, 30, 245, 20);

        AparecerBuscarLabelVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_48px.png"))); // NOI18N
        AparecerBuscarLabelVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AparecerBuscarLabelVendedorMouseClicked(evt);
            }
        });
        jPanel1.add(AparecerBuscarLabelVendedor);
        AparecerBuscarLabelVendedor.setBounds(380, 60, 24, 20);

        AparecerBuscarLabelCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_48px.png"))); // NOI18N
        AparecerBuscarLabelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AparecerBuscarLabelClienteMouseClicked(evt);
            }
        });
        jPanel1.add(AparecerBuscarLabelCliente);
        AparecerBuscarLabelCliente.setBounds(380, 30, 24, 20);

        BIncluirItem.setText("Incluir Item");
        BIncluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIncluirItemActionPerformed(evt);
            }
        });
        jPanel1.add(BIncluirItem);
        BIncluirItem.setBounds(630, 60, 110, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 760, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void esconderBusca()
    {
        PainelBuscaCliente.setVisible(false);
        BotaoBuscaCliente.setVisible(false);
        TNomeBuscaCliente.setVisible(false);
        TabelaBusca.setVisible(false);
        scrollBuscaCliente.setVisible(false);
    }
    public void aparecerBusca(){
        
        PainelBuscaCliente.setVisible(true);
        BotaoBuscaCliente.setVisible(true);
        TNomeBuscaCliente.setVisible(true);
        TabelaBusca.setVisible(true);
        scrollBuscaCliente.setVisible(true);
    
    }
        public void esconderBuscaVE()
    {
        PainelBuscaVendedor.setVisible(false);
        BotaoBuscaVe.setVisible(false);
        TNomeBuscaVe.setVisible(false);
        TabelaBusca2.setVisible(false);
        scrollBuscaVe.setVisible(false);
    }
    public void aparecerBuscaVE(){
        
        PainelBuscaVendedor.setVisible(true);
        BotaoBuscaVe.setVisible(true);
        TNomeBuscaVe.setVisible(true);
        TabelaBusca2.setVisible(true);
        scrollBuscaVe.setVisible(true);
    
    }
        public void esconderBuscaPRO()
    {
        PainelBuscaProdutos.setVisible(false);
        BotaoBuscaPro.setVisible(false);
        TNomeBuscaPro.setVisible(false);
        TabelaBusca3.setVisible(false);
        scrollBuscaPro.setVisible(false);
    }
    public void aparecerBuscaPRO(){
        
        PainelBuscaProdutos.setVisible(true);
        BotaoBuscaPro.setVisible(true);
        TNomeBuscaPro.setVisible(true);
        TabelaBusca3.setVisible(true);
        scrollBuscaPro.setVisible(true);
    
    }
    
    public void selecionarVendedor(){
    
            int row = TabelaBusca2.getSelectedRow();
        
        entidadepojo.setCODIGOE(Integer.parseInt(TabelaBusca2.getValueAt(row,0).toString().trim()));
        entidadepojo.setNOME(TabelaBusca2.getValueAt(row,1).toString().trim());
        
        CodVendedor.setText(String.valueOf(entidadepojo.getCODIGOE()));
        DescVendedor.setText(String.valueOf(entidadepojo.getNOME()));
}
    
    
        public void selecionarProduto(){
                int row = TabelaBusca3.getSelectedRow();
        
        produtopojo.setCODIGOP(Integer.parseInt(TabelaBusca3.getValueAt(row,0).toString().trim()));
        produtopojo.setDESCRICAO(TabelaBusca3.getValueAt(row,1).toString().trim());
        produtopojo.setCOR(TabelaBusca3.getValueAt(row,2).toString().trim());
        produtopojo.setMARCA(TabelaBusca3.getValueAt(row,3).toString().trim());
        produtopojo.setMODELO(TabelaBusca3.getValueAt(row,4).toString().trim());
        produtopojo.setPRECO(TabelaBusca3.getValueAt(row,5).toString().trim());
        
        CodigoProduto.setText(String.valueOf(produtopojo.getCODIGOP()));
        DescProduto.setText(String.valueOf(produtopojo.getDESCRICAO()));
        CodigoCor.setText(String.valueOf(produtopojo.getCOR()));
        CodMarca.setText(String.valueOf(produtopojo.getMARCA()));
        CodModelo.setText(String.valueOf(produtopojo.getMODELO()));
        Preco.setText(String.valueOf(produtopojo.getPRECO()));
    }
     
        
        public void selecionarCliente(){
                int row = TabelaBusca.getSelectedRow();
        
        entidadepojo.setCODIGOE(Integer.parseInt(TabelaBusca.getValueAt(row,0).toString().trim()));
        entidadepojo.setNOME(TabelaBusca.getValueAt(row,1).toString().trim());
        
        CodCliente.setText(String.valueOf(entidadepojo.getCODIGOE()));
        DescCli.setText(String.valueOf(entidadepojo.getNOME()));
    }
        
    
    
    
    
    
        
    
    
    
    
    private void BIncluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIncluirVendaActionPerformed
        limparCampos();
    }//GEN-LAST:event_BIncluirVendaActionPerformed

    private void BSairVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSairVendaActionPerformed
        this.dispose();
    }//GEN-LAST:event_BSairVendaActionPerformed

    private void DescCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DescCliFocusGained
      
    }//GEN-LAST:event_DescCliFocusGained

    private void DescCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescCliActionPerformed
            
    }//GEN-LAST:event_DescCliActionPerformed

    private void DescCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DescCliFocusLost

    }//GEN-LAST:event_DescCliFocusLost

    private void CQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CQuantidadeActionPerformed

    }//GEN-LAST:event_CQuantidadeActionPerformed

    private void BIncluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIncluirItemActionPerformed
         
        
          String Codigop=CodigoProduto.getText().trim();
          String Descricao=DescProduto.getText().trim();
          String Cor=CodigoCor.getText().trim();
          String Marca=CodMarca.getText().trim();
          String Modelo=CodModelo.getText().trim();
          String QTDE=Quantidade.getText().trim();
          String PRC=Preco.getText().trim();
          
          
          DefaultTableModel val = (DefaultTableModel) TabelaBusca3.getModel();
          val.addRow(new String[]{Codigop,Descricao,Cor,Marca,Modelo,QTDE,PRC});
          

          
          
                            /*CodigoProduto.setText("");
                            DescProduto.setText("");
                            CodigoCor.setText("");
                            CodMarca.setText("");
                            CodModelo.setText("");
                            this.Quantidade.setText("");
                            this.Preco.setText("");*/
                            
                            
    }//GEN-LAST:event_BIncluirItemActionPerformed

    private void BotaoSairClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairClienteActionPerformed
        
        esconderBusca();
        aparecerTudo();
        
    }//GEN-LAST:event_BotaoSairClienteActionPerformed

    private void CodClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodClienteMouseClicked
    
    }//GEN-LAST:event_CodClienteMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

               
    }//GEN-LAST:event_formInternalFrameOpened

    private void AparecerBuscarLabelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AparecerBuscarLabelClienteMouseClicked
        
        
        aparecerBusca();
        esconderTudo();
        
        
    }//GEN-LAST:event_AparecerBuscarLabelClienteMouseClicked

    private void TNomeBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNomeBuscaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNomeBuscaClienteActionPerformed

    private void TNomeBuscaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TNomeBuscaClienteMouseClicked
            DefaultTableModel mp1 = (DefaultTableModel) TabelaBusca.getModel();
        int l=mp1.getRowCount();
        
        if(1>0){
            while(1>0){
          ((DefaultTableModel)TabelaBusca.getModel()).removeRow(l-l);
             l--;
            }
        }
        try {
            ResultSet rs = VendaDAO.carregaTabela();
            
            DefaultTableModel mp = (DefaultTableModel) TabelaBusca.getModel();
            
            while(rs.next()){
                String Coluna0=rs.getString("CODIGOE").toString().trim();
                String Coluna1=rs.getString("NOME").toString().trim();
                String Coluna2=rs.getString("CPF").toString().trim();
                
                
                
                mp.addRow(new String[]{Coluna0,Coluna1,Coluna2});
                
            }
        
        }   catch (SQLException erro) {
            JOptionPane.showMessageDialog(this,"Ocorreu um erro:"+erro, "Preencher Item",2);
            
    }
        
            tamanhoColunas();
            TabelaBusca.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_TNomeBuscaClienteMouseClicked

    private void AparecerBuscarLabelVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AparecerBuscarLabelVendedorMouseClicked

        aparecerBuscaVE();
        esconderTudo();
        
    }//GEN-LAST:event_AparecerBuscarLabelVendedorMouseClicked

    private void BotaoBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscaClienteActionPerformed
             
        selecionarCliente();
        
           
    }//GEN-LAST:event_BotaoBuscaClienteActionPerformed

    private void TNomeBuscaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TNomeBuscaClienteKeyPressed
        if(evt.getKeyCode()==KeyEvent.KEY_PRESSED);
        List lista = entidadedao.buscarContatos(TNomeBuscaCliente.getText());
       
        for(int i=0; i<lista.size();i++){
            EntidadePOJO entidadepojo = (EntidadePOJO)lista.get(i);
            DefaultTableModel dtm = (DefaultTableModel)TabelaBusca.getModel();
            dtm.addRow(new Object[]{entidadepojo.getCODIGOE(), 
                entidadepojo.getNOME(), entidadepojo.getCPF()});
        }
    }//GEN-LAST:event_TNomeBuscaClienteKeyPressed

    private void TNomeBuscaVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TNomeBuscaVeMouseClicked
            DefaultTableModel mp1 = (DefaultTableModel) TabelaBusca2.getModel();
        int l=mp1.getRowCount();
        
        if(1>0){
            while(1>0){
          ((DefaultTableModel)TabelaBusca2.getModel()).removeRow(l-l);
             l--;
            }
        }
        try {
            ResultSet rs = VendaDAO.carregaTabela();
            
            DefaultTableModel mp = (DefaultTableModel) TabelaBusca2.getModel();
            
            while(rs.next()){
                String Coluna0=rs.getString("CODIGOE").toString().trim();
                String Coluna1=rs.getString("NOME").toString().trim();
                String Coluna2=rs.getString("CPF").toString().trim();
                
                
                
                mp.addRow(new String[]{Coluna0,Coluna1,Coluna2});
                
            }
        
        }   catch (SQLException erro) {
            JOptionPane.showMessageDialog(this,"Ocorreu um erro:"+erro, "Preencher Item",2);
            
    }
        
            tamanhoColunas();
            TabelaBusca2.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_TNomeBuscaVeMouseClicked

    private void TNomeBuscaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNomeBuscaVeActionPerformed

    }//GEN-LAST:event_TNomeBuscaVeActionPerformed

    private void TNomeBuscaVeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TNomeBuscaVeKeyPressed

        if(evt.getKeyCode()==KeyEvent.KEY_PRESSED);
        List lista = entidadedao.buscarContatos(TNomeBuscaVe.getText());
       
        for(int i=0; i<lista.size();i++){
            EntidadePOJO entidadepojo = (EntidadePOJO)lista.get(i);
            DefaultTableModel dtm = (DefaultTableModel)TabelaBusca2.getModel();
            dtm.addRow(new Object[]{entidadepojo.getCODIGOE(), 
                entidadepojo.getNOME(), entidadepojo.getCPF()});
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_TNomeBuscaVeKeyPressed

    private void BotaoBuscaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscaVeActionPerformed

    }//GEN-LAST:event_BotaoBuscaVeActionPerformed

    private void BotaoSairVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairVeActionPerformed
      
        esconderBuscaVE();
        aparecerTudo();
    }//GEN-LAST:event_BotaoSairVeActionPerformed

    private void TNomeBuscaProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TNomeBuscaProMouseClicked
        DefaultTableModel mp2 = (DefaultTableModel) TabelaBusca3.getModel();
        int l=mp2.getRowCount();
        
        if(1>0){
            while(1>0){
          ((DefaultTableModel)TabelaBusca3.getModel()).removeRow(l-l);
             l--;
            }
        }
        try {
            ResultSet rs = VendaDAO.carregaTabelaPro();
            
            DefaultTableModel mp = (DefaultTableModel) TabelaBusca3.getModel();
            
            while(rs.next()){
                String Coluna0=rs.getString("CODIGOP").toString().trim();
                String Coluna1=rs.getString("DESCRICAO").toString().trim();
                String Coluna2=rs.getString("COR").toString().trim();
                String Coluna3=rs.getString("MARCA").toString().trim();
                String Coluna4=rs.getString("MODELO").toString().trim();
                String Coluna5=rs.getString("VALOR").toString().trim();
                
                
                
                mp.addRow(new String[]{Coluna0,Coluna1,Coluna2,Coluna3,Coluna4,Coluna5});
                
            }
        
        }   catch (SQLException erro) {
            JOptionPane.showMessageDialog(this,"Ocorreu um erro:"+erro, "Preencher Item",2);
            
    }
        
            tamanhoColunas();
            TabelaBusca3.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_TNomeBuscaProMouseClicked

    private void TNomeBuscaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNomeBuscaProActionPerformed

    }//GEN-LAST:event_TNomeBuscaProActionPerformed

    private void TNomeBuscaProKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TNomeBuscaProKeyPressed
        
        if(evt.getKeyCode()==KeyEvent.KEY_PRESSED);
        List lista = produtodao.buscarProduto(TNomeBuscaPro.getText());
       
        for(int i=0; i<lista.size();i++){
            ProdutoPOJO produtopojo = (ProdutoPOJO)lista.get(i);
            DefaultTableModel dtm = (DefaultTableModel)TabelaBusca3.getModel();
            dtm.addRow(new Object[]{
                produtopojo.getCODIGOP(), 
                produtopojo.getDESCRICAO(),
                produtopojo.getCOR(),
                produtopojo.getMARCA(), 
                produtopojo.getMODELO(),
                produtopojo.getPRECO()});
        }
    
        
    }//GEN-LAST:event_TNomeBuscaProKeyPressed

    private void BotaoBuscaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscaProActionPerformed
      
        selecionarProduto();
        
    }//GEN-LAST:event_BotaoBuscaProActionPerformed

    private void BotaoSairProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairProActionPerformed
     
        esconderBuscaPRO();
        aparecerTudo();
    }//GEN-LAST:event_BotaoSairProActionPerformed

    private void AparecerBuscarLabelProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AparecerBuscarLabelProdutoMouseClicked

        aparecerBuscaPRO();
        esconderTudo();
        
    }//GEN-LAST:event_AparecerBuscarLabelProdutoMouseClicked

    private void TabelaBusca3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaBusca3MouseClicked
     
        selecionarProduto();
        esconderBuscaPRO();
        aparecerTudo();
        
    }//GEN-LAST:event_TabelaBusca3MouseClicked

    private void TabelaBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaBuscaMouseClicked
      
        selecionarCliente();
        esconderBusca();        
        aparecerTudo();
    }//GEN-LAST:event_TabelaBuscaMouseClicked

    private void TabelaBusca2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaBusca2MouseClicked
  
        selecionarVendedor();
        esconderBuscaVE(); 
        aparecerTudo();
    }//GEN-LAST:event_TabelaBusca2MouseClicked

    private void BGravarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGravarVendaActionPerformed
                pegar_dados();
        try{
        //vendamodel.verificar_campos(vendapojo);
         vendadao.inserirVenda(vendapojo);
            }catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+e.getMessage()+" é obrigatório");
            }
                JOptionPane.showMessageDialog(null, "Pronto!");
    }//GEN-LAST:event_BGravarVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AparecerBuscarLabelCliente;
    private javax.swing.JLabel AparecerBuscarLabelProduto;
    private javax.swing.JLabel AparecerBuscarLabelVendedor;
    private javax.swing.JButton BCancelarVenda;
    private javax.swing.JButton BFecharVenda;
    private javax.swing.JButton BGravarVenda;
    private javax.swing.JButton BIncluirItem;
    private javax.swing.JButton BIncluirVenda;
    private javax.swing.JButton BSairVenda;
    private javax.swing.JButton BotaoBuscaCliente;
    private javax.swing.JButton BotaoBuscaPro;
    private javax.swing.JButton BotaoBuscaVe;
    private javax.swing.JButton BotaoSairCliente;
    private javax.swing.JButton BotaoSairPro;
    private javax.swing.JButton BotaoSairVe;
    private javax.swing.JTextField CQuantidade;
    private javax.swing.JTextField CValor;
    private javax.swing.JTextField CValorDesc;
    private javax.swing.JTextField CValorTotal;
    private javax.swing.JTextField CodCliente;
    private javax.swing.JTextField CodMarca;
    private javax.swing.JTextField CodModelo;
    private javax.swing.JTextField CodVendedor;
    private javax.swing.JTextField CodigoCor;
    private javax.swing.JTextField CodigoProduto;
    private javax.swing.JTextField DescCli;
    private javax.swing.JTextField DescProduto;
    private javax.swing.JTextField DescVendedor;
    private javax.swing.JLabel LCodigoProduto;
    private javax.swing.JLabel LCorProduto;
    private javax.swing.JLabel LDescricaoProduto;
    private javax.swing.JLabel LMarca;
    private javax.swing.JLabel LModelo;
    private javax.swing.JLabel LPreco;
    private javax.swing.JLabel LQuantidade;
    private javax.swing.JLabel LQuantidade2;
    private javax.swing.JLabel LValor2;
    private javax.swing.JLabel LValorDesc2;
    private javax.swing.JLabel LValorTotal2;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelBuscaCliente;
    private javax.swing.JPanel PainelBuscaProdutos;
    private javax.swing.JPanel PainelBuscaVendedor;
    private javax.swing.JPanel PainelLabel;
    private javax.swing.JPanel PainelValores;
    private javax.swing.JTextField Preco;
    private javax.swing.JTextField Quantidade;
    private javax.swing.JTextField TNomeBuscaCliente;
    private javax.swing.JTextField TNomeBuscaPro;
    private javax.swing.JTextField TNomeBuscaVe;
    private javax.swing.JTable TTabelaItens;
    private javax.swing.JTable TabelaBusca;
    private javax.swing.JTable TabelaBusca2;
    private javax.swing.JTable TabelaBusca3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JScrollPane scrollBuscaCliente;
    private javax.swing.JScrollPane scrollBuscaPro;
    private javax.swing.JScrollPane scrollBuscaVe;
    private javax.swing.JScrollPane scrollpane1;
    // End of variables declaration//GEN-END:variables

    public void tamanhoColunas(){
    TabelaBusca.getColumnModel().getColumn(0).setMinWidth(100);
    TabelaBusca.getColumnModel().getColumn(1).setMaxWidth(250);
    }
    
}

