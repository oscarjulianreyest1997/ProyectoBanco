package productos;

/**
 *
 * @author alejonba0498
 */
public abstract class CuentaAhorro {

    public String id;
    public boolean estado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
