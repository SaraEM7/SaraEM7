
package Controlador;

import Modelo.CRUDProducto;
import Modelo.Producto;
import Modelo.conexionDb;
import Vista.Ventana;
import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControladorProducto implements ActionListener {
    private Ventana vista;
    private Producto producto;
    private CRUDProducto modelo;
    
    public ControladorProducto(Ventana vista, Producto producto, CRUDProducto modelo){
        this.vista = vista;
        this.producto = producto;
        this.modelo = modelo;
        
        vista.botonGuardar.addActionListener(this);
        vista.botonActualizar.addActionListener(this);
        vista.botonEliminar.addActionListener(this);
        vista.botonConsultar.addActionListener(this);
            
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Guardar
        if(e.getSource()== vista.botonGuardar){
            producto.setNombre(vista.cajaNombre.getText());
            producto.setCantidad(Integer.parseInt(vista.cajaCantidad.getText()));
            producto.setPrecio(Integer.parseInt(vista.cajaPrecio.getText()));
            producto.setCategoria((String)vista.comboBoxCategoria.getSelectedItem());
          
            if (modelo.ingresar(producto)){
                JOptionPane.showMessageDialog(null, "Registro ingresado con exito");
            }
            else{
                JOptionPane.showMessageDialog(null, "El registro no fue ingresado con exito");
            }
        }
        //Eliminar
        if(e.getSource() == vista.botonEliminar){
            producto.setId(Integer.parseInt(vista.cajaConsultarId.getText()));
                   
            if ( modelo.eliminar(producto)){
                JOptionPane.showMessageDialog(null, "Registro eliminado con exito");
            }
            else{
                JOptionPane.showMessageDialog(null, "El registro no fue eliminado con exito");
            }
        }

        //Actualizar
        if(e.getSource()== vista.botonActualizar){
            producto.setId(Integer.parseInt(vista.cajaConsultarId.getText()));
            producto.setNombre(vista.cajaConsultarNombre.getText());
            producto.setCantidad((Integer.parseInt(vista.cajaConsultarCantidad.getText())));
            producto.setPrecio(Double.parseDouble(vista.cajaConsultarPrecio.getText()));
            producto.setCategoria((String)vista.comboBoxConsultarCategoria.getSelectedItem());
            
            if (modelo.actualizar(producto)){
                JOptionPane.showMessageDialog(null, "Registro actualizado con exito");
            }
            else{
                JOptionPane.showMessageDialog(null, "El resgistro no fue actualizado con exito");
            }
        }
        //Consultar
        if(e.getSource()== vista.botonConsultar){
            DefaultTableModel modeloTabla = new DefaultTableModel();
            vista.jTable1.setModel(modeloTabla);
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            try {
                conexionDb con = new conexionDb();
                Connection conexion = con.getConnection();
                ps = conexion.prepareStatement("select id, nombre, categoria, cantidad, precio from producto");
                rs = ps.executeQuery();
                
                modeloTabla.addColumn("Id");
                modeloTabla.addColumn("Nombre");
                modeloTabla.addColumn("Categoria");
                modeloTabla.addColumn("Cantidad");
                modeloTabla.addColumn("Precio");
                
                ResultSetMetaData rsMD = rs.getMetaData();
                int numCols = rsMD.getColumnCount();
                
                while(rs.next()){
                    Object fila[]=new Object[numCols];
                    for(int i=0; i<numCols; i++){
                        fila [i]=rs.getObject(i+1);
                    }
                    modeloTabla.addRow(fila);
                }
            } catch (SQLException except) {
                System.out.println("¡ERROR!"+except);
            } 
            if("".equals(vista.cajaConsultarId.getText())){
                JOptionPane.showMessageDialog(null, "No se ha ingresado el ID");
            }else{
                producto.setId(Integer.parseInt(vista.cajaConsultarId.getText()));
                if(modelo.consultar(producto)){
                    vista.cajaConsultarNombre.setText(producto.getNombre());
                    vista.comboBoxConsultarCategoria.setSelectedItem(String.valueOf(producto.getCategoria()));
                    vista.cajaConsultarCantidad.setText(String.valueOf(producto.getCantidad()));
                    vista.cajaConsultarPrecio.setText(String.valueOf(producto.getPrecio()));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Registro no encontrado");
                }
                
            }
        }
    }
}



