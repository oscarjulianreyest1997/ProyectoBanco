/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import Modelo.Cliente;
import builder.GerenteBanco;
import productos.CDT;

/**
 *
 * @author alejonba0498
 */
public class Main {

    public static void main(String[] args) {

        GerenteBanco gerente = GerenteBanco.getGerente();

        System.out.println(gerente.toString());
        System.out.println("");
        //Se intenta crear dos instancias de gerente, pero con el patrón singleton solo se puede crear una. 
        GerenteBanco gerente2 = GerenteBanco.getGerente();

        System.out.println(gerente2.toString());
        System.out.println("");
        Cliente cliente = new Cliente();
        cliente.setTipo("Empleado");

        Cliente cliente2 = new Cliente();
        cliente2.setTipo("Desempleado");

        Cliente cliente3 = new Cliente();
        cliente3.setTipo("Pensionado");

        Cliente cliente4 = new Cliente();
        cliente4.setTipo("18 Años");
        //Gracias a los patrones Builder y abstractFactory se crean los portafolios dependiendo el tipo de cliente. 
        gerente.crearPortafolio(cliente);
        gerente.crearPortafolio(cliente2);
        gerente.crearPortafolio(cliente3);
        gerente.crearPortafolio(cliente4);
        System.out.println(cliente.getTipo());
        cliente.mostrarPortafolio();
        System.out.println("");
        System.out.println(cliente2.getTipo());
        cliente2.mostrarPortafolio();
        System.out.println("");
        System.out.println(cliente3.getTipo());
        cliente3.mostrarPortafolio();
        System.out.println("");
        System.out.println(cliente4.getTipo());
        cliente4.mostrarPortafolio();

        //   System.out.println(cdt.getClass().getSimpleName());
        //Se busca en la lista del cliente de tipo CDT y se clona al patrón prototype
        CDT cdt, cloneCdt;
        System.out.println("");
        for (Object producto : cliente.getListaProductos()) {
          
            if (producto.getClass().getSimpleName().equals("CDT")) {
                cdt = (CDT) producto;

                cloneCdt = cdt.clone();
                cloneCdt.setMontoMinimo(15000000);
                cloneCdt.setDuracion(10);
                cliente.getListaProductos().add(cloneCdt);
                break;
            }
        }
        System.out.println("");
        cliente.mostrarPortafolio();

    }
}
