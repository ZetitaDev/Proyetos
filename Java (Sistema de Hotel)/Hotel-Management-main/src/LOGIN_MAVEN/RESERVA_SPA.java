
package LOGIN_MAVEN;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;



public class RESERVA_SPA extends javax.swing.JPanel {

     private DefaultTableModel modeloTabla;

    
    public RESERVA_SPA() {
        initComponents();

               // Inicializar el modelo de tabla con las columnas necesarias
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Fecha Ingreso");
        modeloTabla.addColumn("Nombre Cliente");
        modeloTabla.addColumn("Apellido Cliente");
        modeloTabla.addColumn("Contacto");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Horario"); // Nueva columna para el horario
        
        
        // Asignar el modelo de tabla a la tabla jTable2
        jTable2.setModel(modeloTabla);
    }

    // Método para agregar una fila a la tabla
    private void agregarFilaATabla(String[] datosFila) {
        modeloTabla.addRow(datosFila);
    }

    // Método para eliminar la fila seleccionada de la tabla
    private void eliminarFilaDeTabla() {
        int filaSeleccionada = jTable2.getSelectedRow();
        if (filaSeleccionada != -1) { // Si se ha seleccionado una fila
            modeloTabla.removeRow(filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una reserva para cancelar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        Categoria = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dia_ingreso = new javax.swing.JComboBox<>();
        mes_ingreso = new javax.swing.JComboBox<>();
        año_ingres = new javax.swing.JComboBox<>();
        Categoria1 = new javax.swing.JComboBox<>();

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        jButton1.setText("Hacer factura");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jButton8.setText("Cancelar");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Apellido:");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setBackground(new java.awt.Color(204, 204, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Habitacion", "Ubicacion", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/spaicono.png"))); // NOI18N
        jLabel10.setText("Reserva spa");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        jButton2.setText("Hacer factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Contacto");

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));

        Categoria.setBackground(new java.awt.Color(255, 255, 255));
        Categoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Categoria.setForeground(new java.awt.Color(0, 0, 0));
        Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basico: 50$", "Intermedio: 99$", "VIP: 169$" }));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jButton9.setText("Cancelar reserva");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de ingreso"));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        dia_ingreso.setBackground(new java.awt.Color(255, 255, 255));
        dia_ingreso.setForeground(new java.awt.Color(0, 0, 0));
        dia_ingreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        mes_ingreso.setBackground(new java.awt.Color(255, 255, 255));
        mes_ingreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        año_ingres.setBackground(new java.awt.Color(255, 255, 255));
        año_ingres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dia_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mes_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(año_ingres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dia_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(año_ingres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Categoria1.setBackground(new java.awt.Color(255, 255, 255));
        Categoria1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Categoria1.setForeground(new java.awt.Color(0, 0, 0));
        Categoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6 a.m - 12 p.m", "12:20 p.m - 4 p.m", "4:20 p.m a 8 p.m" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Categoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton9)
                                    .addGap(33, 33, 33))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Categoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   // Obtener los datos ingresados por el usuario en el formulario de reserva
    String nombreCliente = jTextField1.getText(); // Obtener el nombre del cliente
    String apellidoCliente = jTextField4.getText(); // Obtener el apellido del cliente
    String contacto = jTextField5.getText(); // Obtener el contacto
    double precio = Double.parseDouble(Categoria.getSelectedItem().toString().split(": ")[1].replace("$", "")); // Obtener el precio desde la opción seleccionada
    
    // Obtener el horario seleccionado del JComboBox
    String horario = (String) Categoria1.getSelectedItem();

    // Obtener los valores seleccionados de los JComboBox de fecha
    int diaIngreso = Integer.parseInt((String) dia_ingreso.getSelectedItem());
    int mesIngreso = mes_ingreso.getSelectedIndex() + 1; // Sumar 1 porque los meses se indexan desde 0
    int añoIngreso = Integer.parseInt((String) año_ingres.getSelectedItem());

    LocalDate fechaIngreso = LocalDate.of(añoIngreso, mesIngreso, diaIngreso);

    // Mostrar un cuadro de diálogo de confirmación
    int option = JOptionPane.showConfirmDialog(null, "¿Desea realizar la reserva?", "Confirmar Reserva", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        // URL de conexión a la base de datos SQL Server
        String url = "jdbc:sqlserver://DESKTOP-KOKC65M:1433;" +
                    "databaseName=PPHS_San_Cristobal;" +
                    "encrypt=true;" +
                    "trustServerCertificate=true;" +
                    "trustStore=storeName;" +
                    "trustStorePassword=storePassword;" +
                    "hostNameInCertificate=hostName";
        // Credenciales de inicio de sesión de SQL Server
        String usuarioSQL = "Efren";
        String contraseñaSQL = "12345678";

        // Preparar la consulta SQL para insertar la nueva reserva
        String query = "INSERT INTO Reserva_SPA (Horario, FechaIngreso, NombreCliente, ApellidoCliente, Contacto, Precio) VALUES (?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Establecer la conexión con la base de datos
            connection = DriverManager.getConnection(url, usuarioSQL, contraseñaSQL);

            // Preparar la consulta SQL
            statement = connection.prepareStatement(query);

            // Establecer los parámetros de la consulta
            statement.setString(1, horario); // Horario
            statement.setDate(2, java.sql.Date.valueOf(fechaIngreso));
            statement.setString(3, nombreCliente);
            statement.setString(4, apellidoCliente);
            statement.setString(5, contacto);
            statement.setDouble(6, precio);

            // Ejecutar la consulta
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Reserva realizada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al realizar la reserva", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            // Capturar cualquier error durante la conexión o la ejecución de la consulta
            System.err.println("Error al conectar a la base de datos o al ejecutar la consulta: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al realizar la reserva", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar la conexión y liberar los recursos
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar el PreparedStatement: " + ex.getMessage());
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar la Connection: " + ex.getMessage());
                }
            } 
        }
        // Agregar los datos a la tabla
        String[] datosFila = {  
            horario,
            fechaIngreso.toString(),
            nombreCliente, 
            apellidoCliente, 
            contacto, 
            String.valueOf(precio)
        };
        agregarFilaATabla(datosFila);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      // Obtener la fila seleccionada en la tabla
    int filaSeleccionada = jTable2.getSelectedRow();
    if (filaSeleccionada != -1) {
        eliminarFilaDeTabla();
        // Obtener los datos de la fila seleccionada
        String fechaIngreso = jTable2.getValueAt(filaSeleccionada, 0).toString();
        String horario = jTable2.getValueAt(filaSeleccionada, 1).toString();
        String nombreCliente = jTable2.getValueAt(filaSeleccionada, 2).toString();
        String apellidoCliente = jTable2.getValueAt(filaSeleccionada, 3).toString();
        String contacto = jTable2.getValueAt(filaSeleccionada, 4).toString();
        double precio = Double.parseDouble(jTable2.getValueAt(filaSeleccionada, 5).toString());

        // Mostrar un cuadro de diálogo de confirmación
        int option = JOptionPane.showConfirmDialog(null, "¿Está seguro de cancelar la reserva?", "Confirmar Cancelación", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // URL de conexión a la base de datos SQL Server
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PPHS_puerto_plataa";
            // Credenciales de inicio de sesión de SQL Server
            String usuarioSQL = "usuario22";
            String contraseñaSQL = "12345";

            // Preparar la consulta SQL para eliminar la reserva de la base de datos
            String query = "DELETE FROM Reserva_SPA WHERE FechaIngreso = ? AND Horario = ? AND NombreCliente = ? AND ApellidoCliente = ? AND Contacto = ? AND Precio = ?";
            Connection connection = null;
            PreparedStatement statement = null;

            try {
                // Establecer la conexión con la base de datos
                connection = DriverManager.getConnection(url, usuarioSQL, contraseñaSQL);

                // Preparar la consulta SQL
                statement = connection.prepareStatement(query);

                // Establecer los parámetros de la consulta
                statement.setString(1, fechaIngreso);
                statement.setString(2, horario);
                statement.setString(3, nombreCliente);
                statement.setString(4, apellidoCliente);
                statement.setString(5, contacto);
                statement.setDouble(6, precio);

                // Ejecutar la consulta
                int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Reserva cancelada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    // Eliminar la fila de la tabla
                    modeloTabla.removeRow(filaSeleccionada);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al cancelar la reserva", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                // Capturar cualquier error durante la conexión o la ejecución de la consulta
                System.err.println("Error al conectar a la base de datos o al ejecutar la consulta: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error al cancelar la reserva", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                // Cerrar la conexión y liberar los recursos
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException ex) {
                        System.err.println("Error al cerrar el PreparedStatement: " + ex.getMessage());
                    }
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        System.err.println("Error al cerrar la Connection: " + ex.getMessage());
                    }
                } 
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una reserva para cancelar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton9ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Categoria;
    private javax.swing.JComboBox<String> Categoria1;
    private javax.swing.JComboBox<String> año_ingres;
    private javax.swing.JComboBox<String> dia_ingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JComboBox<String> mes_ingreso;
    // End of variables declaration//GEN-END:variables
}
