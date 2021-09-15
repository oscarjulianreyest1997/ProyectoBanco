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
public class CDT {

    public String id;
    public int montoMinimo;
    public float duracion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public CDT(String id, int montoMinimo, float duracion) {
        this.id = id;
        this.montoMinimo = montoMinimo;
        this.duracion = duracion;
    }

    private CDT(CDT cdt) {
        this.duracion = cdt.duracion;
        this.id = cdt.id;
        this.montoMinimo = cdt.montoMinimo;
    }

    public CDT clone() {
        return new CDT(this);
    }

    @Override
    public String toString() {
        return "CDT" + "id=" + id + ", montoMinimo=" + montoMinimo + ", duracion=" + duracion;
    }

}
