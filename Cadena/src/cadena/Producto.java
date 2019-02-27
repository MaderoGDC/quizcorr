/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author CARITO
 */
public abstract class Producto {
    protected String nombre;
    protected ArrayList<Dato> datos;

    public Producto(String nombre, Date fecha_e, Eslabon eslabon) {
        this.nombre = nombre;
        this.datos = new ArrayList<>();
        Dato datoinicial = new Dato(fecha_e, eslabon);
        this.datos.add(datoinicial);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Dato> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Dato> datos) {
        this.datos = datos;
    }
    
    public void addDato(Dato dato){
        this.datos.add(dato);
    }
}
