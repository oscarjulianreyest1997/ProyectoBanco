/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.cuentaAhorros;

import productos.CuentaAhorro;

/**
 *
 * @author alejonba0498
 */
public class CuentaAhorroPensionado extends CuentaAhorro{
    
    public CuentaAhorroPensionado(String id){
        this.id = id;
        this.estado = true;
    }
    
    private CuentaAhorroPensionado(CuentaAhorroPensionado cuentaA) {
        super(cuentaA); 
    }

    @Override
    public CuentaAhorro clone() {
        return new CuentaAhorroPensionado(this);
    }
    
}
