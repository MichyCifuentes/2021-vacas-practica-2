package src.peliculas;

import src.tienda.*;

public class VectorPeliculas {

    private Pelicula[] listaPeliculas = new Pelicula[50];
    private String[] categorias = {"Accion", "Animacion", "Ciencia Ficcion", "Comedia", "Drama", "Romantica", "Terror"};
    private int siguientePelicula;

    public VectorPeliculas() {
        siguientePelicula = 1;
    }

    public void agregarPelicula(String nombre, String categoria, int anio){
        if (siguientePelicula > 50){
            System.out.println("Limite de peliculas alcanzado");
        }
        else{
            listaPeliculas[(siguientePelicula-1)] = new Pelicula(nombre, categoria, anio);
        }
        siguientePelicula++;
    }

    public void agregarPelicula(){
        String nombrePelicula = IngresoDatos.getTexto("Ingrese el nombre de la Pelicula");
        String categoriaPelicula = asignarCategoria();
        int anio = IngresoDatos.getEntero("Ingrese el anio de la pelicula", false);
        agregarPelicula(nombrePelicula, categoriaPelicula, anio);
    }

    public void mostrarPeliculas() {
        System.out.println("\n Listado de Peliculas\n");
        for (int i = 0; i < siguientePelicula-1; i++) {
            System.out.println(" " + (i+1) + ". " + listaPeliculas[i].mostrarInformacionPelicula());
        }
    }

    public String asignarCategoria() {
        System.out.println("\nCategoria de Peliculas:\n");
        for (int i = 0; i < categorias.length; i++) {
            System.out.println(" " + (i+1) + ". "+categorias[i]);
        }
        int opcion = IngresoDatos.getEntero("Ingrese el numero de la categoria: ", false);
        return categorias[opcion-1];
    }

    // 0.85*16 + 37*16 + 0.54*16 + 15 + 2  
    public void ordenarPeliculaPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguientePelicula-1); i++) {
            for (int j = 0; j < (siguientePelicula-1-i); j++) {

                if (ascendente) {
                    cambio = (listaPeliculas[j].getNombre().compareToIgnoreCase(listaPeliculas[j+1].getNombre()) > 0 );
                } else { 
                    cambio = (listaPeliculas[j].getNombre().compareToIgnoreCase(listaPeliculas[j+1].getNombre()) < 0 );
                }

                if(cambio){
                    //clientes i va antes que clientes j <0 descendente
                    Pelicula aux = listaPeliculas[j];
                    listaPeliculas[j] = listaPeliculas[j+1];
                    listaPeliculas[j+1]= aux;
                }
            }
        }

    }

    public void mostrarPeliculasDisponibles() {

    }

}
