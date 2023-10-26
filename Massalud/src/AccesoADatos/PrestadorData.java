/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Prestador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class PrestadorData {
    
    private Connection con = null;
    private EspecialidadData especialidadData = new EspecialidadData();
    public PrestadorData() {
        con = Conexion.getConexion();
        
    }

    public void altaPrestador(Prestador prestador) {
        String sql = "INSERT INTO prestador(nombre, apellido, dni, domicilio, telefono, idEspecialidad, activo) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prestador.getNombre());
            ps.setString(2, prestador.getApellido());
            ps.setInt(3, prestador.getDni());
            ps.setString(4, prestador.getDomicilio());
            ps.setInt(5, prestador.getTelefono());
            ps.setInt(6, prestador.getEspecialidad().getIdEspecialidad());
            ps.setBoolean(7, prestador.isActivo());
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                prestador.setIdPrestador(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Prestador añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador " + ex.getMessage());
        }

    }

    public Prestador buscarPrestador(int id) {
        Prestador prestador = null;
        String sql = "SELECT * FROM prestador WHERE idPrestador= ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                prestador = new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getInt("telefono"));  
                prestador.setEspecialidad(especialidadData.buscarEspecialidadPorId(rs.getInt("idEspecialidad")));
                prestador.setActivo(rs.getBoolean("activo"));

            }else{
                JOptionPane.showMessageDialog(null, "No existe el prestador");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador " + ex.getMessage());

        }

        return prestador;
    }

    public Prestador buscarPrestadorPorDni(int dni) {
        Prestador prestador = null;        
        String sql = "SELECT * FROM prestador WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                prestador = new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getInt("telefono"));  
                prestador.setEspecialidad(especialidadData.buscarEspecialidadPorId(rs.getInt("idEspecialidad")));
                prestador.setActivo(rs.getBoolean("activo"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el prestador");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador " + ex.getMessage());
        }

        return prestador;
    }

    public List<Prestador> listarPrestadores() {
        String sql = "SELECT * FROM prestador WHERE activo=1";
        ArrayList<Prestador> prestadores = new ArrayList();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Prestador prestador = new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getInt("telefono"));
                prestador.setEspecialidad(especialidadData.buscarEspecialidadPorId(rs.getInt("idEspecialidad")));
                prestador.setActivo(rs.getBoolean("activo"));

                prestadores.add(prestador);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador " + ex.getMessage());
        }
        return prestadores;
    }

    public void modificarPrestador(Prestador prestador) {
        String sql = "UPDATE prestador SET nombre =?, apellido =? ,dni =?, domicilio =? , telefono =? , idEspecialidad =?, activo =?" + " WHERE idPrestador = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, prestador.getNombre());
            ps.setString(2, prestador.getApellido());
            ps.setInt(3, prestador.getDni());
            ps.setString(4, prestador.getDomicilio());
            ps.setInt(5, prestador.getTelefono());
            ps.setInt(6, prestador.getEspecialidad().getIdEspecialidad());
            ps.setBoolean(7, prestador.isActivo());
            ps.setInt(8, prestador.getIdPrestador());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico el prestador con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador " + ex.getMessage());
            
        }

    }

    public void bajaPrestador(int id) {
        try {
            String sql = "UPDATE prestador SET activo = 0 WHERE idPrestador = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Baja de prestador exitosa!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador " + ex.getMessage());
        }
    }
    
    public List<Prestador> buscarPrestadorPorEspecialidad(int idEspecialidad){
        List<Prestador> prestadores = new ArrayList<>();
        
        String sql = "SELECT * FROM prestador WHERE idEspecialidad = ? AND activo = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, idEspecialidad);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Prestador prestador = buscarPrestador(rs.getInt("idPrestador"));
                prestadores.add(prestador);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador " + ex.getMessage());
        }
        return prestadores;
    }

}
