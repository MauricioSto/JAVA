
package JOGO;

import java.awt.Image;
import javax.swing.ImageIcon;


public class FrPlacas extends javax.swing.JFrame {


    public FrPlacas() {
        initComponents();
        // carregar o formulário no centro da tela
        setLocationRelativeTo(this);
        // desativa o redirecionamento do formulario
        setResizable (false);
        // atribui titulo ao formulário
        setTitle("Placas!");
        //Imagem Logo
        ImageIcon logo = new ImageIcon(getClass().getResource("LOGOSHOW.jpg"));
        jLogo.setIcon(new ImageIcon(logo.getImage().getScaledInstance(jLogo.getWidth(),jLogo.getHeight(),Image.SCALE_SMOOTH)));
        //Imagem Placa 1
        ImageIcon placa = new ImageIcon(getClass().getResource("PLACA.jpg"));
        lblPlaca1.setIcon(new ImageIcon(placa.getImage().getScaledInstance(lblPlaca1.getWidth(),lblPlaca1.getHeight(),Image.SCALE_SMOOTH)));
        //Imagem Placa 2
        ImageIcon placa2 = new ImageIcon(getClass().getResource("PLACA.jpg"));
        lblPlaca2.setIcon(new ImageIcon(placa2.getImage().getScaledInstance(lblPlaca2.getWidth(),lblPlaca2.getHeight(),Image.SCALE_SMOOTH)));
        //Imagem Placa 3
        ImageIcon placa3 = new ImageIcon(getClass().getResource("PLACA.jpg"));
        lblPlaca3.setIcon(new ImageIcon(placa3.getImage().getScaledInstance(lblPlaca3.getWidth(),lblPlaca3.getHeight(),Image.SCALE_SMOOTH)));
        //Imagem Placa 4
        ImageIcon placa4 = new ImageIcon(getClass().getResource("PLACA.jpg"));
        jLabel5.setIcon(new ImageIcon(placa4.getImage().getScaledInstance(jLabel5.getWidth(),jLabel5.getHeight(),Image.SCALE_SMOOTH))); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        lblPlaca1 = new javax.swing.JLabel();
        lblPlaca2 = new javax.swing.JLabel();
        lblPlaca3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(1, 1, 28));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 103));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 339, 280, 46));

        btnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(0, 0, 51));
        btnCadastro.setText("Escolha do Publico pelas Placas");
        btnCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 225, 40));

        lblPlaca1.setText("jLabel2");
        jPanel2.add(lblPlaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, 80));

        lblPlaca2.setText("jLabel3");
        jPanel2.add(lblPlaca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 80));

        lblPlaca3.setText("jLabel4");
        jPanel2.add(lblPlaca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, 81));

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 80, 81));

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
            java.util.logging.Logger.getLogger(FrPlacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPlacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPlacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPlacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrPlacas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPlaca1;
    private javax.swing.JLabel lblPlaca2;
    private javax.swing.JLabel lblPlaca3;
    // End of variables declaration//GEN-END:variables
}
