
package LOGIN_MAVEN;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;




public class PRINCIPAL2 extends javax.swing.JFrame {

    
    public PRINCIPAL2() {
        initComponents();
       
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tipo = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 384, -1, -1));

        btnUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar_user.png"))); // NOI18N
        btnUsuarios.setText("Trabajadores");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.setFocusable(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jPanel2.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 857, 246, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Imagen de WhatsApp 2024-04-18 a las 13.20.54_fa9d7163_1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 20, 250, 237));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 100, 39));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sucursal");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Punta Cana");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 240, 750));

        jLabel3.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Relajacion y lujo en un mismo lugar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 620, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/hotel.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 700));

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/spamodeli.png"))); // NOI18N
        jMenu5.setText("SPA");

        jMenuItem7.setText("RESERVACION");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar2.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/hotelbotoncito-removebg-preview.png"))); // NOI18N
        jMenu6.setText("HOTEL");

        jMenuItem9.setText("RESERVACION");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem9MouseClicked(evt);
            }
        });
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem2.setText("AGREGAR HABITACION");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuBar2.add(jMenu6);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/emploderi.png"))); // NOI18N
        jMenu9.setText("EMPLEADOS");

        jMenuItem8.setText("AGREGAR EMPLEADOS");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem8);

        jMenuBar2.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logotablas.png"))); // NOI18N
        jMenu10.setText("TABLAS");

        jMenuItem10.setText("SPA");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem10);

        jMenuItem13.setText("HABITACIONES");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem13);

        jMenuItem14.setText("EMPLEADOS");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem14);

        jMenuItem15.setText("HOTEL");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem15);

        jMenuBar2.add(jMenu10);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/config-removebg-preview.png"))); // NOI18N
        jMenu7.setText("CONFIGURACION");

        jMenuItem11.setText("CONFIGURACION");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuItem1.setText("AYUDA");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuBar2.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salio.png"))); // NOI18N
        jMenu8.setText("CERRAR SECCION");

        jMenuItem12.setText("SALIR");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem12);

        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JFrame frame = new JFrame("Nuevo Panel");

        // Crea una instancia del nuevo panel INTERIOR_RESERVA
        RESERVA_SPA newPanel = new RESERVA_SPA
        ();

        // Agrega el nuevo panel al contenido del marco
        frame.getContentPane().add(newPanel);

        // Configura el tamaño del marco para que se ajuste al contenido
        frame.pack();

        // Hacer visible el marco
        frame.setVisible(true);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MouseClicked

    }//GEN-LAST:event_jMenuItem9MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JFrame frame = new JFrame("Nuevo Panel");

        // Crea una instancia del nuevo panel INTERIOR_RESERVA
        RESERVA_HOTEL newPanel = new RESERVA_HOTEL ();

        // Agrega el nuevo panel al contenido del marco
        frame.getContentPane().add(newPanel);

        // Configura el tamaño del marco para que se ajuste al contenido
        frame.pack();

        // Hacer visible el marco
        frame.setVisible(true);

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFrame frame = new JFrame("Nuevo Panel");

        // Crea una instancia del nuevo panel INTERIOR_RESERVA
        AGREGAR_HABITACION newPanel = new AGREGAR_HABITACION ();

        // Agrega el nuevo panel al contenido del marco
        frame.getContentPane().add(newPanel);

        // Configura el tamaño del marco para que se ajuste al contenido
        frame.pack();

        // Hacer visible el marco
        frame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        JFrame frame = new JFrame("Nuevo Panel");

        // Crea una instancia del nuevo panel INTERIOR_RESERVA
        EMPLEADOS  newPanel = new EMPLEADOS ();

        // Agrega el nuevo panel al contenido del marco
        frame.getContentPane().add(newPanel);

        // Configura el tamaño del marco para que se ajuste al contenido
        frame.pack();

        // Hacer visible el marco
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
         // Abrir el JFrame llamado REGISTRO
     CONFIG registroFrame = new CONFIG();
    registroFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
        Desktop desktop = Desktop.getDesktop();
        URI uri = new URI("https://playaparaisohotelspa.000webhostapp.com/");
        desktop.browse(uri);
    } catch (IOException | URISyntaxException e) {
        JOptionPane.showMessageDialog(this, "No se pudo abrir el enlace, por favor verifique la URL y su conexión a internet.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        JFrame frame = new JFrame("Nuevo Panel");

        // Crea una instancia del nuevo panel INTERIOR_RESERVA
        VER_RESERVACIONES_SPA  newPanel = new VER_RESERVACIONES_SPA
        ();

        // Agrega el nuevo panel al contenido del marco
        frame.getContentPane().add(newPanel);

        // Configura el tamaño del marco para que se ajuste al contenido
        frame.pack();

        // Hacer visible el marco
        frame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        JFrame frame = new JFrame("Nuevo Panel");

        // Crea una instancia del nuevo panel INTERIOR_RESERVA
        VER_AGREGAR_HABITACIONES  newPanel = new VER_AGREGAR_HABITACIONES
        ();

        // Agrega el nuevo panel al contenido del marco
        frame.getContentPane().add(newPanel);

        // Configura el tamaño del marco para que se ajuste al contenido
        frame.pack();

        // Hacer visible el marco
        frame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        JFrame frame = new JFrame("Nuevo Panel");

        // Crea una instancia del nuevo panel INTERIOR_RESERVA
        VER_EMPLEADOS  newPanel = new VER_EMPLEADOS
        ();

        // Agrega el nuevo panel al contenido del marco
        frame.getContentPane().add(newPanel);

        // Configura el tamaño del marco para que se ajuste al contenido
        frame.pack();

        // Hacer visible el marco
        frame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        JFrame frame = new JFrame("Nuevo Panel");

        // Crea una instancia del nuevo panel INTERIOR_RESERVA
        VER_RESERVACIONES_HOTEL newPanel = new VER_RESERVACIONES_HOTEL
        ();

        // Agrega el nuevo panel al contenido del marco
        frame.getContentPane().add(newPanel);

        // Configura el tamaño del marco para que se ajuste al contenido
        frame.pack();

        // Hacer visible el marco
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    
    
  
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
            java.util.logging.Logger.getLogger(PRINCIPAL0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

     
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new PRINCIPAL0().setVisible(true);


            
             }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
}
