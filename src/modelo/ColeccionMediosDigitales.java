package modelo;

import java.util.List;

public class ColeccionMediosDigitales {

    private List<MedioDigital> mediosDigitales;

    public ColeccionMediosDigitales(List<MedioDigital> mediosDigitales) {
        this.mediosDigitales = mediosDigitales;
    }
    public ColeccionMediosDigitales() {
    }

    public void agregarMedioDigital(MedioDigital medioDigital) {
        if (medioDigital instanceof Revista) {
            mediosDigitales.add((Revista) medioDigital);
        } else if (medioDigital instanceof Periodico) {
            mediosDigitales.add((Periodico) medioDigital);
        } else if (medioDigital instanceof Libro) {
            mediosDigitales.add((Libro) medioDigital);
        }
    }

    public void eliminarMedioDigital(MedioDigital medioDigital) {
        mediosDigitales.remove(medioDigital);
    }

    public List<MedioDigital> getMediosDigitales() {
        return this.mediosDigitales;
    }



}
