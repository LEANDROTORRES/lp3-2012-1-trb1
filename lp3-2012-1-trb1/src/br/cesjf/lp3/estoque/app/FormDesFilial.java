package br.cesjf.lp3.estoque.app;

public class FormDesFilial extends javax.swing.JDialog {    

    public FormDesFilial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        setLocationRelativeTo(null);
    }   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFilialOrigem = new javax.swing.JComboBox();
        jFilialDestino = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jGravar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Filial Desativar:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Filial Destino Produtos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jFilialOrigem, 0, 355, Short.MAX_VALUE)
                    .addComponent(jFilialDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFilialOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFilialDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        jGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_salvar.png"))); // NOI18N
        jGravar.setText("Desativar");
        jGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGravarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sair.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 282, Short.MAX_VALUE)
                .addComponent(jGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jGravar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

private void jGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGravarActionPerformed
//    if (jFilialOrigem.getSelectedItem().equals(jFilialDestino.getSelectedItem())) {
//        JOptionPane.showMessageDialog(null, "A Filial de Destino Deve ser Diferente da Filial de Origem!",
//                "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
//
//    } else {
//        Estoque e1 = new Estoque();
//        e1.setFilial(String.valueOf(jFilialOrigem.getSelectedItem()));
//
//        ArrayList<Estoque> est = new EstoqueDAO().Buscar(e1);
//
//        for (int i = 0; i < est.size(); i++) {
//            Estoque orig = est.get(i);
//
//            Estoque dest = new Estoque();
//            dest.setFilial(String.valueOf(jFilialDestino.getSelectedItem()));
//            dest.setProduto(orig.getProduto());
//
//            Estoque e2 = new EstoqueDAO().BuscarConsulta(dest);
//
//            if (e2 != null) {
//                Estoque e3 = new Estoque();
//                e3.setFilial(String.valueOf(jFilialDestino.getSelectedItem()));
//                e3.setProduto(orig.getProduto());
//                e3.setQuantidade(orig.getQuantidade() + e2.getQuantidade());
//                new EstoqueDAO().Alterar(e3);
//
//                Estoque e4 = new Estoque();
//                e4.setFilial(String.valueOf(jFilialOrigem.getSelectedItem()));
//                e4.setProduto(orig.getProduto());
//                new EstoqueDAO().Apagar(e4);
//                
//            } else {
//                Estoque e3 = new Estoque();
//                e3.setFilial(String.valueOf(jFilialDestino.getSelectedItem()));
//                e3.setProduto(orig.getProduto());
//                e3.setQuantidade(orig.getQuantidade());
//                new EstoqueDAO().Inserir(e3);
//
//                Estoque e4 = new Estoque();
//                e4.setFilial(String.valueOf(jFilialOrigem.getSelectedItem()));
//                e4.setProduto(orig.getProduto());
//                new EstoqueDAO().Apagar(e4);               
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Dasativação Concluída!",
//                "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
//
//        LimparCampos();
//    }
}//GEN-LAST:event_jGravarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        ArrayList<Estoque> pct = new EstoqueDAO().BuscarTodos();
//
//        jFilialOrigem.removeAllItems();
//        jFilialDestino.removeAllItems();
//
//        for (int i = 0; i < pct.size(); i++) {
//            Estoque filial = pct.get(i);
//            jFilialOrigem.addItem(filial.getFilial());
//            jFilialDestino.addItem(filial.getFilial());
//        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {                
                FormDesFilial dialog = new FormDesFilial(new javax.swing.JFrame(), true);                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jFilialDestino;
    private javax.swing.JComboBox jFilialOrigem;
    private javax.swing.JButton jGravar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
