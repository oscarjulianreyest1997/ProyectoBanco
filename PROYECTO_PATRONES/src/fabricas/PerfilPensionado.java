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
    
    public CuentaAhorro crearCuentaAhorros(String id){
         return new CuentaAhorroPensionado(id);
    }
    
    public CuentaCorriente crearCuentaCorriente(String id){
        return new CuentaCorrientePensionado(id);
    }
    
    public TarjetaCredito crearTarjetaCredito(String id){
        return new TarjetaCreditoPensionado(id);
    }
    
    public TarjetaDebito crearTarjetaDebito(String id){
        return new TarjetaDebitoPensionado(id);
    }
    
    public CDT crearCDT(String id){
       return new CdtPensionado(id); 
    }
    
    public CreditoRotativo crearRotativo(String id){
      return new CreditoRotativoPensionado(id); 
    }
}
