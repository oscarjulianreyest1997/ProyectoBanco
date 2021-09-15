package builder;

import Modelo.Cliente;
import algoritmoLuhn.NumberGenerator;
import fabricas.Perfil18Años;
import fabricas.PerfilDesempleado;
import fabricas.PerfilEmpleado;
import fabricas.PerfilPensionado;
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
public class GerenteBanco {

    private static GerenteBanco gerente;

    private GerenteBanco() {

    }

    public void crearPortafolio(Cliente c) {
        NumberGenerator algoritmo = new NumberGenerator();

        String idCdt = algoritmo.generateNumberByLuhnAlgorithm();
        String idCreditoRotativo = algoritmo.generateNumberByLuhnAlgorithm();
        String idCuentaAhorro = algoritmo.generateNumberByLuhnAlgorithm();
        String idCuentaCorriente = algoritmo.generateNumberByLuhnAlgorithm();
        String idTarjetaCredito = algoritmo.generateNumberByLuhnAlgorithm();
        String idTarjetaDebito = algoritmo.generateNumberByLuhnAlgorithm();

        if (c.tipo == "18 Años") {

            Perfil18Años perfil18 = new Perfil18Años();

            CDT cdt18 = perfil18.crearCDT(idCdt);
            CreditoRotativo creditoRotativo18 = perfil18.crearRotativo(idCreditoRotativo);
            CuentaAhorro cuentaAhorro18 = perfil18.crearCuentaAhorros(idCuentaAhorro);
            CuentaCorriente cuentaCorriente18 = perfil18.crearCuentaCorriente(idCuentaCorriente);
            TarjetaCredito tarjetaCredito18 = perfil18.crearTarjetaCredito(idTarjetaCredito);
            TarjetaDebito tarjetaDebito18 = perfil18.crearTarjetaDebito(idTarjetaDebito);

            c.getListaProductos().add(cdt18);
            c.getListaProductos().add(creditoRotativo18);
            c.getListaProductos().add(cuentaAhorro18);
            c.getListaProductos().add(cuentaCorriente18);
            c.getListaProductos().add(tarjetaCredito18);
            c.getListaProductos().add(tarjetaDebito18);

        } else if (c.tipo == "Desempleado") {

            PerfilDesempleado desempleado = new PerfilDesempleado();

            CDT cdt = desempleado.crearCDT(idCdt);
            CreditoRotativo creditoRotativo = desempleado.crearRotativo(idCreditoRotativo);
            CuentaAhorro cuentaAhorro = desempleado.crearCuentaAhorros(idCuentaAhorro);
            CuentaCorriente cuentaCorriente = desempleado.crearCuentaCorriente(idCuentaCorriente);
            TarjetaCredito tarjetaCredito = desempleado.crearTarjetaCredito(idTarjetaCredito);
            TarjetaDebito tarjetaDebito = desempleado.crearTarjetaDebito(idTarjetaDebito);

            c.getListaProductos().add(cdt);
            c.getListaProductos().add(creditoRotativo);
            c.getListaProductos().add(cuentaAhorro);
            c.getListaProductos().add(cuentaCorriente);
            c.getListaProductos().add(tarjetaCredito);
            c.getListaProductos().add(tarjetaDebito);

        } else if (c.tipo == "Empleado") {

            PerfilEmpleado empleado = new PerfilEmpleado();

            CDT cdt = empleado.crearCDT(idCdt);
            CreditoRotativo creditoRotativo = empleado.crearRotativo(idCreditoRotativo);
            CuentaAhorro cuentaAhorro = empleado.crearCuentaAhorros(idCuentaAhorro);
            CuentaCorriente cuentaCorriente = empleado.crearCuentaCorriente(idCuentaCorriente);
            TarjetaCredito tarjetaCredito = empleado.crearTarjetaCredito(idTarjetaCredito);
            TarjetaDebito tarjetaDebito = empleado.crearTarjetaDebito(idTarjetaDebito);

            c.getListaProductos().add(cdt);
            c.getListaProductos().add(creditoRotativo);
            c.getListaProductos().add(cuentaAhorro);
            c.getListaProductos().add(cuentaCorriente);
            c.getListaProductos().add(tarjetaCredito);
            c.getListaProductos().add(tarjetaDebito);

        } else if (c.tipo == "Pensionado") {

            PerfilPensionado pensionado = new PerfilPensionado();

            CDT cdt = pensionado.crearCDT(idCdt);
            CreditoRotativo creditoRotativo = pensionado.crearRotativo(idCreditoRotativo);
            CuentaAhorro cuentaAhorro = pensionado.crearCuentaAhorros(idCuentaAhorro);
            CuentaCorriente cuentaCorriente = pensionado.crearCuentaCorriente(idCuentaCorriente);
            TarjetaCredito tarjetaCredito = pensionado.crearTarjetaCredito(idTarjetaCredito);
            TarjetaDebito tarjetaDebito = pensionado.crearTarjetaDebito(idTarjetaDebito);

            c.getListaProductos().add(cdt);
            c.getListaProductos().add(creditoRotativo);
            c.getListaProductos().add(cuentaAhorro);
            c.getListaProductos().add(cuentaCorriente);
            c.getListaProductos().add(tarjetaCredito);
            c.getListaProductos().add(tarjetaDebito);
        }

    }

    public static GerenteBanco getGerente() {
        if (gerente == null) {
            gerente = new GerenteBanco();
        }
        return gerente;
    }

}
