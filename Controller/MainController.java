package Controller;


import Model.*;
import Utils.UI;
import View.MainView;

import java.util.Scanner;


public class MainController {
    Almacen liga = new Almacen();

    public void start() {
        Almacen ligadearchivo = (Almacen) Guardar.desearize("liga.bin");
        if (ligadearchivo != null) {
            liga = ligadearchivo;
        }
        int opcion;

        MainView.bienvenida();
        do {
            opcion = MainView.menuSistema();
            int tipoPersonaje;
            switch (opcion) {
                case 0:
                    UI.LeeString("Gracias por usar la aplicación");
                    break;
                case 1:
                    listarPersonaje();
                    break;
                case 2:
                    CrearPersonaje();
                    break;
                case 3:
                    borrarPersonaje();
                    break;
                case 4:
                    Guardar.serialize(liga, "liga.bin");
                    break;
                case 5:
                    editarPersonaje();
                default:
                    System.out.println("error");
            }
        } while (opcion != 0);

    }


    public void CrearPersonaje() {
        Marvel marvel = null;
        switch (MainView.menuAnadirTipoPersonaje()) {
            case 1:
                Marvel superheroe = new Superheroe(
                        UI.LeeString("Introduce Nombre: "),
                        UI.LeeString("Introduce Sexo"),
                        UI.LeeString("Introduce Origen "),
                        UI.LeeString("Introduce Poder"),
                        UI.LeeString("Introduce Grupo"),
                        UI.LeeString("Introduce Equipamiento"));
                marvel = superheroe;
                break;
            case 2:
                Marvel villano = new Villano(
                        UI.LeeString("Introduce Nombre: "),
                        UI.LeeString("Introduce Sexo"),
                        UI.LeeString("Introduce Origen "),
                        UI.LeeString("Introduce Poder"),
                        UI.LeeString("Introduce Equipamiento"),
                        UI.LeeString("Introduce Plan Maestro"));
                marvel = villano;
                break;
            case 3:
                Marvel antiheroe = new Antiheroe(
                        UI.LeeString("Introduce Nombre: "),
                        UI.LeeString("Introduce Sexo"),
                        UI.LeeString("Introduce Origen "),
                        UI.LeeString("Introduce Poder"),
                        UI.LeeString("Introduce Equipamiento"),
                        UI.LeeBoolean("Introduce [true or false]\ntrue bueno\nfalse malo"));
                marvel = antiheroe;
                break;
        }
        if (marvel != null) {
            liga.addMarvel(marvel);
        }

        System.out.println();
    }

    public void listarPersonaje() {

        switch (MainView.menuTipoPersonaje()) {

            case 0:
                break;
            case 1:

                UI.LeeString("Listado de superheroes ");
                UI.ImprimeString(liga.obtenerSuperheroes().toString());
                break;
            case 2:
                UI.LeeString("Listado de villanos ");
                UI.ImprimeString(liga.obtenerVillanos().toString());
                break;
            case 3:
                UI.LeeString("listado de antiheroes ");
                UI.ImprimeString(liga.obtenerAntiheroe().toString());

            case 4:
                UI.ImprimeString(liga.obtenerAntiheroe().toString());
                UI.ImprimeString(liga.obtenerSuperheroes().toString());
                UI.ImprimeString(liga.obtenerVillanos().toString());
                break;

            default:
                UI.LeeString("error");

        }
    }

    public String borrarPersonaje() {
        String nombre = "";
        boolean borrado = false;
        switch (MainView.menuBorrarTipoPersonaje()) {
            case 1:
                nombre = UI.LeeString("Borrar SuperHeroes");
                borrado = liga.borrarSuperheroe(nombre);
                if (borrado == true)
                    System.out.println("Borrado SuperHeroe correcta mente");
                break;
            case 2:
                nombre = UI.LeeString("Borrar villano");
                borrado = liga.borrarVillano(nombre);
                if (borrado == true)
                    System.out.println("Borrado Villano correcta mente");
                break;
            case 3:
                nombre = UI.LeeString("Borrar Antiheroe");
                borrado = liga.borrarAntiheroe(nombre);
                if (borrado == true)
                    System.out.println("Borrado Antiheroe correcta mente");
                break;
            default:
                System.out.println("Nombre mal introducido");
        }
        return nombre;
    }


    public String editarPersonaje() {
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        Marvel marvel;
        // Pedir nombre
        UI.ImprimeString("Escribe el nombre del personaje a editar");
        teclado.nextLine();
        // Buscar personaje
        marvel=liga.buscaPorNombre(nombre);
        // campo a campo y actualizando

        // eliminar antiguo
        // añadir nuevo
        return nombre;
    }
}