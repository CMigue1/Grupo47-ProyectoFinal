/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Afiliado;
import Entidades.Plan;
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
public class AfiliadoData {
    
    private Connection con = null;
    private PlanData planData = new PlanData();
    public AfiliadoData() {
        con = Conexion.getConexion();
        
    }

    public void altaAfilidado(Afiliado afiliado) {
        String sql = "INSERT INTO afiliado(nombre, apellido, dni, domicilio, telefono, idPlan, activo) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setInt(3, afiliado.getDni());
            ps.setString(4, afiliado.getDomicilio());
            ps.setInt(5, afiliado.getTelefono());
            ps.setInt(6, afiliado.getPlan().getIdPlan());
            ps.setBoolean(7, afiliado.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                afiliado.setIdAfiliado(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Afiliado añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado " + ex);
        }

    }

    public Afiliado buscarAfiliado(int id) {
        Afiliado afiliado = null;
        String sql = "SELECT * FROM afiliado WHERE idAfiliado = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));  
                afiliado.setPlan(planData.buscarPlanPorId(rs.getInt("idPlan")));
                afiliado.setActivo(rs.getBoolean("activo"));

            } else{
                JOptionPane.showMessageDialog(null, "No existe el afiliado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado " + ex.getMessage());

        }

        return afiliado;
    }

    public Afiliado buscarAfiliadoPorDni(int dni) {
        Afiliado afiliado = null;
        Plan plan = null;
        String sql = "SELECT * FROM afiliado WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                afiliado = new Afiliado();
                plan = new Plan();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                 afiliado.setPlan(planData.buscarPlanPorId(rs.getInt("idPlan")));
                afiliado.setActivo(rs.getBoolean("activo"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el afiliado");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado " + ex.getMessage());
        }

        return afiliado;
    }

    public List<Afiliado> listarAfiliados() {
        String sql = "SELECT * FROM afiliado WHERE activo=1";
        ArrayList<Afiliado> afiliados = new ArrayList();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Afiliado afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setPlan(planData.buscarPlanPorId(rs.getInt("idPlan")));
                afiliado.setActivo(rs.getBoolean("activo"));

                afiliados.add(afiliado);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado " + ex.getMessage());
        }

        return afiliados;
    }

    public void modificarAfiliado(Afiliado afiliado) {
        String sql = "UPDATE afiliado SET nombre =?, apellido =? ,dni =?, domicilio =? , telefono =? , idPlan =?, activo =?" + " WHERE idAfiliado = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setInt(3, afiliado.getDni());
            ps.setString(4, afiliado.getDomicilio());
            ps.setInt(5, afiliado.getTelefono());
            ps.setInt(6, afiliado.getPlan().getIdPlan());
            ps.setBoolean(7, afiliado.isActivo());
            ps.setInt(8, afiliado.getIdAfiliado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico el afiliado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado " + ex.getMessage());
            System.out.println(ex);
        }

    }

    public void bajaAfiliado(int id) {
        try {
            String sql = "UPDATE afiliado SET activo = 0 WHERE idAfiliado = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Baja de afiliado exitosa!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado " + ex.getMessage());
        }
    }
public List<Afiliado> buscarAfiliadosPorPlan(int idPlan){
        List<Afiliado> afiliados = new ArrayList<>();
        
        String sql = "SELECT * FROM afiliado WHERE idPlan = ? AND activo = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, idPlan);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Afiliado afiliado = buscarAfiliado(rs.getInt("idAfiliado"));
                afiliados.add(afiliado);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliados" + ex.getMessage());
        }
        return afiliados;
    }
}
