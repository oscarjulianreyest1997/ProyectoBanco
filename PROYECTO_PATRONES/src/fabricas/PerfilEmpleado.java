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
   
    public CuentaAhorro crearCuentaAhorros(String id){
         return new CuentaAhorroEmpleado(id);
     }
    
    public CuentaCorriente crearCuentaCorriente(String id){
        return new CuentaCorrienteEmpleado(id);
    }
    
    public TarjetaCredito crearTarjetaCredito(String id){
        return new TarjetaCreditoEmpleado(id);
    }
    
    public TarjetaDebito crearTarjetaDebito(String id){
        return new TarjetaDebitoEmpleado(id);
    }
    
    public CDT crearCDT(String id){
       return new CdtEmpleado(id); 
    }
    
    public CreditoRotativo crearRotativo(String id){
      return new CreditoRotativoEmpleado(id);  
    }
    
    
    
    
}
