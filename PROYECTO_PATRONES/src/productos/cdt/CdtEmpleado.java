/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.cdt;

import productos.CDT;

/**
 *
 * @author alejonba0498
 */
public class CdtEmpleado extends CDT{
    
    
    public CdtEmpleado() {
        
    }
    
    private CdtEmpleado(CdtEmpleado cdte) {
        super(cdte); 
    }

    @Override
    public CDT clone() {
        return new CdtEmpleado(this);
    }
    
    
}
