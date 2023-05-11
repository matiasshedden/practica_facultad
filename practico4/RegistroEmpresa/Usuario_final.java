package practico4.RegistroEmpresa;

public class Usuario_final extends Persona {
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

    public Usuario_final(String nombre_usuario, String password) {
        this.nombre_usuario = nombre_usuario;
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + ", Usuario_final";
    }
}
