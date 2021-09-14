/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.cuentaAhorros;

import productos.CDT;
import productos.CuentaAhorro;

/**
 *
 * @author alejonba0498
 */
public class CuentaAhorroEmpleado extends CuentaAhorro{
    
    public CuentaAhorroEmpleado() {
        
    }
    
    private CuentaAhorroEmpleado(CuentaAhorroEmpleado cuentaA) {
        super(cuentaA); 
    }

    @Override
    public CuentaAhorro clone() {
        return new CuentaAhorroEmpleado(this);
    }
    
    
}
