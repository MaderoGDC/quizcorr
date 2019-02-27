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
public class ProductoM extends Producto{
    private ArrayList<Producto> Mp;
    private int Lote;
    private Integer cod ;
    private Double precio;

    public ProductoM(ArrayList<Producto> Mp, int Lote, String nombre, Date fecha_e, Eslabon eslabon) {
        super(nombre, fecha_e, eslabon);
        this.Mp = Mp;
        this.Lote = Lote;
        this.cod = null;
        this.precio = 0.0;
    }


    public ProductoM(ArrayList<Producto> Mp, String nombre, Date fecha_e, Eslabon eslabon) {
        super(nombre, fecha_e, eslabon);
        this.Mp = Mp;
    }
    
    @Override
    public void addDato(Dato dato) {
        super.addDato(dato); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDatos(ArrayList<Dato> datos) {
        super.setDatos(datos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Dato> getDatos() {
        return super.getDatos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
