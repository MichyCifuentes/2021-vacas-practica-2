package src.peliculas;

import java.util.Random;

public class Pelicula {

    private String nombre, categoria;
    private int id, anio;
    private boolean disponible;

    Random random = new Random();

    public Pelicula(String nombre, String categoria, int anio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.id = generarID();
        this.anio = anio;
        this.disponible = true;
    }

    public String mostrarInformacionPelicula() {
        return "ID: " + id + ", Nombre: " + nombre + ", Categoria: "+ categoria + ", Anio: " + anio + ", Estado: " + asignarEstadoPelicula(disponible);
    }

    public int generarID() {
        int idAleatorio = random.nextInt(1000-100)+100;
        return idAleatorio;
    }

    public String asignarEstadoPelicula(boolean disponibilidad) {

        String mensaje;
        if (disponibilidad) {
            mensaje = "Disponible";
        } else {
            mensaje = "Prestada";           
        }
        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    

}
