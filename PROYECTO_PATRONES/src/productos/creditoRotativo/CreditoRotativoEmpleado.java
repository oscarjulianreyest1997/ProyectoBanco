/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.creditoRotativo;

import productos.CreditoRotativo;

/**
 *
 * @author alejonba0498
 */
public class CreditoRotativoEmpleado extends CreditoRotativo {
    
    public CreditoRotativoEmpleado() {
        
    }
    
    private CreditoRotativoEmpleado(CreditoRotativoEmpleado tarjetaD) {
        super(tarjetaD); 
    }

    @Override
    public CreditoRotativo clone() {
        return new CreditoRotativoEmpleado(this);
    }
}
