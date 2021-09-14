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
public class TarjetaDebito18Años extends TarjetaDebito{
    public TarjetaDebito18Años(String id){
        this.id = id;
        this.tieneLimite = true;
        this.limiteTransaccion = 200000;
    }
    
    private TarjetaDebito18Años(TarjetaDebito18Años tarjetaD) {
        super(tarjetaD); 
    }

    @Override
    public TarjetaDebito clone() {
        return new TarjetaDebito18Años(this);
    }
}
