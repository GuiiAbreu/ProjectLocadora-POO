package Locadora.view;

import Locadora.controller.ItemController;
import Locadora.database.ExceptionDAO;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaCadastroItem extends javax.swing.JFrame {
    
    private TelaPrincipal telaprincipal;
    private Integer codFilme = 0;
    private Integer codItem = 0;
    
    public TelaCadastroItem(TelaPrincipal telaPrincipal){
        this.telaprincipal = telaPrincipal;
        initComponents();
    }
        
    public TelaCadastroItem() {
        initComponents();
    }
    
    public void buscarFilme(Integer codFilme, String titulo) {
        this.codFilme = codFilme;
        this.jTextFieldTitulo.setText(titulo);
    }
    
    public void buscarItem(Integer codItem, Integer codFilme, String titulo, String tipo, String preço) {
        this.codItem = codItem;
        this.codFilme = codFilme;
        this.jTextFieldTitulo.setText(titulo);
        for(int contador=0; contador<jComboBoxTipo.getItemCount(); contador++){
            if(jComboBoxTipo.getItemAt(contador).equals(tipo))
                jComboBoxTipo.setSelectedIndex(contador);
        }
        this.jTextFieldPreco.setText(preço);       
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastroItem = new javax.swing.JLabel();
        jPanelCadastroItem = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jTextFieldTitulo = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonConsultarFilme = new javax.swing.JButton();
        jTextFieldPreco = new javax.swing.JTextField();
        jButtonApagarItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Clube do Filme");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        jLabelCadastroItem.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelCadastroItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/craquete.png"))); // NOI18N
        jLabelCadastroItem.setText("Cadastro de Item");
        jLabelCadastroItem.setAlignmentY(0.0F);
        jLabelCadastroItem.setIconTextGap(10);
        jLabelCadastroItem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanelCadastroItem.setBackground(new java.awt.Color(51, 51, 51));
        jPanelCadastroItem.setPreferredSize(new java.awt.Dimension(740, 500));

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Título:");

        jLabelTipo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo:");

        jLabelPreco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreco.setText("Preço:");

        jButtonSalvar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarItem(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTelaCadastroItem(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCadastroItem(evt);
            }
        });

        jButtonConsultar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonConsultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaConsultaItem(evt);
            }
        });

        jTextFieldTitulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldTitulo.setToolTipText("Consulte o título do filme");
        jTextFieldTitulo.setEnabled(false);

        jComboBoxTipo.setBackground(new java.awt.Color(204, 204, 204));
        jComboBoxTipo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tipo", "Blu-Ray Disc", "CD", "DVD" }));
        jComboBoxTipo.setToolTipText("Escolha um tipo");

        jButtonConsultarFilme.setBackground(new java.awt.Color(204, 204, 204));
        jButtonConsultarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        jButtonConsultarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarFilme(evt);
            }
        });

        jTextFieldPreco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldPreco.setToolTipText("Informe o preço do item");

        jButtonApagarItem.setBackground(new java.awt.Color(102, 102, 102));
        jButtonApagarItem.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonApagarItem.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApagarItem.setText("Apagar");
        jButtonApagarItem.setName("jTextApagar"); // NOI18N
        jButtonApagarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroItemLayout = new javax.swing.GroupLayout(jPanelCadastroItem);
        jPanelCadastroItem.setLayout(jPanelCadastroItemLayout);
        jPanelCadastroItemLayout.setHorizontalGroup(
            jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroItemLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo)
                            .addComponent(jLabelPreco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTipo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                                .addComponent(jTextFieldTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonConsultarFilme))
                            .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonApagarItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultar)))
                .addGap(30, 30, 30))
        );
        jPanelCadastroItemLayout.setVerticalGroup(
            jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTitulo)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonConsultarFilme))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipo))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPreco)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonApagarItem))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(jLabelCadastroItem)
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelCadastroItem)
                .addGap(30, 30, 30)
                .addComponent(jPanelCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarFilme
        TelaConsultaFilme telaConsultaFilme = new TelaConsultaFilme((JFrame) this);
        telaConsultaFilme.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConsultarFilme

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        telaprincipal.setVisible(true);
    }//GEN-LAST:event_fecharJanela

    private void cancelarCadastroItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCadastroItem
        this.dispose();
        telaprincipal.setVisible(true);
        System.out.println("A inserção dos dados foi cancelada!");
    }//GEN-LAST:event_cancelarCadastroItem

    private void limparTelaCadastroItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTelaCadastroItem
        jTextFieldTitulo.setText("");
        jComboBoxTipo.setSelectedIndex(0);
        jTextFieldPreco.setText("");
        this.codFilme = 0;
        this.codItem = 0;
    }//GEN-LAST:event_limparTelaCadastroItem

    private void salvarItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarItem
        String tipo = jComboBoxTipo.getSelectedItem().toString();
        double preço;
        if (!jTextFieldPreco.getText().isEmpty())
            preço = Double.parseDouble(jTextFieldPreco.getText());
        else
            preço = 0;
        
        boolean sucesso;
        try {
            ItemController itemController = new ItemController();            
            if (this.codItem == 0){
                sucesso = itemController.cadastrarItem(this.codFilme, tipo, preço);
            } else {
                sucesso = itemController.alterarItem(this.codItem, this.codFilme, tipo, preço);
                this.codItem = 0;
            }
            if (sucesso) {
                JOptionPane.showMessageDialog(null, "O item foi cadastrado com sucesso!");
                this.limparTelaCadastroItem(evt);
            } else
                JOptionPane.showMessageDialog(null, "O item não foi cadastrado com sucesso.");
                
        } catch (ExceptionDAO | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaCadastroItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarItem

    private void abrir_telaConsultaItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaConsultaItem
        TelaConsultaItem telaConsultaItem = new TelaConsultaItem((JFrame) this);
        telaConsultaItem.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_abrir_telaConsultaItem

    private void jButtonApagarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarItemActionPerformed
        boolean sucesso;
        ItemController itemController = new ItemController();
        try {
            sucesso = itemController.apagarItem(this.codItem);
                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Item apagado com sucesso!");
                    this.limparTelaCadastroItem(evt);
                } else
                    JOptionPane.showMessageDialog(null, "Erro ao apagar o item. Por favor selecione um item!");
        } catch (ExceptionDAO | ClassNotFoundException ex) {
            Logger.getLogger(TelaCadastroItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonApagarItemActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastroItem().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagarItem;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonConsultarFilme;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelCadastroItem;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCadastroItem;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables

}
