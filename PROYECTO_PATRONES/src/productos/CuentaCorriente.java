
package productos;

/**
 *
 * @author alejonba0498
 */
public abstract class CuentaCorriente {
    
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
   
    
    public CuentaCorriente(){
        
    }
    protected CuentaCorriente(CuentaCorriente cuentaC){
        this.id = cuentaC.id;
        this.estado = cuentaC.estado;
    }
    
    
    public abstract CuentaCorriente clone();
    
    
}
