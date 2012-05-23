package br.cesjf.lp3.estoque.app;

import br.cesjf.lp3.estoque.classe.Estoque;
import br.cesjf.lp3.estoque.db.EstoqueDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class FormDesativarFilial extends javax.swing.JFrame {

    private JTree tree;
    private DefaultMutableTreeNode noPai;
    Estoque estoque;
    EstoqueDAO estoqueDao;

    public FormDesativarFilial() {
        initComponents();
        CriaArvore();
        
        try {
            estoque = new Estoque();
            estoqueDao = new EstoqueDAO();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco!", "Erro de Conexão", JOptionPane.ERROR_MESSAGE);
        }


        List<Estoque> estoques;
        try {
            estoques = estoqueDao.listAllCombo();

            for (Estoque est : estoques) {
                addFilho(est.getFilial());                
            }
        } catch (Exception ex) {
            Logger.getLogger(FormTransProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CriaArvore() {
        noPai = new DefaultMutableTreeNode("Filiais");
        tree = new JTree(noPai);
        jFilialOrigem.setViewportView(tree);
        repaint();
    }

    private void addFilho(String no) {
        DefaultMutableTreeNode filho = new DefaultMutableTreeNode(no);
        noPai.add(filho);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFilialOrigem = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Estoque");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Filial");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Produto - Quantidade");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jTree1.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                jTree1TreeExpanded(evt);
            }
        });
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jFilialOrigem.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFilialOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFilialOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
     
    }//GEN-LAST:event_jTree1ValueChanged

    private void jTree1TreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_jTree1TreeExpanded
         
    }//GEN-LAST:event_jTree1TreeExpanded

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        
    }//GEN-LAST:event_jTree1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormDesativarFilial().setVisible(true);
            }
        });



    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jFilialOrigem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
