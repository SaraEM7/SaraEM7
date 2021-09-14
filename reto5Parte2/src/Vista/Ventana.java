/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author JHEYS
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        configLabel();
    }
    
    public void configLabel(){
        ImageIcon imagenTienda = new ImageIcon("src/Imagenes/Futuro.png");
        jLabel5.setIcon(new ImageIcon(imagenTienda.getImage().getScaledInstance(jLabel5.getWidth(), 
                jLabel5.getHeight(), Image.SCALE_SMOOTH)));
        ImageIcon imagenMercar = new ImageIcon("src/Imagenes/Mercar.png");
        jLabel1.setIcon(new ImageIcon(imagenMercar.getImage().getScaledInstance(jLabel1.getWidth(), 
                jLabel1.getHeight(), Image.SCALE_SMOOTH)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Cantidad = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Categoria = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaCantidad = new javax.swing.JTextField();
        cajaPrecio = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cajaConsultarId = new javax.swing.JTextField();
        cajaConsultarNombre = new javax.swing.JTextField();
        cajaConsultarCantidad = new javax.swing.JTextField();
        cajaConsultarPrecio = new javax.swing.JTextField();
        comboBoxConsultarCategoria = new javax.swing.JComboBox<>();
        botonConsultar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        Id = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nombre.setText("Nombre");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, 52, -1));

        Cantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cantidad.setText("Cantidad");
        jPanel1.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 59, -1));

        Precio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Precio.setText("Precio");
        jPanel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, 59, -1));

        Categoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Categoria.setText("Categoria");
        jPanel1.add(Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 169, 59, -1));

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        jPanel1.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 130, -1));
        jPanel1.add(cajaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, -1));

        cajaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(cajaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, -1));

        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonGuardar.setText("Guardar");
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        comboBoxCategoria.setBackground(new java.awt.Color(255, 204, 255));
        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "ASEO", "VIVERES", "LACTEOS", "VERDURAS", "CARNICERIA" }));
        comboBoxCategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        comboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 122, -1));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Futuro.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 410, 280));

        jTabbedPane1.addTab("Registrar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Cantidad", "Precio", "Categoria"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 420, 150));
        jPanel2.add(cajaConsultarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 122, -1));
        jPanel2.add(cajaConsultarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 122, -1));
        jPanel2.add(cajaConsultarCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 122, -1));
        jPanel2.add(cajaConsultarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 122, -1));

        comboBoxConsultarCategoria.setBackground(new java.awt.Color(255, 204, 255));
        comboBoxConsultarCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "ASEO", "VIVERES", "LACTEOS", "VERDURAS", "CARNICERIA", " " }));
        jPanel2.add(comboBoxConsultarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 122, -1));

        botonConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonConsultar.setText("Consultar");
        jPanel2.add(botonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 110, -1));

        botonActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonActualizar.setText("Actualizar");
        jPanel2.add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 110, -1));

        botonEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 110, -1));

        Id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Id.setText("Id");
        jPanel2.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 37, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nombre");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Cantidad");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Precio");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 50, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Categoria");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mercar.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 210, 270));

        jTabbedPane1.addTab("Consultar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void cajaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPrecioActionPerformed

    private void comboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Categoria;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Precio;
    public javax.swing.JButton botonActualizar;
    public javax.swing.JButton botonConsultar;
    public javax.swing.JButton botonEliminar;
    public javax.swing.JButton botonGuardar;
    public javax.swing.JTextField cajaCantidad;
    public javax.swing.JTextField cajaConsultarCantidad;
    public javax.swing.JTextField cajaConsultarId;
    public javax.swing.JTextField cajaConsultarNombre;
    public javax.swing.JTextField cajaConsultarPrecio;
    public javax.swing.JTextField cajaNombre;
    public javax.swing.JTextField cajaPrecio;
    public javax.swing.JComboBox<String> comboBoxCategoria;
    public javax.swing.JComboBox<String> comboBoxConsultarCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}