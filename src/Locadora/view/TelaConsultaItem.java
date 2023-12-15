package Locadora.view;

import Locadora.controller.ItemController;
import Locadora.database.ExceptionDAO;
import Locadora.model.Item;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class TelaConsultaItem extends javax.swing.JFrame {

    private JFrame telaCadastro;
    
    public TelaConsultaItem() {
        initComponents();
    }

    public TelaConsultaItem (JFrame telaCadastroItem) {
        this.telaCadastro = telaCadastroItem;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConsultaItem = new javax.swing.JPanel();
        jLabelTituloFilme = new javax.swing.JLabel();
        jTextFieldFilme = new javax.swing.JTextField();
        jButtonConsultaFilme = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaItem = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Clube do Filme");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanelConsultaItem.setBackground(new java.awt.Color(51, 51, 51));

        jLabelTituloFilme.setBackground(new java.awt.Color(204, 204, 204));
        jLabelTituloFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTituloFilme.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloFilme.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTituloFilme.setText("Informe o titulo do filme: ");

        jTextFieldFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldFilme.setToolTipText("Informe o titulo do filme que deseja");

        jButtonConsultaFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        jButtonConsultaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaFilme(evt);
            }
        });

        jTableConsultaItem.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableConsultaItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Item", "Código Filme", "Título", "Tipo", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultaItem);

        javax.swing.GroupLayout jPanelConsultaItemLayout = new javax.swing.GroupLayout(jPanelConsultaItem);
        jPanelConsultaItem.setLayout(jPanelConsultaItemLayout);
        jPanelConsultaItemLayout.setHorizontalGroup(
            jPanelConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaItemLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(jPanelConsultaItemLayout.createSequentialGroup()
                        .addComponent(jLabelTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultaFilme)))
                .addGap(30, 30, 30))
        );
        jPanelConsultaItemLayout.setVerticalGroup(
            jPanelConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaItemLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConsultaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/craquete.png"))); // NOI18N
        jLabelTitulo.setText("Consulta de Item");
        jLabelTitulo.setIconTextGap(10);
        jLabelTitulo.setVerifyInputWhenFocusTarget(false);
        jLabelTitulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelConsultaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTitulo)
                .addGap(30, 30, 30)
                .addComponent(jPanelConsultaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        this.telaCadastro.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButtonConsultaFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaFilme
        String titulo = jTextFieldFilme.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTableConsultaItem.getModel();
        tableModel.setRowCount(0);
        ItemController itemController = new ItemController();
        
        try {
            ArrayList<Item> itens = itemController.listarItens(titulo);
            itens.forEach((Item item) -> {
                tableModel.addRow(new Object[] {
                    item.getCodItem(),
                    item.getFilme().getCodFilme(),
                    item.getFilme().getTitulo(),
                    item.getTipo(),
                    item.getPreço()
                });
            });
            jTableConsultaItem.setModel(tableModel);
            
        } catch (ExceptionDAO | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TelaConsultaItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConsultaFilme

    private void jTableConsultaItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaItemMouseClicked
        if(evt.getClickCount()==2) {
            Integer codItem = (Integer) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 0);
            Integer codFilme = (Integer) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 1);
            String titulo = (String) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 2);
            String tipo = (String) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 3);
            String preço = String.valueOf(jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 4));
            TelaCadastroItem telaCadastroItem = (TelaCadastroItem) this.telaCadastro;
            telaCadastroItem.buscarItem(codItem, codFilme, titulo, tipo, preço);
            telaCadastroItem.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jTableConsultaItemMouseClicked

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
            java.util.logging.Logger.getLogger(TelaConsultaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaConsultaItem().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultaFilme;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloFilme;
    private javax.swing.JPanel jPanelConsultaItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaItem;
    private javax.swing.JTextField jTextFieldFilme;
    // End of variables declaration//GEN-END:variables
}
