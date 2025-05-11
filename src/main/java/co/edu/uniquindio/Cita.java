package co.edu.uniquindio;

import java.util.Date;

public class Cita {
    private int idCita;
    private Date fecha;
    private String motivo;
    private Medico medico;
    private Paciente paciente;

    // Constructor
    public Cita(int idCita, Date fecha, String motivo, Medico medico, Paciente paciente) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.motivo = motivo;
        this.medico = medico;
        this.paciente = paciente;
    }

    // Getters y Setters
    public int getIdCita() { return idCita; }
    public void setIdCita(int idCita) { this.idCita = idCita; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) { this.medico = medico; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    @Override
    public String toString() {
        return "Cita ID: " + idCita + ", Fecha: " + fecha + ", Motivo: " + motivo + ", Médico: " + medico.getNombre() + ", Paciente: " + paciente.getNombre();
    }
}
