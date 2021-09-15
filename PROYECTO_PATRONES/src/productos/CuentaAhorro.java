package productos;

/**
 *
 * @author alejonba0498
 */
public class CuentaAhorro extends ProductoBancario{

    public boolean estado;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public CuentaAhorro(String id, boolean estado) {
        super(id);
        this.estado = estado;
    }

    private CuentaAhorro(CuentaAhorro cuentaA) {
        super(cuentaA);
        this.estado = cuentaA.estado;
    }

    @Override
    public CuentaAhorro clone() {
        return new CuentaAhorro(this);
    }

    @Override
    public String toString() {
        return "CuentaAhorro " + " id = " + this.getId() + " , estado = " + estado;
    }

}
