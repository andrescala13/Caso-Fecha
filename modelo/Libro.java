package modelo;
public class Libro {
    private String titulo;
    private String autor;
    private int edicion;
    private int ediciondelujo;

    //constructor por defecto
    public Libro() {
    }

    //constructor con parámetros
    public Libro(String titulo, String autor, int edicion, int prestados) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.edicion= edicion;
        this.ediciondelujo = ediciondelujo;
    }

    //getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getEdiciondelujo() {
        return ediciondelujo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    //método toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "el titulo del libro es: " + titulo + "\n✓ El autor es: " + autor +
                  "\n✓ El año de edicion del libro es: " + edicion + "\n La colecion es: " + ediciondelujo;                                    
    }
   
  
}