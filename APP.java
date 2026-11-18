package yooooo;
public class APP extends Persona {
    public APP(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Jose manuel", 19, "Masculino", "josemanuel@example.com", "chema1234");
        usuario.mostrarInformacion();
    }
}



