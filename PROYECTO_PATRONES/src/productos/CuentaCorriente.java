
package productos;

/**
 *
 * @author alejonba0498
 */
public abstract class CuentaCorriente {
    
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
   
    
    public CuentaCorriente(){
        
    }
    protected CuentaCorriente(CuentaCorriente cuentaC){
        this.id = cuentaC.id;
        this.estado = cuentaC.estado;
    }
    
    
    public abstract CuentaCorriente clone();
    
    
}
