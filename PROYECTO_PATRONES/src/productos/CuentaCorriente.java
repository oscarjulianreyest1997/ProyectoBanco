package productos;

/**
 *
 * @author alejonba0498
 */
public class CuentaCorriente extends ProductoBancario{

    public boolean estado;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public CuentaCorriente(String id, boolean estado) {
        super(id);
        this.estado = estado;
    }

    private CuentaCorriente(CuentaCorriente cuentaC) {
        super(cuentaC);
        this.estado = cuentaC.estado;
    }

    @Override
    public CuentaCorriente clone() {
        return new CuentaCorriente(this);
    }

    @Override
    public String toString() {
        return "CuentaCorriente " + " id = " + this.getId() + " , estado = " + estado;
    }

}
