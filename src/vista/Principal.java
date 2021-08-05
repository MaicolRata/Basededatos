package vista;

import confi.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
    int id = 0;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BASE DE DATOS");

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DNI:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NOMBRE:");

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtid.setEnabled(false);

        txtdni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("EDAD:");

        txtedad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtid)
                    .addComponent(txtdni)
                    .addComponent(txtnombre)
                    .addComponent(txtedad, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnagregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnagregar)
                .addGap(34, 34, 34)
                .addComponent(btnmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btneliminar)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificar)
                    .addComponent(btnagregar)
                    .addComponent(btneliminar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TablaDatos.setBackground(new java.awt.Color(204, 204, 204));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRES", "EDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        Agregar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        Modificar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
       int row = TablaDatos.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se Selecciono");
        } else {
            id = Integer.parseInt((String) TablaDatos.getValueAt(row, 0).toString());
            String dni = (String) TablaDatos.getValueAt(row, 1);
            String nom = (String) TablaDatos.getValueAt(row, 2);
            String ed = (String) TablaDatos.getValueAt(row, 3);
            txtid.setText("" + id);
            txtdni.setText(dni);
            txtnombre.setText(nom);
            txtedad.setText(ed);

        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Eliminar();
        listar();
        nuevo();
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    void listar() {
        String sql = "select * from persona";
        try {
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] persona = new Object[4];
   
            model = (DefaultTableModel) TablaDatos.getModel();
            while (rs.next()) {
                persona[0] = rs.getInt("Id");
                persona[1] = rs.getString("DNI");
                persona[2] = rs.getString("Nombres");
                persona[3] = rs.getString("Edad");
                model.addRow(persona);
            }
            TablaDatos.setModel(model);

        } catch (Exception e) {
        }

    }
    void Agregar() {
        String dni = txtdni.getText();
        String nom = txtnombre.getText();
        String ed = txtedad.getText();
        try {
            if (dni.equals("") || nom.equals("")|| ed.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar Datos");
                limpiarTabla(model);               
            } else {
                String sql = "insert into persona(DNI,Nombres,Edad) values('" + dni + "','" + nom + "','" +ed+"')";
                con = cn.getConnection();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Registrado con Exito");
                limpiarTabla(model);
                
            }

        } catch (Exception e) {
        }    
    }
    void limpiarTabla(DefaultTableModel model) {
        for (int i = 0; i <= TablaDatos.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }

    }
    void Modificar() {
        String dni = txtdni.getText();
        String nom = txtnombre.getText();
        String ed = txtedad.getText();
        String sql = "update persona set DNI='" + dni + "',Nombres='" + nom + "',Edad='" + ed + "' where Id=" + id;
        try {
            if (dni != null || nom != null|| ed != null) {
                con = cn.getConnection();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Modificado");
                limpiarTabla(model);
                
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }

        } catch (Exception e) {
        }

    }
    void Eliminar() {
        String sql = "delete from persona where Id=" + id;        
        int fila = TablaDatos.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null,"Usuario no Seleccionado");
        } else {
                try {
                    con = cn.getConnection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                    limpiarTabla(model);
                    
                } catch (Exception e) {
                }
               
        }
    }
    void nuevo() {
        txtid.setText("");
        txtdni.setText("");
        txtnombre.setText("");
        txtedad.setText("");
        txtdni.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
