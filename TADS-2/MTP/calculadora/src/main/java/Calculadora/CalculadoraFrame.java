/*
 * @author CarlosNeto
 */
package Calculadora;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CalculadoraFrame extends JFrame {
    public CalculadoraFrame() {
        super("Calculadora!");
        initComponents();
        setVisible(true);
    }
    CalculadoraMain cm = new CalculadoraMain();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextFieldVisor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonSomar = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButtonFatorial = new javax.swing.JButton();
        jButtonRaizQuadrada = new javax.swing.JButton();
        jButtonRaizCubica = new javax.swing.JButton();
        jButtonPotencia = new javax.swing.JButton();
        jButtonParentesesEsquerda = new javax.swing.JButton();
        jButtonParentesesDireita = new javax.swing.JButton();
        jButtonCalcular = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneHistorico = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jTextFieldVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVisorActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonInfo.setBackground(new java.awt.Color(0, 0, 0));
        jButtonInfo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInfo.setText("INFO");
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });

        jButton0.setBackground(new java.awt.Color(0, 0, 0));
        jButton0.setForeground(new java.awt.Color(255, 255, 255));
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonPonto.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPonto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPonto.setText(".");
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });

        jButtonApagar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonApagar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApagar.setText("<");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonSomar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSomar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSomar.setText("+");
        jButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomarActionPerformed(evt);
            }
        });

        jButtonSubtrair.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSubtrair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSubtrair.setText("-");
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonDividir.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDividir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDividir.setText("/");
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        jButtonFatorial.setBackground(new java.awt.Color(102, 102, 102));
        jButtonFatorial.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFatorial.setText("!");
        jButtonFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFatorialActionPerformed(evt);
            }
        });

        jButtonRaizQuadrada.setBackground(new java.awt.Color(102, 102, 102));
        jButtonRaizQuadrada.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRaizQuadrada.setText("sqrt()");
        jButtonRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizQuadradaActionPerformed(evt);
            }
        });

        jButtonRaizCubica.setBackground(new java.awt.Color(102, 102, 102));
        jButtonRaizCubica.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRaizCubica.setText("cbrt()");
        jButtonRaizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizCubicaActionPerformed(evt);
            }
        });

        jButtonPotencia.setBackground(new java.awt.Color(102, 102, 102));
        jButtonPotencia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPotencia.setText("^");
        jButtonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotenciaActionPerformed(evt);
            }
        });

        jButtonParentesesEsquerda.setBackground(new java.awt.Color(0, 0, 0));
        jButtonParentesesEsquerda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonParentesesEsquerda.setText("(");
        jButtonParentesesEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParentesesEsquerdaActionPerformed(evt);
            }
        });

        jButtonParentesesDireita.setBackground(new java.awt.Color(0, 0, 0));
        jButtonParentesesDireita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonParentesesDireita.setText(")");
        jButtonParentesesDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParentesesDireitaActionPerformed(evt);
            }
        });

        jButtonCalcular.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalcular.setText("Calcular!");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jTextPaneHistorico.setEditable(false);
        jTextPaneHistorico.setBackground(new java.awt.Color(102, 102, 102));
        jTextPaneHistorico.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTextPaneHistorico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonFatorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonPotencia))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSubtrair)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonMultiplicar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDividir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonParentesesEsquerda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonParentesesDireita))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton7)
                                        .addComponent(jButton4)
                                        .addComponent(jButton1))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton8)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton9))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton5)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton6))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton0)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonPonto)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonApagar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonRaizQuadrada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRaizCubica))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCalcular)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLimpar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonInfo)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSomar)
                            .addComponent(jButtonSubtrair)
                            .addComponent(jButtonMultiplicar)
                            .addComponent(jButtonDividir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonFatorial)
                            .addComponent(jButtonPotencia)
                            .addComponent(jButtonParentesesEsquerda)
                            .addComponent(jButtonParentesesDireita))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRaizQuadrada)
                            .addComponent(jButtonRaizCubica))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton0)
                            .addComponent(jButtonPonto)
                            .addComponent(jButtonApagar)))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalcular)
                    .addComponent(jButtonInfo)
                    .addComponent(jButtonLimpar))
                .addGap(18, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jTextFieldVisorActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButton1.getText());
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButton2.getText());
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButton3.getText());
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButton4.getText());
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButton5.getText());
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButton6.getText());
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButton7.getText());
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButton8.getText());
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButton9.getText());
    }                                        

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButton0.getText());
    }                                        

    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButtonPonto.getText());
    }                                            

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        StringBuilder deleted = new StringBuilder(jTextFieldVisor.getText());
        deleted.deleteCharAt(deleted.length() - 1);
        jTextFieldVisor.setText(deleted.toString());
    }                                             

    private void jButtonRaizCubicaActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        jTextFieldVisor.setText("cbrt(" + jTextFieldVisor.getText() + ")");
    }                                                 

    private void jButtonRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        jTextFieldVisor.setText("sqrt(" + jTextFieldVisor.getText() + ")");
    }                                                   

    private void jButtonFatorialActionPerformed(java.awt.event.ActionEvent evt) {                                                
        jTextFieldVisor.setText(jButtonFatorial.getText() + jTextFieldVisor.getText());
    }                                               

    private void jButtonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButtonPotencia.getText());
    }                                               

    private void jButtonParentesesEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButtonParentesesEsquerda.getText());
    }                                                         

    private void jButtonParentesesDireitaActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButtonParentesesDireita.getText());
    }                                                        

    private void jButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButtonSomar.getText());
    }                                            

    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {                                                
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButtonSubtrair.getText());
    }                                               

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButtonMultiplicar.getText());
    }                                                  

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {                                               
        jTextFieldVisor.setText(jTextFieldVisor.getText() + jButtonDividir.getText());
    }                                              

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        JOptionPane.showMessageDialog(null, "Bem Vindo-a á nossa Calculadora! \n\n "
                + "nela Você pode fazer todo tipo de cálculo digitando manualmente ou simplesmente apertando os botões\n"
                + "Á direita temos o campo de Histótico de calculos\n"
                + "Nesta bela Calculadora você pode fazer as seguintes operações:\n\n"
                + "(+). Soma\n"
                + "(-). Subtração\n"
                + "(*). Multiplicação\n"
                + "(/). Divisão\n"
                + "(^). Potência\n"
                + "(!). Fatorial\n"
                + "(sqrt()). Raiz Quadrada\n"
                + "(cbrt()). Raiz Cúbica\n\n"
                + "Como o criador é preguiçoso, não terminou de implementar os parênteses e mais de uma operação por cálculo.\n"
                + "Portanto NÃO as use ou a calculadora apresentará ERRO.\n\n\n\n"
                + "===========================================@authorCarlosNeto=================================================");
    }                                           
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                                
        String str = jTextFieldVisor.getText();
        try{
        if(str.contains("*")){
            cm.setNum1(Double.parseDouble(str.subSequence(0, str.indexOf("*")).toString()));
            cm.setNum2(Double.parseDouble(str.substring(str.indexOf("*")+1)));
            res = cm.getMul();
            
        }else if(str.contains("/")){
            cm.setNum1(Double.parseDouble(str.subSequence(0, str.indexOf("/")).toString()));
            cm.setNum2(Double.parseDouble(str.substring(str.indexOf("/")+1)));
            res = cm.getDiv();
            
        }else if(str.contains("+")){
            cm.setNum1(Double.parseDouble(str.subSequence(0, str.indexOf("+")).toString()));
            cm.setNum2(Double.parseDouble(str.substring(str.indexOf("+")+1)));
            res = cm.getSum();
            
        }else if(str.contains("^")){
            cm.setNum1(Double.parseDouble(str.subSequence(0, str.indexOf("^")).toString()));
            cm.setNum2(Double.parseDouble(str.substring(str.indexOf("^")+1)));
            res = cm.getPot();
            
        }else if(str.contains("sqrt(")){
            cm.setNum(Double.parseDouble(str.subSequence(str.indexOf("(")+1, str.indexOf(")")).toString()));
            res = cm.getSqrt();
            
        }else if(str.contains("cbrt(")){
            cm.setNum(Double.parseDouble(str.subSequence(str.indexOf("(")+1, str.indexOf(")")).toString()));
            res = cm.getCbrt();
            
        }else if(str.contains("!")){
            cm.setNum(Double.parseDouble(str.substring(str.indexOf("!")+1)));
            res = cm.getFat();
            cm.f = 1;
            
        }else if(str.contains("-")){
            if(str.startsWith("-")){
                String[] menos = str.split("-");
                cm.setNum1(Double.parseDouble(menos[1])*-1);
                cm.setNum2(Double.parseDouble(menos[2]));
            }else{
                cm.setNum1(Double.parseDouble(str.subSequence(0, str.indexOf("-")).toString()));
                cm.setNum2(Double.parseDouble(str.substring(str.indexOf("-")+1)));
            }
            res = cm.getSub();
        }
        his = his + "\n" + str + " = " + res;
        jTextPaneHistorico.setText(his);
        jTextFieldVisor.setText(res.toString());
        }catch(NumberFormatException | NullPointerException e){
            jTextFieldVisor.setText("Erro, Digite Um número ou Formato Válido.");
        }
        }                                               
    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {                                              
        jTextFieldVisor.setText("");
    }                                             
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonFatorial;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonParentesesDireita;
    private javax.swing.JButton jButtonParentesesEsquerda;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JButton jButtonPotencia;
    private javax.swing.JButton jButtonRaizCubica;
    private javax.swing.JButton jButtonRaizQuadrada;
    private javax.swing.JButton jButtonSomar;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldVisor;
    private javax.swing.JTextPane jTextPaneHistorico;
    // End of variables declaration                   
    private Double res;
    private String his = "Histórico";
}