package Entidades;

public class Administrativo {
    
    private int idAdministrativo;
    private String usuario,nombre, apellido, contrase�a;

    public Administrativo(int idAdministrativo, String usuario, String contrase�a) {
        this.idAdministrativo = idAdministrativo;
        this.usuario = usuario;
        this.contrase�a = contrase�a;
    }

    public Administrativo(String usuario, String nombre, String apellido, String contrase�a) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrase�a = contrase�a;
    }

    public Administrativo(String usuario, String contrase�a) {
        this.usuario = usuario;
        this.contrase�a = contrase�a;
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

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
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
        return "Administrativo"+ idAdministrativo +  usuario + "="+ contrase�a + "\n";
    }
    
    
       

}