package br.cesjf.lp3.estoque.app;

import javax.swing.JFrame;


public class formPrincipal extends javax.swing.JFrame {
    
    public formPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);        
    }   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cCadastrar = new javax.swing.JMenuItem();
        cTransferir = new javax.swing.JMenuItem();
        jDesFilial = new javax.swing.JMenuItem();
        jRelatorio = new javax.swing.JMenu();
        jRelGeral = new javax.swing.JMenuItem();
        jSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas de Informação");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Ações");

        cCadastrar.setText("Cadastrar");
        cCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(cCadastrar);

        cTransferir.setText("Transferir Produto");
        cTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTransferirActionPerformed(evt);
            }
        });
        jMenu1.add(cTransferir);

        jDesFilial.setText("Desativar Filial");
        jDesFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDesFilialActionPerformed(evt);
            }
        });
        jMenu1.add(jDesFilial);

        jMenuBar1.add(jMenu1);

        jRelatorio.setText("Relatórios");
        jRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRelatorioActionPerformed(evt);
            }
        });

        jRelGeral.setText("Geral");
        jRelGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRelGeralActionPerformed(evt);
            }
        });
        jRelatorio.add(jRelGeral);

        jMenuBar1.add(jRelatorio);

        jSair.setText("Sair");
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked
        System.exit(0);
}//GEN-LAST:event_jSairMouseClicked

private void cCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCadastrarActionPerformed
        FormCadEstoque frp = new FormCadEstoque(this, true);
        frp.setLocationRelativeTo(null);
        frp.setVisible(true);
}//GEN-LAST:event_cCadastrarActionPerformed

    private void cTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTransferirActionPerformed
        FormTransProduto frp = new FormTransProduto(this, true);
        frp.setLocationRelativeTo(null);
        frp.setVisible(true);
    }//GEN-LAST:event_cTransferirActionPerformed

    private void jDesFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDesFilialActionPerformed
        FormDesFilial frp = new FormDesFilial(this, true);
        frp.setLocationRelativeTo(null);
        frp.setVisible(true);
    }//GEN-LAST:event_jDesFilialActionPerformed

    private void jRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRelatorioActionPerformed
    }//GEN-LAST:event_jRelatorioActionPerformed

    private void jRelGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRelGeralActionPerformed
        FormRelEstoque frp = new FormRelEstoque(this, true);
        frp.setLocationRelativeTo(null);
        frp.setVisible(true);
    }//GEN-LAST:event_jRelGeralActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cCadastrar;
    private javax.swing.JMenuItem cTransferir;
    private javax.swing.JMenuItem jDesFilial;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jRelGeral;
    private javax.swing.JMenu jRelatorio;
    private javax.swing.JMenu jSair;
    // End of variables declaration//GEN-END:variables
}
