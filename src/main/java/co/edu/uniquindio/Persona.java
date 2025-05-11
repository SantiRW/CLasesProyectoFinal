package co.edu.uniquindio;

public abstract class Persona {
    private String nombre;
    private String id;
    private String correo;
    private String edad;

    public Persona(String nombre, String id, String correo, String edad) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.edad = edad;
    }
//Metodo abstracto
    public abstract void recibirNotificacion(String mensaje);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
