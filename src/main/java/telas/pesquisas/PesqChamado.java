/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package telas.pesquisas;

import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import models.SituacaoChamado;
import models.Tipo;
import models.Utilitarios;
import models.Empresacliente;
import persistence.DAO;
import telas.cadastros.Chamado;

/**
 *
 * @author Altair Mateus T Alencastro
 */
public class PesqChamado extends javax.swing.JDialog {
    
    //  Iniciando chamado
    models.Chamado chamado;
    
    //  Lista de chamados
    List<models.Chamado> lista;
    
    //  Variavel para usar as consultas na pesquisa
    private String where;
    
    private final Frame parent;
    
    public PesqChamado(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        
        jTable_Chamado.setCellSelectionEnabled(false);
                
        this.parent = parent;
        
        //  Inicialização da variavel que será usada nas pesquisas
        where = "";
        
        atualizaComboBox();
            }// Fim do construtor
    
    
    
    //  Metodo que popula a tabela
    private void atualiza()
    {
        String[] titulos = new String[]{"Número", "Nome", "Data Abertura", "Cliente", "Prioridade", "Técnico Resp", "Vencimento", "Empresa"};
        
        lista = DAO.consultaSQL(models.Chamado.class, where);    
        
        Object[][] dados = new Object[lista.size()][titulos.length];
        
        for(int i = 0; i < lista.size(); i++)
        {
            
            dados[i][0] = lista.get(i).getId();
            dados[i][1] = lista.get(i).getNome();
            dados[i][2] = lista.get(i).dataAbertura();
            dados[i][3] = lista.get(i).getIdCliente();
            dados[i][4] = lista.get(i).getIdPrioridade();
            dados[i][5] = lista.get(i).getIdTecnico();
            dados[i][6] = lista.get(i).dataVencimento();
            dados[i][7] = lista.get(i).getIdEmpresa();
            
        }// Fim do bloco de repetição for
        
        DefaultTableModel dtm = new DefaultTableModel(dados, titulos);
        
        jTable_Chamado.setModel(dtm);
        
    }// Fim do método atualiza
    
    //  Preenchimento dos jComboBox
    private void atualizaComboBox()
    {
        
        List tipos = new LinkedList();
        tipos.add("Selecione");
        tipos.addAll(DAO.consulta(Tipo.class, ""));
        jComboBox_Tipo.setModel(new DefaultComboBoxModel(tipos.toArray()));
        
        List cliente = new LinkedList();
        cliente.add("Selecione");
        cliente.addAll(DAO.consulta(models.Cliente.class, ""));
        jComboBox_Cliente_.setModel(new DefaultComboBoxModel<>(cliente.toArray()));       
        
        List situacao = new LinkedList();
        situacao.add("Selecione");
        situacao.addAll(DAO.consulta(SituacaoChamado.class, ""));
        jComboBox_Situacao_.setModel(new DefaultComboBoxModel<>(situacao.toArray()));
        
        List empresa = new LinkedList();
        empresa.add("Selecione");
        empresa.addAll(DAO.consulta(Empresacliente.class, ""));
        jComboBox_Empresa.setModel(new DefaultComboBoxModel<>(empresa.toArray()));
        
    }// Fim do método

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
        jTextField_Pesquisa = new javax.swing.JTextField();
        jButton_Pesquisar_ = new javax.swing.JButton();
        jDateChooser_DataAbertura = new com.toedter.calendar.JDateChooser();
        jLabel_DataAbertura = new javax.swing.JLabel();
        jComboBox_Tipo = new javax.swing.JComboBox<>();
        jLabel_Tipo = new javax.swing.JLabel();
        jComboBox_Cliente_ = new javax.swing.JComboBox<>();
        jLabel_Cliente = new javax.swing.JLabel();
        jComboBox_Situacao_ = new javax.swing.JComboBox<>();
        jLabel_Situacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Chamado = new javax.swing.JTable();
        jLabel_DataAbertura1 = new javax.swing.JLabel();
        jComboBox_Empresa = new javax.swing.JComboBox<>();
        jLabel_Empresa = new javax.swing.JLabel();
        jButton_Editar = new javax.swing.JButton();
        jButton_Incluir = new javax.swing.JButton();
        jButton_Limpar = new javax.swing.JButton();
        jButton_Imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar");

        jPanel2.setBackground(new java.awt.Color(72, 124, 189));

        jLabel_Chamados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Chamados.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Chamados.setText("CHAMADOS");

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

        jDateChooser_DataAbertura.setDateFormatString("d '/' M '/' y");

        jLabel_DataAbertura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_DataAbertura.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_DataAbertura.setText("Data Abertura");

        jComboBox_Tipo.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_Tipo.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TipoActionPerformed(evt);
            }
        });

        jLabel_Tipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Tipo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Tipo.setText("Tipo");

        jComboBox_Cliente_.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_Cliente_.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_Cliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Cliente_ActionPerformed(evt);
            }
        });

        jLabel_Cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Cliente.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Cliente.setText("Cliente");

        jComboBox_Situacao_.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_Situacao_.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_Situacao_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Situacao_ActionPerformed(evt);
            }
        });

        jLabel_Situacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Situacao.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Situacao.setText("Situação");

        jTable_Chamado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Número", "Nome", "Data Abertura", "Cliente", "Prioridade", "Técnico Resp", "Vencimento", "Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Chamado.setSelectionBackground(new java.awt.Color(72, 124, 189));
        jTable_Chamado.setSelectionForeground(new java.awt.Color(72, 124, 189));
        jTable_Chamado.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_Chamado.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_Chamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ChamadoMouseClicked(evt);
            }
        });
        jTable_Chamado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_ChamadoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Chamado);

        jLabel_DataAbertura1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_DataAbertura1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_DataAbertura1.setText("Nome ou Id");

        jComboBox_Empresa.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_Empresa.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_EmpresaActionPerformed(evt);
            }
        });

        jLabel_Empresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Empresa.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Empresa.setText("Empresa");

        jButton_Editar.setBackground(new java.awt.Color(72, 124, 189));
        jButton_Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Editar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Editar.setText("EDITAR");
        jButton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarActionPerformed(evt);
            }
        });

        jButton_Incluir.setBackground(new java.awt.Color(72, 124, 189));
        jButton_Incluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Incluir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Incluir.setText("INCLUIR");
        jButton_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IncluirActionPerformed(evt);
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

        jButton_Imprimir.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Imprimir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Imprimir.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Imprimir.setText("IMPRIMIR");
        jButton_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Incluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Imprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Limpar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_DataAbertura1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_DataAbertura)
                                .addComponent(jDateChooser_DataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Tipo)
                                .addComponent(jComboBox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Cliente)
                                .addComponent(jComboBox_Cliente_, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox_Situacao_, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_Situacao))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Empresa)
                                .addComponent(jComboBox_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jButton_Pesquisar_))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_DataAbertura1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Pesquisa)
                    .addComponent(jButton_Pesquisar_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_DataAbertura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser_DataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Tipo)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Cliente_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Situacao)
                            .addComponent(jLabel_Empresa))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Situacao_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Pesquisar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesquisar_ActionPerformed
            
        //  Pesquisa por nome
        where = " and o.nome like '%" + jTextField_Pesquisa.getText() + "%'";
        
        //  Pesquis por id
        if( Utilitarios.isNumeric(jTextField_Pesquisa.getText()))
        {
            where += " or o.id='" + jTextField_Pesquisa.getText()+ "'";
        }// Fim do bloco de condição if
        
        //  Pesquisa por data de abertura
        if(jDateChooser_DataAbertura.getDate() != null)
        {
            where += " and o.data_abertura='" + new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser_DataAbertura.getDate()) + "'";
        }// Fim do bloco de condição else if
        
        //  Pesquisa por Tipo
        if(jComboBox_Tipo.getSelectedIndex() > 0)
        {
            where += " and o.id_tipo='" + ((Tipo) jComboBox_Tipo.getSelectedItem()).getId()+ "'";
        }// Fim do bloco de condição else if
        
        //  Pesquisa por cliente
        if(jComboBox_Cliente_.getSelectedIndex() > 0)
        {
            where += " and o.id_cliente='" + ((models.Cliente) jComboBox_Cliente_.getSelectedItem()).getId()+ "'";
        }// Fim do bloco de condição else if
        
        //  Pesquisa por Situação
        if(jComboBox_Situacao_.getSelectedIndex() > 0)
        {
            where += " and o.id_situacao='" + ((SituacaoChamado) jComboBox_Situacao_.getSelectedItem()).getId()+ "'";
        }// Fim do bloco de condição else if
        
        //  Pesquisa por empresa
        if(jComboBox_Empresa.getSelectedIndex() > 0)
        {
            where += " and o.id_empresa='" + ((Empresacliente) jComboBox_Empresa.getSelectedItem()).getId()+ "'";
        }// Fim do bloco de condição else if
        
        atualiza();
        
    }//GEN-LAST:event_jButton_Pesquisar_ActionPerformed
    
    private void jComboBox_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TipoActionPerformed

    }//GEN-LAST:event_jComboBox_TipoActionPerformed

    private void jComboBox_Cliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Cliente_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_Cliente_ActionPerformed

    private void jComboBox_Situacao_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Situacao_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_Situacao_ActionPerformed

    private void jTable_ChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ChamadoMouseClicked
        
        
        
    }//GEN-LAST:event_jTable_ChamadoMouseClicked

    private void jTextField_PesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PesquisaKeyPressed


    }//GEN-LAST:event_jTextField_PesquisaKeyPressed

    private void jTextField_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PesquisaActionPerformed

    private void jTable_ChamadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_ChamadoKeyPressed
       
        //  Chamando a tela e exibindo registro
        new Chamado(parent, true, lista.get(jTable_Chamado.getSelectedRow())).setVisible(true);
        
        //  Atualizando tabela
        atualiza();
    }//GEN-LAST:event_jTable_ChamadoKeyPressed

    private void jComboBox_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_EmpresaActionPerformed

    private void jButton_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditarActionPerformed
        
        //  Chamando a tela e exibindo registro
        new Chamado(parent, true, lista.get(jTable_Chamado.getSelectedRow())).setVisible(true);
  
        //  Atualizando tabela
        atualiza();
    }//GEN-LAST:event_jButton_EditarActionPerformed

    private void jButton_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IncluirActionPerformed
        
        //  Chamando a tela para incluir novo registro
        new Chamado(parent, true).setVisible(true);
        
        //  Atualizando tabela
        atualiza();
    }//GEN-LAST:event_jButton_IncluirActionPerformed

    private void jButton_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimparActionPerformed
        
        DefaultTableModel table = (DefaultTableModel)jTable_Chamado.getModel();
        table.setRowCount(0);
        
    }//GEN-LAST:event_jButton_LimparActionPerformed

    private void jButton_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImprimirActionPerformed
        try 
        {
            if (! jTable_Chamado.print()) 
            {
                System.err.println("Usuario cancelou a impressao");
            }// Fim do bloco if
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Nao impressa %s%n", e.getMessage());
        }// Fim do bloco try-catch
    }//GEN-LAST:event_jButton_ImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(PesqChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesqChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesqChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesqChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PesqChamado dialog = new PesqChamado(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<Object> jComboBox_Cliente_;
    private javax.swing.JComboBox<Object> jComboBox_Empresa;
    private javax.swing.JComboBox<Object> jComboBox_Situacao_;
    private javax.swing.JComboBox<Object> jComboBox_Tipo;
    private com.toedter.calendar.JDateChooser jDateChooser_DataAbertura;
    private javax.swing.JLabel jLabel_Chamados;
    private javax.swing.JLabel jLabel_Cliente;
    private javax.swing.JLabel jLabel_DataAbertura;
    private javax.swing.JLabel jLabel_DataAbertura1;
    private javax.swing.JLabel jLabel_Empresa;
    private javax.swing.JLabel jLabel_Situacao;
    private javax.swing.JLabel jLabel_Tipo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Chamado;
    private javax.swing.JTextField jTextField_Pesquisa;
    // End of variables declaration//GEN-END:variables
}
