package br.cesjf.lp3.estoque.app;

import br.cesjf.lp3.estoque.classe.Estoque;
import br.cesjf.lp3.estoque.db.EstoqueDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormTransProduto extends javax.swing.JDialog {

    Estoque estoque;
    EstoqueDAO estoqueDao;

    public FormTransProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        try {
            estoque = new Estoque();
            estoqueDao = new EstoqueDAO();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco!", "Erro de Conexão", JOptionPane.ERROR_MESSAGE);
        }
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

        jQuantidadeD.setEditable(false);
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jFilialOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIdade)
                    .addComponent(jQuantidadeD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jFilialDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jIdade1)
                            .addComponent(jQuantidadeT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFilialOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTransferir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTransferir)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

private void jTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTransferirActionPerformed
    if (jFilialOrigem.getSelectedItem().equals(jFilialDestino.getSelectedItem())) {
        JOptionPane.showMessageDialog(null, "A Filial de Destino Deve ser Diferente da Filial de Origem!",
                "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);

    } else if (Integer.parseInt(jQuantidadeT.getText()) > Integer.parseInt(jQuantidadeD.getText())) {
        JOptionPane.showMessageDialog(null, "A Quantidade a Ser Transferida não Pode Ser Maior que a Quantidade Disponível!",
                "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);

    } else if ((jProduto.getText().equals("")) || (jQuantidadeD.getText().equals("")) || (jQuantidadeT.getText().equals(""))) {
        JOptionPane.showMessageDialog(null, "Preenchimento obrigatório de todos os campos!",
                "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
    } else {

        estoque.setFilial(String.valueOf(jFilialDestino.getSelectedItem()));
        estoque.setProduto(jProduto.getText());
        estoque.setQuantidade(Integer.parseInt(jQuantidadeT.getText()));

        try {
            estoqueDao.transferir(String.valueOf(jFilialOrigem.getSelectedItem()), estoque);
            LimparCampos();
        } catch (Exception ex) {
            Logger.getLogger(FormTransProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//GEN-LAST:event_jTransferirActionPerformed

    private void jProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProdutoFocusLost
        estoque.setFilial(String.valueOf(jFilialOrigem.getSelectedItem()));
        estoque.setProduto(jProduto.getText());

        Estoque estoque2;
        try {
            estoque2 = estoqueDao.busca(estoque);
            jQuantidadeD.setText(String.valueOf(estoque2.getQuantidade()));
        } catch (Exception ex) {
            Logger.getLogger(FormTransProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jProdutoFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jFilialOrigem.removeAllItems();
        jFilialDestino.removeAllItems();

        List<Estoque> estoques;
        try {
            estoques = estoqueDao.listAll();

            for (Estoque est : estoques) {
                jFilialOrigem.addItem(est.getFilial());
                jFilialDestino.addItem(est.getFilial());
            }
        } catch (Exception ex) {
            Logger.getLogger(FormTransProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
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
