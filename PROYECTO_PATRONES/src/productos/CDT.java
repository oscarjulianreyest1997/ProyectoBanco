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
public  abstract class  CDT {
    
    
    public double id;
    public int montoMinimo;
    public float duracion;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public int getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(int montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    
    
    
    public CDT(){
        
    }
    
    protected CDT(CDT cdt){
        this.duracion=cdt.duracion;
        this.id=cdt.id;
        this.montoMinimo=cdt.montoMinimo;
    }
    
    public abstract CDT clone();
    
}
