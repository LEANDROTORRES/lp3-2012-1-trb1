package br.cesjf.lp3.estoque.app;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormTransProduto extends javax.swing.JDialog {

    public FormTransProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void LimparCampos() {
        jProduto.setText("");
        jQuantidadeD.setText("");
        jQuantidadeT.setText("");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNome = new javax.swing.JLabel();
        jProduto = new javax.swing.JTextField();
        jIdade = new javax.swing.JLabel();
        jQuantidadeD = new javax.swing.JTextField();
        jFilialOrigem = new javax.swing.JComboBox();
        jFilialDestino = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jQuantidadeT = new javax.swing.JTextField();
        jIdade1 = new javax.swing.JLabel();
        jTransferir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Filial Origem:");

        jNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jNome.setText("Produto:");

        jProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jProdutoFocusLost(evt);
            }
        });

        jIdade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jIdade.setText("Quantidade Disponível:");

        jQuantidadeD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFilialOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFilialOrigemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Filial Destino:");

        jQuantidadeT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jIdade1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jIdade1.setText("Quantidade Transferida:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNome)
                    .addComponent(jIdade)
                    .addComponent(jQuantidadeD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jFilialOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jFilialDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jIdade1)
                            .addComponent(jQuantidadeT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFilialOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jQuantidadeD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFilialDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jIdade1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jQuantidadeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        jTransferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_salvar.png"))); // NOI18N
        jTransferir.setText("Transferir");
        jTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTransferirActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTransferir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTransferir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

private void jTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTransferirActionPerformed
//    if (jFilialOrigem.getSelectedItem().equals(jFilialDestino.getSelectedItem())) {
//        JOptionPane.showMessageDialog(null, "A Filial de Destino Deve ser Diferente da Filial de Origem!",
//                "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
//
//    } else if (Integer.parseInt(jQuantidadeT.getText()) > Integer.parseInt(jQuantidadeD.getText())) {
//        JOptionPane.showMessageDialog(null, "A Quantidade a Ser Transferida não Pode Ser Maior que a Quantidade Disponível!",
//                "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
//
//    } else if (jProduto.getText().equals("") || jQuantidadeD.getText().equals("") || jQuantidadeT.getText().equals("")) {
//        JOptionPane.showMessageDialog(null, "Preenchimento obrigatório de todos os campos!",
//                "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
//    } else {
//        Estoque e1 = new Estoque();
//        e1.setFilial(String.valueOf(jFilialDestino.getSelectedItem()));
//        e1.setProduto(jProduto.getText());
//
//        Estoque e2 = new EstoqueDAO().BuscarConsulta(e1);
//
//        if (e2 != null) {
//            Estoque e3 = new Estoque();
//            e3.setFilial(String.valueOf(jFilialDestino.getSelectedItem()));
//            e3.setProduto(jProduto.getText());
//            e3.setQuantidade(e2.getQuantidade() + Integer.parseInt(jQuantidadeT.getText()));
//            new EstoqueDAO().Alterar(e3);
//
//            Estoque e4 = new Estoque();
//            e4.setFilial(String.valueOf(jFilialOrigem.getSelectedItem()));
//            e4.setProduto(jProduto.getText());
//            e4.setQuantidade(Integer.parseInt(jQuantidadeD.getText()) - Integer.parseInt(jQuantidadeT.getText()));
//            new EstoqueDAO().Alterar(e4);
//
//            JOptionPane.showMessageDialog(null, "Transferência Concluída!",
//                    "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
//
//            LimparCampos();
//        } else {       
//            Estoque e3 = new Estoque();
//            e3.setFilial(String.valueOf(jFilialDestino.getSelectedItem()));
//            e3.setProduto(jProduto.getText());
//            e3.setQuantidade(Integer.parseInt(jQuantidadeT.getText()));
//            new EstoqueDAO().Inserir(e3);
//
//            Estoque e4 = new Estoque();
//            e4.setFilial(String.valueOf(jFilialOrigem.getSelectedItem()));
//            e4.setProduto(jProduto.getText());
//            e4.setQuantidade(Integer.parseInt(jQuantidadeD.getText()) - Integer.parseInt(jQuantidadeT.getText()));
//            new EstoqueDAO().Alterar(e4);
//
//            JOptionPane.showMessageDialog(null, "Transferência Concluída!",
//                    "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
//
//            LimparCampos();      
//            
//        }
//
//    }
}//GEN-LAST:event_jTransferirActionPerformed

    private void jProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProdutoFocusLost
//        Estoque e1 = new Estoque();
//        e1.setFilial(String.valueOf(jFilialOrigem.getSelectedItem()));
//        e1.setProduto(jProduto.getText());
//
//        Estoque e2 = new EstoqueDAO().BuscarConsulta(e1);
//
//        jQuantidadeD.setText(String.valueOf(e2.getQuantidade()));
    }//GEN-LAST:event_jProdutoFocusLost

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

    private void jFilialOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFilialOrigemActionPerformed
    }//GEN-LAST:event_jFilialOrigemActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FormTransProduto dialog = new FormTransProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jIdade;
    private javax.swing.JLabel jIdade1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jProduto;
    private javax.swing.JTextField jQuantidadeD;
    private javax.swing.JTextField jQuantidadeT;
    private javax.swing.JButton jTransferir;
    // End of variables declaration//GEN-END:variables
}
