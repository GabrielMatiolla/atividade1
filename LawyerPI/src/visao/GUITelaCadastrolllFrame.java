/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Camila_Camera
 */
public class GUITelaCadastrolllFrame extends javax.swing.JFrame {

    /**
     * Creates new form GUITelaCadastrolllFrame
     */
    public GUITelaCadastrolllFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrbAluguel = new javax.swing.JRadioButton();
        jrbProprio = new javax.swing.JRadioButton();
        jlDivida = new javax.swing.JLabel();
        jtfDivida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfDataEndividadmento = new javax.swing.JTextField();
        jlSituacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMotivo = new javax.swing.JTextArea();
        jlHabitacao = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jrbAluguel.setText("Aluguel");

        jrbProprio.setText("Próprio");

        jlDivida.setText("Tamanho da Dívida:");

        jtfDivida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDividaActionPerformed(evt);
            }
        });

        jLabel1.setText("Data Inicial do Endividamento:");

        jtfDataEndividadmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDataEndividadmentoActionPerformed(evt);
            }
        });

        jlSituacao.setText("Situação do Usuário (Motivo da dívida e consultoria): ");

        jtaMotivo.setColumns(20);
        jtaMotivo.setRows(5);
        jScrollPane1.setViewportView(jtaMotivo);

        jlHabitacao.setText("Situação de Habitação:");

        jbSalvar.setText("Salvar e finalizar");

        jButton1.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jrbAluguel)
                            .addGap(18, 18, 18)
                            .addComponent(jrbProprio))
                        .addComponent(jlHabitacao)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlSituacao)
                            .addComponent(jLabel1)
                            .addComponent(jtfDataEndividadmento)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlDivida)
                                .addComponent(jtfDivida, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(227, 227, 227)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSalvar)
                        .addGap(101, 101, 101)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfDataEndividadmento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlSituacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlHabitacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAluguel)
                    .addComponent(jrbProprio))
                .addGap(18, 18, 18)
                .addComponent(jlDivida)
                .addGap(18, 18, 18)
                .addComponent(jtfDivida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jButton1))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDividaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDividaActionPerformed

    private void jtfDataEndividadmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDataEndividadmentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDataEndividadmentoActionPerformed

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
            java.util.logging.Logger.getLogger(GUITelaCadastrolllFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUITelaCadastrolllFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUITelaCadastrolllFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUITelaCadastrolllFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUITelaCadastrolllFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlDivida;
    private javax.swing.JLabel jlHabitacao;
    private javax.swing.JLabel jlSituacao;
    private javax.swing.JRadioButton jrbAluguel;
    private javax.swing.JRadioButton jrbProprio;
    private javax.swing.JTextArea jtaMotivo;
    private javax.swing.JTextField jtfDataEndividadmento;
    private javax.swing.JTextField jtfDivida;
    // End of variables declaration//GEN-END:variables
}