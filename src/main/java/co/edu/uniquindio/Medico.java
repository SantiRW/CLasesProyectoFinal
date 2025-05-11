package co.edu.uniquindio;

public class Medico extends Persona{
    private String especialidad;
    private ArrayList<Paciente> listpacientes;

    public Medico(String nombre, String id, String correo, String edad) {
        super(nombre, id, correo, edad);
    }

    @Override
    public void recibirNotificacion(String mensaje) {

    }

    public Medico(String nombre, String id, String correo, String edad, String especialidad, ArrayList<Paciente> listpacientes) {
        super(nombre, id, correo, edad);
        this.especialidad = especialidad;
        this.listpacientes = listpacientes;
    }

    //CRUD para Diagnóstico
    public void crearDiagnostico(Paciente paciente, String diagnostico) {

    }

    public void leerDiagnostico(Paciente paciente) {
        paciente.mostrarHistorial();
    }

    public void actualizarDiagnostico(Paciente paciente, String nuevoDiagnostico) {

    }

    public void eliminarDiagnostico(Paciente paciente) {

    }
    // CRUD para Tratamiento
    public void crearTratamiento(Paciente paciente, String tratamiento) {

    }

    public void leerTratamiento(Paciente paciente) {

        paciente.mostrarTratamientos();
    }

    public void actualizarTratamiento(Paciente paciente, String nuevoTratamiento) {

    }

    public void eliminarTratamiento(Paciente paciente) {

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Paciente> getListpacientes() {
        return listpacientes;
    }

    public void setListpacientes(ArrayList<Paciente> listpacientes) {
        this.listpacientes = listpacientes;
    }
}
