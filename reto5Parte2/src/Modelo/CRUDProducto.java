
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CRUDProducto extends conexionDb{
    PreparedStatement ps;
    ResultSet rs;
    
    //Ingresar
    public boolean ingresar(Producto producto){
        Connection conexion = getConnection();
        
        try{
            ps = conexion.prepareStatement("insert into producto(nombre, categoria, cantidad, precio)"
                    + " values (?,?,?,?)");
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getCategoria());
            ps.setInt(3, producto.getCantidad());
            ps.setDouble(4, producto.getPrecio());
            
            int consulta = ps.executeUpdate();
            if(consulta>0){
                return true;
            }else{
                return false;
            }
        }
        catch(Exception except){
            System.out.println("¡ERROR!"+except);
            return false;
        }
        finally{
            try{
                conexion.close();
            }catch(Exception except){
                System.out.println("¡ERROR!"+except);
            }
        }
    }
    
    // Consultar
    public boolean consultar(Producto producto){
        Connection conexion = getConnection();
        
        try{
            ps = conexion.prepareStatement("select * from producto where id=?");
            ps.setInt(1, producto.getId());
            rs = ps.executeQuery();
            
            if(rs.next()){
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecio(rs.getDouble("precio"));
                return true;
            }
            else{
                return false;
            }
           
        }
        catch(Exception except){
            System.out.println("¡ERROR!"+except);
            return false;
        }
        finally{
            try{
                conexion.close();
            }catch(Exception except){
                System.out.println("¡ERROR!"+except);
            }
        }
    }
    
    // Actualizar
    public boolean actualizar(Producto producto){
        Connection conexion = getConnection();
        
        try{
            ps = conexion.prepareStatement("update producto set nombre=?, categoria=?, cantidad=?, precio=?"
                    + "where id=?");
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getCategoria());
            ps.setInt(3, producto.getCantidad());
            ps.setDouble(4, producto.getPrecio());
            ps.setInt(5, producto.getId());
            
            int consulta = ps.executeUpdate();
            if(consulta>0){
                return true;
            }else{
                return false;
            }
        }
        catch(Exception except){
            System.out.println("¡ERROR!"+except);
            return false;
        }
        finally{
            try{
                conexion.close();
            }catch(Exception except){
                System.out.println("¡ERROR!"+except);
            }
        }
    }
    
    // Eliminar
    public boolean eliminar(Producto producto){
        Connection conexion = getConnection();
        
        try{
            ps = conexion.prepareStatement("delete  from producto where id=? ");
            ps.setInt(1, producto.getId());
            
            int consulta = ps.executeUpdate();
            if(consulta>0){
                return true;
            }else{
                return false;
            }
        }
        catch(Exception except){
            System.out.println("¡ERROR!"+except);
            return false;
        }
        finally{
            try{
                conexion.close();
            }catch(Exception except){
                System.out.println("¡ERROR!"+except);
            }
        }
    }
    
    
}
