/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import static java.awt.SystemColor.text;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pcs.Usuario;

/**
 *
 * @author felipequintanilha
 */
public class TelaUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaUsuarios
     */
    public TelaUsuarios() {
        initComponents();
        this.setSize(640, 430);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(228, 220, 206));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jButton2.setText("<Nome>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButton2PropertyChange(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 120, 100, 40);

        jButton3.setBackground(new java.awt.Color(228, 220, 206));
        jButton3.setText("<Nome>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButton3PropertyChange(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(250, 180, 100, 40);

        jButton5.setBackground(new java.awt.Color(228, 220, 206));
        jButton5.setText("<Nome>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButton5PropertyChange(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(250, 240, 100, 40);

        jButton6.setBackground(new java.awt.Color(228, 220, 206));
        jButton6.setText("<Nome>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButton6PropertyChange(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(250, 300, 100, 40);

        jLabel2.setFont(new java.awt.Font("Luminari", 0, 16)); // NOI18N
        jLabel2.setText("Achou seu nome? Vamos lá!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 10, 230, 30);

        jButton1.setBackground(new java.awt.Color(228, 220, 206));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setText("<Nome>");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButton1PropertyChange(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 60, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Hansel_Gretel2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 590, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Quando o usuário clica em seu nome vai para a tela de seleção de dificuldade
        
        Dificuldade tela = new Dificuldade();
        tela.setVisible(true);
        
        // TESTE 1
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Dificuldade tela = new Dificuldade();
        tela.setVisible(true);
        // TESTE
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Dificuldade tela = new Dificuldade();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton1PropertyChange
        Usuario usuario = new Usuario();
        String con;
        try {
            con = usuario.mostrarUsersName(0, "usuarios.txt");
            jButton1.setText(con);
           
// Transforma o nome do usuário na label do botão
            
            /*Usuario usuario = new Usuario();
            String nomeusr = null;
            nomeusr = usuario.mostrarUsersName(0,"contos/capitulo1/tepatbp.txt");
            
            jButton1.setText(nomeusr);
            
            /*BufferedReader r = null;
            try {
            r = new BufferedReader(new FileReader("usuarios.txt")); //carrega o arquivo para leitura
            } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
            jButton1.setText(r.readLine()); //Lê a primeira linha do arquivo
            } catch (IOException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1PropertyChange

    private void jButton2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton2PropertyChange
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        String con;
        
        try {
            con = usuario.mostrarUsersName(1, "usuarios.txt");
            jButton2.setText(con);
            /*BufferedReader r = null;
            try {
            r = new BufferedReader(new FileReader("usuarios.txt")); //carrega o arquivo para leitura
            } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
            jButton2.setText(r.readLine()); //Lê a primeira linha do arquivo
            } catch (IOException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2PropertyChange

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Dificuldade tela = new Dificuldade();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Dificuldade tela = new Dificuldade();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton3PropertyChange
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        String con;
        
        try {
            con = usuario.mostrarUsersName(2, "usuarios.txt");
            jButton3.setText(con);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3PropertyChange

    private void jButton5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton5PropertyChange
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        String con;
        
        try {
            con = usuario.mostrarUsersName(4, "usuarios.txt");
            jButton5.setText(con);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5PropertyChange

    private void jButton6PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton6PropertyChange
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        String con;
        
        try {
            con = usuario.mostrarUsersName(5, "usuarios.txt");
            jButton6.setText(con);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6PropertyChange

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
