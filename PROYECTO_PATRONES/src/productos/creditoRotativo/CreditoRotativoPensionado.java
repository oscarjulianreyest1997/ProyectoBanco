/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.creditoRotativo;

import productos.CreditoRotativo;
import productos.CuentaAhorro;

/**
 *
 * @author alejonba0498
 */
public class CreditoRotativoPensionado extends CreditoRotativo{
      public CreditoRotativoPensionado(String id) {
        this.id = id;
        this.cupo = 5000000;
    }
    
    private CreditoRotativoPensionado(CreditoRotativoPensionado tarjetaD) {
        super(tarjetaD); 
    }

    @Override
    public CreditoRotativo clone() {
        return new CreditoRotativoPensionado(this);
    }
}
