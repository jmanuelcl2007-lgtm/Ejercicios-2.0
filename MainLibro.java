package yooooo;

public class MainLibro extends Libro {

    public MainLibro(String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        
    }

    public static void main(String[] args) {
        MainLibro libro = new MainLibro("El Gato negro ", "Edgar Allan Poe", 1843);
        libro.mostrarInformacion();
    }
   

}
