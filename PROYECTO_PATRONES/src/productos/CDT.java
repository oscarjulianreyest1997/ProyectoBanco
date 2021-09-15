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
public class CDT extends ProductoBancario{

    public int montoMinimo;
    public float duracion;

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

    public CDT(String id, int montoMinimo, float duracion) {
        super(id);
        this.montoMinimo = montoMinimo;
        this.duracion = duracion;
    }

    private CDT(CDT cdt) {
        super(cdt);
        this.duracion = cdt.duracion;
        this.montoMinimo = cdt.montoMinimo;
    }

    @Override
    public CDT clone() {
        return new CDT(this);
    }

    @Override
    public String toString() {
        return "CDT " + " id = " + this.getId() + " , montoMinimo = " + montoMinimo + " , duracion = " + duracion;
    }

}
