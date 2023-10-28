package Entidades;

public class Administrativo {
    
    private int idAdministrativo;
    private String usuario, contraseña;

    public Administrativo(int idAdministrativo, String usuario, String contraseña) {
        this.idAdministrativo = idAdministrativo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Administrativo(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Administrativo"+ idAdministrativo +  usuario + "="+ contraseña + "\n";
    }
    
    
       

}