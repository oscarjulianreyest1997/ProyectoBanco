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
public class CuentaCorriente18Años extends CuentaCorriente{
    public CuentaCorriente18Años() {
        
    }
    
    private CuentaCorriente18Años(CuentaCorriente18Años cuentaC) {
        super(cuentaC); 
    }

    @Override
    public CuentaCorriente clone() {
        return new CuentaCorriente18Años(this);
    }
    
}
