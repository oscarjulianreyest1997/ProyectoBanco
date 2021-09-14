/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.tarjetaCredito;

import productos.TarjetaCredito;

/**
 *
 * @author alejonba0498
 */
public class TarjetaCreditoPensionado extends TarjetaCredito{
    
    public TarjetaCreditoPensionado(String id){
        this.id = id;
        this.cupo = 10000000;
    }
    
    private TarjetaCreditoPensionado(TarjetaCreditoPensionado tarjetaC) {
        super(tarjetaC); 
    }

    @Override
    public TarjetaCredito clone() {
        return new TarjetaCreditoPensionado(this);
    }
    
    
}
