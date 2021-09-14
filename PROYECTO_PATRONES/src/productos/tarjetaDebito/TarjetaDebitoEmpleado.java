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
public class TarjetaDebitoEmpleado extends TarjetaDebito{
    public TarjetaDebitoEmpleado(String id){
        this.id = id;
        this.tieneLimite = false;
    }
    
    private TarjetaDebitoEmpleado(TarjetaDebitoEmpleado tarjetaD) {
        super(tarjetaD); 
    }

    @Override
    public TarjetaDebito clone() {
        return new TarjetaDebitoEmpleado(this);
    }
}

