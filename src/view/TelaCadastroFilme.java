package Locadora.view;

import Locadora.controller.FilmeController;
import Locadora.database.ExceptionDAO;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;


public class TelaCadastroFilme extends javax.swing.JFrame {

    private TelaPrincipal telaprincipal;
    
    private Integer codFilme = 0;
    
    public TelaCadastroFilme(TelaPrincipal telaPrincipal){
        this.telaprincipal = telaPrincipal;
        initComponents();      
    }
    
    public TelaCadastroFilme() {
        initComponents();
    }

    
    public void buscarFilme (Integer codFilme, String titulo, String genero, String sinopse, Integer duração){
        this.codFilme = codFilme;
        this.jTextFieldTitulo.setText(titulo);
        for (int contador=0; contador<jComboBoxGenero.getItemCount(); contador++) {
            if (jComboBoxGenero.getItemAt(contador).equals(genero))
                jComboBoxGenero.setSelectedIndex(contador);
        }
        this.jTextAreaSinopse.setText(sinopse);
        this.jSpinnerDuracao.setValue(duração);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelCadastroFilme = new javax.swing.JPanel();
        jLabelTituloFilme = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabelGenero = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jLabelSinopse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSinopse = new javax.swing.JTextArea();
        jSpinnerDuracao = new javax.swing.JSpinner();
        jLabelDuracao = new javax.swing.JLabel();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabelMinutos = new javax.swing.JLabel();
        jButtonApagar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Clube do Filme");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/craquete.png"))); // NOI18N
        jLabelTitulo.setText("Cadastro de Filme");
        jLabelTitulo.setIconTextGap(10);
        jLabelTitulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanelCadastroFilme.setBackground(new java.awt.Color(51, 51, 51));

        jLabelTituloFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTituloFilme.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloFilme.setText("Titulo:");
        jLabelTituloFilme.setToolTipText("");

        jTextFieldTitulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldTitulo.setToolTipText("Informe o título do filme");

        jLabelGenero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGenero.setText("Gênero:");
        jLabelGenero.setToolTipText("");

        jComboBoxGenero.setBackground(new java.awt.Color(204, 204, 204));
        jComboBoxGenero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um gênero", "Ação", "Animação", "Comédia", "Documentário", "Fatansia", "Ficção científica", "Musicais", "Romance", "Suspense", "Terror", "Drama" }));
        jComboBoxGenero.setToolTipText("Escolha um gênero");

        jLabelSinopse.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelSinopse.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSinopse.setText("Sinopse:");

        jTextAreaSinopse.setColumns(20);
        jTextAreaSinopse.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextAreaSinopse.setRows(5);
        jTextAreaSinopse.setToolTipText("Informe a sinopse do filme");
        jScrollPane1.setViewportView(jTextAreaSinopse);

        jSpinnerDuracao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jSpinnerDuracao.setModel(new javax.swing.SpinnerNumberModel(20, 20, 300, 10));

        jLabelDuracao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDuracao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDuracao.setText("Duração:");

        jButtonLimpar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTelaCadastroFilme(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCadastroFilme(evt);
            }
        });

        jButtonConsultar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonConsultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaConsultaFilme(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarFilme(evt);
            }
        });

        jLabelMinutos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelMinutos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinutos.setText("minutos");

        jButtonApagar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonApagar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonApagar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApagar.setText("Apagar");
        jButtonApagar.setActionCommand("jButtonApagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarFilme(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroFilmeLayout = new javax.swing.GroupLayout(jPanelCadastroFilme);
        jPanelCadastroFilme.setLayout(jPanelCadastroFilmeLayout);
        jPanelCadastroFilmeLayout.setHorizontalGroup(
            jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroFilmeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroFilmeLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelGenero)
                            .addComponent(jLabelSinopse)
                            .addComponent(jLabelDuracao)
                            .addComponent(jLabelTituloFilme))
                        .addGap(6, 6, 6)
                        .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelCadastroFilmeLayout.createSequentialGroup()
                                .addComponent(jSpinnerDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMinutos))
                            .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                            .addComponent(jTextFieldTitulo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroFilmeLayout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonApagar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultar)))
                .addGap(30, 30, Short.MAX_VALUE))
        );
        jPanelCadastroFilmeLayout.setVerticalGroup(
            jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroFilmeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloFilme))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenero)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSinopse))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDuracao)
                    .addComponent(jSpinnerDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMinutos))
                .addGap(30, 30, 30)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonApagar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelCadastroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTitulo)
                .addGap(30, 30, 30)
                .addComponent(jPanelCadastroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void abrir_telaConsultaFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaConsultaFilme
        TelaConsultaFilme telaConsultaFilme = new TelaConsultaFilme((JFrame) this);
        telaConsultaFilme.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_abrir_telaConsultaFilme

    private void salvarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarFilme
        int duracao = Integer.parseInt(jSpinnerDuracao.getValue().toString());
        String genero = jComboBoxGenero.getSelectedItem().toString();
        boolean sucesso;
    
        try{
            FilmeController filmeController = new FilmeController();
        
            if (this.codFilme == 0) {
                sucesso = filmeController.cadastrarFilme(jTextFieldTitulo.getText(), genero, jTextAreaSinopse.getText(), duracao);
            } else {
                sucesso = filmeController.alterarFilme(this.codFilme, jTextFieldTitulo.getText(), genero, jTextAreaSinopse.getText(), duracao);
            }
            if(sucesso == true){
                JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!");
                this.limparTelaCadastroFilme(evt);
            } else{
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        } catch (ExceptionDAO | ClassNotFoundException ex) {
            Logger.getLogger(TelaCadastroFilme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_salvarFilme

    private void limparTelaCadastroFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTelaCadastroFilme
        jTextFieldTitulo.setText("");
        jComboBoxGenero.setSelectedIndex(0);
        jTextAreaSinopse.setText("");
        jSpinnerDuracao.setModel(new SpinnerNumberModel(20,20,300,10));
    }//GEN-LAST:event_limparTelaCadastroFilme

    private void cancelarCadastroFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCadastroFilme
        this.dispose();
        telaprincipal.setVisible(true);
        System.out.println("A inserção dos dados foi cancelada!");
    }//GEN-LAST:event_cancelarCadastroFilme

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        //fecharJanela
        this.dispose();
        this.telaprincipal.setVisible(true);              
    }//GEN-LAST:event_fecharJanela

    private void apagarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarFilme
        boolean sucesso;
        FilmeController filmeController = new FilmeController();
        try {
            sucesso = filmeController.apagarFilme(this.codFilme);
            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Filme apagado com sucesso!");
                this.limparTelaCadastroFilme(evt);
            } else
                JOptionPane.showMessageDialog(null, "Erro ao apagar o filme. Por favor selecione um filme!");
        } catch (ExceptionDAO | ClassNotFoundException e) {
            Logger.getLogger(TelaCadastroFilme.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_apagarFilme

    
    
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
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastroFilme().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JLabel jLabelDuracao;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelMinutos;
    private javax.swing.JLabel jLabelSinopse;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloFilme;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanelCadastroFilme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinnerDuracao;
    private javax.swing.JTextArea jTextAreaSinopse;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables

}
