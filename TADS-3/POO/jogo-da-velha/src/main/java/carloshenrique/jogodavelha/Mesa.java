package carloshenrique.jogodavelha;
import java.util.Scanner;

/**** @author CarlosH ****/

public class Mesa extends javax.swing.JFrame {
    Scanner in = new Scanner(System.in);

    public Mesa() {
        initComponents();
        setVisible(true);
    }
    
    Turno turno = new Turno();
    JogoDaVelha jdv = new JogoDaVelha();

    
    private String[][] getMatriz(){ // Metodo para definir a matriz do jogo.
        String[][] matriz = new String[3][3];
        //Linha de superior.     
        matriz[0][0] = superiorEsquerdo.getText();           
        matriz[0][1]= superior.getText();
        matriz[0][2]= superiorDireito.getText();        
        //Linha do meio.
        matriz[1][0] = esquerdo.getText();
        matriz[1][1] =  meio.getText();          
        matriz[1][2] = direito.getText();
        //Linha inferior.
        matriz[2][0] = inferiorEsquerdo.getText();        
        matriz[2][1] = inferior.getText();
        matriz[2][2] = inferiorDireito.getText();        
        return matriz;
    }
            
    public void matrizEVencedor(){                
        // Definindo a nova matriz.
        jdv.setMatriz(getMatriz());
        // Procurando um vencedor.
        jdv.getVencedor();        
    }
    public String turnoEVisor(){
        String vez = turno.getTurno();
        turno.setVisor(vez);                    
        visor.setText("É a vez do "+ turno.getVisor());
        return vez;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inferiorDireito = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 90), new java.awt.Dimension(0, 90), new java.awt.Dimension(32767, 90));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 90), new java.awt.Dimension(0, 90), new java.awt.Dimension(32767, 90));
        inferiorEsquerdo = new javax.swing.JButton();
        superiorDireito = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(300, 0), new java.awt.Dimension(300, 0), new java.awt.Dimension(300, 32767));
        superior = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(300, 0), new java.awt.Dimension(300, 0), new java.awt.Dimension(300, 32767));
        meio = new javax.swing.JButton();
        inferior = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 90), new java.awt.Dimension(0, 90), new java.awt.Dimension(32767, 90));
        direito = new javax.swing.JButton();
        superiorEsquerdo = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 90), new java.awt.Dimension(0, 90), new java.awt.Dimension(32767, 90));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 90), new java.awt.Dimension(0, 90), new java.awt.Dimension(32767, 90));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 90), new java.awt.Dimension(0, 90), new java.awt.Dimension(32767, 90));
        esquerdo = new javax.swing.JButton();
        jogar = new javax.swing.JButton();
        visor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        inferiorDireito.setBackground(new java.awt.Color(239, 238, 239));
        inferiorDireito.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        inferiorDireito.setForeground(new java.awt.Color(0, 0, 0));
        inferiorDireito.setBorder(null);
        inferiorDireito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inferiorDireitoActionPerformed(evt);
            }
        });

        filler7.setBackground(new java.awt.Color(0, 0, 0));
        filler7.setOpaque(true);

        filler8.setBackground(new java.awt.Color(0, 0, 0));
        filler8.setOpaque(true);

        inferiorEsquerdo.setBackground(new java.awt.Color(239, 238, 239));
        inferiorEsquerdo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        inferiorEsquerdo.setForeground(new java.awt.Color(0, 0, 0));
        inferiorEsquerdo.setBorder(null);
        inferiorEsquerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inferiorEsquerdoActionPerformed(evt);
            }
        });

        superiorDireito.setBackground(new java.awt.Color(239, 238, 239));
        superiorDireito.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        superiorDireito.setForeground(new java.awt.Color(0, 0, 0));
        superiorDireito.setBorder(null);
        superiorDireito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superiorDireitoActionPerformed(evt);
            }
        });

        filler1.setBackground(new java.awt.Color(0, 0, 0));
        filler1.setOpaque(true);

        superior.setBackground(new java.awt.Color(239, 238, 239));
        superior.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        superior.setForeground(new java.awt.Color(0, 0, 0));
        superior.setBorder(null);
        superior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superiorActionPerformed(evt);
            }
        });

        filler2.setBackground(new java.awt.Color(0, 0, 0));
        filler2.setOpaque(true);

        meio.setBackground(new java.awt.Color(239, 238, 239));
        meio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        meio.setForeground(new java.awt.Color(0, 0, 0));
        meio.setBorder(null);
        meio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meioActionPerformed(evt);
            }
        });

        inferior.setBackground(new java.awt.Color(239, 238, 239));
        inferior.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        inferior.setForeground(new java.awt.Color(0, 0, 0));
        inferior.setBorder(null);
        inferior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inferiorActionPerformed(evt);
            }
        });

        filler3.setBackground(new java.awt.Color(0, 0, 0));
        filler3.setOpaque(true);

        direito.setBackground(new java.awt.Color(239, 238, 239));
        direito.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        direito.setForeground(new java.awt.Color(0, 0, 0));
        direito.setBorder(null);
        direito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direitoActionPerformed(evt);
            }
        });

        superiorEsquerdo.setBackground(new java.awt.Color(239, 238, 239));
        superiorEsquerdo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        superiorEsquerdo.setForeground(new java.awt.Color(0, 0, 0));
        superiorEsquerdo.setBorder(null);
        superiorEsquerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superiorEsquerdoActionPerformed(evt);
            }
        });

        filler4.setBackground(new java.awt.Color(0, 0, 0));
        filler4.setOpaque(true);

        filler6.setBackground(new java.awt.Color(0, 0, 0));
        filler6.setOpaque(true);

        filler5.setBackground(new java.awt.Color(0, 0, 0));
        filler5.setOpaque(true);

        esquerdo.setBackground(new java.awt.Color(239, 238, 239));
        esquerdo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        esquerdo.setForeground(new java.awt.Color(0, 0, 0));
        esquerdo.setBorder(null);
        esquerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esquerdoActionPerformed(evt);
            }
        });

        jogar.setBackground(new java.awt.Color(0, 0, 0));
        jogar.setForeground(new java.awt.Color(255, 255, 255));
        jogar.setText("Jogar");
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });

        visor.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        visor.setText("            ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(esquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(meio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(filler6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(direito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inferiorEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(inferior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(filler8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(inferiorDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(superiorEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(superior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(filler7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(superiorDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jogar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superiorEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superiorDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filler6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inferiorDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inferiorEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inferior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filler8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        //Resetando os campos para um novo jogo.
        superiorEsquerdo.setText("");
        superior.setText("");
        superiorDireito.setText("");
        esquerdo.setText("");
        meio.setText("");
        direito.setText("");        
        inferiorEsquerdo.setText("");
        inferior.setText("");
        inferiorDireito.setText("");  
        
        visor.setText("É a vez do X");
        
        // Resetando a jogada.
        turno.setTurno(0);
        
    }//GEN-LAST:event_jogarActionPerformed

    private void superiorEsquerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superiorEsquerdoActionPerformed
        if("".equals(superiorEsquerdo.getText())){
            superiorEsquerdo.setText(turnoEVisor());
        }
        matrizEVencedor();
    }//GEN-LAST:event_superiorEsquerdoActionPerformed

    private void superiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superiorActionPerformed
        if("".equals(superior.getText())){
            superior.setText(turnoEVisor());
        }
        matrizEVencedor();  
    }//GEN-LAST:event_superiorActionPerformed

    private void superiorDireitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superiorDireitoActionPerformed
        if("".equals(superiorDireito.getText())){
            superiorDireito.setText(turnoEVisor());
        }
        matrizEVencedor();
    }//GEN-LAST:event_superiorDireitoActionPerformed

    private void esquerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esquerdoActionPerformed
        if("".equals(esquerdo.getText())){
            esquerdo.setText(turnoEVisor());
        }
        matrizEVencedor();
    }//GEN-LAST:event_esquerdoActionPerformed

    private void meioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meioActionPerformed
        if("".equals(meio.getText())){
            meio.setText(turnoEVisor());
        }
        matrizEVencedor();
    }//GEN-LAST:event_meioActionPerformed

    private void direitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direitoActionPerformed
        if("".equals(direito.getText())){
            direito.setText(turnoEVisor());
        }
        matrizEVencedor();
    }//GEN-LAST:event_direitoActionPerformed

    private void inferiorEsquerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inferiorEsquerdoActionPerformed
        if("".equals(inferiorEsquerdo.getText())){
            inferiorEsquerdo.setText(turnoEVisor());
        }
        matrizEVencedor();
    }//GEN-LAST:event_inferiorEsquerdoActionPerformed

    private void inferiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inferiorActionPerformed
        if("".equals(inferior.getText())){
            inferior.setText(turnoEVisor());
        }
        matrizEVencedor();
        
        
    }//GEN-LAST:event_inferiorActionPerformed

    private void inferiorDireitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inferiorDireitoActionPerformed
         if("".equals(inferiorDireito.getText())){
            inferiorDireito.setText(turnoEVisor());
        }  
        matrizEVencedor();   
    }//GEN-LAST:event_inferiorDireitoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton direito;
    private javax.swing.JButton esquerdo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JButton inferior;
    private javax.swing.JButton inferiorDireito;
    private javax.swing.JButton inferiorEsquerdo;
    private javax.swing.JButton jogar;
    private javax.swing.JButton meio;
    private javax.swing.JButton superior;
    private javax.swing.JButton superiorDireito;
    private javax.swing.JButton superiorEsquerdo;
    private javax.swing.JLabel visor;
    // End of variables declaration//GEN-END:variables
}
