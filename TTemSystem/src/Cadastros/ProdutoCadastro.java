/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastros;

import DAO.ProdutoDAO;
import DAO.VendaDAO;
import MODEL.ProdutoMODEL;
import POJO.ProdutoPOJO;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

        
public class ProdutoCadastro extends javax.swing.JInternalFrame {
        
        ProdutoDAO produtodao = new ProdutoDAO();
        ProdutoMODEL produtomodel = new ProdutoMODEL();
        ProdutoPOJO produtopojo = new ProdutoPOJO();
        GeradorCodigo gerador = new GeradorCodigo();
    /**
     * Creates new form CadastroProduto
     */
    public ProdutoCadastro() {
        initComponents();
        esconderBuscaPRO();
        TPFornecedor.setEnabled(false);
        CodigoProduto.setEnabled(false);
        //TPCCor.setEnabled(false);
        //TPCMarca.setEnabled(false);
        //TPCFornecedor.setEnabled(false);
    }
        public void pegar_dados(){
      produtopojo.setCODIGOP(Integer.parseInt(CodigoProduto.getText()));
      produtopojo.setDESCRICAO(DescProduto.getText());
      produtopojo.setMODELO(CodModelo.getText());
      produtopojo.setMARCA(CodMarca.getText());
      produtopojo.setCOR(CodigoCor.getText());
      produtopojo.setPRECO(Preco.getText());
      produtopojo.setCUSTO(Custo.getText());
      produtopojo.setQTDE(Integer.parseInt(Quantidade.getText())); 
    }

      public void limparCampos(){
      CodigoProduto.setText("0");
      DescProduto.setText("");
      CodModelo.setText("");
      CodMarca.setText("");
      CodigoCor.setText("");
      Preco.setText("0,00");
      Custo.setText("0,00");
      Quantidade.setText("");
    }
      public void esconderTudo(){
          jPanel1.setVisible(false);
          jPanel2.setVisible(false);
      }
      public void aparecerTudo(){
          jPanel1.setVisible(true);
          jPanel2.setVisible(true);
      }

      public class GeradorCodigo {
          
      }
      public void limparTabela(){
        DefaultTableModel dtm= (DefaultTableModel)TabelaBusca3.getModel();
         int nlinhas = dtm.getRowCount();
        for(int i=0;i< nlinhas;i++){
         dtm.removeRow(0);}  
            
    }
      public void buscarAutomatico(){
      java.util.List Lista = produtodao.buscarProduto(TNomeBuscaPro.getText());
       limparTabela();
     for (int i=0; i< Lista.size();i++){
        ProdutoPOJO produtopojo = (ProdutoPOJO) Lista.get(i);
        DefaultTableModel dtm= (DefaultTableModel)TabelaBusca3.getModel();
        dtm.addRow(new Object[]{produtopojo.getCODIGOP(),produtopojo.getDESCRICAO(),produtopojo.getMODELO(),produtopojo.getMARCA(),produtopojo.getCOR(),produtopojo.getQTDE(),produtopojo.getPRECO(),produtopojo.getCUSTO()});
    }
 }
    private static int ID = 1;

        public static int getProxProduto() {
        return ID++;
    }
        public void aparecerBuscaPRO(){
        
        PainelBuscaProdutos.setVisible(true);
        BotaoBuscaPro.setVisible(true);
        TNomeBuscaPro.setVisible(true);
        TabelaBusca3.setVisible(true);
        scrollBuscaPro.setVisible(true);
    }
        public void esconderBuscaPRO(){
        PainelBuscaProdutos.setVisible(false);
        BotaoBuscaPro.setVisible(false);
        TNomeBuscaPro.setVisible(false);
        TabelaBusca3.setVisible(false);
        scrollBuscaPro.setVisible(false);
    }
        public void selecionarProduto(){
        int row = TabelaBusca3.getSelectedRow();
        
        produtopojo.setCODIGOP(Integer.parseInt(TabelaBusca3.getValueAt(row,0).toString().trim()));
        produtopojo.setDESCRICAO(TabelaBusca3.getValueAt(row,1).toString().trim());
        produtopojo.setCOR(TabelaBusca3.getValueAt(row,2).toString().trim());
        produtopojo.setMARCA(TabelaBusca3.getValueAt(row,3).toString().trim());
        produtopojo.setMODELO(TabelaBusca3.getValueAt(row,4).toString().trim());
        produtopojo.setPRECO(TabelaBusca3.getValueAt(row,5).toString().trim());
        produtopojo.setQTDE(Integer.parseInt(TabelaBusca3.getValueAt(row,6).toString().trim()));
        produtopojo.setCUSTO(TabelaBusca3.getValueAt(row,7).toString().trim());
        
        CodigoProduto.setText(String.valueOf(produtopojo.getCODIGOP()));
        DescProduto.setText(String.valueOf(produtopojo.getDESCRICAO()));
        CodigoCor.setText(String.valueOf(produtopojo.getCOR()));
        CodMarca.setText(String.valueOf(produtopojo.getMARCA()));
        CodModelo.setText(String.valueOf(produtopojo.getMODELO()));
        Preco.setText(String.valueOf(produtopojo.getPRECO()));
        Quantidade.setText(String.valueOf(produtopojo.getQTDE()));
        Custo.setText(String.valueOf(produtopojo.getCUSTO()));        
    }
            public void excluirProduto() {                                         
             if(TabelaBusca3.getSelectedRow()<0){
            JOptionPane.showConfirmDialog(null,"É Obrigatório Selecionar uma Linha");
             }
            else{
                 int linha=TabelaBusca3.getSelectedRow();
            Object dado=TabelaBusca3.getValueAt(linha, 0);
            int CODIGOP=Integer.parseInt(""+TabelaBusca3.getValueAt(linha, 0)); 
            String nome=""+TabelaBusca3.getValueAt(linha, 1);
            int ok=JOptionPane.showConfirmDialog(null,"Deseja realmente excluir o produto " +nome);
            if(ok==0){
                produtodao.removerProduto(CODIGOP);
                limparTabela();
                buscarAutomatico();
                
            }
        }
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBuscaProdutos = new javax.swing.JPanel();
        TNomeBuscaPro = new javax.swing.JTextField();
        BotaoBuscaPro = new javax.swing.JButton();
        scrollBuscaPro = new javax.swing.JScrollPane();
        TabelaBusca3 = new javax.swing.JTable();
        BotaoSairPro = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CodigoProduto = new javax.swing.JTextField();
        DescProduto = new javax.swing.JTextField();
        DescricaoProduto = new javax.swing.JLabel();
        CodModelo = new javax.swing.JTextField();
        TPFornecedor = new javax.swing.JTextField();
        LModeloProd = new javax.swing.JLabel();
        LFornecedor = new javax.swing.JLabel();
        LMarcaProd = new javax.swing.JLabel();
        LCorProd = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        LPreco = new javax.swing.JLabel();
        Quantidade = new javax.swing.JTextField();
        LCusto = new javax.swing.JLabel();
        LQuantidade = new javax.swing.JLabel();
        Preco = new javax.swing.JFormattedTextField();
        Custo = new javax.swing.JFormattedTextField();
        CodMarca = new javax.swing.JTextField();
        CodigoCor = new javax.swing.JTextField();
        BuscarProduto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BPCadastrar = new javax.swing.JButton();
        BPNovo = new javax.swing.JButton();
        BPAlterar = new javax.swing.JButton();
        BPExcluir = new javax.swing.JButton();
        BPSair = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

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
                "Código", "Descrição", "Cor", "Marca", "Modelo", "Valor", "Quantidade", "Custo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            TabelaBusca3.getColumnModel().getColumn(6).setResizable(false);
            TabelaBusca3.getColumnModel().getColumn(7).setResizable(false);
        }

        BotaoSairPro.setText("Sair");
        BotaoSairPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairProActionPerformed(evt);
            }
        });

        jLabel11.setText("Busca Produtos");

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
                            .addComponent(jLabel11))
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
                .addComponent(jLabel11)
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
        PainelBuscaProdutos.setBounds(92, 80, 600, 410);

        jPanel1.setBackground(new java.awt.Color(227, 227, 227));

        jLabel1.setText("Código");

        CodigoProduto.setText("0");
        CodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoProdutoActionPerformed(evt);
            }
        });

        DescricaoProduto.setText("Descrição:");

        LModeloProd.setText("Modelo:");

        LFornecedor.setText("Fornecedor:");

        LMarcaProd.setText("Marca:");

        LCorProd.setText("Cor:");

        LPreco.setText("Preço:");

        Quantidade.setText("0");

        LCusto.setText("Custo:");

        LQuantidade.setText("Quantidade:");

        Preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        Preco.setText("0,00");

        Custo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        Custo.setText("0,00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LPreco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LCusto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Quantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(Preco)
                    .addComponent(Custo))
                .addGap(53, 53, 53))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPreco)
                    .addComponent(Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCusto)
                    .addComponent(Custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LQuantidade))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        BuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_48px.png"))); // NOI18N
        BuscarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarProdutoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(46, 46, 46))
                                    .addComponent(LModeloProd, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(LMarcaProd, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(LCorProd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodModelo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DescricaoProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BuscarProduto))
                                    .addComponent(DescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CodMarca, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TPFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuscarProduto)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(DescricaoProduto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CodModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LModeloProd))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LMarcaProd))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LCorProd))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TPFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LFornecedor))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 764, 235);

        jPanel2.setBackground(new java.awt.Color(227, 227, 227));

        BPCadastrar.setText("Cadastrar");
        BPCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPCadastrarActionPerformed(evt);
            }
        });

        BPNovo.setText("Novo");
        BPNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPNovoActionPerformed(evt);
            }
        });

        BPAlterar.setText("Alterar");
        BPAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPAlterarActionPerformed(evt);
            }
        });

        BPExcluir.setText("Excluir");
        BPExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPExcluirActionPerformed(evt);
            }
        });

        BPSair.setText("Sair");
        BPSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(BPSair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(BPExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BPAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BPNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BPCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BPSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 264, 764, 296);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPCadastrarActionPerformed
        pegar_dados();
        try {
        produtomodel.verificar_campos(produtopojo);
        produtodao.inserirProduto(produtopojo);
        JOptionPane.showMessageDialog(null, "Pronto");
        limparCampos();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "O campo "+e.getMessage()+" é obrigatório");
            }
            
    }//GEN-LAST:event_BPCadastrarActionPerformed
    
    private void BPAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPAlterarActionPerformed
        pegar_dados();
        try{
            produtomodel.verificar_campos(produtopojo);
            produtodao.alterarProduto(produtopojo);
            //JOptionPane.showMessageDialog(null , "Pronto!");
            limparCampos();
            limparTabela();
            TNomeBuscaPro.setText("");
        } catch (IllegalArgumentException e){
        JOptionPane.showMessageDialog(null, "O campo "+e.getMessage()+"é obrigatório");
        }
    }//GEN-LAST:event_BPAlterarActionPerformed

    private void BPExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPExcluirActionPerformed

        
        excluirProduto();
        limparCampos();
        
    }//GEN-LAST:event_BPExcluirActionPerformed

    private void BPSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPSairActionPerformed
  
        this.dispose();
        
    }//GEN-LAST:event_BPSairActionPerformed

    private void BPNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPNovoActionPerformed
 
        limparCampos();
        
    }//GEN-LAST:event_BPNovoActionPerformed

    private void CodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoProdutoActionPerformed
        
    }//GEN-LAST:event_CodigoProdutoActionPerformed

    private void BuscarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarProdutoMouseClicked
  
        esconderTudo();
        aparecerBuscaPRO();     
        
    }//GEN-LAST:event_BuscarProdutoMouseClicked

    private void TNomeBuscaProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TNomeBuscaProMouseClicked
        DefaultTableModel mp3 = (DefaultTableModel) TabelaBusca3.getModel();
        int l=mp3.getRowCount();

        if(1>0){
            while(1>0){
                ((DefaultTableModel)TabelaBusca3.getModel()).removeRow(l-l);
                l--;
            }
        }
        try {
            ResultSet rs = ProdutoDAO.carregaTabelaPro();

            DefaultTableModel mp = (DefaultTableModel) TabelaBusca3.getModel();

            while(rs.next()){
                String Coluna0=rs.getString("CODIGOP").toString().trim();
                String Coluna1=rs.getString("DESCRICAO").toString().trim();
                String Coluna2=rs.getString("COR").toString().trim();
                String Coluna3=rs.getString("MARCA").toString().trim();
                String Coluna4=rs.getString("MODELO").toString().trim();
                String Coluna5=rs.getString("VALOR").toString().trim();
                String Coluna6=rs.getString("QTDE").toString().trim();
                String Coluna7=rs.getString("CUSTO").toString().trim();

                mp.addRow(new String[]{Coluna0,Coluna1,Coluna2,Coluna3,Coluna4,Coluna5,Coluna6,Coluna7});

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
                produtopojo.getPRECO(),
                produtopojo.getQTDE(),
                produtopojo.getCUSTO()});
        }

    }//GEN-LAST:event_TNomeBuscaProKeyPressed

    private void BotaoBuscaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscaProActionPerformed

        selecionarProduto();

    }//GEN-LAST:event_BotaoBuscaProActionPerformed

    private void TabelaBusca3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaBusca3MouseClicked
     
        selecionarProduto();
        esconderBuscaPRO();
        aparecerTudo();

    }//GEN-LAST:event_TabelaBusca3MouseClicked

    private void BotaoSairProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairProActionPerformed
       
        aparecerTudo();
        esconderBuscaPRO();
        
    }//GEN-LAST:event_BotaoSairProActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BPAlterar;
    private javax.swing.JButton BPCadastrar;
    private javax.swing.JButton BPExcluir;
    private javax.swing.JButton BPNovo;
    private javax.swing.JButton BPSair;
    private javax.swing.JButton BotaoBuscaPro;
    private javax.swing.JButton BotaoSairPro;
    private javax.swing.JLabel BuscarProduto;
    private javax.swing.JTextField CodMarca;
    private javax.swing.JTextField CodModelo;
    private javax.swing.JTextField CodigoCor;
    private javax.swing.JTextField CodigoProduto;
    private javax.swing.JFormattedTextField Custo;
    private javax.swing.JTextField DescProduto;
    private javax.swing.JLabel DescricaoProduto;
    private javax.swing.JLabel LCorProd;
    private javax.swing.JLabel LCusto;
    private javax.swing.JLabel LFornecedor;
    private javax.swing.JLabel LMarcaProd;
    private javax.swing.JLabel LModeloProd;
    private javax.swing.JLabel LPreco;
    private javax.swing.JLabel LQuantidade;
    private javax.swing.JPanel PainelBuscaProdutos;
    private javax.swing.JFormattedTextField Preco;
    private javax.swing.JTextField Quantidade;
    private javax.swing.JTextField TNomeBuscaPro;
    private javax.swing.JTextField TPFornecedor;
    private javax.swing.JTable TabelaBusca3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane scrollBuscaPro;
    // End of variables declaration//GEN-END:variables
    public void tamanhoColunas(){
    TabelaBusca3.getColumnModel().getColumn(0).setMinWidth(100);
    TabelaBusca3.getColumnModel().getColumn(1).setMaxWidth(250);
    }
    
}


