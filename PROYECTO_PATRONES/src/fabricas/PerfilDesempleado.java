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
    
    public CuentaAhorro crearCuentaAhorros(String id){
         return new CuentaAhorroDesempleado(id);
     }
    
    public CuentaCorriente crearCuentaCorriente(String id){
        return new CuentaCorrienteDesempleado(id);
    }
    public TarjetaCredito crearTarjetaCredito(String id){
        return new TarjetaCreditoDesempleado(id);
    }
    
    public TarjetaDebito crearTarjetaDebito(String id){
        return new TarjetaDebitoDesempleado(id);
    }
    
    public CDT crearCDT(String id){
       return new CdtDesempleado(id); 
    }
    public CreditoRotativo crearRotativo(String id){
      return new CreditoRotativoDesempleado(id);  
    }
    
    
}
