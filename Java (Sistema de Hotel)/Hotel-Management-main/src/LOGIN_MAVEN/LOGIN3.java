
package LOGIN_MAVEN;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class LOGIN3 extends javax.swing.JFrame {

    
     String url = "jdbc:sqlserver://DESKTOP-KOKC65M:1433;" +
    "databaseName=PPHS_San_Cristobal;" +
    "encrypt=true;" + // Habilitar el cifrado
    "trustServerCertificate=true;" + // No confiar automáticamente en el certificado
    "trustStore=storeName;" + // Nombre del almacén de confianza
    "trustStorePassword=storePassword;" + // Contraseña del almacén de confianza
    "hostNameInCertificate=hostName"; // Nombre del host en el certificado

// Credenciales de inicio de sesión de SQL Server
String usuarioSQL = "Efren";
String contraseñaSQL = "12345678";

    
   
    public LOGIN3() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mover = new javax.swing.JPanel();
        panelp = new javax.swing.JPanel();
        X1 = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        inicio1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usuario1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ususu = new javax.swing.JTextField();
        ususu1 = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        boton = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        contraseña1 = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        contraseña2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        mover.setBackground(new java.awt.Color(255, 255, 255));
        mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moverMouseDragged(evt);
            }
        });
        mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moverMousePressed(evt);
            }
        });

        panelp.setBackground(new java.awt.Color(255, 255, 255));
        panelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelpMouseExited(evt);
            }
        });

        X1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        X1.setText("X");
        X1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                X1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                X1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelpLayout = new javax.swing.GroupLayout(panelp);
        panelp.setLayout(panelpLayout);
        panelpLayout.setHorizontalGroup(
            panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(X1)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelpLayout.setVerticalGroup(
            panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(X1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout moverLayout = new javax.swing.GroupLayout(mover);
        mover.setLayout(moverLayout);
        moverLayout.setHorizontalGroup(
            moverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moverLayout.createSequentialGroup()
                .addComponent(panelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 666, Short.MAX_VALUE))
        );
        moverLayout.setVerticalGroup(
            moverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        inicio.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        inicio.setForeground(new java.awt.Color(0, 0, 0));
        inicio.setText("INICIAR SESION");

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("USUARIO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inicio1.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        inicio1.setForeground(new java.awt.Color(255, 255, 255));
        inicio1.setText("INICIAR SESION");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/hotellogin.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 170));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario1.setForeground(new java.awt.Color(255, 255, 255));
        usuario1.setText("USUARIO");
        jPanel1.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No tienes una cuenta?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 130, 30));

        ususu.setBackground(new java.awt.Color(255, 255, 255));
        ususu.setText("Ingresa el usuario");
        ususu.setBorder(null);
        ususu.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(ususu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, 20));

        ususu1.setBackground(new java.awt.Color(255, 255, 255));
        ususu1.setText(" Ingrese el correo");
        ususu1.setBorder(null);
        ususu1.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(ususu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 20));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setText(" ******");
        pass.setBorder(null);
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, 20));

        boton.setBackground(new java.awt.Color(0, 0, 0));
        boton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 255, 255));
        boton.setText("REGISTRO");
        jPanel1.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 100, 30));

        boton1.setBackground(new java.awt.Color(0, 0, 0));
        boton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("INGRESAR");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel1.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, 30));

        contraseña1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña1.setForeground(new java.awt.Color(255, 255, 255));
        contraseña1.setText("CORREO ELECTRONICO");
        jPanel1.add(contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        contraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("ID ADMIN");
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 210, 210));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puerto Plata", "Zamana", "Barahona", "San Cristobal", "Punta Cana", " ", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 110, -1));

        contraseña2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña2.setForeground(new java.awt.Color(255, 255, 255));
        contraseña2.setText("CONTRASEÑA");
        jPanel1.add(contraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Solo si eres administrador");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(inicio1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void X1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_X1MouseClicked

    private void X1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X1MouseEntered

    }//GEN-LAST:event_X1MouseEntered

    private void panelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelpMouseEntered
        panelp.setBackground(Color.RED);
        X1.setForeground(Color.white);
    }//GEN-LAST:event_panelpMouseEntered

    private void panelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelpMouseExited
        panelp.setBackground(Color.white);
        X1.setForeground(Color.black);
    }//GEN-LAST:event_panelpMouseExited

    private void moverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseDragged

    }//GEN-LAST:event_moverMouseDragged

    private void moverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMousePressed

    }//GEN-LAST:event_moverMousePressed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
    String usuario = ususu.getText();
        String correo = ususu1.getText();
        String contraseña = new String(pass.getPassword());
        String idAdministrativo = jTextField1.getText();

        try {
            Connection conn = DriverManager.getConnection(url, usuarioSQL, contraseñaSQL);
            String query = "SELECT * FROM Clientes WHERE nombre = ? AND gmail = ? AND contraseña = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, usuario);
            pst.setString(2, correo);
            pst.setString(3, contraseña);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String provinciaSeleccionada = (String) jComboBox1.getSelectedItem();
                System.out.println("Provincia Seleccionada: " + provinciaSeleccionada);
                switch (provinciaSeleccionada) {
                    case "Puerto Plata":
                        new PRINCIPAL_USUARIO1().setVisible(true);
                        break;
                    case "Samaná":
                        new PRINCIPAL_USUARIO2().setVisible(true);
                        break;
                    case "Punta Cana":
                        new PRINCIPAL_USUARIO3().setVisible(true);
                        break;
                    case "Barahona":
                        new PRINCIPAL_USUARIO4().setVisible(true);
                        break;
                    case "San Cristobal":
                        new PRINCIPAL_USUARIO5().setVisible(true);
                        break;
                    default:
                        System.out.println("No se encontró una provincia válida.");
                }
                dispose(); // Cierra el JFrame actual

                if (!idAdministrativo.isEmpty()) {
                    System.out.println("ID Administrativo ingresado: " + idAdministrativo);
                    // Verificar si el ID administrativo es para el panel administrativo
                    if (idAdministrativo.equals("06C81D00-54A3-46FC-95DF-11F8F15EF276")) {
                        System.out.println("Accediendo al panel PRINCIPAL0");
                        new PRINCIPAL0().setVisible(true);
                        dispose(); // Cierra la ventana actual
                    } else {
                        switch (idAdministrativo) {
                            case "7C71331B-29FB-4C61-8645-A9327BD6B4BE":
                                System.out.println("Accediendo al panel PRINCIPAL1");
                                new PRINCIPAL1().setVisible(true);
                                dispose(); // Cierra la ventana actual
                                break;
                            case "6739BE03-233F-450A-894C-3C5285D8DA49":
                                System.out.println("Accediendo al panel PRINCIPAL2");
                                new PRINCIPAL2().setVisible(true);
                                dispose(); // Cierra la ventana actual
                                break;
                            case "6CEDCE86-53FD-4177-9209-E89D69575188":
                                System.out.println("Accediendo al panel PRINCIPAL3");
                                new PRINCIPAL3().setVisible(true);
                                dispose(); // Cierra la ventana actual
                                break;
                            case "51CBCA5F-6123-467F-9B84-4A74C291769C":
                                System.out.println("Accediendo al panel PRINCIPAL4");
                                new PRINCIPAL4().setVisible(true);
                                dispose(); // Cierra la ventana actual
                                break;
                        }
                    }
                } else {
                    // Si no se proporcionó un ID administrativo, muestra un mensaje de error
                    System.out.println("ID Administrativo no ingresado.");
                    JOptionPane.showMessageDialog(this, "Debe ingresar un ID administrativo para acceder al panel administrativo");
                }
            }

            rs.close();
            pst.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + ex.getMessage());
        }


    }//GEN-LAST:event_boton1ActionPerformed

  
    public static void main(String args[]) {
 
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel X1;
    private javax.swing.JButton boton;
    private javax.swing.JButton boton1;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel contraseña1;
    private javax.swing.JLabel contraseña2;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel inicio1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mover;
    private javax.swing.JPanel panelp;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    private javax.swing.JTextField ususu;
    private javax.swing.JTextField ususu1;
    // End of variables declaration//GEN-END:variables
}
