package use_case;

import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class TelaVenda extends javax.swing.JFrame {
    private ControladorFarmacia controller;
    private List<Produto> produtos;
    private double valorTotal = 0.0;
    private DecimalFormat df;

    public TelaVenda(ControladorFarmacia controller) {
        this.controller = controller;
        this.produtos = this.controller.getProdutos();
        this.df = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.ENGLISH));    
        
        initComponents(); 
        erroCodigo.setVisible(false);
        botaoLimpar.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoPrecoUnitario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoPrecoTotal = new javax.swing.JTextField();
        campoQuantidade = new javax.swing.JSpinner();
        botaoAdicionarAoCarrinho = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoValorTotalDaCompra = new javax.swing.JTextField();
        botaoFazerPagamento = new javax.swing.JButton();
        botaoCancelarVenda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botaoRemoverItens = new javax.swing.JButton();
        scrollTabela = new javax.swing.JScrollPane();
        tabelaDeProdutos = new javax.swing.JTable();
        campoNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoCategoria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        erroCodigo = new javax.swing.JLabel();
        botaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Venda");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 751));
        setResizable(false);

        botaoVoltar.setBackground(new java.awt.Color(18, 17, 73));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("VOLTAR");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setLabelFor(tabelaDeProdutos);
        jLabel1.setText("CARRINHO");

        campoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoCodigoKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setLabelFor(campoPrecoUnitario);
        jLabel3.setText("PREÇO UNITÁRIO");

        campoPrecoUnitario.setEditable(false);
        campoPrecoUnitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoPrecoUnitario.setText("0.00");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setLabelFor(campoQuantidade);
        jLabel4.setText("QUANTIDADE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setLabelFor(campoPrecoTotal);
        jLabel5.setText("PREÇO TOTAL");

        campoPrecoTotal.setEditable(false);
        campoPrecoTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        campoQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        campoQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        campoQuantidade.setEnabled(false);
        campoQuantidade.setPreferredSize(new java.awt.Dimension(34, 26));
        campoQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                campoQuantidadeStateChanged(evt);
            }
        });

        botaoAdicionarAoCarrinho.setBackground(new java.awt.Color(255, 49, 79));
        botaoAdicionarAoCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        botaoAdicionarAoCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionarAoCarrinho.setText("ADICIONAR");
        botaoAdicionarAoCarrinho.setEnabled(false);
        botaoAdicionarAoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarAoCarrinhoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setLabelFor(campoValorTotalDaCompra);
        jLabel6.setText("VALOR TOTAL DA COMPRA (R$)");

        campoValorTotalDaCompra.setEditable(false);
        campoValorTotalDaCompra.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        campoValorTotalDaCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoValorTotalDaCompra.setText("0.00");
        campoValorTotalDaCompra.setRequestFocusEnabled(false);
        campoValorTotalDaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorTotalDaCompraActionPerformed(evt);
            }
        });

        botaoFazerPagamento.setBackground(new java.awt.Color(255, 49, 79));
        botaoFazerPagamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoFazerPagamento.setForeground(new java.awt.Color(255, 255, 255));
        botaoFazerPagamento.setText("FAZER PAGAMENTO");
        botaoFazerPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFazerPagamentoActionPerformed(evt);
            }
        });

        botaoCancelarVenda.setBackground(new java.awt.Color(255, 49, 79));
        botaoCancelarVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoCancelarVenda.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelarVenda.setText("CANCELAR VENDA");
        botaoCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarVendaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setLabelFor(campoCodigo);
        jLabel7.setText("CÓDIGO");

        botaoRemoverItens.setBackground(new java.awt.Color(255, 49, 79));
        botaoRemoverItens.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoRemoverItens.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverItens.setText("REMOVER ITENS SELECIONADOS");
        botaoRemoverItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverItensActionPerformed(evt);
            }
        });

        scrollTabela.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollTabela.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabelaDeProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME", "PREÇO", "QUANTIDADE", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDeProdutos.setFocusable(false);
        tabelaDeProdutos.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaDeProdutos.setRowHeight(30);
        tabelaDeProdutos.setRowSelectionAllowed(false);
        tabelaDeProdutos.setSelectionBackground(new java.awt.Color(18, 17, 73));
        tabelaDeProdutos.getTableHeader().setResizingAllowed(false);
        tabelaDeProdutos.getTableHeader().setReorderingAllowed(false);
        scrollTabela.setViewportView(tabelaDeProdutos);

        campoNome.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setLabelFor(campoNome);
        jLabel8.setText("NOME");

        campoCategoria.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setLabelFor(campoCategoria);
        jLabel9.setText("CATEGORIA");

        erroCodigo.setForeground(new java.awt.Color(255, 0, 51));
        erroCodigo.setText("Produto não existe!");

        botaoLimpar.setBackground(new java.awt.Color(51, 51, 51));
        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        botaoLimpar.setText("LIMPAR");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(71, 71, 71))
                                    .addComponent(campoCategoria)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(40, 40, 40))
                                    .addComponent(campoNome)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(botaoCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoFazerPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(38, 38, 38))
                                            .addComponent(campoPrecoTotal)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoPrecoUnitario)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(15, 15, 15))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botaoAdicionarAoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(348, 348, 348))
                                    .addComponent(campoValorTotalDaCompra)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(erroCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoCodigo))
                                        .addGap(232, 232, 232)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(121, 121, 121)
                                .addComponent(botaoRemoverItens, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(scrollTabela)))
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addGap(1041, 1041, 1041))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRemoverItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCodigo)
                            .addComponent(campoCategoria))
                        .addGap(3, 3, 3)
                        .addComponent(erroCodigo)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoPrecoUnitario))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botaoAdicionarAoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoPrecoTotal)))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoValorTotalDaCompra)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoFazerPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(botaoCancelarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                    .addComponent(scrollTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.controller.iniciarTelaInicial();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoFazerPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFazerPagamentoActionPerformed
        campoValorTotalDaCompra.getText();

        if(!"0.00".equals(campoValorTotalDaCompra.getText())) {
            this.controller.iniciarTelaFazerPagamento();
            //telaFazerPagamento.setAlwaysOnTop(true);
        }
    }//GEN-LAST:event_botaoFazerPagamentoActionPerformed

    private void botaoRemoverItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverItensActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaDeProdutos.getModel();
        for(int i=0;i < tabelaDeProdutos.getRowCount();i++){
            if((boolean)tabelaDeProdutos.getValueAt(i, 4)) {
                double precoRemovido = (double)tabelaDeProdutos.getValueAt(i,2);
                int quantidadeRemovida = (int)tabelaDeProdutos.getValueAt(i, 3);
                valorTotal -= quantidadeRemovida * precoRemovido;
                campoValorTotalDaCompra.setText(df.format(valorTotal));
                model.removeRow(i);
                i--;
            }
        }
        if(tabelaDeProdutos.getRowCount() == 0) {
            campoValorTotalDaCompra.setText("0.00");
        }
        // coluna 2: preço / coluna 3: quantidade
    }//GEN-LAST:event_botaoRemoverItensActionPerformed

    private void botaoAdicionarAoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarAoCarrinhoActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaDeProdutos.getModel();
        model.addRow(new Object[]{campoCodigo.getText(), campoNome.getText(), Double.parseDouble(campoPrecoUnitario.getText()), (int)campoQuantidade.getValue(), false});
        valorTotal += Double.parseDouble(campoPrecoUnitario.getText()) * (int)campoQuantidade.getValue();
        campoValorTotalDaCompra.setText(df.format(valorTotal));
        limpaCampos();
    }//GEN-LAST:event_botaoAdicionarAoCarrinhoActionPerformed

    private void campoCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCodigoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            botaoLimpar.setEnabled(true);
            
            int codigo = -1;
            try {
                codigo = Integer.parseInt(campoCodigo.getText());
                int i;
                for(i=0; i<this.produtos.size();i++){
                    if(codigo == this.produtos.get(i).getCodigo()){
                        campoNome.setText(this.produtos.get(i).getNome());
                        campoCategoria.setText(this.produtos.get(i).getCategoria().getNome());
                        String valor = df.format(this.produtos.get(i).getPreco());
                        //System.out.println(df.format(valor));
                        campoPrecoUnitario.setText(valor);
                        campoPrecoTotal.setText(valor);
                        campoQuantidade.setEnabled(true);
                        campoCodigo.setEnabled(false);
                        erroCodigo.setVisible(false);
                        botaoAdicionarAoCarrinho.setEnabled(true);
                        break;
                    }
                }
                if(i==this.produtos.size())
                erroCodigo.setVisible(true);
            }
            catch(RuntimeException error){
                erroCodigo.setVisible(true);
            }
        }
    }//GEN-LAST:event_campoCodigoKeyPressed

    private void campoQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_campoQuantidadeStateChanged
        // TODO add your handling code here:
        String valorTotal1 = df.format((int)campoQuantidade.getValue() * Double.parseDouble(campoPrecoUnitario.getText()));
        campoPrecoTotal.setText(valorTotal1);
    }//GEN-LAST:event_campoQuantidadeStateChanged

    private void botaoCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarVendaActionPerformed
        limpaCampos();
        valorTotal = 0.0;
        campoValorTotalDaCompra.setText("0.00");
        DefaultTableModel model = (DefaultTableModel) tabelaDeProdutos.getModel();
        model.setRowCount(0);
        
    }//GEN-LAST:event_botaoCancelarVendaActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void campoValorTotalDaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorTotalDaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorTotalDaCompraActionPerformed

    private void limpaCampos() {
        botaoLimpar.setEnabled(false);
        erroCodigo.setVisible(false);
        campoCodigo.setText("");
        campoCategoria.setText("");
        campoNome.setText("");
        campoQuantidade.setValue(1);
        campoQuantidade.setEnabled(false);
        campoPrecoUnitario.setText("");
        campoPrecoTotal.setText("");
        campoCodigo.setEnabled(true);
        botaoAdicionarAoCarrinho.setEnabled(false);
    }
    
    public String getValorTotalDaCompra() {
        return this.campoValorTotalDaCompra.getText();
    }
    
    public javax.swing.JTable getTabelaDeProdutos() {
        return this.tabelaDeProdutos;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarAoCarrinho;
    private javax.swing.JButton botaoCancelarVenda;
    private javax.swing.JButton botaoFazerPagamento;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoRemoverItens;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCategoria;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPrecoTotal;
    private javax.swing.JTextField campoPrecoUnitario;
    private javax.swing.JSpinner campoQuantidade;
    private javax.swing.JTextField campoValorTotalDaCompra;
    private javax.swing.JLabel erroCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane scrollTabela;
    private javax.swing.JTable tabelaDeProdutos;
    // End of variables declaration//GEN-END:variables
}
