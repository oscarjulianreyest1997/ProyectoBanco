package Modelo;

import java.util.ArrayList;
import productos.ProductoBancario;

/**
 *
 * @author alejonba0498
 */
public class Cliente {

    public String tipo;
    private ArrayList<ProductoBancario> listaProductos = new ArrayList<ProductoBancario>();

    public ArrayList<ProductoBancario> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<ProductoBancario> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarPortafolio() {
        System.out.println("Tipo de cliente : "+this.tipo);
        for (Object producto : listaProductos) {
            System.out.println(producto.toString());
        }
    }

}
