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
public abstract class TarjetaDebito {
   public String id;
   public boolean tieneLimite;
   public int limiteTransaccion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isTieneLimite() {
        return tieneLimite;
    }

    public void setTieneLimite(boolean tieneLimite) {
        this.tieneLimite = tieneLimite;
    }

    public int getLimiteTransaccion() {
        return limiteTransaccion;
    }

    public void setLimiteTransaccion(int limiteTransaccion) {
        this.limiteTransaccion = limiteTransaccion;
    }
   
   
   public  TarjetaDebito(){
       
   }
   
   protected TarjetaDebito(TarjetaDebito tarjetaD){
       this.id = tarjetaD.id;
       this.limiteTransaccion = tarjetaD.limiteTransaccion;
    }
    
    
    public abstract TarjetaDebito clone();    
    
}
