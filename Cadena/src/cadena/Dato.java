/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.util.Date;

/**
 *
 * @author CARITO
 */
public class Dato {
    private Date fechae;
    private Date fecha_s;
    private Eslabon eslabonE;
    private Eslabon eslabonS;

    public Dato(Date fechae, Date fecha_s, Eslabon eslabonE, Eslabon eslabonS) {
        this.fechae = fechae;
        this.fecha_s = fecha_s;
        this.eslabonE = eslabonE;
        this.eslabonS = eslabonS;
    }

    public Dato(Date fechae, Eslabon eslabonE) {
        this.fechae = fechae;
        this.eslabonE = eslabonE;
    }

    public Date getFechae() {
        return fechae;
    }

    public void setFechae(Date fechae) {
        this.fechae = fechae;
    }

    public Date getFechas() {
        return fecha_s;
    }

    public void setFechas(Date fechas) {
        this.fecha_s = fechas;
    }

    public Eslabon getEslabonE() {
        return eslabonE;
    }

    public void setEslabonE(Eslabon eslabonE) {
        this.eslabonE = eslabonE;
    }

    public Eslabon getEslabonS() {
        return eslabonS;
    }

    public void setEslabonS(Eslabon eslabonS) {
        this.eslabonS = eslabonS;
    }
    
    
}
