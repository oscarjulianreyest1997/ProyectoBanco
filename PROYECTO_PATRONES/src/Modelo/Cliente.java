
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alejonba0498
 */
public class Cliente {
 
public  String tipo;
ArrayList listaProductos=new ArrayList();

    public ArrayList getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarPortafolio(){
        
        for (Object producto : listaProductos) {
            System.out.println(producto.toString());
        }
    }
    
    
    
}
