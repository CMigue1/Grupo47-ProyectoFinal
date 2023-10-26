/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Miguel
 */
public class Plan {
    private int idPlan;
    private String tipoDePlan;
    private double precio;
    private int adherentes;

    public Plan() {
    }

    public Plan(int idPlan, String tipoDePlan, double precio, int adherentes) {
        this.idPlan = idPlan;
        this.tipoDePlan = tipoDePlan;
        this.precio = precio;
        this.adherentes = adherentes;
    }

    public Plan(String tipoDePlan, double precio, int adherentes) {
        this.tipoDePlan = tipoDePlan;
        this.precio = precio;
        this.adherentes = adherentes;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getTipoDePlan() {
        return tipoDePlan;
    }

    public void setTipoDePlan(String tipoDePlan) {
        this.tipoDePlan = tipoDePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAdherentes() {
        return adherentes;
    }

    public void setAdherentes(int adherentes) {
        this.adherentes = adherentes;
    }

    @Override
    public String toString() {
        return  tipoDePlan;
    }
    
    
    
}
