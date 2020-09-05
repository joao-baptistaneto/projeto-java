/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.calculadora;

/**
 *
 * @author jaone
 */
public class InterfaceCalculadora extends javax.swing.JFrame {

    Double valorDaAplicacao = 19.99;
    
    public InterfaceCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblValorAtualMes = new javax.swing.JLabel();
        txtCampoAtualMes = new javax.swing.JTextField();
        lvlQuantidadeMes = new javax.swing.JLabel();
        txtQuantidadeMes = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblResultado1 = new javax.swing.JLabel();
        lblResultado2 = new javax.swing.JLabel();
        lblResultado3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValorAtualMes.setText("Qual o valor que você gasta atualmente por mês?");
        getContentPane().add(lblValorAtualMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, -1, -1));

        txtCampoAtualMes.setForeground(new java.awt.Color(102, 102, 102));
        txtCampoAtualMes.setText("Coloque em números");
        txtCampoAtualMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoAtualMesActionPerformed(evt);
            }
        });
        getContentPane().add(txtCampoAtualMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 238, -1));

        lvlQuantidadeMes.setText("Quantos meses pretente contratar?");
        getContentPane().add(lvlQuantidadeMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, -1, -1));

        txtQuantidadeMes.setForeground(new java.awt.Color(102, 102, 102));
        txtQuantidadeMes.setText("Coloque em números");
        getContentPane().add(txtQuantidadeMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 91, 238, -1));

        lblResultado.setText("*****************");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 510, 20));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 116, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Calculadora Projeto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 170, 42));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblResultado1.setText("*****************");
        getContentPane().add(lblResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 216, 510, 20));

        lblResultado2.setForeground(new java.awt.Color(255, 51, 51));
        lblResultado2.setText("*****************");
        getContentPane().add(lblResultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 510, 20));

        lblResultado3.setText("*****************");
        getContentPane().add(lblResultado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 510, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCampoAtualMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoAtualMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoAtualMesActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        calcularValorNaMinhaAplicacao();
    }//GEN-LAST:event_btnCalcularActionPerformed

   void calcularValorNaMinhaAplicacao(){
       
       Double desconto = 0.0;
       
       Integer quantidadeMes = Integer.parseInt(txtQuantidadeMes.getText());
       Double valorMes = Double.parseDouble(txtCampoAtualMes.getText());
       
       if (quantidadeMes >=6){
           desconto = 0.1;
       }else if (quantidadeMes >=12){
           desconto = 0.15;
       }
       
       Double total = valorDaAplicacao*quantidadeMes;
       
       Double valorDesconto = total * desconto;
       
       Double totalComDesconto = total - valorDesconto;
       
       Double valorGastoSemSolucao = valorMes * quantidadeMes;
       
       lblResultado.setText(String.format("O valor por mês gasto com a nossa solução é de: R$ %.2f", total));
       lblResultado1.setText(String.format("O valor de desconto é de: R$ %.2f", valorDesconto));
       lblResultado2.setText(String.format("O valor com desconto é de: R$ %.2f", totalComDesconto));
       lblResultado3.setText(String.format("O valor por mês sem a solução: R$ %.2f", valorGastoSemSolucao));
   }
    
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
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JLabel lblResultado2;
    private javax.swing.JLabel lblResultado3;
    private javax.swing.JLabel lblValorAtualMes;
    private javax.swing.JLabel lvlQuantidadeMes;
    private javax.swing.JTextField txtCampoAtualMes;
    private javax.swing.JTextField txtQuantidadeMes;
    // End of variables declaration//GEN-END:variables
}
