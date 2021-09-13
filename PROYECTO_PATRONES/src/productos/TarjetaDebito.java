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
public class TarjetaDebito {
   public double id;
   public int limiteTransaccion;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
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
       
   }
    
    
}
