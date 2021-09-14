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
import productos.cdt.Cdt18Años;
import productos.creditoRotativo.CreditoRotativo18Años;
import productos.cuentaAhorros.CuentaAhorro18Años;
import productos.cuentaCorriente.CuentaCorriente18Años;
import productos.tarjetaCredito.TarjetaCredito18Años;
import productos.tarjetaDebito.TarjetaDebito18Años;

/**
 *
 * @author alejonba0498
 */
public class Perfil18Años implements IBanco{
    
    public CuentaAhorro crearCuentaAhorros(String id){    
        return new CuentaAhorro18Años(id);
    }
    
    public CuentaCorriente crearCuentaCorriente(String id){
        return new CuentaCorriente18Años(id);
    }
    
    public TarjetaCredito crearTarjetaCredito(String id){
        return new TarjetaCredito18Años(id);  
    }
    public TarjetaDebito crearTarjetaDebito(String id){
        return new TarjetaDebito18Años(id);
    }
    public CDT crearCDT(String id){
       return new Cdt18Años(id); 
    }
    
    public CreditoRotativo crearRotativo(String id){
      return new CreditoRotativo18Años(id);  
    }
 
    
   
  
}
