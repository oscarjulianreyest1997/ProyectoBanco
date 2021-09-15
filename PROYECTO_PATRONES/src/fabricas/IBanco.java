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

    public CuentaAhorro crearCuentaAhorros(String id);

    public CuentaCorriente crearCuentaCorriente(String id);

    public TarjetaCredito crearTarjetaCredito(String id);

    public TarjetaDebito crearTarjetaDebito(String id);

    public CDT crearCDT(String id);

    public CreditoRotativo crearRotativo(String id);

}
