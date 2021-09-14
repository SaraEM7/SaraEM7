
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionDb {
    public static final String URL = "jdbc:mysql://localhost:3306/tiendaElFuturo?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "SaraEscobar1143_";
    
    public  Connection getConnection(){
        Connection conexion=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        
        }catch(Exception except){
            System.out.println("Error"+except);
        }
        
        return conexion;
    }
}
