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
public class CuentaCorrienteDesempleado extends CuentaCorriente{
    
     public CuentaCorrienteDesempleado() {
        
    }
    
    private CuentaCorrienteDesempleado(CuentaCorrienteDesempleado cuentaC) {
        super(cuentaC); 
    }

    @Override
    public CuentaCorriente clone() {
        return new CuentaCorrienteDesempleado(this);
    }
}
