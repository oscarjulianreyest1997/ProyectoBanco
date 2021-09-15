/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author diego
 */
public abstract class ProductoBancario {
    private String id;

    public ProductoBancario(String id){
        this.id = id;
    }
    
    protected ProductoBancario(ProductoBancario p){
        this.id = p.id;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public abstract ProductoBancario clone();
    
}
