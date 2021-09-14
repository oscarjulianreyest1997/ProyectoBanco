/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author alejonba0498
 */
public abstract class TarjetaCredito {
  
    public String id;
    public int cupo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
    
    public TarjetaCredito(){
        
    }
    protected TarjetaCredito(TarjetaCredito tarjetaC){
        this.id = tarjetaC.id;
        this.cupo = tarjetaC.cupo;
    }
    
    
    public abstract TarjetaCredito clone();
    
    
    
   
}
