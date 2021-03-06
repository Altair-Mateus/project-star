/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package telas.pesquisas;

import java.awt.Frame;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.SituacaoChamado;
import models.Utilitarios;
import persistence.DAO;
import telas.cadastros.Situacao;

/**
 *
 * @author Altair Mateus T Alencastro
 */
public class PesqSituacao extends javax.swing.JDialog {

    /**
     * Creates new form PesqSituacao
     */
    
    //  Variavel para usar as consultas na pesquisa
    private String where;
    
    //  Lista de Situações
    List<SituacaoChamado> lista;
    
    private final Frame parent;
    
    //  Construtor
    public PesqSituacao(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        
        jTable_SitChamado.setCellSelectionEnabled(false);
                
        this.parent = parent;
        
        where = "";
       
    }// Fim do construtor
    
    //  Metodo que popula a tabela
    private void atualiza()
    {
        String[] titulos = new String[]{"Número", "Nome"};
        
        lista = DAO.consultaSQL(models.SituacaoChamado.class, where);
        
        Object[][] dados = new Object[lista.size()][titulos.length];
        
        for (int i = 0; i < lista.size(); i++)
        {
            dados[i][0] = lista.get(i).getId();
            dados[i][1] = lista.get(i).getNome();
        }// Fim do bloco de repeticao for
        
        DefaultTableModel dtm = new DefaultTableModel(dados, titulos);
        
        jTable_SitChamado.setModel(dtm);
    }// Fim do metodo atualiza

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel_Chamados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_SitChamado = new javax.swing.JTable();
        jTextField_Pesquisa = new javax.swing.JTextField();
        jButton_Pesquisar_ = new javax.swing.JButton();
        jLabel_NomeId = new javax.swing.JLabel();
        jButton_Incluir = new javax.swing.JButton();
        jButton_Editar = new javax.swing.JButton();
        jButton_Imprimir = new javax.swing.JButton();
        jButton_Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar");

        jPanel2.setBackground(new java.awt.Color(72, 124, 189));

        jLabel_Chamados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Chamados.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Chamados.setText("SITUAÇÃO CHAMADO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Chamados)
                .addContainerGap(559, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Chamados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable_SitChamado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Número", "Nome"
            }
        ));
        jTable_SitChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SitChamadoMouseClicked(evt);
            }
        });
        jTable_SitChamado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_SitChamadoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_SitChamado);
        if (jTable_SitChamado.getColumnModel().getColumnCount() > 0) {
            jTable_SitChamado.getColumnModel().getColumn(0).setHeaderValue("Número");
            jTable_SitChamado.getColumnModel().getColumn(1).setHeaderValue("Nome");
        }

        jTextField_Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PesquisaActionPerformed(evt);
            }
        });
        jTextField_Pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_PesquisaKeyPressed(evt);
            }
        });

        jButton_Pesquisar_.setBackground(new java.awt.Color(72, 124, 189));
        jButton_Pesquisar_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Pesquisar_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Pesquisar_.setText("PESQUISAR");
        jButton_Pesquisar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pesquisar_ActionPerformed(evt);
            }
        });

        jLabel_NomeId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_NomeId.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_NomeId.setText("Nome ou Id");

        jButton_Incluir.setBackground(new java.awt.Color(72, 124, 189));
        jButton_Incluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Incluir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Incluir.setText("INCLUIR");
        jButton_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IncluirActionPerformed(evt);
            }
        });

        jButton_Editar.setBackground(new java.awt.Color(72, 124, 189));
        jButton_Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Editar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Editar.setText("EDITAR");
        jButton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarActionPerformed(evt);
            }
        });

        jButton_Imprimir.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Imprimir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Imprimir.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Imprimir.setText("IMPRIMIR");
        jButton_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ImprimirActionPerformed(evt);
            }
        });

        jButton_Limpar.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Limpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Limpar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Limpar.setText("LIMPAR");
        jButton_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Incluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Imprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Limpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_NomeId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Pesquisar_))
                            .addComponent(jScrollPane1))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Pesquisar_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_NomeId)
                        .addGap(7, 7, 7)
                        .addComponent(jTextField_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_SitChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SitChamadoMouseClicked
        
        
    }//GEN-LAST:event_jTable_SitChamadoMouseClicked

    private void jButton_Pesquisar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesquisar_ActionPerformed
        
        //  Pesquisa por nome
        where = " and o.nome like '%" + jTextField_Pesquisa.getText() + "%'";
        
        //  Pesquis por id
        if( Utilitarios.isNumeric(jTextField_Pesquisa.getText()))
        {
            where += " or o.id='" + jTextField_Pesquisa.getText()+ "'";
        }// Fim do bloco de condição if
        
        atualiza();
    }//GEN-LAST:event_jButton_Pesquisar_ActionPerformed

        
    private void jTextField_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PesquisaActionPerformed

    private void jTextField_PesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PesquisaKeyPressed
        
    }//GEN-LAST:event_jTextField_PesquisaKeyPressed

    private void jTable_SitChamadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_SitChamadoKeyPressed
        
        //  Chamando a tela de situacao e exibindo registro
        new Situacao(parent, true, lista.get(jTable_SitChamado.getSelectedRow())).setVisible(true);
        
        //  Atualizando tabela
        atualiza();
    }//GEN-LAST:event_jTable_SitChamadoKeyPressed

    private void jButton_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IncluirActionPerformed

        //  Chamando a tela para incluir novo registro
        new Situacao(parent, true).setVisible(true);

        //  Atualizando tabela
        atualiza();
    }//GEN-LAST:event_jButton_IncluirActionPerformed

    private void jButton_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditarActionPerformed

        //  Chamando a tela e exibindo registro
        new Situacao(parent, true, lista.get(jTable_SitChamado.getSelectedRow())).setVisible(true);

        //  Atualizando tabela
        atualiza();
    }//GEN-LAST:event_jButton_EditarActionPerformed

    private void jButton_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImprimirActionPerformed
        try
        {
            if (! jTable_SitChamado.print())
            {
                System.err.println("Usuario cancelou a impressao");
            }// Fim do bloco if
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Nao impressa %s%n", e.getMessage());
        }// Fim do bloco try-catch
    }//GEN-LAST:event_jButton_ImprimirActionPerformed

    private void jButton_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimparActionPerformed

        DefaultTableModel table = (DefaultTableModel)jTable_SitChamado.getModel();
        table.setRowCount(0);

    }//GEN-LAST:event_jButton_LimparActionPerformed

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesqSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesqSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesqSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesqSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PesqSituacao dialog = new PesqSituacao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Editar;
    private javax.swing.JButton jButton_Imprimir;
    private javax.swing.JButton jButton_Incluir;
    private javax.swing.JButton jButton_Limpar;
    private javax.swing.JButton jButton_Pesquisar_;
    private javax.swing.JLabel jLabel_Chamados;
    private javax.swing.JLabel jLabel_NomeId;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_SitChamado;
    private javax.swing.JTextField jTextField_Pesquisa;
    // End of variables declaration//GEN-END:variables

}

