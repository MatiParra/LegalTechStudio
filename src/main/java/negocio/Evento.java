package negocio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Evento {

    private LocalDate fechaVencimiento;
    private LocalTime hora;
    private String descripcion;
    private PrioridadEvento prioridad;


    public Evento () {

    }

    public Evento (LocalDate fechaVencimiento, LocalTime hora, String descripcion, PrioridadEvento prioridad) {

        this.fechaVencimiento = fechaVencimiento;
        this.hora = hora;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }


    public boolean esUrgente () {
        LocalDate hoy = LocalDate.now();
        long diasRestantes = ChronoUnit.DAYS.between(hoy, this.fechaVencimiento);
        return diasRestantes <= 7 && diasRestantes >= 0;
    }


    public boolean cambiarPrioridad (PrioridadEvento prioridad) {

        if (prioridad.equals(PrioridadEvento.ALTA) || prioridad.equals(PrioridadEvento.MEDIA) || prioridad.equals(PrioridadEvento.BAJA)) {
            this.prioridad = prioridad;
            return true;
        }

        return false;
    }


    public LocalDate getFecha() {
        return fechaVencimiento;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public PrioridadEvento getPrioridad() {
        return prioridad;
    }
}
