package Locadora.view;

import Locadora.controller.ClienteController;
import Locadora.database.ExceptionDAO;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaCadastroCliente extends javax.swing.JFrame {

    private TelaPrincipal telaprincipal;
    
    private Integer codCliente = 0;
    
    public TelaCadastroCliente(TelaPrincipal telaPrincipal){
        this.telaprincipal = telaPrincipal;
        initComponents();
    }
    
    public TelaCadastroCliente() {
        initComponents();
    }
    
    private void limparTela() {
        jTextFieldNome.setText("");
        jFormattedTextFieldDtNascimento.setText("");
        jFormattedTextFieldCPF.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndereco.setText("");
    }

    public void buscarCliente(Integer codCliente, String nome, String cpf, String email, String endereço, Date dtNascimento) {
        this.codCliente = codCliente;
        this.jTextFieldNome.setText(nome);
        this.jFormattedTextFieldCPF.setText(cpf);
        this.jTextFieldEmail.setText(email);
        this.jTextFieldEndereco.setText(endereço);
        SimpleDateFormat mask = new SimpleDateFormat("dd/MM/yyyy");
        this.jFormattedTextFieldDtNascimento.setText(mask.format(dtNascimento));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelCadastroCliente = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelDtNascimento = new javax.swing.JLabel();
        jFormattedTextFieldDtNascimento = new javax.swing.JFormattedTextField();
        jLabelCPF = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonApagarCliente = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Clube do Filme");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/craquete.png"))); // NOI18N
        jLabel1.setText("Cadastro de Cliente");
        jLabel1.setIconTextGap(10);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanelCadastroCliente.setBackground(new java.awt.Color(51, 51, 51));
        jPanelCadastroCliente.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabelDtNascimento.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDtNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDtNascimento.setText("Data de Nascimento:");

        try {
            jFormattedTextFieldDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDtNascimento.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jFormattedTextFieldDtNascimento.setMinimumSize(new java.awt.Dimension(6, 29));

        jLabelCPF.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPF.setText("CPF:");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabelEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail:");

        jTextFieldEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEmail.setToolTipText("Informe o e-mail do cliente");

        jLabelEndereco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("Endereço:");

        jTextFieldEndereco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEndereco.setToolTipText("Informe o endereço do cliente");

        jButtonSalvar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCliente(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTelaCadastroCliente(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCadastroCliente(evt);
            }
        });

        jButtonConsultar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonConsultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaConsultaCliente(evt);
            }
        });

        jButtonApagarCliente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonApagarCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonApagarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApagarCliente.setText("Apagar");
        jButtonApagarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarCliente(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroClienteLayout = new javax.swing.GroupLayout(jPanelCadastroCliente);
        jPanelCadastroCliente.setLayout(jPanelCadastroClienteLayout);
        jPanelCadastroClienteLayout.setHorizontalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroClienteLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCPF)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelNome))
                                .addGap(6, 6, 6)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroClienteLayout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelDtNascimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldEmail)
                                    .addComponent(jTextFieldNome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(jLabelEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonApagarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelCadastroClienteLayout.setVerticalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDtNascimento)
                    .addComponent(jFormattedTextFieldDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonApagarCliente))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCliente
        boolean sucesso;
        
        try{
            ClienteController clienteController = new ClienteController();
            
            if (this.codCliente == 0){
                sucesso = clienteController.cadastrarCliente(jTextFieldNome.getText(), jFormattedTextFieldCPF.getText(), 
                    jTextFieldEndereco.getText(), jTextFieldEmail.getText(), jFormattedTextFieldDtNascimento.getText());
            } else {
                sucesso = clienteController.alterarCliente(this.codCliente, jTextFieldNome.getText(), jFormattedTextFieldCPF.getText(), 
                    jTextFieldEndereco.getText(), jTextFieldEmail.getText(), jFormattedTextFieldDtNascimento.getText());
            }
            
            if(sucesso){
                JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!");
                this.limparTelaCadastroCliente(evt);
            }else{
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
        } catch(HeadlessException | ParseException e){
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        } catch (ExceptionDAO | ClassNotFoundException ex) {
            Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarCliente

    private void limparTelaCadastroCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTelaCadastroCliente
        this.limparTela();
    }//GEN-LAST:event_limparTelaCadastroCliente

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        //fecharTelaCadastro
        telaprincipal.setVisible(true);
    }//GEN-LAST:event_fecharJanela

    private void cancelarCadastroCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCadastroCliente
        this.dispose();
        telaprincipal.setVisible(true);
        System.out.println("A inserção dos dados foi cancelada!");
    }//GEN-LAST:event_cancelarCadastroCliente

    private void abrir_telaConsultaCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaConsultaCliente
        TelaConsultaCliente telaConsultaCliente = new TelaConsultaCliente(this);
        this.setVisible(false);
        telaConsultaCliente.setVisible(true);
    }//GEN-LAST:event_abrir_telaConsultaCliente

    private void apagarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarCliente
        boolean sucesso;
        ClienteController clienteController = new ClienteController();
        try {
            sucesso = clienteController.apagarCliente(this.codCliente);
            if (sucesso) {
                JOptionPane.showMessageDialog(null, "O cliente foi apagado com sucesso!");
                this.limparTela();
            } else
                JOptionPane.showMessageDialog(null, "O cliente não foi apagado. Por favor, selecione um cliente!");
        } catch (ExceptionDAO | ClassNotFoundException ex) {
            Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_apagarCliente

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastroCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagarCliente;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelDtNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelCadastroCliente;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

}
