/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;


public class Orden {
    private int idOrden;
    private LocalDate fecha;
    private String formaPago;
    private double importe;
    private Afiliado afiliado;
    private Prestador prestador; 

    public Orden() {
    }

    public Orden(int idOrden, LocalDate fecha, String formaPago, double importe, Afiliado afiliado, Prestador prestador) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.afiliado = afiliado;
        this.prestador = prestador;
    }

    public Orden(LocalDate fecha, String formaPago, double importe, Afiliado afiliado, Prestador prestador) {
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.afiliado = afiliado;
        this.prestador = prestador;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", fecha=" + fecha + ", formaPago=" + formaPago + ", importe=" + importe + ", afiliado=" + afiliado + ", prestador=" + prestador + '}';
    }

    
    
    
    
    
}
