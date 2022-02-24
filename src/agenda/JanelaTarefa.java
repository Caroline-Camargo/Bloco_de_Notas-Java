package agenda;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Component;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JanelaTarefa extends javax.swing.JFrame {

    double tarefa;
    boolean editar = false;
    boolean parar = true;
    boolean f = false;
    String digitado;
    int i = 1;
    String CorAntes = "";

    public JanelaTarefa() {
        initComponents();
        caixadescriçao.setEditable(editar);
        caixadetextonome.setEditable(parar);
        caixadescriçao1.setEditable(f);
        getContentPane().setBackground(Color.white);
        caixadescriçao.setText("1. ");
    }
    
    public String TesteCor (){
        String cor = " ";
        
            cor = "black";
        
        return cor;
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel3 = new javax.swing.JPanel();
        painelcomguias = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        caixadetextonome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botaolimpar = new javax.swing.JButton();
        testao = new javax.swing.JScrollPane();
        caixadescriçao = new javax.swing.JTextArea();
        botaoexcluir = new javax.swing.JButton();
        botaoeditar = new javax.swing.JButton();
        botaosalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botaosair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        testao1 = new javax.swing.JScrollPane();
        caixadescriçao1 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        op1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        op2 = new javax.swing.JComboBox<>();
        redefinir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        op3 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BLOCO DE NOTAS");
        setBackground(new java.awt.Color(204, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        painelcomguias.setBackground(new java.awt.Color(255, 255, 255));
        painelcomguias.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);
        jPanel5.add(jLabel3);
        jLabel3.setBounds(60, 90, 0, 0);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("BLOCO DE NOTAS");
        jPanel1.add(jLabel2);

        jPanel5.add(jPanel1);
        jPanel1.setBounds(150, 30, 320, 50);

        caixadetextonome.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        caixadetextonome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixadetextonomeActionPerformed(evt);
            }
        });
        jPanel5.add(caixadetextonome);
        caixadetextonome.setBounds(200, 110, 220, 50);

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("ADICIONAR NOTA:");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(40, 130, 138, 18);

        botaolimpar.setBackground(new java.awt.Color(204, 0, 0));
        botaolimpar.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        botaolimpar.setForeground(new java.awt.Color(255, 255, 255));
        botaolimpar.setText("LIMPAR");
        botaolimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaolimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaolimparMouseExited(evt);
            }
        });
        botaolimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaolimparActionPerformed(evt);
            }
        });
        jPanel5.add(botaolimpar);
        botaolimpar.setBounds(470, 120, 120, 35);

        caixadescriçao.setColumns(20);
        caixadescriçao.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        caixadescriçao.setForeground(new java.awt.Color(0, 102, 51));
        caixadescriçao.setRows(5);
        testao.setViewportView(caixadescriçao);

        jPanel5.add(testao);
        testao.setBounds(50, 210, 380, 190);

        botaoexcluir.setBackground(new java.awt.Color(255, 0, 0));
        botaoexcluir.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        botaoexcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoexcluir.setText("EXCLUIR ");
        botaoexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoexcluirActionPerformed(evt);
            }
        });
        jPanel5.add(botaoexcluir);
        botaoexcluir.setBounds(470, 290, 120, 34);

        botaoeditar.setBackground(new java.awt.Color(255, 0, 0));
        botaoeditar.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        botaoeditar.setForeground(new java.awt.Color(255, 255, 255));
        botaoeditar.setText("EDITAR");
        botaoeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoeditarActionPerformed(evt);
            }
        });
        jPanel5.add(botaoeditar);
        botaoeditar.setBounds(470, 210, 120, 34);

        botaosalvar.setBackground(new java.awt.Color(255, 0, 0));
        botaosalvar.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        botaosalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaosalvar.setText("SALVAR ");
        botaosalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosalvarActionPerformed(evt);
            }
        });
        jPanel5.add(botaosalvar);
        botaosalvar.setBounds(470, 250, 120, 34);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "                       NOTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Swis721 BlkEx BT", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));
        jPanel5.add(jPanel2);
        jPanel2.setBounds(50, 190, 380, 210);

        botaosair.setBackground(new java.awt.Color(255, 0, 0));
        botaosair.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        botaosair.setForeground(new java.awt.Color(255, 255, 255));
        botaosair.setText("SAIR");
        botaosair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosairActionPerformed(evt);
            }
        });
        jPanel5.add(botaosair);
        botaosair.setBounds(470, 330, 120, 34);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jPanel4);
        jPanel4.setBounds(460, 190, 140, 190);

        painelcomguias.addTab("Aba Principal", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        testao1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));

        caixadescriçao1.setColumns(20);
        caixadescriçao1.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        caixadescriçao1.setForeground(new java.awt.Color(0, 102, 0));
        caixadescriçao1.setRows(5);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, caixadescriçao, org.jdesktop.beansbinding.ELProperty.create("${text}"), caixadescriçao1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        testao1.setViewportView(caixadescriçao1);

        jPanel7.add(testao1);
        testao1.setBounds(50, 110, 530, 300);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("BLOCO DE NOTAS");
        jPanel8.add(jLabel4);

        jPanel7.add(jPanel8);
        jPanel8.setBounds(150, 30, 320, 50);

        painelcomguias.addTab("Visualisar notas", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        op1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vermelho", "azul", "preto", "rosa", "verde" }));
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });
        jPanel9.add(op1);
        op1.setBounds(50, 70, 90, 30);

        jLabel5.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("COR DE FUNDO:");
        jPanel9.add(jLabel5);
        jLabel5.setBounds(50, 230, 220, 40);

        jLabel6.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("COR DOS BOTÕES:");
        jPanel9.add(jLabel6);
        jLabel6.setBounds(50, 30, 220, 40);

        op2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vermelho", "azul", "preto", "rosa", "verde" }));
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });
        jPanel9.add(op2);
        op2.setBounds(50, 170, 90, 30);

        redefinir.setBackground(new java.awt.Color(204, 0, 0));
        redefinir.setFont(new java.awt.Font("Swis721 Blk BT", 0, 12)); // NOI18N
        redefinir.setForeground(new java.awt.Color(255, 255, 255));
        redefinir.setText("REDEFINIR CONFIGURAÇÕES");
        redefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redefinirActionPerformed(evt);
            }
        });
        jPanel9.add(redefinir);
        redefinir.setBounds(210, 340, 220, 40);

        jLabel7.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("COR DAS NOTAS:");
        jPanel9.add(jLabel7);
        jLabel7.setBounds(50, 130, 220, 40);

        op3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vermelho", "azul", "preto", "rosa", "verde", "branco" }));
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });
        jPanel9.add(op3);
        op3.setBounds(50, 270, 90, 30);

        painelcomguias.addTab("Editar Layout", jPanel9);

        getContentPane().add(painelcomguias);
        painelcomguias.setBounds(20, 20, 630, 470);
        getContentPane().add(jPanel6);
        jPanel6.setBounds(60, -40, 10, 10);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(669, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaosairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosairActionPerformed
        JOptionPane.showMessageDialog(null, "Obrigado por utilizar !!! \nVolte Sempre...");
        System.exit(0);
    }//GEN-LAST:event_botaosairActionPerformed

    private void botaosalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosalvarActionPerformed
        editar = false;  
        parar = true;   
        caixadescriçao.setEditable(editar); 
        caixadetextonome.setEditable(parar);
    }//GEN-LAST:event_botaosalvarActionPerformed

    private void botaoeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoeditarActionPerformed
        editar = true;
        parar = false;
        caixadescriçao.setEditable(editar); 
        caixadetextonome.setEditable(parar);
    }//GEN-LAST:event_botaoeditarActionPerformed

    private void botaoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexcluirActionPerformed
        caixadescriçao.setText(" ");
        i = 1;
    }//GEN-LAST:event_botaoexcluirActionPerformed

    private void caixadetextonomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixadetextonomeActionPerformed
        if (i == 1) {
            caixadescriçao.setText("1. ");
        }
        digitado = "";
        String nome = caixadetextonome.getText(); //lê e grava em uma variável temporária o que é digitado em 
        i = i + 1;
        digitado += (nome + "\n" + i + ". ");
        caixadescriçao.append(digitado);
    }//GEN-LAST:event_caixadetextonomeActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        if (op1.getSelectedItem() == "vermelho" ){
            botaolimpar.setBackground(Color.red);
            botaoeditar.setBackground(Color.red);
            botaosalvar.setBackground(Color.red);
            botaoexcluir.setBackground(Color.red);
            botaosair.setBackground(Color.red);
            redefinir.setBackground(Color.red);
        }
       
        if (op1.getSelectedItem() == "azul" ){
            botaolimpar.setBackground(Color.blue);
            botaoeditar.setBackground(Color.blue);
            botaosalvar.setBackground(Color.blue);
            botaoexcluir.setBackground(Color.blue);
            botaosair.setBackground(Color.blue);
            redefinir.setBackground(Color.blue);
        }
        
        if (op1.getSelectedItem() == "preto" ){
            botaolimpar.setBackground(Color.black);
            botaoeditar.setBackground(Color.black);
            botaosalvar.setBackground(Color.black);
            botaoexcluir.setBackground(Color.black);
            botaosair.setBackground(Color.black);
            redefinir.setBackground(Color.black);
        }
       
        if (op1.getSelectedItem() == "rosa" ){
            botaolimpar.setBackground(Color.magenta);
            botaoeditar.setBackground(Color.magenta);
            botaosalvar.setBackground(Color.magenta);
            botaoexcluir.setBackground(Color.magenta);
            botaosair.setBackground(Color.magenta);
            redefinir.setBackground(Color.magenta);
        }
        
        if (op1.getSelectedItem() == "verde" ){
            botaolimpar.setBackground(Color.green);
            botaoeditar.setBackground(Color.green);
            botaosalvar.setBackground(Color.green);
            botaoexcluir.setBackground(Color.green);
            botaosair.setBackground(Color.green);
            redefinir.setBackground(Color.green);
        }
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        if (op2.getSelectedItem() == "vermelho" ){
            caixadescriçao.setForeground(Color.red);
            caixadescriçao1.setForeground(Color.red);
        }
       
        if (op2.getSelectedItem() == "azul" ){
            caixadescriçao.setForeground(Color.blue);
            caixadescriçao1.setForeground(Color.blue);
        }
        
        if (op2.getSelectedItem() == "preto" ){
            caixadescriçao.setForeground(Color.black);
            caixadescriçao1.setForeground(Color.black);
        }
       
        if (op2.getSelectedItem() == "rosa" ){
            caixadescriçao.setForeground(Color.magenta);
            caixadescriçao1.setForeground(Color.magenta);
        }
        
        if (op2.getSelectedItem() == "verde" ){
            caixadescriçao.setForeground(Color.green);
            caixadescriçao1.setForeground(Color.green);
        }
    }//GEN-LAST:event_op2ActionPerformed

    private void redefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redefinirActionPerformed
        botaolimpar.setBackground(new Color(205,0,0));
        botaoeditar.setBackground(new Color(205,0,0));
        botaosalvar.setBackground(new Color(205,0,0));
        botaoexcluir.setBackground(new Color(205,0,0));
        botaosair.setBackground(new Color(205,0,0));
        caixadescriçao.setForeground(new Color(0,102,51));
        caixadescriçao1.setForeground(new Color(0,102,51));
        redefinir.setBackground(new Color(205,0,0));
        getContentPane().setBackground(Color.white);
        
    }//GEN-LAST:event_redefinirActionPerformed

    private void botaolimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolimparActionPerformed
        caixadetextonome.setText(" ");
    }//GEN-LAST:event_botaolimparActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        if (op3.getSelectedItem() == "vermelho" ){
            getContentPane().setBackground(Color.red);
        }
       
        if (op3.getSelectedItem() == "azul" ){
            getContentPane().setBackground(Color.blue);
        }
        
        if (op3.getSelectedItem() == "preto" ){
            getContentPane().setBackground(Color.black);
        }
       
        if (op3.getSelectedItem() == "rosa" ){
            getContentPane().setBackground(Color.pink);
        }
        
        if (op3.getSelectedItem() == "verde" ){
            getContentPane().setBackground(Color.green);
        }
        
        if (op3.getSelectedItem() == "branco" ){
            getContentPane().setBackground(Color.white);
        }
    }//GEN-LAST:event_op3ActionPerformed

    private void botaolimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaolimparMouseEntered

        CorAntes = TesteCor();
        botaolimpar.setBackground(Color.gray);
    }//GEN-LAST:event_botaolimparMouseEntered

    private void botaolimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaolimparMouseExited
        
        botaolimpar.setBackground(Color.getColor(CorAntes));
    }//GEN-LAST:event_botaolimparMouseExited

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaTarefa().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoeditar;
    private javax.swing.JButton botaoexcluir;
    private javax.swing.JButton botaolimpar;
    private javax.swing.JButton botaosair;
    private javax.swing.JButton botaosalvar;
    private javax.swing.JTextArea caixadescriçao;
    private javax.swing.JTextArea caixadescriçao1;
    private javax.swing.JTextField caixadetextonome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> op1;
    private javax.swing.JComboBox<String> op2;
    private javax.swing.JComboBox<String> op3;
    private javax.swing.JTabbedPane painelcomguias;
    private javax.swing.JButton redefinir;
    private javax.swing.JScrollPane testao;
    private javax.swing.JScrollPane testao1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
