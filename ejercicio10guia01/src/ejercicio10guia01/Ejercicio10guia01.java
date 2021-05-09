/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10guia01;

/**
 *
 * @author Usuario
 */
public class Ejercicio10guia01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comercio c = new Comercio();
        c.agregarFacturable(new Insumo("hardware",Tipo.HARDWARE,3500)); //5455.5
        c.agregarFacturable(new ServicioReparacion(3,12));//3267
        c.agregarFacturable(new ServicioReparacion(1,2));//435.6
        System.out.println(c.montoTotalFacturado());
        System.out.println(c.cantServiciosSimple());
        
        
    }
    
}
