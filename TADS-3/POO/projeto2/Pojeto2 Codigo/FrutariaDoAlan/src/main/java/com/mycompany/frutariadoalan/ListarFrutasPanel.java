
package com.mycompany.frutariadoalan;
import javax.swing.JPanel;

/**** @author CarlosH & PedroH ****/

public class ListarFrutasPanel extends JPanel {
    private Frutas fruta;    
    
    /* 
    ListarFrutasPanel é um Panel para listar o Estoque 
    no JPanelListarEstoque server para listar todas as frutas que
    já estao no banco de dados
    */
    
    public ListarFrutasPanel() {
        initComponents();        
    }    
    public ListarFrutasPanel(Frutas fruta) {
        initComponents();
        this.fruta = fruta;
        
        // Colocando as informaçoes das frutas na tela.
        jTextFieldNome.setText(fruta.getNome().toLowerCase());
        jTextFieldValor.setText(Double.toString(fruta.getValorUnitario()));
        jTextFieldQuantidade.setText(Integer.toString(fruta.getQtd()));
        jTextFieldVencimento.setText(fruta.getValidade());            
        jLabelCodigo.setText(fruta.getCodigo());
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExcluir = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        jLabelVencimento = new javax.swing.JLabel();
        jTextFieldVencimento = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelCodigoDisplay = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();

        setBackground(new java.awt.Color(55, 57, 62));

        jButtonExcluir.setBackground(new java.awt.Color(0, 0, 0));
        jButtonExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir Fruta");
        jButtonExcluir.setFocusPainted(false);
        jButtonExcluir.setFocusable(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTextFieldNome.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldNome.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.setText("jabuticaba");
        jTextFieldNome.setBorder(null);

        jTextFieldValor.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldValor.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTextFieldValor.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldValor.setText("0000");
        jTextFieldValor.setBorder(null);

        jTextFieldQuantidade.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldQuantidade.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTextFieldQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidade.setText("9999");
        jTextFieldQuantidade.setBorder(null);

        jLabelValor.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor:");

        jLabelNome.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome:");

        jLabelQuantidade.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabelQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuantidade.setText("Qtd:");

        jLabelVencimento.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabelVencimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVencimento.setText("Vencimento:");

        jTextFieldVencimento.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldVencimento.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTextFieldVencimento.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldVencimento.setBorder(null);

        jLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));

        jLabelCodigoDisplay.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabelCodigoDisplay.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigoDisplay.setText("Codigo:");

        jButtonAlterar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAlterar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setText("Alterar Fruta");
        jButtonAlterar.setFocusPainted(false);
        jButtonAlterar.setFocusable(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelQuantidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelVencimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVencimento)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonExcluir)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlterar)
                .addGap(18, 18, 18)
                .addComponent(jLabelCodigoDisplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCodigoDisplay)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jLabelValor)
                    .addComponent(jLabelVencimento)
                    .addComponent(jTextFieldVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
    Conexao con = new Conexao(); // Nova conexao.
    String codigo = jLabelCodigo.getText(); // Pegando o nome da fruta.
    con.removerFrutas(codigo); // Excluindo no banco de dados a fruta especificada.
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        Conexao con = new Conexao(); // Nova conexao.
        String nome = jTextFieldNome.getText(); // Pegando o nome da fruta.
        double valorUnitario = Double.parseDouble(jTextFieldValor.getText()); // Pegando o preco.
        int quantidade = Integer.parseInt(jTextFieldQuantidade.getText()); // Pegando a quantidade.
        String tempo = jTextFieldVencimento.getText(); // Pegando o tempo.
        String codigo = jLabelCodigo.getText(); // Pegando o codigo.
        
        con.atualizarFrutas(nome, valorUnitario, quantidade, tempo, codigo); // Atualizando todas as informaçoes para o BD.
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCodigoDisplay;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JLabel jLabelVencimento;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldVencimento;
    // End of variables declaration//GEN-END:variables
}
