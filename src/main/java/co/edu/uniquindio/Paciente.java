package co.edu.uniquindio;

public class Paciente extends Persona{

    private ArrayList<String> listhistorialMedico;
    private ArrayList<String> listTratamientos;
    private ArrayList<Cita> listcitas;

    public Paciente(String nombre, String id, String correo, String edad, ArrayList<String> historialMedico, ArrayList<String> tratamientos, ArrayList<Cita> citas) {
        super(nombre, id, correo, edad);
        this.listhistorialMedico = listhistorialMedico;
        this.listTratamientos = listTratamientos;
        this.listcitas = listcitas;
    }

    // Métodos para el historial médico
    public void agregarDiagnostico(String diagnostico) {
        listhistorialMedico.add(diagnostico);
    }

    public void mostrarHistorial() {
        for (String diag : listhistorialMedico) {

        }
    }

    // Métodos para tratamientos
    public void agregarTratamiento(String tratamiento) {
        listTratamientos.add(tratamiento);
    }

    public void mostrarTratamientos() {
        for (String trat : listTratamientos) {

        }
    }

    // Métodos para citas
    public void solicitarCita(Cita cita) {
        listcitas.add(cita);

    }

    public void cancelarCita(Cita cita) {
        listcitas.remove(cita);

    }

    // Implementación del metodo abstracto
    @Override
    public void recibirNotificacion(String mensaje) {

    }

    // Métodos Getters
    public ArrayList<String> getHistorialMedico() { return listhistorialMedico; }
    public ArrayList<String> getTratamientos() { return listTratamientos; }
    public ArrayList<Cita> getCitas() { return listcitas; }

}
