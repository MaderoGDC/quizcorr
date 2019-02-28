/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.time.*;
import java.util.*;


/**
 *
 * @author CARITO
 */
public class Main {
    public static void main(String[] args) {
        Farmer x = new Farmer("Granja_X", "produce_leche", "ViaCota-km2");
        Farmer y = new Farmer("Garcja_Y","produce_harina","ViaSubachoche-km7");
        Manufacturer w = new Manufacturer("Manufacturera_W","Hace_pan","PuentePiedra");
        Distribution d = new Distribution("Distribucion_D","Centro_de_distribucion" ,"Subachoque");
        Retail r = new Retail("Comercializadora_R", "comercializadora_de_pan", "Cortijo");     
        
        Scanner lectura = new Scanner(System.in);
        int a = 0;
        String n = "BaseDatos.txt";
        do{
            System.out.println("Digite una opcion: ");
            System.out.println("1.Generar un producto(como cadena de suministro)");
            System.out.println("2.Adquirir un producto());
            
        }while(a<2);
      }                   
    }
        //GestionArchivo g = new GestionArchivo(n);








//        LocalDate n = LocalDate.of(2019, 2, 27);
//        System.out.println(n);
//        System.out.println(n.getDayOfMonth());
//        int o = n.getDayOfMonth();
//        Integer p = n.getMonthValue();
//        System.out.println("dia: "+ o);
//        System.out.println("mes: "+ p);
//        Farmer farmer = new Farmer("McDonald","El viejo tenia una granja", "iaiaoh");
//        Dato dato = new Dato(LocalDate.of(1900, 2,1 ), farmer);
//        System.out.println("dato: "+ dato.getFechae());
//        LocalDate hoy = LocalDate.now();
//        System.out.println("hoy:" + hoy);
    }
    
}
