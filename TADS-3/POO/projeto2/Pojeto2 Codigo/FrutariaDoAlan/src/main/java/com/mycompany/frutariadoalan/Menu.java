
package com.mycompany.frutariadoalan;

import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**** @author CarlosH & PedroH ****/

public class Menu extends javax.swing.JFrame {

    private Conexao con;
    LocalDateTime dataChegada = LocalDateTime.now(); // Data de chegada da fruta.
    
    public Menu() {
        super("Frutaria do Alan"); // Definindo o nome do programa.
        initComponents();
        JPanelListarEstoque.setLayout(new WrapLayout());
        setVisible(true);
        con = new Conexao();        
        preencherEstoque(JPanelListarEstoque); // Atualizando o Estoque.
    }

    private void preencherEstoque(javax.swing.JPanel jpanel) { // Metodo para preencher o estoque.
        if (jpanel.getComponentCount() > 0) { // Caso haja algo no JPanel.
            jpanel.removeAll(); // Remove tudo.
        }        
        ArrayList<Frutas> lista = con.listarFrutas();
        for (Frutas fruta : lista) { // Varrendo a lista com as frutas.
            ListarFrutasPanel fr = new ListarFrutasPanel(fruta); // Instanciando um novo ListarFrutasPanel com uma fruta.
            // Caso as frutas estejam podres.
            if(fruta.getValidade().equals(dataChegada.getDayOfMonth() + "/" + dataChegada.getMonthValue() + "/" + dataChegada.getYear())){  
                JOptionPane.showMessageDialog(null, "As " + fruta.getNome().toLowerCase() + "s estao podres!");                
            }
            jpanel.add(fr); // Adiciona a fruta na tela.
            
        }        
        SwingUtilities.invokeLater(() -> {
            jScrollPaneListarFrutas.getVerticalScrollBar().setValue(jScrollPaneListarFrutas.getVerticalScrollBar().getMinimum());
        });
    }    
    private double preencherCarrinho(javax.swing.JPanel jpanel){ // Metodo para preencher o estoque.
        double valorTotal = 0;
        if (jpanel.getComponentCount() > 0) { // Caso haja algo no JPanel.
            jpanel.removeAll(); // Remove tudo.
        }        
        ArrayList<Frutas> lista = con.listarCarrinho();                        
        for (Frutas fruta : lista) { // Varrendo a lista com as frutas.
            ListarFrutasCarrinhoPanel fr = new ListarFrutasCarrinhoPanel(fruta); // Instanciando um novo ListarFrutasPanel com uma fruta.              
            jpanel.add(fr); // Adiciona a fruta na tela.
            valorTotal += fruta.getValorUnitario() * fruta.getQtd(); // Somando o Valor total da compra.
        }        
        SwingUtilities.invokeLater(() -> {
            jScrollPaneListarCarrinho.getVerticalScrollBar().setValue(jScrollPaneListarCarrinho.getVerticalScrollBar().getMinimum());
        });        
        return valorTotal;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanelBemVindo = new javax.swing.JPanel();
        jLabelFrutas1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanelFrutas = new javax.swing.JPanel();
        jLabelFrutas = new javax.swing.JLabel();
        jSeparatorFrutas = new javax.swing.JSeparator();
        jButtonAdicionarFrutas = new javax.swing.JButton();
        jLabelNomeFruta = new javax.swing.JLabel();
        jLabelQuantidadeFrutas = new javax.swing.JLabel();
        jTextFieldQuantidadeFruta = new javax.swing.JTextField();
        jTextFieldNomeFruta = new javax.swing.JTextField();
        jTextFieldValorFruta = new javax.swing.JTextField();
        jLabelNomeFruta1 = new javax.swing.JLabel();
        jTextFieldDias = new javax.swing.JTextField();
        jLabelTempoFruta = new javax.swing.JLabel();
        jLabelBarra = new javax.swing.JLabel();
        jTextFieldMeses = new javax.swing.JTextField();
        jLabelBarra2 = new javax.swing.JLabel();
        jTextFieldAnos = new javax.swing.JTextField();
        jPanelEstoque = new javax.swing.JPanel();
        jLabelEstoque = new javax.swing.JLabel();
        jSeparatorEstoque = new javax.swing.JSeparator();
        jButtonListarEstoque = new javax.swing.JButton();
        jScrollPaneListarFrutas = new javax.swing.JScrollPane();
        JPanelListarEstoque = new javax.swing.JPanel();
        jPanelCompras = new javax.swing.JPanel();
        jLabelCompras = new javax.swing.JLabel();
        jSeparatorCompras = new javax.swing.JSeparator();
        jButtonAdicionarFrutasAoCarrinho = new javax.swing.JButton();
        jLabelNomeFrutaVendas = new javax.swing.JLabel();
        jTextFieldQuantidadeFrutaVendas = new javax.swing.JTextField();
        jTextFieldNomeFrutaVendas = new javax.swing.JTextField();
        jButtonListarCarrinhoVendas = new javax.swing.JButton();
        jLabelValorTotal = new javax.swing.JLabel();
        jLabelValorTotalVendas = new javax.swing.JLabel();
        jLabelNomeFrutaVendas1 = new javax.swing.JLabel();
        jScrollPaneListarCarrinho = new javax.swing.JScrollPane();
        JPanelListarCarrinho = new javax.swing.JPanel();
        jButtonEfetuarCompras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane4.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane4.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane4.setFocusable(false);
        jTabbedPane4.setOpaque(true);

        jPanelBemVindo.setBackground(new java.awt.Color(55, 57, 62));

        jLabelFrutas1.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabelFrutas1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFrutas1.setText("Seja bem vindo(a) a Frutaria do Alan!");

        jTextArea1.setBackground(new java.awt.Color(33, 35, 37));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("   Olá, seja bem vindo(a) a Frutaria do Alan, Este é um projeto de \n     faculdade para a materia de POO feito por Carlos Henrique e \n Pedro Henrique do 3 periodo do curso TADS no IFG Formosa - GO 2022, \nnele voce pode adicionar, remover e vender frutas com tudo registrado \n  ao seu banco de dados, pedimos que tenha paciencia com o projeto, e \ncaso algo nao funcione troque e volte de aba que talvez ira funcionar.\n\t\tFeito em Java com JFrame e Postgresql.\n");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Users\\Downloads\\farmer.png")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanelBemVindoLayout = new javax.swing.GroupLayout(jPanelBemVindo);
        jPanelBemVindo.setLayout(jPanelBemVindoLayout);
        jPanelBemVindoLayout.setHorizontalGroup(
            jPanelBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBemVindoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelFrutas1)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanelBemVindoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBemVindoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanelBemVindoLayout.setVerticalGroup(
            jPanelBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBemVindoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelFrutas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Bem Vindo", jPanelBemVindo);

        jPanelFrutas.setBackground(new java.awt.Color(55, 57, 62));
        jPanelFrutas.setForeground(new java.awt.Color(0, 0, 0));

        jLabelFrutas.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabelFrutas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFrutas.setText("Frutas");

        jSeparatorFrutas.setBackground(new java.awt.Color(0, 0, 0));

        jButtonAdicionarFrutas.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAdicionarFrutas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonAdicionarFrutas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdicionarFrutas.setText("Adicionar Fruta(s)");
        jButtonAdicionarFrutas.setFocusPainted(false);
        jButtonAdicionarFrutas.setFocusable(false);
        jButtonAdicionarFrutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarFrutasActionPerformed(evt);
            }
        });

        jLabelNomeFruta.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelNomeFruta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeFruta.setText("Nome: ");

        jLabelQuantidadeFrutas.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelQuantidadeFrutas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuantidadeFrutas.setText("Quantidade:");

        jTextFieldQuantidadeFruta.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldQuantidadeFruta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldQuantidadeFruta.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeFruta.setBorder(null);

        jTextFieldNomeFruta.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldNomeFruta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNomeFruta.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeFruta.setBorder(null);

        jTextFieldValorFruta.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldValorFruta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldValorFruta.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldValorFruta.setBorder(null);

        jLabelNomeFruta1.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelNomeFruta1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeFruta1.setText("Valor: ");

        jTextFieldDias.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldDias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldDias.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldDias.setBorder(null);

        jLabelTempoFruta.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelTempoFruta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTempoFruta.setText("Tempo de vencimento: ");

        jLabelBarra.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelBarra.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBarra.setText("/");

        jTextFieldMeses.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldMeses.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldMeses.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldMeses.setBorder(null);

        jLabelBarra2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelBarra2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBarra2.setText("/");

        jTextFieldAnos.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldAnos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldAnos.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldAnos.setBorder(null);

        javax.swing.GroupLayout jPanelFrutasLayout = new javax.swing.GroupLayout(jPanelFrutas);
        jPanelFrutas.setLayout(jPanelFrutasLayout);
        jPanelFrutasLayout.setHorizontalGroup(
            jPanelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFrutasLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addGroup(jPanelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparatorFrutas)
                    .addComponent(jLabelFrutas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelFrutasLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFrutasLayout.createSequentialGroup()
                        .addGroup(jPanelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeFruta1)
                            .addComponent(jLabelNomeFruta))
                        .addGap(62, 62, 62)
                        .addGroup(jPanelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeFruta)
                            .addComponent(jTextFieldValorFruta)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFrutasLayout.createSequentialGroup()
                        .addComponent(jLabelQuantidadeFrutas)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldQuantidadeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFrutasLayout.createSequentialGroup()
                        .addComponent(jLabelTempoFruta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelBarra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelBarra2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAnos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFrutasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAdicionarFrutas)
                .addGap(201, 201, 201))
        );
        jPanelFrutasLayout.setVerticalGroup(
            jPanelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFrutasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelFrutas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeFruta))
                .addGap(18, 18, 18)
                .addGroup(jPanelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuantidadeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantidadeFrutas))
                .addGap(18, 18, 18)
                .addGroup(jPanelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeFruta1))
                .addGap(18, 18, 18)
                .addGroup(jPanelFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTempoFruta)
                    .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBarra)
                    .addComponent(jTextFieldMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBarra2)
                    .addComponent(jTextFieldAnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jButtonAdicionarFrutas)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Frutas", jPanelFrutas);

        jPanelEstoque.setBackground(new java.awt.Color(55, 57, 62));
        jPanelEstoque.setForeground(new java.awt.Color(0, 0, 0));

        jLabelEstoque.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabelEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstoque.setText("Estoque");

        jSeparatorEstoque.setBackground(new java.awt.Color(0, 0, 0));

        jButtonListarEstoque.setBackground(new java.awt.Color(0, 0, 0));
        jButtonListarEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarEstoque.setText("Atualizar Estoque");
        jButtonListarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarEstoqueActionPerformed(evt);
            }
        });

        JPanelListarEstoque.setBackground(new java.awt.Color(33, 35, 37));
        JPanelListarEstoque.setAutoscrolls(true);
        jScrollPaneListarFrutas.setViewportView(JPanelListarEstoque);

        javax.swing.GroupLayout jPanelEstoqueLayout = new javax.swing.GroupLayout(jPanelEstoque);
        jPanelEstoque.setLayout(jPanelEstoqueLayout);
        jPanelEstoqueLayout.setHorizontalGroup(
            jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstoqueLayout.createSequentialGroup()
                .addGroup(jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstoqueLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneListarFrutas))
                    .addGroup(jPanelEstoqueLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addGroup(jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparatorEstoque))
                        .addGap(0, 237, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelEstoqueLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jButtonListarEstoque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEstoqueLayout.setVerticalGroup(
            jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstoqueLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonListarEstoque)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneListarFrutas, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Estoque", jPanelEstoque);

        jPanelCompras.setBackground(new java.awt.Color(55, 57, 62));
        jPanelCompras.setForeground(new java.awt.Color(0, 0, 0));

        jLabelCompras.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabelCompras.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCompras.setText("Vendas");

        jSeparatorCompras.setBackground(new java.awt.Color(0, 0, 0));

        jButtonAdicionarFrutasAoCarrinho.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAdicionarFrutasAoCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdicionarFrutasAoCarrinho.setText("Adicionar Fruta(s) ao Carrinho");
        jButtonAdicionarFrutasAoCarrinho.setFocusPainted(false);
        jButtonAdicionarFrutasAoCarrinho.setFocusable(false);
        jButtonAdicionarFrutasAoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarFrutasAoCarrinhoActionPerformed(evt);
            }
        });

        jLabelNomeFrutaVendas.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelNomeFrutaVendas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeFrutaVendas.setText("Nome da fruta: ");

        jTextFieldQuantidadeFrutaVendas.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldQuantidadeFrutaVendas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldQuantidadeFrutaVendas.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeFrutaVendas.setBorder(null);

        jTextFieldNomeFrutaVendas.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldNomeFrutaVendas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNomeFrutaVendas.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeFrutaVendas.setBorder(null);

        jButtonListarCarrinhoVendas.setBackground(new java.awt.Color(0, 0, 0));
        jButtonListarCarrinhoVendas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarCarrinhoVendas.setText("Atualizar Carrinho");
        jButtonListarCarrinhoVendas.setFocusPainted(false);
        jButtonListarCarrinhoVendas.setFocusable(false);
        jButtonListarCarrinhoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCarrinhoVendasActionPerformed(evt);
            }
        });

        jLabelValorTotal.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabelValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorTotal.setText("Valor Total: ");

        jLabelValorTotalVendas.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabelValorTotalVendas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorTotalVendas.setText("        ");

        jLabelNomeFrutaVendas1.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelNomeFrutaVendas1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeFrutaVendas1.setText("Quantidade: ");

        JPanelListarCarrinho.setBackground(new java.awt.Color(33, 35, 37));
        JPanelListarCarrinho.setAutoscrolls(true);
        jScrollPaneListarCarrinho.setViewportView(JPanelListarCarrinho);

        jButtonEfetuarCompras.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEfetuarCompras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEfetuarCompras.setText("Efetuar Compra");
        jButtonEfetuarCompras.setFocusPainted(false);
        jButtonEfetuarCompras.setFocusable(false);
        jButtonEfetuarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEfetuarComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelComprasLayout = new javax.swing.GroupLayout(jPanelCompras);
        jPanelCompras.setLayout(jPanelComprasLayout);
        jPanelComprasLayout.setHorizontalGroup(
            jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelComprasLayout.createSequentialGroup()
                        .addGap(0, 244, Short.MAX_VALUE)
                        .addGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparatorCompras))
                        .addGap(249, 249, 249))
                    .addGroup(jPanelComprasLayout.createSequentialGroup()
                        .addComponent(jScrollPaneListarCarrinho)
                        .addContainerGap())
                    .addGroup(jPanelComprasLayout.createSequentialGroup()
                        .addComponent(jLabelValorTotal)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelValorTotalVendas)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanelComprasLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeFrutaVendas)
                    .addComponent(jLabelNomeFrutaVendas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelComprasLayout.createSequentialGroup()
                        .addComponent(jTextFieldNomeFrutaVendas)
                        .addGap(90, 90, 90))
                    .addGroup(jPanelComprasLayout.createSequentialGroup()
                        .addComponent(jTextFieldQuantidadeFrutaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelComprasLayout.createSequentialGroup()
                .addGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelComprasLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButtonListarCarrinhoVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEfetuarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelComprasLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jButtonAdicionarFrutasAoCarrinho)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelComprasLayout.setVerticalGroup(
            jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComprasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeFrutaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeFrutaVendas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeFrutaVendas1)
                    .addComponent(jTextFieldQuantidadeFrutaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButtonAdicionarFrutasAoCarrinho)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneListarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarCarrinhoVendas)
                    .addComponent(jButtonEfetuarCompras))
                .addGap(46, 46, 46)
                .addGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorTotal)
                    .addComponent(jLabelValorTotalVendas))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Vendas", jPanelCompras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarFrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarFrutasActionPerformed
        // Caso o dia, mes e ano estejam vazios.
        if(jTextFieldDias.getText().equals("") || jTextFieldMeses.getText().equals("") || jTextFieldAnos.getText().equals("")){
            jTextFieldDias.setText("00");
            jTextFieldMeses.setText("00");
            jTextFieldAnos.setText("00");
        }      
        try{ // Caso o usuario digite algo errado.
            // Pegando as informaçoes dos campos.
            String nome = jTextFieldNomeFruta.getText().toLowerCase();
            double valor = Double.parseDouble(jTextFieldValorFruta.getText());
            int quantidade = Integer.parseInt(jTextFieldQuantidadeFruta.getText());
            // Pegando a data e formatando.
            String tempo = jTextFieldDias.getText() + "/" + jTextFieldMeses.getText() + "/" + jTextFieldAnos.getText();
            con.inserirFrutas(nome, valor, quantidade, tempo); // Inserindo as frutas no banco de dados.
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato invalido, tente novamente.");
        }        
        // Limpando os campos da tela.
        jTextFieldNomeFruta.setText("");
        jTextFieldValorFruta.setText("");
        jTextFieldQuantidadeFruta.setText("");        
        jTextFieldDias.setText("");
        jTextFieldMeses.setText("");
        jTextFieldAnos.setText("");        
    }//GEN-LAST:event_jButtonAdicionarFrutasActionPerformed
   
    private void jButtonListarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarEstoqueActionPerformed
        preencherEstoque(JPanelListarEstoque); // Preenchendo o estoque.
    }//GEN-LAST:event_jButtonListarEstoqueActionPerformed
    
    private void jButtonAdicionarFrutasAoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarFrutasAoCarrinhoActionPerformed
        try{ // Caso o usuario digite algo inválido.
            // Pegando as informaçoes do campo.
            String nome = jTextFieldNomeFrutaVendas.getText().toLowerCase();
            int qtd = Integer.parseInt(jTextFieldQuantidadeFrutaVendas.getText());        
            // Inserindo a fruta no carrinho.
            con.inserirFrutasCarrinho(nome, qtd);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato invalido, tente novamente.");
        }        
    }//GEN-LAST:event_jButtonAdicionarFrutasAoCarrinhoActionPerformed

    private void jButtonListarCarrinhoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCarrinhoVendasActionPerformed
        // Atualizando o carrinho. 
        jLabelValorTotalVendas.setText(Double.toString(preencherCarrinho(JPanelListarCarrinho)) + " R$");
    }//GEN-LAST:event_jButtonListarCarrinhoVendasActionPerformed

    private void jButtonEfetuarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEfetuarComprasActionPerformed
        ArrayList<Frutas> frutas = con.listarCarrinho();
        for(int i = 0; i < frutas.size(); i++){ // Para cada fruta no carrinho.
            // Atualizando o Estoque subtraindo as compras efetuadas.
            con.atualizarEstoque(frutas.get(i).getQtd(), frutas.get(i).getCodigo());
        }                
        con.removerFrutasDoCarrinho(); // Removendo as frutas do carrinho.
        JOptionPane.showMessageDialog(null, "Compra Efetuada com sucesso!");
    }//GEN-LAST:event_jButtonEfetuarComprasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelListarCarrinho;
    private javax.swing.JPanel JPanelListarEstoque;
    private javax.swing.JButton jButtonAdicionarFrutas;
    private javax.swing.JButton jButtonAdicionarFrutasAoCarrinho;
    private javax.swing.JButton jButtonEfetuarCompras;
    private javax.swing.JButton jButtonListarCarrinhoVendas;
    private javax.swing.JButton jButtonListarEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelBarra2;
    private javax.swing.JLabel jLabelCompras;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelFrutas;
    private javax.swing.JLabel jLabelFrutas1;
    private javax.swing.JLabel jLabelNomeFruta;
    private javax.swing.JLabel jLabelNomeFruta1;
    private javax.swing.JLabel jLabelNomeFrutaVendas;
    private javax.swing.JLabel jLabelNomeFrutaVendas1;
    private javax.swing.JLabel jLabelQuantidadeFrutas;
    private javax.swing.JLabel jLabelTempoFruta;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JLabel jLabelValorTotalVendas;
    private javax.swing.JPanel jPanelBemVindo;
    private javax.swing.JPanel jPanelCompras;
    private javax.swing.JPanel jPanelEstoque;
    private javax.swing.JPanel jPanelFrutas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneListarCarrinho;
    private javax.swing.JScrollPane jScrollPaneListarFrutas;
    private javax.swing.JSeparator jSeparatorCompras;
    private javax.swing.JSeparator jSeparatorEstoque;
    private javax.swing.JSeparator jSeparatorFrutas;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAnos;
    private javax.swing.JTextField jTextFieldDias;
    private javax.swing.JTextField jTextFieldMeses;
    private javax.swing.JTextField jTextFieldNomeFruta;
    private javax.swing.JTextField jTextFieldNomeFrutaVendas;
    private javax.swing.JTextField jTextFieldQuantidadeFruta;
    private javax.swing.JTextField jTextFieldQuantidadeFrutaVendas;
    private javax.swing.JTextField jTextFieldValorFruta;
    // End of variables declaration//GEN-END:variables
}
