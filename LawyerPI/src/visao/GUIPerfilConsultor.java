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
public class GUIPerfilConsultor extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIPerfilConsultor
     */
    public GUIPerfilConsultor() {
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

        jlTitulo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlID = new javax.swing.JLabel();
        jlNumOab = new javax.swing.JLabel();
        jlLogo = new javax.swing.JLabel();
        jlIDconsultor = new javax.swing.JLabel();
        jlNomeConsultor = new javax.swing.JLabel();
        jlTelefoneConsultor = new javax.swing.JLabel();
        jlOAB = new javax.swing.JLabel();
        jbConsultar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbVoltarMenu = new javax.swing.JButton();
        jlConsultar = new javax.swing.JLabel();
        jlVoltar = new javax.swing.JLabel();
        jlPerfilConsultor = new javax.swing.JLabel();
        jlSair = new javax.swing.JLabel();

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlTitulo.setText("Perfil do Consultor(a)");

        jlNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlNome.setText("Nome:");

        jlTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTelefone.setText("Contato:");

        jlID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlID.setText("ID: ");

        jlNumOab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlNumOab.setText("OAB:");

        jlLogo.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo64px.png"))); // NOI18N
        jlLogo.setText("Logo aqui");

        jlIDconsultor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlIDconsultor.setText("123456789");

        jlNomeConsultor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlNomeConsultor.setText("João da Silva");

        jlTelefoneConsultor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTelefoneConsultor.setText("(99) 9999-9999");

        jlOAB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlOAB.setText("UF999999");

        jbConsultar.setText("Consultar um usuário");

        jbSair.setText("Sair");

        jbVoltarMenu.setText("Voltar ao Menu Principal");
        jbVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarMenuActionPerformed(evt);
            }
        });

        jlConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/searchUser.png"))); // NOI18N

        jlVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/voltar.png"))); // NOI18N

        jlPerfilConsultor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfilConsultor128px.png"))); // NOI18N

        jlSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jlPerfilConsultor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jlConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jbConsultar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jlSair))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jlVoltar)
                                    .addGap(180, 180, 180))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jbVoltarMenu)
                                    .addGap(107, 107, 107))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlID)
                                        .addComponent(jlNome)
                                        .addComponent(jlTelefone)
                                        .addComponent(jlNumOab))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlTelefoneConsultor)
                                        .addComponent(jlOAB)
                                        .addComponent(jlIDconsultor)
                                        .addComponent(jlNomeConsultor))
                                    .addGap(214, 214, 214)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jlLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlTitulo)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlNome)
                                    .addComponent(jlNomeConsultor))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlID)
                                    .addComponent(jlIDconsultor))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlTelefone)
                                    .addComponent(jlTelefoneConsultor))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlNumOab)
                                    .addComponent(jlOAB)))
                            .addComponent(jlPerfilConsultor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConsultar)
                    .addComponent(jbVoltarMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarMenuActionPerformed
        // TODO add your handling cjlConsultare:
    }//GEN-LAST:event_jbVoltarMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbVoltarMenu;
    private javax.swing.JLabel jlConsultar;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlIDconsultor;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomeConsultor;
    private javax.swing.JLabel jlNumOab;
    private javax.swing.JLabel jlOAB;
    private javax.swing.JLabel jlPerfilConsultor;
    private javax.swing.JLabel jlSair;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlTelefoneConsultor;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlVoltar;
    // End of variables declaration//GEN-END:variables
}
