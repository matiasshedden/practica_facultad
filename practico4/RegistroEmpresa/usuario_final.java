package practico4.RegistroEmpresa;

public class usuario_final extends persona{
    String nombre_usuario;
    String password;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public usuario_final(String nombre_usuario, String password) {
        this.nombre_usuario = nombre_usuario;
        this.password = password;
    }

    public String mostrarDatos() {
        return super.mostrarDatos();
    }
}
