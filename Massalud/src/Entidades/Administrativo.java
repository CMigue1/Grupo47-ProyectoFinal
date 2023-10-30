package Entidades;

public class Administrativo {
    
    private int idAdministrativo;
    private String usuario,nombre, apellido, contraseña;

    public Administrativo(int idAdministrativo, String usuario, String contraseña) {
        this.idAdministrativo = idAdministrativo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Administrativo(String usuario, String nombre, String apellido, String contraseña) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Administrativo"+ idAdministrativo +  usuario + "="+ contraseña + "\n";
    }
    
    
       

}