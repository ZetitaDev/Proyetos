package LOGIN_MAVEN;

import com.itextpdf.text.BaseColor;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Container;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class RESERVA_HOTEL extends javax.swing.JPanel {
    
     private DefaultTableModel modeloTabla;


    public RESERVA_HOTEL() {
        initComponents();
        
        
                // Inicializar el modelo de tabla con las columnas necesarias
   modeloTabla = new DefaultTableModel();
modeloTabla.addColumn("Fecha Ingreso");
modeloTabla.addColumn("Fecha Salida");
modeloTabla.addColumn("Nombre Cliente");
modeloTabla.addColumn("Apellido Cliente");
modeloTabla.addColumn("Contacto");
modeloTabla.addColumn("Precio");
modeloTabla.addColumn("Número Acompañantes");
        
        
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

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Categorias = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dia_ingreso = new javax.swing.JComboBox<>();
        mes_ingreso = new javax.swing.JComboBox<>();
        año_ingres = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        salida_di = new javax.swing.JComboBox<>();
        mes_salida = new javax.swing.JComboBox<>();
        año_salida = new javax.swing.JComboBox<>();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondonegro.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jButton8.setText("Cancelar reserva");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(204, 204, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Habitacion", "Ubicación", "Costo"
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

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logohotel.png"))); // NOI18N
        jLabel1.setText("Reserva hotel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(298, 298, 298))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Categorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basico: 69$", "Intermedio: 129$", "VIP: 199$" }));
        Categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriasActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        jButton1.setText("Hacer factura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Apellido:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Aconmpañantes");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Contacto");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jButton9.setText("Salir");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de ingreso"));
        jPanel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        dia_ingreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        mes_ingreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

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
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de ingreso"));
        jPanel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        salida_di.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        mes_salida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        año_salida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salida_di, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mes_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(año_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salida_di, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(año_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Categorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleName("Fecha de salida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "¿Está seguro de cancelar la reserva?", "Confirmar Cancelación", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            eliminarFilaDeTabla();
            // Aquí puedes agregar cualquier otra acción que desees realizar después de la confirmación.
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void CategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // Obtener los datos ingresados por el usuario en el formulario de reserva
    String nombreCliente = jTextField1.getText();
    String apellidoCliente = jTextField2.getText();
    int numeroHuespedes = Integer.parseInt(jTextField4.getText());
    String contacto = jTextField3.getText();

    // Obtener el valor seleccionado del JComboBox de precio
    String precioSeleccionado = (String) Categorias.getSelectedItem();
    String precioNumerico = precioSeleccionado.replaceAll("[^\\d.]", "");
    BigDecimal precio = new BigDecimal(precioNumerico);

    // Obtener los valores seleccionados de los JComboBox de fecha
    int diaIngreso = Integer.parseInt((String) dia_ingreso.getSelectedItem());
    int mesIngreso = mes_ingreso.getSelectedIndex() + 1;
    int añoIngreso = Integer.parseInt((String) año_ingres.getSelectedItem());
    int diaSalida = Integer.parseInt((String) salida_di.getSelectedItem());
    int mesSalida = mes_salida.getSelectedIndex() + 1;
    int añoSalida = Integer.parseInt((String) año_salida.getSelectedItem());

    LocalDate fechaIngreso = LocalDate.of(añoIngreso, mesIngreso, diaIngreso);
    LocalDate fechaSalida = LocalDate.of(añoSalida, mesSalida, diaSalida);

    if (fechaSalida.isBefore(fechaIngreso)) {
        JOptionPane.showMessageDialog(null, "La fecha de salida debe ser posterior a la fecha de ingreso", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int option = JOptionPane.showConfirmDialog(null, "¿Desea realizar la reserva?", "Confirmar Reserva", JOptionPane.YES_NO_OPTION);

    if (option == JOptionPane.YES_OPTION) {
        String url = "jdbc:sqlserver://DESKTOP-KOKC65M:1433;databaseName=PPHS_San_Cristobal;encrypt=true;trustServerCertificate=true;trustStore=storeName;trustStorePassword=storePassword;hostNameInCertificate=hostName";
        String usuarioSQL = "Efren";
        String contraseñaSQL = "12345678";

        String query = "INSERT INTO Reservaciones_hotel (FechaIngreso, FechaSalida, NombreCliente, ApellidoCliente, NumeroHuespedes, Contacto, Precio) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(url, usuarioSQL, contraseñaSQL);
            statement = connection.prepareStatement(query);

            statement.setDate(1, java.sql.Date.valueOf(fechaIngreso));
            statement.setDate(2, java.sql.Date.valueOf(fechaSalida));
            statement.setString(3, nombreCliente);
            statement.setString(4, apellidoCliente);
            statement.setInt(5, numeroHuespedes);
            statement.setString(6, contacto);
            statement.setBigDecimal(7, precio);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Reserva realizada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                generarFacturaPDF(nombreCliente, apellidoCliente, numeroHuespedes, contacto, fechaIngreso, fechaSalida, precio);
            } else {
                JOptionPane.showMessageDialog(null, "Error al realizar la reserva", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.err.println("Error al conectar a la base de datos o al ejecutar la consulta: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al realizar la reserva", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
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
        String[] datosFila = { 
            fechaIngreso.toString(), 
            fechaSalida.toString(),  
            nombreCliente, 
            apellidoCliente, 
            String.valueOf(numeroHuespedes), 
            contacto,
            precio.toString() 
        };
        agregarFilaATabla(datosFila);
    }
}
    
    public class BackgroundColorEvent extends PdfPageEventHelper {

    @Override
    public void onEndPage(PdfWriter writer, Document document) {
        PdfContentByte canvas = writer.getDirectContentUnder();
        Rectangle rect = document.getPageSize();
        canvas.setColorFill(BaseColor.YELLOW);  // Establecer el color de fondo deseado
        canvas.rectangle(rect.getLeft(), rect.getBottom(), rect.getWidth(), rect.getHeight());
        canvas.fill();
    }
}
    
    private void generarFacturaPDF(String nombreCliente, String apellidoCliente, int numeroHuespedes, String contacto, LocalDate fechaIngreso, LocalDate fechaSalida, BigDecimal precio) {
    Document document = new Document();
      String directorio = "src/pdf";
        File pdfDir = new File(directorio);
        if (!pdfDir.exists()) {
            pdfDir.mkdirs(); // Crear el directorio si no existe
        }

        // Generar un nombre único para la factura
        String nombreFactura = "factura_" + nombreCliente + "_" + apellidoCliente + ".pdf";
        String path = directorio + nombreFactura;

 
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(path));
            writer.setPageEvent(new BackgroundColorEvent()); // Aplicar el evento de color de fondo
            document.open();

            // Agregar logo
            String logoPath = "src/img/logoempresa.jpg"; // Ruta al logo
            Image logo = Image.getInstance(logoPath);
            logo.setAbsolutePosition(50, 750); // Posición del logo en la página
            logo.scaleToFit(100, 100); // Escalar el logo al tamaño deseado
            document.add(logo);

            // Agregar título
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD, BaseColor.WHITE);
            Paragraph titulo = new Paragraph("Factura de Reserva", titleFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            // Espacio después del título
            document.add(new Paragraph(" "));

            // Crear tabla para organizar la información
            PdfPTable table = new PdfPTable(2); // 2 columnas
            table.setSpacingBefore(20);

            Font cellFont = getHelveticaFont(); // Obtener la fuente Helvetica

            addTableCell(table, "Nombre del Cliente:", cellFont);
            addTableCell(table, nombreCliente, cellFont);

            addTableCell(table, "Apellido del Cliente:", cellFont);
            addTableCell(table, apellidoCliente, cellFont);

            addTableCell(table, "Número de Huéspedes:", cellFont);
            addTableCell(table, String.valueOf(numeroHuespedes), cellFont);

            addTableCell(table, "Contacto:", cellFont);
            addTableCell(table, contacto, cellFont);

            addTableCell(table, "Precio:", cellFont);
            addTableCell(table, "$" + precio.toString(), cellFont);

            document.add(table);

            document.close();
            JOptionPane.showMessageDialog(null, "Factura generada exitosamente en " + path, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (DocumentException | IOException e) {
            System.err.println("Error al generar la factura PDF: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al generar la factura", "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    
    private static Font getHelveticaFont() throws IOException, DocumentException {
        String fontPath = "C:\\Users\\tusal\\AppData\\Local\\Microsoft\\Windows\\Fonts\\Helvetica.ttf"; // Ruta de la fuente Helvetica
        BaseFont helvetica = BaseFont.createFont(fontPath, BaseFont.WINANSI, BaseFont.EMBEDDED);
        return new Font(helvetica, 12, Font.NORMAL, BaseColor.WHITE);
    }

    
    private void addTableCell(PdfPTable table, String text, Font font) {
    PdfPCell cell = new PdfPCell(new Paragraph(text, font));
    cell.setBorder(PdfPCell.NO_BORDER);
    cell.setBackgroundColor(BaseColor.BLACK);
    table.addCell(cell);
}
    
private java.sql.Date convertirFecha(String fechaString) {
    try {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = formato.parse(fechaString);
        return new java.sql.Date(fecha.getTime());
    } catch (ParseException ex) {
        System.err.println("Error al convertir la fecha: " + ex.getMessage());
        return null;
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Categorias;
    private javax.swing.JComboBox<String> año_ingres;
    private javax.swing.JComboBox<String> año_salida;
    private javax.swing.JComboBox<String> dia_ingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> mes_ingreso;
    private javax.swing.JComboBox<String> mes_salida;
    private javax.swing.JComboBox<String> salida_di;
    // End of variables declaration//GEN-END:variables

}
