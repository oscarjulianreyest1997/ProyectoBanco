package productos.cuentaAhorros;

import productos.CuentaAhorro;

/**
 *
 * @author alejonba0498
 */
public class CuentaAhorroDesempleado extends CuentaAhorro{
     public CuentaAhorroDesempleado() {
        
    }
    
    private CuentaAhorroDesempleado(CuentaAhorroDesempleado cuentaA) {
        super(cuentaA); 
    }

    @Override
    public CuentaAhorro clone() {
        return new CuentaAhorroDesempleado(this);
    }
}
