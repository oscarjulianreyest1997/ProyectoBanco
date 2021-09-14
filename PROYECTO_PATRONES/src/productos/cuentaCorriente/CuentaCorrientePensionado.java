/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.cuentaCorriente;

import productos.CuentaCorriente;

/**
 *
 * @author alejonba0498
 */
public class CuentaCorrientePensionado extends CuentaCorriente{
       public CuentaCorrientePensionado(String id) {
        this.id = id;
        this.estado = true;
    }
    
    private CuentaCorrientePensionado(CuentaCorrientePensionado cuentaC) {
        super(cuentaC); 
    }

    @Override
    public CuentaCorriente clone() {
        return new CuentaCorrientePensionado(this);
    }
    
}
