package negocio;

import java.util.ArrayList;
import java.util.List;

public class Estudio {

    private List<Cliente> clientes;

    public Estudio() {

        this.clientes = new ArrayList<>();
    }

    public boolean altaCliente(String nombreCompleto, String dni, String telefono, String email, String direccion) {
        if (nombreCompleto == null || nombreCompleto.isBlank()) {
            return false;
        }

        Cliente nuevoCliente = new Cliente(nombreCompleto, dni, telefono, email, direccion);
        return agregarCliente(nuevoCliente);
    }

    public boolean agregarCliente(Cliente cliente) {
        if (cliente == null) {
            return false;
        }
        if (cliente.getDni() == null || cliente.getDni().isBlank()) {
            return false;
        }
        if (existeClienteConDni(cliente.getDni())) {
            return false;
        }

        this.clientes.add(cliente);
        return true;
    }

    private boolean existeClienteConDni(String dni) {
        for (Cliente c : this.clientes) {
            if (c.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }

    public List<Cliente> getClientes() {

        return new ArrayList<>(this.clientes);
    }
}
