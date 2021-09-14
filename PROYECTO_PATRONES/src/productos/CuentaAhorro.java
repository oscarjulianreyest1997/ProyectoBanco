package productos;

/**
 *
 * @author alejonba0498
 */
public abstract class CuentaAhorro {

    public double id;
    public boolean estado;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    public CuentaAhorro(){
        
    }
    
    protected CuentaAhorro(CuentaAhorro cuentaA){
       this.id = cuentaA.id;
        this.estado = cuentaA.estado;
    }
    
    
    public abstract CuentaAhorro clone();
    
    
}
