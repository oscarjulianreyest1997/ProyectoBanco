
package productos;

/**
 *
 * @author alejonba0498
 */
public abstract class CreditoRotativo {
    
    public double id;
    public int cupo;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
    
    public CreditoRotativo(){
        
    }
    protected CreditoRotativo(CreditoRotativo rota){
        this.id = rota.id;
        this.cupo = rota.cupo;
    }
    
    
    public abstract CreditoRotativo clone();
    
    
}
