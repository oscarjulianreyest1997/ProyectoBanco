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

/**
 *
 * @author alejonba0498
 */
public class PerfilEmpleado implements IBanco {

    @Override
    public CuentaAhorro crearCuentaAhorros(String id) {
        return new CuentaAhorro(id, false);
    }

    @Override
    public CuentaCorriente crearCuentaCorriente(String id) {
        return new CuentaCorriente(id, true);
    }

    @Override
    public TarjetaCredito crearTarjetaCredito(String id) {
        return new TarjetaCredito(id, 3500000);
    }

    @Override
    public TarjetaDebito crearTarjetaDebito(String id) {
        return new TarjetaDebito(id, false, -1);
    }

    @Override
    public CDT crearCDT(String id) {
        return new CDT(id, 1000000, 5);
    }

    @Override
    public CreditoRotativo crearRotativo(String id) {
        return new CreditoRotativo(id, 2000000);
    }

}
