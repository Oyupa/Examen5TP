package modelo;

public class Libro implements MedioDigital{
    private String titulo;
    private String autor;
    private String editorial;
    private int id;

    public Libro(String titulo, String autor, String editorial, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Libro;"+titulo + ";" + autor + ";" + editorial + ";" + id ;
    }
}
