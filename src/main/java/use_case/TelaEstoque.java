/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package use_case;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class TelaEstoque extends javax.swing.JFrame {
    private ControladorFarmacia controller;
    List<ItemEstoque> itensEstoque;
   
    public TelaEstoque(ControladorFarmacia controller) {
        initComponents();
        this.setSize(1280,751);
        this.controller = controller;
        this.itensEstoque = this.controller.getItemEstoque();
        preencheTabelaEstoque();
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
        labelEstoque = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();

        botaoVoltar.setBackground(new java.awt.Color(18, 17, 73));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("VOLTAR");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelEstoque.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelEstoque.setForeground(new java.awt.Color(255, 49, 79));
        labelEstoque.setText("ESTOQUE");

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME", "PREÇO", "CATEGORIA", "FABRICANTE", "QUANTIDADE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaEstoque);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEstoque)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(botaoVoltar)
                .addGap(37, 37, 37)
                .addComponent(labelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.controller.iniciarTelaInicial();
    }//GEN-LAST:event_botaoVoltarActionPerformed
    
    private void preencheTabelaEstoque() {
        DefaultTableModel model = (DefaultTableModel) tabelaEstoque.getModel();
        
        for(int i=0; i<itensEstoque.size(); i++) {
            int codigo = (int) this.itensEstoque.get(i).getProduto().getCodigo();
            String nome = this.itensEstoque.get(i).getProduto().getNome();
            double preco = this.itensEstoque.get(i).getProduto().getPreco();
            String categoria = this.itensEstoque.get(i).getProduto().getCategoria().getNome();
            String fabricante = this.itensEstoque.get(i).getProduto().getFabricante().getNome();
            int quantidade = this.itensEstoque.get(i).getQuantidade();
            
            model.addRow(new Object[]{codigo, nome, preco, categoria, fabricante, quantidade});
        }
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        for(int i=0; i<tabelaEstoque.getColumnCount(); i++){
            tabelaEstoque.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEstoque;
    private javax.swing.JTable tabelaEstoque;
    // End of variables declaration//GEN-END:variables
}
