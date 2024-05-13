package modelo;

import java.time.LocalDate;

public class Periodico implements MedioDigital{
    private String nombrePeriodico;
    private LocalDate fecha;
    private int id;

    public Periodico(String nombrePeriodico, LocalDate fecha, int id) {
        this.nombrePeriodico = nombrePeriodico;
        this.fecha = fecha;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Periodico;"+nombrePeriodico + ";" + fecha + ";" + id;
    }
}
