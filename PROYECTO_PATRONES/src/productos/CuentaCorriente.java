
package productos;

/**
 *
 * @author alejonba0498
 */
public class CuentaCorriente {
    
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
   
    
    public CuentaCorriente(String id, boolean estado){
        this.id = id;
        this.estado = estado;
    }
    private CuentaCorriente(CuentaCorriente cuentaC){
        this.id = cuentaC.id;
        this.estado = cuentaC.estado;
    }
    
    
    public CuentaCorriente clone(){
        return new CuentaCorriente(this);
    }
    
    
}
