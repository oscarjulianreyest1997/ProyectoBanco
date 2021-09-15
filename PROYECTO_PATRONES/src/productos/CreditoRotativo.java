package productos;

/**
 *
 * @author alejonba0498
 */
public class CreditoRotativo {

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

    public CreditoRotativo(String id, int cupo) {
        this.id = id;
        this.cupo = cupo;
    }

    private CreditoRotativo(CreditoRotativo creditoR) {
        this.cupo = creditoR.cupo;
        this.id = creditoR.id;
    }

    public CreditoRotativo clone() {
        return new CreditoRotativo(this);
    }

    @Override
    public String toString() {
        return "CreditoRotativo" + "id=" + id + ", cupo=" + cupo;
    }

}
