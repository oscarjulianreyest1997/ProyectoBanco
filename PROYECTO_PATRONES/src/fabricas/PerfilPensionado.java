/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import productos.CDT;
import productos.CreditoRotativo;
import productos.CuentaAhorro;
import productos.CuentaCorriente;
import productos.TarjetaCredito;
import productos.TarjetaDebito;
import productos.cdt.CdtPensionado;
import productos.creditoRotativo.CreditoRotativoPensionado;
import productos.cuentaAhorros.CuentaAhorroPensionado;
import productos.cuentaCorriente.CuentaCorrientePensionado;
import productos.tarjetaCredito.TarjetaCreditoPensionado;
import productos.tarjetaDebito.TarjetaDebitoPensionado;

/**
 *
 * @author alejonba0498
 */
public class PerfilPensionado implements IBanco{
    
    public CuentaAhorro crearCuentaAhorros(){
        
         return new CuentaAhorroPensionado();
     }
    public CuentaCorriente crearCuentaCorriente(){
        
        return new CuentaCorrientePensionado();
    }
    public TarjetaCredito crearTarjetaCredito(){
        return new TarjetaCreditoPensionado();
        
    }
    public TarjetaDebito crearTarjetaDebito(){
        
        return new TarjetaDebitoPensionado();
    }
    public CDT crearCDT(){
       return new CdtPensionado(); 
    }
    public CreditoRotativo crearRotativo(){
      return new CreditoRotativoPensionado(); 
      //------------------------------
    }
}
