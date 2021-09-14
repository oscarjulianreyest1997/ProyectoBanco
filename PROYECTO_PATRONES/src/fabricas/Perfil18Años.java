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
    
    public CuentaAhorro crearCuentaAhorros(){    
        return new CuentaAhorro18Años();
    }
    
    public CuentaCorriente crearCuentaCorriente(){
        return new CuentaCorriente18Años();
    }
    
    public TarjetaCredito crearTarjetaCredito(){
        return new TarjetaCredito18Años();  
    }
    public TarjetaDebito crearTarjetaDebito(){
        return new TarjetaDebito18Años();
    }
    public CDT crearCDT(){
       return new Cdt18Años(); 
    }
    public CreditoRotativo crearRotativo(){
      return new CreditoRotativo18Años();  
    }
 
    
   
  
}
