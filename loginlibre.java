/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdlibreria;

import controladror.conexionlibre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class loginlibre extends javax.swing.JFrame {

    conexionlibre con=new conexionlibre();
    Connection cnn=con.Conexionlibredb();
    public loginlibre() {
        initComponents();
    }
    public void validausuario(String us,String cla){
     PreparedStatement op=null;
        ResultSet rs=null;
        try{
        op=cnn.prepareStatement("SELECT *FROM Tbcliente WHERE cli_nom='"+us+"'AND clave ='"+cla+"'");
        rs=op.executeQuery();
        if(rs.next()){  
          tbcliente ca=new tbcliente();
          ca.setVisible(true);
          dispose();
        }
       else{
          JOptionPane.showMessageDialog(null,"Datos no Validos"); 
           }
           
        } catch (Exception e) {
         System.out.print("Error"+e);
        }
        
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usu = new javax.swing.JTextField();
        contra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("INGRESO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 290, 110, 56);

        jLabel1.setText("ACCESO AL SISTEMA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(162, 41, 160, 47);

        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(83, 97, 70, 14);

        jLabel3.setText("CLAVE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 180, 50, 14);
        getContentPane().add(usu);
        usu.setBounds(191, 94, 123, 20);
        getContentPane().add(contra);
        contra.setBounds(190, 180, 123, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaper_roto2[1].jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 510, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String u,c;
     u=usu.getText();
       c=contra.getText();
        validausuario(u, c); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(loginlibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginlibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginlibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginlibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginlibre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField usu;
    // End of variables declaration//GEN-END:variables
}
