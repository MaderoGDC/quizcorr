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
public class Distribution extends Eslabon{
    
    private ArrayList<ProductoM> productos;
    
    public Distribution(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        
    }

    public Distribution(ArrayList<ProductoM> productos, String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        this.productos = productos;
    }
    public void AgrPm(ProductoM pc){
        this.productos.add(pc);
    }
    public void enviar( Retail r, Date fecha_s){
         for (ProductoM p : productos) {
            Dato d1 = new Dato(fecha_s, r); 
            p.datos.get(1).setEslabonE(p.datos.get(0).getEslabonS());
            p.datos.get(1).setFechae(p.datos.get(0).getFechas());
            r.AgrPm(p);
           
            }
        productos.clear();
    }
}
