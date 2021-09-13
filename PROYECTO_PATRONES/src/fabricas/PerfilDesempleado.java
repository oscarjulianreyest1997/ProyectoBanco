/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import Controlador.IBanco;
import productos.CDT;
import productos.CreditoRotativo;
import productos.CuentaAhorro;
import productos.CuentaCorriente;
import productos.TarjetaCredito;
import productos.TarjetaDebito;

/**
 *
 * @author alejonba0498
 */
public class PerfilDesempleado implements IBanco {
    
    public CuentaAhorro crearCuentaAhorros(){
        
         return new CuentaAhorro();
     }
    public CuentaCorriente crearCuentaCorriente(){
        
        return new CuentaCorriente();
    }
    public TarjetaCredito crearTarjetaCredito(){
        return new TarjetaCredito();
        
    }
    public TarjetaDebito crearTarjetaDebito(){
        
        return new TarjetaDebito();
    }
    public CDT crearCDT(){
       return new CDT(); 
    }
    public CreditoRotativo crearRotativo(){
      return new CreditoRotativo();  
    }
    
    
}
