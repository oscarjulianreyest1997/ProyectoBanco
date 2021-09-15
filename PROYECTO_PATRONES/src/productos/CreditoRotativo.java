package productos;

/**
 *
 * @author alejonba0498
 */
public class CreditoRotativo extends ProductoBancario{

    public int cupo;

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public CreditoRotativo(String id, int cupo) {
        super(id);
        this.cupo = cupo;
    }

    private CreditoRotativo(CreditoRotativo creditoR) {
        super(creditoR);
        this.cupo = creditoR.cupo;
    }

    @Override
    public CreditoRotativo clone() {
        return new CreditoRotativo(this);
    }

    @Override
    public String toString() {
        return "CreditoRotativo " + " id = " + this.getId() + " , cupo = " + cupo;
    }

}
