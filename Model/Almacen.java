package Model;

import Utils.UI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Almacen  implements Serializable {
    ArrayList<Marvel> marvelList = new ArrayList<>();

    public void addMarvel(Marvel m) {
        marvelList.add(m);
    }

    public Marvel buscaPorNombre(String nombre) {
        Marvel resultado = null;
        for (Marvel m : marvelList) {
            if (m.getNombre().equals(nombre)) {
                resultado = m;
                break;
            }
        }
        return resultado;
    }

    public ArrayList<Marvel> obtenerSuperheroes() {
        ArrayList<Marvel> superheroes = new ArrayList<>();

        for (Marvel m : marvelList) {
            if (m.getClass().equals(Superheroe.class)) {
                superheroes.add(m);
            }
        }
        return superheroes;
    }

    public ArrayList<Marvel> obtenerVillanos() {
        ArrayList<Marvel> villanos = new ArrayList<>();

        for (Marvel m : marvelList) {
            if (m.getClass().equals(Villano.class)) {
                villanos.add(m);
            }
        }
        return villanos;
    }

    public ArrayList<Marvel> obtenerAntiheroe() {
        ArrayList<Marvel> antiheroes = new ArrayList<>();

        for (Marvel m : marvelList) {
            if (m.getClass().equals(Antiheroe.class)) {
                antiheroes.add(m);
            }
        }
        return antiheroes;
    }

    public boolean borrarSuperheroe(String nombre) {
        boolean borrado = false;
        Iterator<Marvel> iterator = marvelList.iterator();
        while (iterator.hasNext() && !borrado) {
            Marvel m = iterator.next();
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                borrado = true;

            }
        }
        return borrado;
    }

    public boolean borrarVillano(String nombre) {
        boolean borrado = false;
        Iterator<Marvel> iterator = marvelList.iterator();
        while (iterator.hasNext() && !borrado) {
            Marvel m = iterator.next();
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                borrado = true;

            }
        }
        return borrado;
    }

    public boolean borrarAntiheroe(String nombre) {
        boolean borrado = false;
        Iterator<Marvel> iterator = marvelList.iterator();
        while (iterator.hasNext() && !borrado) {
            Marvel m = iterator.next();
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                borrado = true;
            }
        }
        return borrado;
    }
}