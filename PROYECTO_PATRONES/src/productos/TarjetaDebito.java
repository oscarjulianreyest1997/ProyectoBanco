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
public class TarjetaDebito extends ProductoBancario{

    public boolean tieneLimite;
    public int limiteTransaccion;

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

    public TarjetaDebito(String id, boolean tieneLimite, int limiteTransaccion) {
        super(id);
        this.tieneLimite = tieneLimite;
        this.limiteTransaccion = limiteTransaccion;
    }

    private TarjetaDebito(TarjetaDebito tarjetaD) {
        super(tarjetaD);
        this.limiteTransaccion = tarjetaD.limiteTransaccion;
    }

    @Override
    public TarjetaDebito clone() {
        return new TarjetaDebito(this);
    }

    @Override
    public String toString() {
        return "TarjetaDebito " + " id = " + this.getId() + " , tieneLimite = " + tieneLimite + " , limiteTransaccion = " + limiteTransaccion;
    }

}
