package productos;

/**
 *
 * @author alejonba0498
 */
public class CuentaAhorro {

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

    
    public CuentaAhorro(String id, boolean estado){
        this.id = id;
        this.estado = estado;
    }
    
    private CuentaAhorro(CuentaAhorro cuentaA){
       this.id = cuentaA.id;
       this.estado = cuentaA.estado;
    }
    
    
    public CuentaAhorro clone(){
        return new CuentaAhorro(this);
    }
    
    
}
