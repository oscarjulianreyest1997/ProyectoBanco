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
public class TarjetaCredito extends ProductoBancario{

    public int cupo;

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public TarjetaCredito(String id, int cupo) {
        super(id);
        this.cupo = cupo;
    }

    private TarjetaCredito(TarjetaCredito tarjetaC) {
        super(tarjetaC);
        this.cupo = tarjetaC.cupo;
    }

    @Override
    public TarjetaCredito clone() {
        return new TarjetaCredito(this);
    }

    @Override
    public String toString() {
        return "TarjetaCredito " + " id = " + this.getId() + " , cupo = " + cupo;
    }

}
