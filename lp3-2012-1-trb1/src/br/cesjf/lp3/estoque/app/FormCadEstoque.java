package br.cesjf.lp3.estoque.app;

import br.cesjf.lp3.estoque.classe.Estoque;
import br.cesjf.lp3.estoque.db.EstoqueDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        atualizarTblEstoque();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jExcluir.setEnabled(false);
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
            }
        });

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Filial", "Produto", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstoque);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tela_cliente.jpg"))); // NOI18N
        jLabel2.setText("       Cadastro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jExcluir)
                    .addComponent(jButton2)
                    .addComponent(jGravar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    jExcluir.setEnabled(false);
    atualizarTblEstoque();
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
        
        jExcluir.setEnabled(false);
        atualizarTblEstoque();
    }//GEN-LAST:event_jExcluirActionPerformed

    private void jProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProdutoFocusLost
    }//GEN-LAST:event_jProdutoFocusLost

    private void tblEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseClicked
        int linha = tblEstoque.getSelectedRow();
        String filial = (String) tblEstoque.getModel().getValueAt(linha, 0);
        String produto = (String) tblEstoque.getModel().getValueAt(linha, 1);   
        
        estoque.setFilial(filial);
        estoque.setProduto(produto);

        try {
            estoque = estoqueDao.busca(estoque);           
            
            jFilial.setText(estoque.getFilial());
            jProduto.setText(estoque.getProduto());
            jQuantidade.setText(String.valueOf(estoque.getQuantidade()));            
            
            tblEstoque.getSelectedRow();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível recuperar o registro!\n" + ex.getMessage(), "Erro ao buscar o registro", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FormCadEstoque.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        jExcluir.setEnabled(true);
    }//GEN-LAST:event_tblEstoqueMouseClicked
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jProduto;
    private javax.swing.JTextField jQuantidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstoque;
    // End of variables declaration//GEN-END:variables

    private void atualizarTblEstoque() {
        DefaultTableModel tm = (DefaultTableModel) tblEstoque.getModel();
        tm.getDataVector().removeAllElements();

        try {
            List<Estoque> estoques = estoqueDao.listAll();
            for (Estoque est : estoques) {
                tm.addRow(new Object[]{
                            est.getFilial(),
                            est.getProduto(),
                            est.getQuantidade()
                        });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros!\n" + ex.getMessage(), "Erro ao listar", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FormCadEstoque.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

    }
}
