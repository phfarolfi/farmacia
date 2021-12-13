/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package use_case;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phfar
 */
public class TelaFazerPedido extends javax.swing.JFrame {

    /**
     * Creates new form TelaFazerPedido
     */
    public TelaFazerPedido() {
        initComponents();
        teste();

        String[] fornecedoresNome = new String[fornecedores.size()+1];
        fornecedoresNome[0] = "Escolha o fornecedor...";
        for(int i = 0; i < fornecedores.size(); i++) {
            fornecedoresNome[i+1] = fornecedores.get(i).getNome();
        }
        campoFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(fornecedoresNome));
    }

    public void teste(){
        categorias = new ArrayList<CategoriaProduto>();
    	categoria1 = new CategoriaProduto("Medicamentos", "Descrição de Categoria de Produto 1");        
        categoria2 = new CategoriaProduto("Higiene e Cuidados Pessoais", "Descrição de Categoria de Produto 2");
        categoria3 = new CategoriaProduto("Saúde e Bem-estar", "Descrição de Categoria de Produto 3");
        categoria4 = new CategoriaProduto("Beleza e Dermocosméticos", "Descrição de Categoria de Produto 4");
        categoria5 = new CategoriaProduto("Conveniência", "Descrição de Categoria de Produto 5");
        categoria6 = new CategoriaProduto("Mundo Infantil", "Descrição de Categoria de Produto 6");
        categoria7 = new CategoriaProduto("Outros", "Descrição de Categoria de Produto 7");
        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
        categorias.add(categoria5);
        categorias.add(categoria6);
        categorias.add(categoria7);
        
        fabricantes = new ArrayList<Fabricante>();
        fabricante1 = new Fabricante("Sanofi");
        fabricante2 = new Fabricante("EMS");
        fabricante3 = new Fabricante("Braida");
        fabricantes.add(fabricante1);
        fabricantes.add(fabricante2);
        fabricantes.add(fabricante3);
        
        tarjas = new ArrayList<Tarja>();
        tarja1 = new Tarja("Livre Comercialização", false);
        tarja2 = new Tarja("Tarja Vermelha sem retenção de receita", false);
        tarja3 = new Tarja("Tarja Vermelha com retenção de receita", true);
        tarja4 = new Tarja("Tarja Preta", true);
        tarjas.add(tarja1);
        tarjas.add(tarja2);
        tarjas.add(tarja3);
        tarjas.add(tarja4);
        
        principiosAtivos = new ArrayList<PrincipioAtivo>();
        principioAtivo1 = new PrincipioAtivo("PrincipioAtivo 1");
        principioAtivo2 = new PrincipioAtivo("PrincipioAtivo 2");
        principioAtivo3 = new PrincipioAtivo("PrincipioAtivo 3");
        principioAtivo4 = new PrincipioAtivo("PrincipioAtivo 4");
        principiosAtivos.add(principioAtivo1);
        principiosAtivos.add(principioAtivo2);
        principiosAtivos.add(principioAtivo3);
        principiosAtivos.add(principioAtivo4);
        
        produtos = new ArrayList<Produto>();
        produto1 = new Produto("Shampoo", "Descrição do produto 1", 13.0, categoria2, fabricante1);  
        produto2 = new Produto("Repelente", "Descrição do produto 2", 20.50, categoria3, fabricante2); 
        produto3 = new Produto("Serum Vitamina C", "Descrição do produto 3", 120.99, categoria4, fabricante3); 
        produto4 = new Produto("Fralda", "Descrição do produto 4", 20.58, categoria6, fabricante1); 
        produto5 = new Produto("Adoçante", "Descrição do produto 5", 8.50, categoria5, fabricante2); 
//        med1 = new Medicamento("BraiDorflex", "Remédio para dor", 21.99, categoria1, fabricante1, "Analgésico", tarja1, listaPrincipioAtivo1);;
//        med2 = new Medicamento("Ivermectina", "Remédio para piolho", 15.00, categoria1, fabricante2, "Tipo 2", tarja2, listaPrincipioAtivo1);
//        med3 = new Medicamento("Rivotril", "Remédio antidepressivo", 30.00, categoria1, fabricante3, "Antidepressivo", tarja4, listaPrincipioAtivo2);
//        med4 = new Medicamento("Azitromicina", "Remédio 4", 30.00, categoria1, fabricante3, "Tipo 3", tarja3, listaPrincipioAtivo2);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
//        produtos.add(med1);
//        produtos.add(med2);
//        produtos.add(med3);
//        produtos.add(med4);

        fornecedores = new ArrayList<Fornecedor>();
        fornecedor1 = new Fornecedor("Fornecedor 1", "4992-8922", "@@@@");  
        fornecedor1.adicionarFabricante(fabricante1);
        fornecedor1.adicionarFabricante(fabricante2);
        fornecedor2 = new Fornecedor("Fornecedor 2", "6666-6666", "@@@@");
        fornecedor2.adicionarFabricante(fabricante3);
        fornecedores.add(fornecedor1);
        fornecedores.add(fornecedor2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoVoltar = new javax.swing.JButton();
        labelFornecedor = new javax.swing.JLabel();
        campoFornecedor = new javax.swing.JComboBox<>();
        labelProdutos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        labelProdutoSelecionado = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        labelQuantidade = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JSpinner();
        labelProdutosSelecionados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutosSelecionados = new javax.swing.JTable();
        botaoRemoverItensSelecionados = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fazer Pedido");

        botaoVoltar.setBackground(new java.awt.Color(18, 17, 73));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("VOLTAR");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelFornecedor.setText("FORNECEDOR");

        campoFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha o fornecedor..." }));
        campoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFornecedorActionPerformed(evt);
            }
        });

        labelProdutos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelProdutos.setText("PRODUTOS");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        labelProdutoSelecionado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelProdutoSelecionado.setText("PRODUTO SELECIONADO");

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        labelQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelQuantidade.setText("QUANTIDADE");

        labelProdutosSelecionados.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelProdutosSelecionados.setText("CARRINHO");

        tabelaProdutosSelecionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "QUANTIDADE", "REMOVER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaProdutosSelecionados.setFocusable(false);
        tabelaProdutosSelecionados.getTableHeader().setResizingAllowed(false);
        tabelaProdutosSelecionados.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaProdutosSelecionados);

        botaoRemoverItensSelecionados.setBackground(new java.awt.Color(255, 49, 79));
        botaoRemoverItensSelecionados.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        botaoRemoverItensSelecionados.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverItensSelecionados.setText("REMOVER ITENS SELECIONADOS");
        botaoRemoverItensSelecionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverItensSelecionadosActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 49, 79));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("FAZER PEDIDO");

        jButton2.setBackground(new java.awt.Color(255, 49, 79));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ADICIONAR AO CARRINHO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1034, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFornecedor)
                            .addComponent(campoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelQuantidade)
                                .addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelProdutoSelecionado)
                                .addComponent(jTextField1)
                                .addComponent(campoQuantidade)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelProdutosSelecionados)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoRemoverItensSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(botaoVoltar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(botaoRemoverItensSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProdutosSelecionados)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(labelProdutoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        TelaInicial telaInicial= new TelaInicial();
        telaInicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void campoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFornecedorActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
        model.setRowCount(0);        

        Fornecedor fornecedor = buscaFornecedor((String)campoFornecedor.getSelectedItem());
        if(fornecedor == null)
            return;     
       
        for(int i=0; i < fornecedor.getFabricantes().size(); i++) {
            for(int j=0; j < fornecedor.getFabricantes().get(i).getProdutos().size(); j++) {
                model.addRow(new Object[]{fornecedor.getFabricantes().get(i).getProdutos().get(j).getNome()});
            }
        }
    }//GEN-LAST:event_campoFornecedorActionPerformed

    private Fornecedor buscaFornecedor(String fornecedor) {
        for(int i = 0; i < fornecedores.size(); i++)
        {
            if(fornecedores.get(i).getNome() == fornecedor) {
                return fornecedores.get(i);
            }
        }
        return null;
    }

    private void botaoRemoverItensSelecionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverItensSelecionadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRemoverItensSelecionadosActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFazerPedido().setVisible(true);
            }
        });
    }


    List<CategoriaProduto> categorias;
    CategoriaProduto categoria1;
    CategoriaProduto categoria2;
    CategoriaProduto categoria3;
    CategoriaProduto categoria4;
    CategoriaProduto categoria5;
    CategoriaProduto categoria6;
    CategoriaProduto categoria7;
    
    List<Fabricante> fabricantes;
    Fabricante fabricante1;
    Fabricante fabricante2;
    Fabricante fabricante3;
    
    List<Tarja> tarjas;
    Tarja tarja1;
    Tarja tarja2;
    Tarja tarja3;
    Tarja tarja4;
    
    List<PrincipioAtivo> principiosAtivos;
    PrincipioAtivo principioAtivo1;
    PrincipioAtivo principioAtivo2;
    PrincipioAtivo principioAtivo3;
    PrincipioAtivo principioAtivo4;
    
    List<Produto> produtos;
    Produto produto1;
    Produto produto2;
    Produto produto3;
    Produto produto4;
    Produto produto5;
    
    Medicamento med1;
    Medicamento med2;
    Medicamento med3;
    Medicamento med4;

    List<Fornecedor> fornecedores;
    Fornecedor fornecedor1;
    Fornecedor fornecedor2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRemoverItensSelecionados;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox<String> campoFornecedor;
    private javax.swing.JSpinner campoQuantidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelFornecedor;
    private javax.swing.JLabel labelProdutoSelecionado;
    private javax.swing.JLabel labelProdutos;
    private javax.swing.JLabel labelProdutosSelecionados;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTable tabelaProdutosSelecionados;
    // End of variables declaration//GEN-END:variables
}
