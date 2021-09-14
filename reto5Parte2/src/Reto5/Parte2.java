
package Reto5;

import Controlador.ControladorProducto;
import Modelo.CRUDProducto;
import Modelo.Producto;
import Vista.Ventana;

public class Parte2 {

    public static void main(String[] args) {
       Ventana ventana1 = new Ventana();
        Producto producto = new Producto();
        CRUDProducto modelo = new CRUDProducto();
        ControladorProducto controlador = new ControladorProducto(ventana1, producto, modelo);
                
        ventana1.setVisible(true);
        ventana1.setLocationRelativeTo(null);
        ventana1.setTitle("Inventario de productos Supermercado El Futuro");    
    }
    
}
