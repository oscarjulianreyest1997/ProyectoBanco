/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        
package fabricas;
import productos.CuentaAhorro;
import productos.*;
/**
 *
 * @author alejonba0498
 */
public interface IBanco {
   
    public CuentaAhorro crearCuentaAhorros();
    public CuentaCorriente crearCuentaCorriente();
    public TarjetaCredito crearTarjetaCredito();
    public TarjetaDebito crearTarjetaDebito();
    public CDT crearCDT();
    public CreditoRotativo crearRotativo();
    
}
