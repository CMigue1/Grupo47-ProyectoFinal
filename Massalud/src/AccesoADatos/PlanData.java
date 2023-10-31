/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;


import Entidades.Plan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class PlanData {
    private Connection con = null;

    public PlanData() {
        con = Conexion.getConexion();
    }
    
    
    public Plan buscarPlanPorId(int idPlan) {
    Plan plan = null;
    String sql = "SELECT * FROM planes WHERE idPlan = ?";
    PreparedStatement ps = null;
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, idPlan);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            plan = new Plan();
            plan.setIdPlan(rs.getInt("idPlan"));
            plan.setTipoDePlan(rs.getString("tipoDePlan"));
            plan.setPrecio(rs.getDouble("precio"));
            plan.setAdherentes(rs.getInt("adherentes"));            
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el plan correspondiente");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Plan ");
        System.out.println(ex.getMessage());
    }

    return plan;
}
    
    public void agregarPlan(Plan plan){
        String sql = "INSERT INTO planes(tipoDePlan, precio, adherentes) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, plan.getTipoDePlan());
            ps.setDouble(2, plan.getPrecio());
            ps.setInt(3, plan.getAdherentes());
             ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                plan.setIdPlan(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Plan añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Plan");
            System.out.println(ex.getMessage());
        }
    }
    
    public void modificarPlan(Plan plan){
        String sql = "UPDATE planes SET tipoDePlan=?,precio=?,adherentes= ? WHERE idPlan = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, plan.getTipoDePlan());
            ps.setDouble(2, plan.getPrecio());
            ps.setInt(3, plan.getAdherentes());
             ps.setInt(4, plan.getIdPlan());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico el plan con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Plan");
            System.out.println(ex.getMessage());
            
        }
        
    }
    
    public List<Plan> listarPlanes(){
        List<Plan> planes = new ArrayList<>();
        String sql = "SELECT * FROM planes";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Plan plan = new Plan();
                plan.setIdPlan(rs.getInt("idPlan"));
                plan.setTipoDePlan(rs.getString("tipoDePlan"));
                plan.setPrecio(rs.getDouble("precio"));
                plan.setAdherentes(rs.getInt("adherentes"));                         
                planes.add(plan);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Plan ");
            System.out.println(ex.getMessage());
        }
        
        return planes;
    }
    
    public void eliminarPlan(int idPlan){
        try {
            String sql = "DELETE FROM planes WHERE idPlan = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPlan);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El plan ha sido eliminado!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Plan ");
            System.out.println(ex.getMessage());
        }
    }
      
}
