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
public class TarjetaCredito {

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

    public TarjetaCredito(String id, int cupo) {
        this.id = id;
        this.cupo = cupo;
    }

    private TarjetaCredito(TarjetaCredito tarjetaC) {
        this.id = tarjetaC.id;
        this.cupo = tarjetaC.cupo;
    }

    public TarjetaCredito clone() {
        return new TarjetaCredito(this);
    }

    @Override
    public String toString() {
        return "TarjetaCredito" + "id=" + id + ", cupo=" + cupo;
    }

}
