/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package telas.cadastros;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.SituacaoChamado;
import models.Utilitarios;
import persistence.DAO;

/**
 *
 * @author Altair Mateus T Alencastro
 */
public class Situacao extends javax.swing.JDialog {

    /**
     * Creates new form Situacao
     */
    
    SituacaoChamado situacao;
       
    public Situacao(java.awt.Frame parent, boolean modal, models.SituacaoChamado situacao) {
        super(parent, modal);
        initComponents();
        
        this.situacao = situacao;
        atualizaDados();
        
    }// Fim do construtor Situacao
    
    public Situacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
    }// Fim do construtor Situacao
    
    private void atualizaDados()
    {
        jTextField_Nome_.setText(situacao.getNome());
    }// Fim do método atualizaDados

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
        jLabel_Numero = new javax.swing.JLabel();
        jTextField_Numero_ = new javax.swing.JTextField();
        jLabel_Nome = new javax.swing.JLabel();
        jTextField_Nome_ = new javax.swing.JTextField();
        jButton_Salvar_ = new javax.swing.JButton();
        jButton_Deletar = new javax.swing.JButton();
        jButton_Sair_ = new javax.swing.JButton();
        jLabel_Aviso1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar, Editar ou Deletar");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Chamados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_Numero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Numero.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Numero.setText("Número");

        jTextField_Numero_.setEditable(false);
        jTextField_Numero_.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Numero_.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Numero_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Numero_ActionPerformed(evt);
            }
        });

        jLabel_Nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Nome.setForeground(new java.awt.Color(73, 124, 190));
        jLabel_Nome.setText("Nome");

        jTextField_Nome_.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Nome_.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Nome_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Nome_ActionPerformed(evt);
            }
        });

        jButton_Salvar_.setBackground(new java.awt.Color(72, 124, 189));
        jButton_Salvar_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Salvar_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Salvar_.setText("SALVAR");
        jButton_Salvar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Salvar_ActionPerformed(evt);
            }
        });

        jButton_Deletar.setBackground(new java.awt.Color(255, 0, 51));
        jButton_Deletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Deletar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Deletar.setText("DELETAR");
        jButton_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeletarActionPerformed(evt);
            }
        });

        jButton_Sair_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Sair_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Sair_.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Sair_.setText("SAIR");
        jButton_Sair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sair_ActionPerformed(evt);
            }
        });

        jLabel_Aviso1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_Aviso1.setForeground(new java.awt.Color(73, 124, 190));
        jLabel_Aviso1.setText("CAMPOS EM AZUL SÃO OBRIGATÓRIOS!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Numero)
                    .addComponent(jTextField_Numero_, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Nome)
                    .addComponent(jTextField_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Aviso1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Sair_, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Salvar_, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Numero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Numero_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Nome_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Aviso1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Salvar_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jButton_Sair_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Numero_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Numero_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Numero_ActionPerformed

    private void jTextField_Nome_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Nome_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Nome_ActionPerformed

    private void jButton_Salvar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Salvar_ActionPerformed

        try
        {
            
            //  Instanciando objeto da classe SituacaoChamado
            if(situacao==null)
            situacao = new SituacaoChamado();

            //  Selecionando os campos a serem salvos
            situacao.setNome(jTextField_Nome_.getText());

            //  Chamando método para gravar no banco
            DAO.editar(situacao);
            JOptionPane.showMessageDialog(this, "SALVO COM SUCESSO");
            
            //  Limpa campos
            situacao = new SituacaoChamado();
            atualizaDados();
            
        } catch(Exception s)
            {
                JOptionPane.showMessageDialog(null, s.getMessage() ,"Erro: ", JOptionPane.ERROR_MESSAGE);
            }// Fim do try-catch
            

    }//GEN-LAST:event_jButton_Salvar_ActionPerformed

    private void jButton_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeletarActionPerformed
        
        try
        {
            //  Removendo registro do banco
            DAO.remover(situacao);
            
            //  Limpa Campos
            situacao = new models.SituacaoChamado();
            atualizaDados();
            
            JOptionPane.showMessageDialog(this, "EXCLUÍDO COM SUCESSO");
            
        }catch(Exception s)
            {
                JOptionPane.showMessageDialog(this, s);
            }// Fim do try-catch
        
    }//GEN-LAST:event_jButton_DeletarActionPerformed

    private void jButton_Sair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sair_ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_Sair_ActionPerformed

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
            java.util.logging.Logger.getLogger(Situacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Situacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Situacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Situacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Situacao dialog = new Situacao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton_Deletar;
    private javax.swing.JButton jButton_Sair_;
    private javax.swing.JButton jButton_Salvar_;
    private javax.swing.JLabel jLabel_Aviso1;
    private javax.swing.JLabel jLabel_Chamados;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_Numero;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Nome_;
    private javax.swing.JTextField jTextField_Numero_;
    // End of variables declaration//GEN-END:variables
}
