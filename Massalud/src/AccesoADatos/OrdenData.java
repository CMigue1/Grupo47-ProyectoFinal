/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Vistas.VistaOrden;
import Entidades.Orden;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author Miguel
 */
public class OrdenData {

    private Connection con = null;
    private PrestadorData presData = new PrestadorData();
    private AfiliadoData afilData = new AfiliadoData();
    private EspecialidadData espeData = new EspecialidadData();
    private PlanData planData = new PlanData();

    public OrdenData() {
        con = Conexion.getConexion();
    }

    public void altaOrden(Orden orden) {
        String sql = "INSERT INTO orden(fecha, formaPago, importe, idAfiliado, idPrestador) VALUES (?,?,?,?,?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(orden.getFecha()));
            ps.setString(2, orden.getFormaPago());
            ps.setDouble(3, orden.getImporte());
            ps.setInt(4, orden.getAfiliado().getIdAfiliado());
            ps.setInt(5, orden.getPrestador().getIdPrestador());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                orden.setIdOrden(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Orden añadida con exito.");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, no se ha podido acceder a la tabla Orden" + ex);
        }

    }

    public void bajaOrden(int idOrden) {
        try {
            String sql = "DELETE FROM orden WHERE idOrden = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idOrden);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La orden ha sido eliminada!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden " + ex.getMessage());
        }

    }

    public List<Orden> listarOrdenPorFecha(Date fecha) {        
        List<Orden> ordenes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM orden WHERE fecha = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, fecha);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {

                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));
                orden.setAfiliado(afilData.buscarAfiliado(rs.getInt("idAfiliado")));
                orden.setPrestador(presData.buscarPrestador(rs.getInt("idPrestador")));

                ordenes.add(orden);
                
            }            
            if (ordenes.isEmpty()) {                
                JOptionPane.showMessageDialog(null, "No se encontraron órdenes para la fecha especificada.");
            }
            ps.close();
            
            

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
        return ordenes;
    }

    public List<Orden> buscarOrdenPorAfiliado(int id) {
        ArrayList<Orden> ordenes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM orden AS o JOIN afiliado AS a ON(o.idAfiliado = a.idAfiliado) WHERE o.idAfiliado = ?";
            System.out.println(sql);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getInt("importe"));
                orden.setAfiliado(afilData.buscarAfiliado(rs.getInt("idAfiliado")));
                orden.setPrestador(presData.buscarPrestador(rs.getInt("idPrestador")));
                ordenes.add(orden);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado " + ex.getMessage());
        }

        return ordenes;
    }

    public List<Orden> buscarOrdenPorPrestador(int id) {
        ArrayList<Orden> ordenes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM orden AS o JOIN prestador AS p ON(o.idPrestador = p.idPrestador) WHERE o.idPrestador= ?";
            System.out.println(sql);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getInt("importe"));
                orden.setAfiliado(afilData.buscarAfiliado(rs.getInt("idAfiliado")));
                orden.setPrestador(presData.buscarPrestador(rs.getInt("idPrestador")));
                ordenes.add(orden);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado " + ex.getMessage());
        }

        return ordenes;
    }

} // Aqui termina la clase.

