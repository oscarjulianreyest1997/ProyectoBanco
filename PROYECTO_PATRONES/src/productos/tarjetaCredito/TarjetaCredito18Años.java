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
public class TarjetaCredito18Años extends TarjetaCredito{
    public TarjetaCredito18Años() {
        
    }
    
    private TarjetaCredito18Años(TarjetaCredito18Años tarjetaC) {
        super(tarjetaC); 
    }

    @Override
    public TarjetaCredito clone() {
        return new TarjetaCredito18Años(this);
    }
    
}
