package AccesoADatos;

import Entidades.Administrativo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AdministrativoData {
     private Connection con = null;
     
    public AdministrativoData() {
       con = Conexion.getConexion();
       
    }
    
    public void altaAdministrativo(Administrativo administrativo){
        String sql = "INSERT INTO administrativo(usuario, contrasena) VALUES (?,?)";
        
         try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, administrativo.getUsuario());
            ps.setString(2, administrativo.getContraseña());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {                
                JOptionPane.showMessageDialog(null, "Administrativo añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Administrativo " + ex);
        }
    }
          public void modificarAdministrativo(Administrativo administrativo) {
        String sql = "UPDATE administrativo SET usuario =?, contrasena =? WHERE idAdministrativo= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, administrativo.getUsuario());
            ps.setString(2, administrativo.getContraseña());
            ps.setInt(3, administrativo.getIdAdministrativo());
                       
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico el administrativo con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Administrativo" + ex.getMessage());
            
        }

    }
         
    }
