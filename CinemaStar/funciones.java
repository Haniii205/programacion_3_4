
public class funciones {
    private Peliculas pelicula;
    private Salas sala;
    private String hora;

public funciones(Peliculas pelicula, Salas sala, String hora) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.hora = hora;
}public Peliculas getPelicula() {
        return pelicula;
    }
    
    public Salas getSala() {
        return sala;
    }
    
    public String getHora() {
        return hora;
    } public void mostrar() {
        System.out.println(pelicula.getNombre() + " - Sala " + sala.getNumero() + " - " + hora);
    }
}