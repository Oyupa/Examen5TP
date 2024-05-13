package modelo;

public class Revista implements MedioDigital{
    private String titulo;
    private int id;

    public Revista(String titulo, int id) {
        this.titulo = titulo;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Revista;"+titulo + ";" + id;
    }
}
