/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Especialidad;

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
public class EspecialidadData {
    private Connection con = null;

    public EspecialidadData() {
        con = Conexion.getConexion();
    }
    
    
    public Especialidad buscarEspecialidadPorId(int idEspecialidad) {
    Especialidad especialidad = null;
    String sql = "SELECT * FROM especialidad WHERE idEspecialidad = ?";
    PreparedStatement ps = null;
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, idEspecialidad);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            especialidad = new Especialidad();
            especialidad.setIdEspecialidad(rs.getInt("idEspecialidad"));;
            especialidad.setEspecialidad(rs.getString("especialidad"));            
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la especialidad correspondiente");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Especialidad ");
        System.out.println(ex.getMessage());
    }
    return especialidad;
}
    
    public void agregarEspecialidad(Especialidad especialidad){
        String sql = "INSERT INTO especialidad(especialidad) VALUES (?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, especialidad.getEspecialidad());
             ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                especialidad.setIdEspecialidad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Especialidad añadida con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Especialidad");
            System.out.println(ex.getMessage());
        }
    }
    
    public void modificarEspecialidad(Especialidad especialidad){
        String sql = "UPDATE especialidad SET especialidad = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad.getEspecialidad());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico la especialidad con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Especialidad ");
            System.out.println(ex.getMessage());
        }
        
    }
    
    public List<Especialidad> listarEspecialidades(){
        List<Especialidad> especialidades = new ArrayList<>();
        String sql = "SELECT * FROM especialidad";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Especialidad especialidad = new Especialidad();
                especialidad.setIdEspecialidad(rs.getInt("idEspecialidad"));
                especialidad.setEspecialidad(rs.getString("especialidad"));
                

                especialidades.add(especialidad);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Especialidad ");
            System.out.println(ex.getMessage());
        }
        
        return especialidades;
    }
}
