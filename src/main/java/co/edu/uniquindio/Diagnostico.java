package co.edu.uniquindio;
import java.util.Date;

public class Diagnostico {
    private Date fecha;
    private String descripcion;

    // Constructor
    public Diagnostico(Date fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Descripción: " + descripcion;
    }
}
