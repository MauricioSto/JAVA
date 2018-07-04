
package JOGO;

import java.awt.Image;
import javax.swing.ImageIcon;


public class FrConidados extends javax.swing.JFrame {


    public FrConidados() {
        initComponents();
               // carregar o formulário no centro da tela
        setLocationRelativeTo(this);
        // desativa o redirecionamento do formulario
        setResizable (false);
        // atribui titulo ao formulário
        setTitle("Convidados!");
        //Imagem Logo
        ImageIcon logo = new ImageIcon(getClass().getResource("LOGOSHOW.jpg"));
        jLogo.setIcon(new ImageIcon(logo.getImage().getScaledInstance(jLogo.getWidth(),jLogo.getHeight(),Image.SCALE_SMOOTH)));
        // Imagem Convidado
        ImageIcon convidado = new ImageIcon(getClass().getResource("PLACACONVIDADO.jpg"));
        lblConvidado1.setIcon(new ImageIcon(convidado.getImage().getScaledInstance(lblConvidado1.getWidth(),lblConvidado1.getHeight(),Image.SCALE_SMOOTH)));
        // Imagem Placa 2
        ImageIcon convidado2 = new ImageIcon(getClass().getResource("PLACACONVIDADO.jpg"));
        lblConvidado2.setIcon(new ImageIcon(convidado2.getImage().getScaledInstance(lblConvidado2.getWidth(),lblConvidado2.getHeight(),Image.SCALE_SMOOTH)));
        // Imagem Placa 3
        ImageIcon convidado3 = new ImageIcon(getClass().getResource("PLACACONVIDADO.jpg"));
        lblConvidado3.setIcon(new ImageIcon(convidado3.getImage().getScaledInstance(lblConvidado3.getWidth(),lblConvidado3.getHeight(),Image.SCALE_SMOOTH)));
        // Imagem Placa 4
        ImageIcon convidado4 = new ImageIcon(getClass().getResource("PLACACONVIDADO.jpg"));
        lblConvidado4.setIcon(new ImageIcon(convidado4.getImage().getScaledInstance(lblConvidado4.getWidth(),lblConvidado4.getHeight(),Image.SCALE_SMOOTH)));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLogo = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        lblConvidado1 = new javax.swing.JLabel();
        lblConvidado2 = new javax.swing.JLabel();
        lblConvidado3 = new javax.swing.JLabel();
        lblConvidado4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(1, 1, 28));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 299, 103));

        btnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(0, 0, 51));
        btnCadastro.setText("Veja a Escolha dos Convidados");
        btnCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 408, 250, 40));

        lblConvidado1.setText("jLabel1");
        jPanel2.add(lblConvidado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, 106));

        lblConvidado2.setText("jLabel2");
        jPanel2.add(lblConvidado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 106));

        lblConvidado3.setText("jLabel1");
        jPanel2.add(lblConvidado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 103));

        lblConvidado4.setText("jLabel1");
        jPanel2.add(lblConvidado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 100, 103));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrConidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrConidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrConidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrConidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrConidados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblConvidado1;
    private javax.swing.JLabel lblConvidado2;
    private javax.swing.JLabel lblConvidado3;
    private javax.swing.JLabel lblConvidado4;
    // End of variables declaration//GEN-END:variables
}
