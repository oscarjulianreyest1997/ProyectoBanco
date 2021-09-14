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
import productos.cdt.CdtEmpleado;
import productos.creditoRotativo.CreditoRotativoEmpleado;
import productos.cuentaAhorros.CuentaAhorroEmpleado;
import productos.cuentaCorriente.CuentaCorrienteEmpleado;
import productos.tarjetaCredito.TarjetaCreditoEmpleado;
import productos.tarjetaDebito.TarjetaDebitoEmpleado;

/**
 *
 * @author alejonba0498
 */
public class PerfilEmpleado implements IBanco {
   
    public CuentaAhorro crearCuentaAhorros(){
         return new CuentaAhorroEmpleado();
     }
    
    public CuentaCorriente crearCuentaCorriente(){
        return new CuentaCorrienteEmpleado();
    }
    
    public TarjetaCredito crearTarjetaCredito(){
        return new TarjetaCreditoEmpleado();
        
    }
    public TarjetaDebito crearTarjetaDebito(){
        
        return new TarjetaDebitoEmpleado();
    }
    
    public CDT crearCDT(){
       return new CdtEmpleado(); 
    }
    
    public CreditoRotativo crearRotativo(){
      return new CreditoRotativoEmpleado();  
    }
    
    
    
    
}
