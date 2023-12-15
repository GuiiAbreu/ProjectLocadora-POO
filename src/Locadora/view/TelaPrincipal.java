package Locadora.view;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanelTelaPrincipal = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuLocacao = new javax.swing.JMenu();
        jMenuItemAlugar = new javax.swing.JMenuItem();
        jMenuItemConsultar = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemFilme = new javax.swing.JMenuItem();
        jMenuItem = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora Clube do Filme");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jPanelTelaPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        jPanelTelaPrincipal.setToolTipText("");
        jPanelTelaPrincipal.setEnabled(false);
        jPanelTelaPrincipal.setPreferredSize(new java.awt.Dimension(800, 400));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo.jpg"))); // NOI18N
        jLabelLogo.setPreferredSize(new java.awt.Dimension(780, 400));
        jLabelLogo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelTelaPrincipalLayout = new javax.swing.GroupLayout(jPanelTelaPrincipal);
        jPanelTelaPrincipal.setLayout(jPanelTelaPrincipalLayout);
        jPanelTelaPrincipalLayout.setHorizontalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelTelaPrincipalLayout.setVerticalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenuLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/craquete.png"))); // NOI18N
        jMenuLocacao.setText(" Clube do Filme |");
        jMenuLocacao.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jMenuLocacao.setIconTextGap(10);
        jMenuLocacao.setVerifyInputWhenFocusTarget(false);

        jMenuItemAlugar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemAlugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seta.png"))); // NOI18N
        jMenuItemAlugar.setText("Alugar");
        jMenuLocacao.add(jMenuItemAlugar);

        jMenuItemConsultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seta.png"))); // NOI18N
        jMenuItemConsultar.setText("Consultar");
        jMenuLocacao.add(jMenuItemConsultar);

        jMenuBarTelaPrincipal.add(jMenuLocacao);

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setFocusable(false);
        jMenuCadastro.setFont(new java.awt.Font("Fira Code SemiBold", 0, 18)); // NOI18N

        jMenuItemCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seta.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaCadastroCliente(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seta.png"))); // NOI18N
        jMenuItemFilme.setText("Filme");
        jMenuItemFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaCadastroFilme(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFilme);

        jMenuItem.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seta.png"))); // NOI18N
        jMenuItem.setText("Item");
        jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaCadastroItem(evt);
            }
        });
        jMenuCadastro.add(jMenuItem);

        jMenuBarTelaPrincipal.add(jMenuCadastro);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Fira Code SemiBold", 0, 18)); // NOI18N
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBarTelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanelTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrir_telaCadastroFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaCadastroFilme
        TelaCadastroFilme telaCadastroFilme = new TelaCadastroFilme(this);
        telaCadastroFilme.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_abrir_telaCadastroFilme

    private void abrir_telaCadastroCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaCadastroCliente
        TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente(this);
        telaCadastroCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_abrir_telaCadastroCliente

    private void abrir_telaCadastroItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaCadastroItem
        TelaCadastroItem telaCadastroItem = new TelaCadastroItem(this);
        this.setVisible(false);
        telaCadastroItem.setVisible(true);
    }//GEN-LAST:event_abrir_telaCadastroItem

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        if(evt.getClickCount()==1){
        int response = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer sair?", "Exit", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_jMenuSairMouseClicked


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem;
    private javax.swing.JMenuItem jMenuItemAlugar;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConsultar;
    private javax.swing.JMenuItem jMenuItemFilme;
    private javax.swing.JMenu jMenuLocacao;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelTelaPrincipal;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
