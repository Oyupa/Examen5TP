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
        this.mediosDigitales.add(medioDigital);
    }

    public void eliminarMedioDigital(MedioDigital medioDigital) {
        mediosDigitales.remove(medioDigital);
    }

    public List<MedioDigital> getMediosDigitales() {
        return this.mediosDigitales;
    }



}
