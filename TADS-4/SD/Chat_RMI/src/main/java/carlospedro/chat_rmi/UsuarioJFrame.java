package carlospedro.chat_rmi;

import java.util.Random;

/**** @author Carlos Henrique Neto & Pedro Henrique Barros ****/

public class UsuarioJFrame extends javax.swing.JFrame {

    public UsuarioJFrame() {
        super("Chat RMI");
        initComponents();
        setVisible(true);
    }
    
    boolean flag = false;
    boolean btnWasPressed = false;
    boolean sair = true;
    String chatMsg = "";
    
    // Getter e Setters
    // texto
    public String getTexto() {
        return jTextFieldTexto.getText();
    }
    public void setTexto(String texto) {
        jTextFieldTexto.setText(texto);
    }
    // chat
    public String getChat() {
        return jTextAreaChat.getText();
    }
    public void setChat(String chat) {
        chatMsg += chat;
        jTextAreaChat.setText(chatMsg);
    }
    // nome
    public String getNome() {
        return jTextFieldNome.getText();
    }
    public void setNome(String nome) {
        jTextFieldNome.setText(nome);
    }
    // flag
    public boolean getFlag(){
        return flag;
    }
    // btnWasPressed
    public boolean getBntWasPressed(){
        return btnWasPressed;
    }
    public void setBtnWasPressedFalse(){
        btnWasPressed = false;
    }
    // sair
    public boolean sair(){
        return sair;
    }
    
    // Código gerado automaticamente pelo o netbeans.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEnviar = new javax.swing.JButton();
        jTextFieldTexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaChat = new javax.swing.JTextArea();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButtonEnviar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEnviar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jTextFieldTexto.setBackground(new java.awt.Color(255, 255, 255));

        jTextAreaChat.setEditable(false);
        jTextAreaChat.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaChat.setColumns(20);
        jTextAreaChat.setRows(5);
        jScrollPane1.setViewportView(jTextAreaChat);

        jTextFieldNome.setBackground(new java.awt.Color(255, 255, 255));

        jButtonOk.setBackground(new java.awt.Color(0, 0, 0));
        jButtonOk.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOk.setText("OK");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome: ");

        jLabel1.setText("Mensagem: ");

        jButtonSair.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOk)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSair)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldTexto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEnviar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOk)
                    .addComponent(jLabelNome)
                    .addComponent(jButtonSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnviar)
                    .addComponent(jTextFieldTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Código gerado automaticamente pelo o netbeans.
    
    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        btnWasPressed = true;
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        // Caso o campo de texto do nome esteja vazio.
        if(jTextFieldNome.getText().equals("")){
            Random random = new Random();
            jTextFieldNome.setText("anonymous" + random.nextInt(1000));
        }
        
        if(flag == false){
            flag = true;
            jTextFieldNome.setEditable(false);
        }else{
            flag = false;
        }
        
        jButtonOk.setEnabled(false);
        jButtonOk.setVisible(false);
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        sair = false;
    }//GEN-LAST:event_jButtonSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaChat;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTexto;
    // End of variables declaration//GEN-END:variables
}
