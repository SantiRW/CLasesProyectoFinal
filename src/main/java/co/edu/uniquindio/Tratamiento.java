package co.edu.uniquindio;

import java.util.Date;

public class Tratamiento {
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;

    // Constructor
    public Tratamiento(Date fechaInicio, Date fechaFin, String descripcion) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

    public Date getFechaFin() { return fechaFin; }
    public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "Inicio: " + fechaInicio + ", Fin: " + fechaFin + ", Descripción: " + descripcion;
    }
}
