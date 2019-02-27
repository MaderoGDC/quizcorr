package cadena;


import cadena.Eslabon;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CARITO
 */
public class Retail extends Eslabon {
    
    private ArrayList<ProductoM> productos;
    
    public Retail(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
    }
    
    public void AgrPm(ProductoM pc){
        this.productos.add(pc);
    }
    
}
