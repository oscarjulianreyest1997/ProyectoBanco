/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.tarjetaDebito;

import productos.TarjetaDebito;

/**
 *
 * @author alejonba0498
 */
public class TarjetaDebitoDesempleado extends TarjetaDebito {
    
    public TarjetaDebitoDesempleado() {
        
    }
    
    private TarjetaDebitoDesempleado(TarjetaDebitoDesempleado tarjetaD) {
        super(tarjetaD); 
    }

    @Override
    public TarjetaDebito clone() {
        return new TarjetaDebitoDesempleado(this);
    }
    
}
