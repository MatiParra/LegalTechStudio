package negocio;

import java.util.ArrayList;
import java.util.List;

public class Expediente {

    private String numeroExpediente;
    private String caratula;
    private String fuero;
    private String juzgado;
    private Estado estado;
    private String contraparte;

    private List<Evento> eventos;
    private FichaFinanciera ficha;

    public Expediente () {

    }

    public Expediente (String numeroExpediente, String caratula, String fuero, String juzgado, String contraparte) {
        this.numeroExpediente = numeroExpediente;
        this.caratula = caratula;
        this.fuero = fuero;
        this.juzgado = juzgado;
        this.contraparte = contraparte;

        this.estado = Estado.INICIADO;
        this.eventos = new ArrayList<>();
        this.ficha = new FichaFinanciera();

    }

    public Expediente (String numeroExpediente, String caratula, String fuero, String juzgado, String contraparte, Estado estado) {
        this.numeroExpediente = numeroExpediente;
        this.caratula = caratula;
        this.fuero = fuero;
        this.juzgado = juzgado;
        this.contraparte = contraparte;

        this.estado = estado;

    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public String getCaratula() {
        return caratula;
    }

    public String getFuero() {
        return fuero;
    }

    public String getJuzgado() {
        return juzgado;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getContraparte() {
        return contraparte;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public FichaFinanciera getFicha() {
        return ficha;
    }
}
