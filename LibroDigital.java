package yooooo;

public class LibroDigital  extends Libro {
    public String formato;
    public double tamañoArchivo;

    public LibroDigital(String titulo, String autor, int anioPublicacion, String formato, double tamañoArchivo) {
        super(titulo, autor, anioPublicacion);
        this.formato = formato;
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Formato: " + formato);
        System.out.println("Tamaño del archivo: " + tamañoArchivo + " MB");
    }

}
