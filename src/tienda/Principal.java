package src.tienda;

import src.clientes.VectorClientes;
import src.peliculas.VectorPeliculas;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private VectorPeliculas tablaPeliculas = new VectorPeliculas();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("\n\nBienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascendente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5) Ingreso de Peliculas");
            System.out.println("6) Mostrar Peliculas");
            System.out.println("7) Ordenar Peliculas Ascendente");
            System.out.println("8) Ordenar Peliculas Descendente");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }
            if (menu == 5) {
                tablaPeliculas.agregarPelicula();
            }
            if (menu == 6) {
                tablaPeliculas.mostrarPeliculas();
            }
            if (menu == 7) {
                tablaPeliculas.ordenarPeliculaPorNombre(true);
                tablaPeliculas.mostrarPeliculas();
            }
            if (menu == 8) {
                tablaPeliculas.ordenarPeliculaPorNombre(false);
                tablaPeliculas.mostrarPeliculas();
            }

        }

    }

    
}
