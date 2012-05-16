package br.cesjf.lp3.estoque.app;

import br.cesjf.lp3.estoque.classe.Estoque;
import br.cesjf.lp3.estoque.db.EstoqueDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormCadEstoque extends javax.swing.JDialog {

    Estoque estoque;
    EstoqueDAO estoqueDao;

    public FormCadEstoque(java.awt.Frame parent, boolean modal) {
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
        jFilial.setText("");
        jProduto.setText("");
        jQuantidade.setText("");

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFilial = new javax.swing.JTextField();
        jNome = new javax.swing.JLabel();
        jProduto = new javax.swing.JTextField();
        jIdade = new javax.swing.JLabel();
        jQuantidade = new javax.swing.JTextField();
        jGravar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Filial:");

        jFilial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jNome.setText("Produto:");

        jProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jProdutoFocusLost(evt);
            }
        });

        jIdade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jIdade.setText("Quantidade:");

        jQuantidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jNome)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIdade)
                    .addComponent(jQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFilial, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jProduto))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        jGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_salvar.png"))); // NOI18N
        jGravar.setText("Gravar");
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

        jExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jExcluir.setText("Excluir");
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
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
                        .addComponent(jGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jExcluir)
                        .addComponent(jGravar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

private void jGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGravarActionPerformed

    if ((jFilial.getText().equals("")) || (jProduto.getText().equals("")) || (jQuantidade.getText().equals(""))) {

        JOptionPane.showMessageDialog(null, "Preenchimento obrigatório de todos os campos!",
                "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
    } else {

        estoque.setFilial(jFilial.getText());
        estoque.setProduto(jProduto.getText());
        estoque.setQuantidade(Integer.parseInt(jQuantidade.getText()));
        try {
            estoqueDao.cad(estoque);
            JOptionPane.showMessageDialog(null, "Produto Cadastrado Com Sucesso!",
                    "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
            LimparCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não é possível cadastrar o Produto!\n" + ex.getMessage(), "Erro ao cadastrar Produto", JOptionPane.ERROR_MESSAGE);
        }
    }
}//GEN-LAST:event_jGravarActionPerformed

    private void jExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirActionPerformed
        estoque.setFilial(jFilial.getText());
        estoque.setProduto(jProduto.getText());

        try {
            estoqueDao.excluir(estoque);
            JOptionPane.showMessageDialog(null, "Produto Excluído Com Sucesso!",
                    "Atenção", JOptionPane.OK_OPTION + JOptionPane.INFORMATION_MESSAGE);
            LimparCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não é possível excluir o Produto!\n" + ex.getMessage(), "Erro ao excluir Produto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jExcluirActionPerformed

    private void jProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProdutoFocusLost
        estoque.setFilial(jFilial.getText());
        estoque.setProduto(jProduto.getText());
        
        try {
            estoque = estoqueDao.busca(estoque);
        } catch (Exception ex) {
            estoque = null;
        }

        if (estoque != null) {
            jQuantidade.setText(String.valueOf(estoque.getQuantidade()));
        }
    }//GEN-LAST:event_jProdutoFocusLost
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FormCadEstoque dialog = new FormCadEstoque(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jExcluir;
    private javax.swing.JTextField jFilial;
    private javax.swing.JButton jGravar;
    private javax.swing.JLabel jIdade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jProduto;
    private javax.swing.JTextField jQuantidade;
    // End of variables declaration//GEN-END:variables
}
