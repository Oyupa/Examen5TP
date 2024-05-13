package utils;

import modelo.ColeccionMediosDigitales;
import modelo.MedioDigital;

import java.io.*;

public class FileManager {
    public static void guardarDatos(ColeccionMediosDigitales coleccionMediosDigitales) {
        File file = new File("data\\datos.txt");
        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (MedioDigital medioDigital : coleccionMediosDigitales.getMediosDigitales()) {
                bufferedWriter.write(medioDigital.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ColeccionMediosDigitales leerMediosDigitales() {
        ColeccionMediosDigitales coleccionMediosDigitales = new ColeccionMediosDigitales();
        File file = new File("data\\datos.txt");
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            while (line != null) {
                String[] parts = line.split(";");
                switch (parts[0]) {
                    case "Revista" -> coleccionMediosDigitales.agregarMedioDigital(new modelo.Revista(parts[1], Integer.parseInt(parts[2])));
                    case "Periodico" -> coleccionMediosDigitales.agregarMedioDigital(new modelo.Periodico(parts[1], java.time.LocalDate.parse(parts[2]), Integer.parseInt(parts[3])));
                    case "Libro" -> coleccionMediosDigitales.agregarMedioDigital(new modelo.Libro(parts[1], parts[2], parts[3], Integer.parseInt(parts[4])));
                    default -> System.out.println("No se reconoce el tipo de medio digital");
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return coleccionMediosDigitales;
    }
}
