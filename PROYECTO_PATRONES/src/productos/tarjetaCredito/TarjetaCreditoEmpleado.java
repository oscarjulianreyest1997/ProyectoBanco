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
public class TarjetaCreditoEmpleado extends TarjetaCredito{
    public TarjetaCreditoEmpleado() {
        
    }
    
    private TarjetaCreditoEmpleado(TarjetaCreditoEmpleado tarjetaC) {
        super(tarjetaC); 
    }
    

    @Override
    public TarjetaCredito clone() {
        return new TarjetaCreditoEmpleado(this);
    }
    
}
