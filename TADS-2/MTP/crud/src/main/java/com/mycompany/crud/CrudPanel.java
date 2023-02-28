package com.mycompany.crud;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**** @author CarlosNeto ****/

public class CrudPanel extends JPanel {

    private Pessoa pessoa;
    private int id;
    
    public CrudPanel() {
        initComponents();
    }

    public CrudPanel(Pessoa pessoa) {
        initComponents();
        
        this.pessoa = pessoa;
        
        jLabelID.setText(Integer.toString(pessoa.getId()));
        jTextFieldNome.setText(pessoa.getNome());
        
        
        if (pessoa.getCheck() == null){
            jLabelCheck.setText("NÃO TEM IMAGEM");
        }else{
            jLabelCheck.setText("TEM IMAGEM");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        excluirButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonImagem = new javax.swing.JButton();
        jLabelCheck = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();

        excluirButton.setBackground(new java.awt.Color(0, 0, 0));
        excluirButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        excluirButton.setForeground(new java.awt.Color(255, 255, 255));
        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        alterarButton.setBackground(new java.awt.Color(0, 0, 0));
        alterarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        alterarButton.setForeground(new java.awt.Color(255, 255, 255));
        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarButtonActionPerformed(evt);
            }
        });

        jTextFieldNome.setText("Nome");

        jLabel1.setText("Nome:");

        jLabel2.setText("ID");

        jButtonImagem.setBackground(new java.awt.Color(0, 0, 0));
        jButtonImagem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonImagem.setForeground(new java.awt.Color(255, 255, 255));
        jButtonImagem.setText("Inserir Imagem");
        jButtonImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(excluirButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonImagem)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(excluirButton)
                            .addComponent(alterarButton)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jButtonImagem))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed
       Conexao con = new Conexao();
       Integer id = Integer.parseInt(jLabelID.getText());
       String nome = jTextFieldNome.getText();
       Boolean ret = con.atualizar(id, nome);
       
        if (ret) {
            JOptionPane.showMessageDialog(null, "Regitro alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o registro!");
        }
       
       
    }//GEN-LAST:event_alterarButtonActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        Conexao con = new Conexao();
        Boolean ret = con.excluir(Integer.parseInt(jLabelID.getText()));
        
        if (ret) {
            JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o regitro!");
        }
    }//GEN-LAST:event_excluirButtonActionPerformed

    private void jButtonImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagemActionPerformed
        LeitorArquivo la = new LeitorArquivo();
        la.setId(Integer.parseInt(jLabelID.getText()));
        
    }//GEN-LAST:event_jButtonImagemActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JButton excluirButton;
    private javax.swing.JButton jButtonImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCheck;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
