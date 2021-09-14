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
import productos.cdt.CdtDesempleado;
import productos.creditoRotativo.CreditoRotativoDesempleado;
import productos.cuentaAhorros.CuentaAhorroDesempleado;
import productos.cuentaCorriente.CuentaCorrienteDesempleado;
import productos.tarjetaCredito.TarjetaCreditoDesempleado;
import productos.tarjetaDebito.TarjetaDebitoDesempleado;

/**
 *
 * @author alejonba0498
 */
public class PerfilDesempleado implements IBanco {
    
    public CuentaAhorro crearCuentaAhorros(){
        
         return new CuentaAhorroDesempleado();
     }
    public CuentaCorriente crearCuentaCorriente(){
        return new CuentaCorrienteDesempleado();
    }
    public TarjetaCredito crearTarjetaCredito(){
        return new TarjetaCreditoDesempleado();
        
    }
    public TarjetaDebito crearTarjetaDebito(){
        return new TarjetaDebitoDesempleado();
        
    }
    public CDT crearCDT(){
       return new CdtDesempleado(); 
    }
    public CreditoRotativo crearRotativo(){
      return new CreditoRotativoDesempleado();  
    }
    
    
}
