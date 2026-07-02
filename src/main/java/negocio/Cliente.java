package negocio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombreCompleto;
    private String dni;
    private String telefono;
    private String email;
    private String direccion;
    private List<Expediente> expedientes;


    public Cliente () {

    }
    public Cliente (String nombreCompleto, String dni, String telefono, String email, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;

        this.expedientes = new ArrayList<>();
    }

    public void agregarExpediente(Expediente nuevoExpediente) {
        this.expedientes.add(nuevoExpediente);
    }

    public String getNombreCompleto() {
        String nombreAux = this.nombreCompleto;
        return nombreAux;
    }

    public String getDni() {
        String dniAux = dni;
        return dniAux;
    }

    public String getTelefono() {
        String telefonoAux = this.telefono;
        return telefonoAux;
    }

    public String getEmail() {
        String emailAux = this.email;
        return emailAux;
    }

    public String getDireccion() {
        String direccionAux = this.direccion;
        return direccionAux;
    }

    public List<Expediente> getExpedientes() {
        List<Expediente> expedientesAux = this.expedientes;
        return expedientesAux;
    }
}
