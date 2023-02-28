package com.mycompany.crud;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**** @author CarlosNeto ****/

public class CrudFrame extends javax.swing.JFrame {

    private Conexao con;

    /**
     * Creates new form TesteConexao
     */
    public CrudFrame() {
        super("Crud Melhorado");
        initComponents();
        painelLista.setLayout(new WrapLayout());
        setVisible(true);

        con = new Conexao();

        botaoInserir.addActionListener((ActionEvent e) -> {
            inserirTexto();
        });
        
        botaoListar.addActionListener((ActionEvent e) -> {
            preencherLista();
        });
        
        preencherLista();
    }

    private void preencherLista() {
        if (painelLista.getComponentCount() > 0) {
            painelLista.removeAll();
        }
        
        ArrayList<Pessoa> lista = con.listarPessoas();
        
        for (Pessoa pessoa : lista) {
            CrudPanel pl = new CrudPanel(pessoa);
            
            painelLista.add(pl);
        }
        
        SwingUtilities.invokeLater(() -> {
            jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMinimum());
        });
    }
    
    private void inserirTexto() {
        Boolean ret = con.inserir(txtNome.getText());
        if (ret) {
            preencherLista();
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível gravar!");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        botaoInserir = new javax.swing.JButton();
        botaoListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelLista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        labelNome.setBackground(new java.awt.Color(0, 0, 0));
        labelNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        labelNome.setText("Nome");

        botaoInserir.setBackground(new java.awt.Color(0, 0, 0));
        botaoInserir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botaoInserir.setForeground(new java.awt.Color(255, 255, 255));
        botaoInserir.setText("Inserir");

        botaoListar.setBackground(new java.awt.Color(0, 0, 0));
        botaoListar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botaoListar.setForeground(new java.awt.Color(255, 255, 255));
        botaoListar.setText("Listar");

        painelLista.setAutoscrolls(true);
        jScrollPane1.setViewportView(painelLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoListar)
                        .addGap(0, 169, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome)
                    .addComponent(botaoInserir)
                    .addComponent(botaoListar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel painelLista;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
