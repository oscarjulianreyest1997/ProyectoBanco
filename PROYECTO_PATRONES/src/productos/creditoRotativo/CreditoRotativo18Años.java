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
public class CreditoRotativo18Años extends CreditoRotativo {
    public CreditoRotativo18Años() {
        
    }
    
    private CreditoRotativo18Años(CreditoRotativo18Años tarjetaD) {
        super(tarjetaD); 
    }

    @Override
    public CreditoRotativo clone() {
        return new CreditoRotativo18Años(this);
    }
}
