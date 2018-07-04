
package JOGO;

import static JOGO.BDJogo.Connect;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.Console;
import java.sql.ResultSet;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class FrJogo extends javax.swing.JFrame {

    
    public FrJogo() {
        initComponents();
        // carregar o formulário no centro da tela
        setLocationRelativeTo(this);
        // desativa o redirecionamento do formulario
        setResizable (false);
        // atribui titulo ao formulário
        setTitle("jogo!");
        
        Connect();
        sortearPerguntas();
        
        // timer
        t = new Timer();
        t.schedule(new relogio(),0,1*1000);
        
        //LBL referencia das resposta
        ImageIcon image1 = new ImageIcon(getClass().getResource("PLACA1.jpg"));
        lbl1.setIcon(new ImageIcon(image1.getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(),Image.SCALE_SMOOTH)));
    
        ImageIcon image2 = new ImageIcon(getClass().getResource("PLACA2.jpg"));
        lbl2.setIcon(new ImageIcon(image2.getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));
    
        ImageIcon image3 = new ImageIcon(getClass().getResource("PLACA3.jpg"));
        lbl3.setIcon(new ImageIcon(image3.getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));
    
        ImageIcon image4 = new ImageIcon(getClass().getResource("PLACA4.jpg"));
        lbl4.setIcon(new ImageIcon(image4.getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));
        Esconde();
    }
    
    //pontuação 
    int pontos = 0;
    String resposta="";    
    private void checaResposta(MouseEvent evt)
    {
    JTextArea caixaclicada = (JTextArea) evt.getSource();
    resposta = caixaclicada.getAccessibleContext().getAccessibleName();
    
    lblConfirmacao.setText("Está certo sua Resposta?");
    
    }
    
    // usuario logado
     public static  int ID_Jogador;
    
    
    private void sortearPerguntas(){    
        //Connect();
        Random r = new Random();
        int n = r.nextInt(300)+1;
        System.out.println(n);
        
        try{
            // variavel que ira guardar o comando sql digitado na caixa de texto
            String q = "select desr_pergunta from pergunta where Id_pergunta = " + n;
            // a execução do comando será feita pelo metodo rsexecutar na classe AcessoBD
            // O RETORNO do metodo será um ResultSet que será armazenado em rsresultado
            ResultSet rsresultado = BDJogo.rsexecutar(q);
            rsresultado.next();
            lblPergunta.setText(rsresultado.getString(1));
       
            String k = "select desc_resposta,status from resposta where Id_pergunta =" +n;
            ResultSet rsresultado1 = BDJogo.rsexecutar(k);

            rsresultado1.next();
            txtResposta1.setText(rsresultado1.getString(1));
            txtResposta1.getAccessibleContext().setAccessibleName(rsresultado1.getString(2));            
            rsresultado1.next();
            txtResposta2.setText(rsresultado1.getString(1));    
            txtResposta2.getAccessibleContext().setAccessibleName(rsresultado1.getString(2));
            rsresultado1.next();
            txtResposta3.setText(rsresultado1.getString(1));
            txtResposta3.getAccessibleContext().setAccessibleName(rsresultado1.getString(2));
            rsresultado1.next();
            txtResposta4.setText(rsresultado1.getString(1));       
            txtResposta4.getAccessibleContext().setAccessibleName(rsresultado1.getString(2));  
          
        }catch(Exception e){e.printStackTrace();}
       
    }
    
    // cronometro do jogo
    Timer t;
    int cronometro = 31;
    
    class relogio extends TimerTask
    {        
        public void run() 
        {
        cronometro -=1;
        lblCronometro.setText(cronometro+"");
          if (cronometro == 0){
              t.cancel();
              JOptionPane.showMessageDialog(null,"Perdeu a Partida");
              fecharjanela();
              BDJogo.executar("insert into Ranking (ID_Jogador,pontuacao) values('"+ID_Jogador+"','"+pontos+"')"); 
              new FrRank().setVisible(true);
            }  
        }  
    }
    
    private void fecharjanela()
    {
    this.setVisible(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblCronometro = new javax.swing.JLabel();
        lblPontuacao = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCartas = new javax.swing.JButton();
        btnConvidados = new javax.swing.JButton();
        btnPlacas = new javax.swing.JButton();
        btnPular = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblPergunta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResposta1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResposta2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtResposta3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtResposta4 = new javax.swing.JTextArea();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lblConfirmacao = new javax.swing.JLabel();
        btnSim = new javax.swing.JButton();
        btnNao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(1, 1, 28));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCronometro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCronometro.setForeground(new java.awt.Color(255, 255, 255));
        lblCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronometro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 86, 31));

        lblPontuacao.setBackground(new java.awt.Color(255, 255, 255));
        lblPontuacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPontuacao.setForeground(new java.awt.Color(255, 255, 255));
        lblPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPontuacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 150, 27));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pontuação :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 90, 30));

        btnCartas.setBackground(new java.awt.Color(255, 255, 255));
        btnCartas.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        btnCartas.setForeground(new java.awt.Color(1, 1, 28));
        btnCartas.setText("Cartas");
        btnCartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartasActionPerformed(evt);
            }
        });
        jPanel2.add(btnCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 456, 61, -1));

        btnConvidados.setBackground(new java.awt.Color(255, 255, 255));
        btnConvidados.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        btnConvidados.setForeground(new java.awt.Color(1, 1, 28));
        btnConvidados.setText("Convidados");
        btnConvidados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvidadosActionPerformed(evt);
            }
        });
        jPanel2.add(btnConvidados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 456, -1, -1));

        btnPlacas.setBackground(new java.awt.Color(255, 255, 255));
        btnPlacas.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        btnPlacas.setForeground(new java.awt.Color(1, 1, 28));
        btnPlacas.setText("Placas");
        btnPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacasActionPerformed(evt);
            }
        });
        jPanel2.add(btnPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 456, 61, -1));

        btnPular.setBackground(new java.awt.Color(255, 255, 255));
        btnPular.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        btnPular.setForeground(new java.awt.Color(1, 1, 28));
        btnPular.setText("Pular");
        btnPular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPularActionPerformed(evt);
            }
        });
        jPanel2.add(btnPular, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 456, 61, -1));

        btnParar.setBackground(new java.awt.Color(255, 255, 255));
        btnParar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnParar.setForeground(new java.awt.Color(1, 1, 28));
        btnParar.setText("PARAR");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });
        jPanel2.add(btnParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 79, 31));

        lblPergunta.setEditable(false);
        lblPergunta.setColumns(10);
        lblPergunta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPergunta.setLineWrap(true);
        lblPergunta.setRows(5);
        lblPergunta.setToolTipText("");
        lblPergunta.setWrapStyleWord(true);
        jScrollPane1.setViewportView(lblPergunta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        txtResposta1.setEditable(false);
        txtResposta1.setColumns(5);
        txtResposta1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtResposta1.setLineWrap(true);
        txtResposta1.setRows(1);
        txtResposta1.setWrapStyleWord(true);
        txtResposta1.setBorder(null);
        txtResposta1.setSelectionColor(new java.awt.Color(255, 0, 0));
        txtResposta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResposta1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtResposta1);
        txtResposta1.getAccessibleContext().setAccessibleName("op");

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 220, 40));

        txtResposta2.setEditable(false);
        txtResposta2.setColumns(5);
        txtResposta2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtResposta2.setLineWrap(true);
        txtResposta2.setRows(2);
        txtResposta2.setWrapStyleWord(true);
        txtResposta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResposta2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(txtResposta2);
        txtResposta2.getAccessibleContext().setAccessibleName("op");

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 220, 40));

        txtResposta3.setEditable(false);
        txtResposta3.setColumns(5);
        txtResposta3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtResposta3.setLineWrap(true);
        txtResposta3.setRows(2);
        txtResposta3.setWrapStyleWord(true);
        txtResposta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResposta3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(txtResposta3);
        txtResposta3.getAccessibleContext().setAccessibleName("op");

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 220, 40));

        txtResposta4.setEditable(false);
        txtResposta4.setColumns(5);
        txtResposta4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtResposta4.setLineWrap(true);
        txtResposta4.setRows(2);
        txtResposta4.setWrapStyleWord(true);
        txtResposta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResposta4MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(txtResposta4);
        txtResposta4.getAccessibleContext().setAccessibleName("op");

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 220, 40));

        lbl1.setText("jLabel1");
        jPanel2.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 40, 40));

        lbl2.setText("jLabel1");
        jPanel2.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 40, 40));

        lbl3.setText("jLabel1");
        jPanel2.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 40, 40));

        lbl4.setText("jLabel1");
        jPanel2.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 40, 40));

        lblConfirmacao.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmacao.setText(".");
        jPanel2.add(lblConfirmacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 200, 50));

        btnSim.setText("Sim");
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });
        jPanel2.add(btnSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 360, 60, -1));

        btnNao.setText("Não");
        btnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartasActionPerformed
        // fecha a janela atual
        this.dispose();
        // trocando a tela para modo jogo
        new FrCartas().setVisible(true);
        btnCartas.setEnabled(false);
        
    }//GEN-LAST:event_btnCartasActionPerformed

    private void btnConvidadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvidadosActionPerformed
        // fecha a janela atual
        this.dispose();
        // trocando a tela para modo jogo
        new FrConidados().setVisible(true);
        btnConvidados.setEnabled(false);
       
    }//GEN-LAST:event_btnConvidadosActionPerformed

    private void btnPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacasActionPerformed
        // fecha a janela atual
        this.dispose();
        // trocando a tela para modo jogo
        new FrPlacas().setVisible(true);
        btnPlacas.setEnabled(false);
        
    }//GEN-LAST:event_btnPlacasActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
      
       BDJogo.executar("insert into Ranking (ID_Jogador,pontuacao) values('"+ID_Jogador+"','"+pontos+"')"); 
       fecharjanela();
       new FrRank().setVisible(true); 
      
    }//GEN-LAST:event_btnPararActionPerformed

    void TiraBorda(){
        txtResposta1.setBorder(new LineBorder(Color.RED, 0, true));
        txtResposta2.setBorder(new LineBorder(Color.RED, 0, true));
        txtResposta3.setBorder(new LineBorder(Color.RED, 0, true));
        txtResposta4.setBorder(new LineBorder(Color.RED, 0, true));
    }
    
    private void txtResposta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtResposta1MouseClicked
        TiraBorda();
        txtResposta1.setBorder(new LineBorder(Color.RED, 2, true));
        checaResposta(evt);
        Mostra();
    }//GEN-LAST:event_txtResposta1MouseClicked

    private void txtResposta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtResposta2MouseClicked
        TiraBorda();
        txtResposta2.setBorder(new LineBorder(Color.RED, 2, true));
        checaResposta(evt);
        Mostra();
    }//GEN-LAST:event_txtResposta2MouseClicked

    private void txtResposta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtResposta3MouseClicked
        TiraBorda();
        txtResposta3.setBorder(new LineBorder(Color.RED, 2, true));
        checaResposta(evt);
        Mostra();
    }//GEN-LAST:event_txtResposta3MouseClicked

    private void txtResposta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtResposta4MouseClicked
        TiraBorda();
        txtResposta4.setBorder(new LineBorder(Color.RED, 2, true));
        checaResposta(evt);
        Mostra();
    }//GEN-LAST:event_txtResposta4MouseClicked

    private void btnPularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPularActionPerformed

        Random r = new Random();
        int n = r.nextInt(300)+1;
        System.out.println(n);
        
        t.cancel();
        cronometro = 31;
        
        t = new Timer();
        t.schedule(new relogio(),0,1*1000);
        btnPular.setEnabled(false);
        
        try{
            // variavel que ira guardar o comando sql digitado na caixa de texto
            String q = "select desr_pergunta from pergunta where Id_pergunta = " + n;
            // a execução do comando será feita pelo metodo rsexecutar na classe AcessoBD
            // O RETORNO do metodo será um ResultSet que será armazenado em rsresultado
            ResultSet rsresultado = BDJogo.rsexecutar(q);
            rsresultado.next();
            lblPergunta.setText(rsresultado.getString(1));
       
            String k = "select desc_resposta from resposta where Id_pergunta =" +n;
            ResultSet rsresultado1 = BDJogo.rsexecutar(k);

            rsresultado1.next();
            txtResposta1.setText(rsresultado1.getString(1));
            rsresultado1.next();
            txtResposta2.setText(rsresultado1.getString(1));    
            rsresultado1.next();
            txtResposta3.setText(rsresultado1.getString(1));
            rsresultado1.next();
            txtResposta4.setText(rsresultado1.getString(1));       
        }catch(Exception e){e.printStackTrace();}
        TiraBorda();
         
    }//GEN-LAST:event_btnPularActionPerformed

    void Esconde()
    {
        lblConfirmacao.setVisible(false);
        btnSim.setVisible(false);
        btnNao.setVisible(false);
    }
    
    void Mostra()
    {
        lblConfirmacao.setVisible(true);
        btnSim.setVisible(true);
        btnNao.setVisible(true);
    }
    
    
    private void btnSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimMouseClicked
 /*    if(resposta.equals("T")){         
            lblConfirmacao.setText("Você acertou!");
            pontos += 100;
            lblPontuacao.setText(pontos+"");
            
            sortearPerguntas();
        
            t.cancel();
            cronometro = 31;
        
            t = new Timer();
            t.schedule(new relogio(),0,1*1000);
        
        }else{
            t.cancel();            
            JOptionPane.showMessageDialog(null,"Você perdeu!!!"); 
            //lblConfirmacao.setText("Você perdeu!");
            fecharjanela();
            new FrRank().setVisible(true);
            pontos -=50;
            BDJogo.executar("insert into Ranking (ID_Jogador,pontuacao) values('"+ID_Jogador+"','"+pontos+"')");
            
    } 
     TiraBorda();    
  */
    }//GEN-LAST:event_btnSimMouseClicked
    
    private void btnNaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNaoMouseClicked
     if(resposta.equals("T")){         
            lblConfirmacao.setText("Você acertou!");
            pontos += 100;
            lblPontuacao.setText(pontos+"");
            
            sortearPerguntas();
        
            t.cancel();
            cronometro = 31;
        
            t = new Timer();
            t.schedule(new relogio(),0,1*1000);
        
        }else{
            t.cancel();            
            JOptionPane.showMessageDialog(null,"Você perdeu!!!"); 
            //lblConfirmacao.setText("Você perdeu!");
            fecharjanela();
            new FrRank().setVisible(true);
            pontos -=50;
            BDJogo.executar("insert into Ranking (ID_Jogador,pontuacao) values('"+ID_Jogador+"','"+pontos+"')");
            
    } 
     TiraBorda();    
  
    }//GEN-LAST:event_btnNaoMouseClicked

    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimActionPerformed

    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        TiraBorda();
        
    }//GEN-LAST:event_btnNaoActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(FrJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartas;
    private javax.swing.JButton btnConvidados;
    private javax.swing.JButton btnNao;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnPlacas;
    private javax.swing.JButton btnPular;
    private javax.swing.JButton btnSim;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblConfirmacao;
    private javax.swing.JLabel lblCronometro;
    private javax.swing.JTextArea lblPergunta;
    private javax.swing.JLabel lblPontuacao;
    private javax.swing.JTextArea txtResposta1;
    private javax.swing.JTextArea txtResposta2;
    private javax.swing.JTextArea txtResposta3;
    private javax.swing.JTextArea txtResposta4;
    // End of variables declaration//GEN-END:variables
}
