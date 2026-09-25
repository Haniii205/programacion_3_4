
public class Peliculas {
        
    private String nombre;
    private String idioma;
    private String tipo;
    private int duracion;

    public Peliculas(String nombre, String idioma, String tipo, int duracion) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.tipo = tipo;
        this.duracion = duracion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getIdioma() {
        return tipo;
    }
    public String getTipo() {
        return nombre;
    }
    public int getDuracion() {
        return duracion;
    }
    public void mostrar() {
        System.out.println(nombre + " - " + idioma + " - " + tipo + " - " + duracion + " min");
    }
}

