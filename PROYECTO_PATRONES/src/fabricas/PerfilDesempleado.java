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
public class PerfilDesempleado implements IBanco {

    public CuentaAhorro crearCuentaAhorros(String id) {
        return new CuentaAhorro(id, true);
    }

    public CuentaCorriente crearCuentaCorriente(String id) {
        return new CuentaCorriente(id, true);
    }

    public TarjetaCredito crearTarjetaCredito(String id) {
        return new TarjetaCredito(id, 0);
    }

    public TarjetaDebito crearTarjetaDebito(String id) {
        return new TarjetaDebito(id, true, 50000);
    }

    public CDT crearCDT(String id) {
        return new CDT(id, 1000000, 3);
    }

    public CreditoRotativo crearRotativo(String id) {
        return new CreditoRotativo(id, 500000);
    }

}
